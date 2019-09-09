package com.example.demo.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ModelAndView uploadException(MaxUploadSizeExceededException e, HttpServletResponse resp) throws IOException {
//        System.out.println("maxuploadfile");
//        resp.setContentType("text/html;charset=utf-8");
//        PrintWriter out = resp.getWriter();
//        out.write("maxuploadsizeExceededException");
//        out.flush();
//        out.close();
        ModelAndView mv = new ModelAndView();
        System.out.println("this is bad");
        mv.addObject("msg", "you upload a file exceed the size of it allowed");
        mv.setViewName("error");
        return mv;
    }
}
