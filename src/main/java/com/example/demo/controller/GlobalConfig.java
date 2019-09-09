package com.example.demo.controller;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

/**
 * 在全局配直中添加 userlnfo 方法,返回一个 map . 该方法有一个注解@ModelAt位ibute ,其中
 * 的 value£ 性表示这条返回数据的 key , 而方法的返回值是返回数据的 value .
 * •
 * 此时在任意请求的 Controller 中,通过方法参数中的 Model 都可以获取 info 的数据 。
 */
@ControllerAdvice
public class GlobalConfig {
    @InitBinder("b")
    public void init(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("b.");
    }

    @InitBinder("a")
    public void init2(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("a.");
    }

    @ModelAttribute(value = "info")
    public Map<String, String> userInfo() {
        HashMap<String, String> map = new HashMap<>();
        map.put("username", "yangbin");
        map.put("gender", "man");
        return map;
    }
}
