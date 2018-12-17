package com.itjun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {

    @RequestMapping("index")
    public String index(){
        System.out.println("要跳转首页了");
        return "index";
    }

    //{pageName}截取了/rest/page/后面的字符串
    //截取到之后会赋值给pageName
    //{}参数名要统一
    @RequestMapping("/rest/page/{pageName}")
    public String page(@PathVariable String pageName){
        System.out.println("pageName" + pageName);
        return pageName;

   }
}
