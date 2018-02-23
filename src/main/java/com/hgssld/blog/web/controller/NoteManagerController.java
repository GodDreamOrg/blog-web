package com.hgssld.blog.web.controller;

import com.hgssld.blog.web.model.NoteSaveMO;
import com.hgssld.blog.web.model.PageResultMO;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * 笔记管理控制器
 *
 * @author monkeyking
 * @create 2018-01-20 13:33
 */
@Controller
@RequestMapping("/manager/note")
public class NoteManagerController {

    @RequestMapping(value = "/toList", method = RequestMethod.GET)
    public String toList(ModelAndView mv) {
        return "note/list";
    }

    @RequestMapping(value = "/toAdd", method = RequestMethod.GET)
    public String toAdd(ModelAndView mv) {
        return "/note/add";
    }

    @RequestMapping(value = "/toUpdate", method = RequestMethod.GET)
    public String toUpdate(ModelAndView mv) {
        return "/note/update";
    }

    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<NoteSaveMO> add() {
        List<NoteSaveMO> moList = new ArrayList<>();
        return moList;
    }

    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String update() {
        return "";
    }

    @ResponseBody
    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String delete() {
        return "";
    }

    @ResponseBody
    @RequestMapping(value = "/list", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public PageResultMO<List<NoteSaveMO>> list() {
        PageResultMO<List<NoteSaveMO>> pageResultMO = new PageResultMO<>();
        pageResultMO.setTotal(1);
        List<NoteSaveMO> moList = new ArrayList<>();
        pageResultMO.setRows(moList);
        NoteSaveMO mo = new NoteSaveMO();
        moList.add(mo);
        mo.setNoteName("haha");
        mo.setNoteTitle("haha");
        mo.setSaveUrl("haha");
        System.out.println("hehe1");
        return pageResultMO;
    }
}
