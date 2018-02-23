package com.hgssld.blog.web.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ceshi
 *
 * @author monkeyking
 * @create 2018-01-20 11:30
 */
@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/test")
    @ResponseBody
    public JSONObject helloWorld(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("hehe","yoxi");
        return jsonObject;
    }

}
