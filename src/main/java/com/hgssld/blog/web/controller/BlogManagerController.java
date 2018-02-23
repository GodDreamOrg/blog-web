package com.hgssld.blog.web.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 博客 管理控制器
 *
 * @author monkeyking
 * @create 2018-01-20 13:33
 */
@Controller
@RequestMapping("/manager/blog")
public class BlogManagerController {

    @RequestMapping(value = "/toList", method = RequestMethod.GET)
    public String toList(ModelAndView mv) {
        return "/blog/list";
    }

    @RequestMapping(value = "/toAdd", method = RequestMethod.GET)
    public String toAdd(ModelAndView mv) {
        return "/blog/add";
    }

    @RequestMapping(value = "/toUpdate", method = RequestMethod.GET)
    public String toUpdate(ModelAndView mv) {
        return "/blog/update";
    }

    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String add() {
        return "";
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
    public String list() {
        return "";
    }
}
