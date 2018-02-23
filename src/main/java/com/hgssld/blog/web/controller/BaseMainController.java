package com.hgssld.blog.web.controller;

import com.alibaba.fastjson.JSON;
import com.hgssld.blog.web.model.TreeNoteMO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * ceshi
 *
 * @author monkeyking
 * @create 2018-01-20 11:30
 */
@Controller
@RequestMapping("/base")
public class BaseMainController {

    @RequestMapping("/main")
    public String toMain() {
        return "/base/main";
    }

    @ModelAttribute
    public void toLeft(ModelAndView modelAndView) {
        List<TreeNoteMO> noteMOS = getNoteAllForLevelAndNum(3, 7, 20);
        modelAndView.addObject("noteList", noteMOS);
    }

    @RequestMapping("/index")
    public ModelAndView toIndex(ModelAndView modelAndView) {
        modelAndView.setViewName("/base/my/index");
//        List<TreeNoteMO> noteMOS = getNoteAllForLevelAndNum(3, 7, 20);
//        String json = "[{\"id\":1,\"name\":\"菜单1\",\"url\":\"http://www.baidu.com\"},{\"childList\":[{\"id\":3,\"name\":\"菜单3\",\"url\":\"http://www.baidu.com\"},{\"childList\":[{\"id\":5,\"name\":\"菜单5\",\"url\":\"http://www.baidu.com\"},{\"id\":6,\"name\":\"菜单6\",\"url\":\"http://www.baidu.com\"},{\"id\":7,\"name\":\"菜单7\",\"url\":\"http://www.baidu.com\"}],\"id\":4,\"name\":\"菜单4\",\"url\":\"http://www.baidu.com\"},{\"childList\":[{\"id\":9,\"name\":\"菜单9\",\"url\":\"http://www.baidu.com\"},{\"id\":10,\"name\":\"菜单10\",\"url\":\"http://www.baidu.com\"},{\"id\":11,\"name\":\"菜单11\",\"url\":\"http://www.baidu.com\"},{\"id\":12,\"name\":\"菜单12\",\"url\":\"http://www.baidu.com\"}],\"id\":8,\"name\":\"菜单8\",\"url\":\"http://www.baidu.com\"},{\"childList\":[{\"id\":14,\"name\":\"菜单14\",\"url\":\"http://www.baidu.com\"}],\"id\":13,\"name\":\"菜单13\",\"url\":\"http://www.baidu.com\"},{\"id\":15,\"name\":\"菜单15\",\"url\":\"http://www.baidu.com\"}],\"id\":2,\"name\":\"菜单2\",\"url\":\"http://www.baidu.com\"},{\"childList\":[{\"childList\":[{\"id\":18,\"name\":\"菜单18\",\"url\":\"http://www.baidu.com\"},{\"id\":19,\"name\":\"菜单19\",\"url\":\"http://www.baidu.com\"},{\"id\":20,\"name\":\"菜单20\",\"url\":\"http://www.baidu.com\"}],\"id\":17,\"name\":\"菜单17\",\"url\":\"http://www.baidu.com\"}],\"id\":16,\"name\":\"菜单16\",\"url\":\"http://www.baidu.com\"}]\n";
//
//        List<TreeNoteMO> result = JSONObject.parseObject(json, new TypeReference<List<TreeNoteMO>>() {
//        }.getType());
//
//        modelAndView.addObject("noteList", noteMOS);
//        System.out.println("============：：：："+JSON.toJSONString(noteMOS));
        return modelAndView;
    }

    public static void main(String[] args) {
//        getList(1,1);
        List<TreeNoteMO> noteMOS = getNoteAllForLevelAndNum(3, 7, 20);
        int num = 0;
        num += noteMOS.size();
        for (int i = 0; i < noteMOS.size(); i++) {
            num += clacNum(noteMOS.get(i));
        }
        System.out.println(JSON.toJSONString(noteMOS));
        System.out.println(num);
    }

    public static int clacNum(TreeNoteMO noteMO) {
        int num = 0;
        List<TreeNoteMO> childList = noteMO.getChildList();
        if (childList != null && childList.size() > 0) {
            num += childList.size();
            for (int i = 0; i < childList.size(); i++) {
                num += clacNum(childList.get(i));
            }
            return num;
        } else {
            return 0;
        }
    }

    public static List<TreeNoteMO> getList(int level, int allNoteNum) {
        List<TreeNoteMO> result = new ArrayList<>();
        TreeNoteMO mo = getNoteOneForLevel(3, 0, null);
        System.out.println(JSON.toJSONString(mo));
        return result;
    }

    private static final Random random = new Random();

    private static boolean isHaveChild(int nextLevel) {
        return used < num && random.nextInt(2) == 1 && nextLevel != 0;
    }

    private static TreeNoteMO getNoteMo(int level) {
        if (used >= num) return null;
        TreeNoteMO temp = new TreeNoteMO();
        List<TreeNoteMO> childList = null;
        used++;
        temp.setId((long) (used));
        temp.setName("菜单" + (used));
        temp.setUrl("http://www.baidu.com");
        int nextLevel = level - 1;
        if (isHaveChild(nextLevel)) {
            childList = new ArrayList<>();
            int maxNum = num - used;
            maxNum = maxNum > factor ? factor : maxNum;
            maxNum = random.nextInt(maxNum) + 1;
            for (int j = 0; j < maxNum; j++) {
                TreeNoteMO noteMo = getNoteMo(nextLevel);
                if (noteMo != null) {
                    childList.add(noteMo);
                }
            }
        }
        temp.setChildList(childList);
        return temp;
    }

    private static int used = 0;
    private static int num = 0;
    private static int factor = 7;


    private static List<TreeNoteMO> getNoteAllForLevelAndNum(int level, int factorNum, int allNum) {
        List<TreeNoteMO> result = new ArrayList<>();
        used = 0;
        factor = factorNum;
        num = allNum;
        while (used < num) {
            TreeNoteMO noteMo = getNoteMo(level);
            result.add(noteMo);
        }
        return result;
    }

    private static TreeNoteMO getNoteOneForLevel(int level, int index, TreeNoteMO parentMo) {
        if (index == level) {
            return null;
        }
        TreeNoteMO currentMo = new TreeNoteMO();
        currentMo.setId((long) index);
        currentMo.setName("菜单" + index);
        currentMo.setParentId(parentMo != null ? parentMo.getId() : null);
        currentMo.setUrl("http://www.baidu.com");
        List<TreeNoteMO> tempList = new ArrayList<>();
        tempList.add(getNoteOneForLevel(level, index + 1, currentMo));
        currentMo.setChildList(tempList);
        return currentMo;
    }


    @RequestMapping("/leftAllData")
    @ResponseBody
    public TreeNoteMO helloWorld() {
        TreeNoteMO treeNoteMO = new TreeNoteMO();

        List<TreeNoteMO> treeNoteMOList = new ArrayList<>();
        treeNoteMO.setId(1L);
        treeNoteMO.setName("主菜单");
        treeNoteMO.setParentId(null);
        treeNoteMO.setSort(1);
        treeNoteMO.setType(1);
        treeNoteMO.setUrl(null);
        treeNoteMO.setChildList(treeNoteMOList);

        TreeNoteMO noteMO = new TreeNoteMO();
        noteMO.setId(2L);
        noteMO.setName("子菜单1");
        noteMO.setParentId(1L);
        noteMO.setSort(1);
        noteMO.setType(2);
        noteMO.setUrl("http://www.baidu.com");
        treeNoteMOList.add(noteMO);
        return treeNoteMO;
    }

}
