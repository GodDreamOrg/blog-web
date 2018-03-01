package com.hgssld.blog.web.controller;

import com.alibaba.fastjson.JSONArray;
import com.hgssld.blog.web.model.NoteSaveMO;
import com.hgssld.blog.web.model.PageResultMO;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

/**
 * 笔记管理控制器
 *
 * @author monkeyking
 * @create 2018-01-20 13:33
 */
@Controller
@RequestMapping("/manager/note")
public class NoteManagerController extends BaseMainController{

    @RequestMapping(value = "/toList", method = RequestMethod.GET)
    public ModelAndView toList(ModelAndView mv) {
        mv.setViewName("note/list");
        return mv;
    }

    @RequestMapping(value = "/toAdd", method = RequestMethod.GET)
    public String toAdd(ModelAndView mv) {
        return "/note/add";
    }

    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(HttpServletRequest request,/*
            @RequestParam("description") String description,*/
            @RequestParam("file") MultipartFile file){
//        System.out.println(description);
        //如果文件不为空，写入上传路径
    	try {
    		if(!file.isEmpty()) {
        		saveFile(request,file);
        		
                System.out.println("success");
                return "success";//TODO
            } else {
            	System.out.println("error");
                return "error";
            }
		} catch (Exception e) {
			System.out.println("error:"+e);
            return "error";
		}
    }
    
    private void saveFile(HttpServletRequest request,MultipartFile file) throws Exception {
            //上传文件路径
            String path = request.getServletContext().getRealPath("/images/");
        	String resource = this.getClass().getResource("/").toString();
        	System.out.println("resource:" + resource);
            //上传文件名
            String filename = file.getOriginalFilename();//TODO 另存其真实文件名
            File filepath = new File(path,filename);
            //判断路径是否存在，如果不存在就创建一个
            if (!filepath.getParentFile().exists()) { 
                filepath.getParentFile().mkdirs();
            }
            String picName = UUID.randomUUID().toString();
            //将上传文件保存到一个目标文件当中
            file.transferTo(new File(path + File.separator + picName));
	}
    
    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(HttpServletRequest request,
    		@RequestParam("noteId") String id,
    		@RequestParam("noteName") String noteName,
    		@RequestParam("noteTiTle") String noteTiTle,
    		@RequestParam("file") MultipartFile file) {
    	try {
	    	System.out.println("id:"+id);//TODO
	    	System.out.println("noteName:"+noteName);//TODO
	    	System.out.println("noteTiTle:"+noteTiTle);//TODO
			if(!file.isEmpty()) {
        		saveFile(request,file);
        		
                System.out.println("success");
                return "success";//TODO
            } else {
            	System.out.println("error");
                return "error";
            }
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error:"+e);
            return "error";
		}
    }

    @ResponseBody
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String delete(HttpServletRequest request,@RequestParam("list") String list) {
    	List<Long> listLong = new ArrayList<>();
//    	System.out.println("list:"+list);  
        JSONArray jsonArray = JSONArray.parseArray(list);  
//        System.out.println("fromObject"+jsonArray);  
        List<Map<String,Object>> mapListJson = (List)jsonArray;  
        for (int i = 0; i < mapListJson.size(); i++) {  
            Map<String,Object> obj=mapListJson.get(i);  
            for(Entry<String,Object> entry : obj.entrySet()){  
                String strkey1 = entry.getKey();  
                if ("id".equals(strkey1)) {  
                	listLong.add(Long.valueOf(String.valueOf(entry.getValue())));
                }  
            }  
        }  
        System.out.println(listLong.toString());//TODO
    	return "success";
    }

    @ResponseBody
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public PageResultMO<List<NoteSaveMO>> list(HttpServletRequest request) {
    	String noteName = request.getParameter("noteName");
    	String noteTitle = request.getParameter("noteTitle");
        PageResultMO<List<NoteSaveMO>> pageResultMO = new PageResultMO<>();
        pageResultMO.setTotal(1);
        List<NoteSaveMO> moList = new ArrayList<>();
        pageResultMO.setRows(moList);
        
        if (StringUtils.isBlank(noteTitle)&&StringUtils.isBlank(noteName)) {
        	NoteSaveMO mo = new NoteSaveMO();
            moList.add(mo);
            mo.setId(1L);
            mo.setNoteName("noteName1");
            mo.setNoteTitle("noteTitle1");
            mo.setSaveUrl("saveUrl1");
            mo = new NoteSaveMO();
            moList.add(mo);
            mo.setId(2L);
            mo.setNoteName("noteName2");
            mo.setNoteTitle("noteTitle2");
            mo.setSaveUrl("saveUrl2");
            mo = new NoteSaveMO();
            moList.add(mo);
            mo.setId(3L);
            mo.setNoteName("noteName3");
            mo.setNoteTitle("noteTitle3");
            mo.setSaveUrl("saveUrl3");
        	return pageResultMO;
        }
        
        NoteSaveMO mo = new NoteSaveMO();
        moList.add(mo);
        mo.setId(1L);
        mo.setNoteName("noteName1");
        mo.setNoteTitle("noteTitle1");
        mo.setSaveUrl("saveUrl1");
        return pageResultMO;
    }
}
