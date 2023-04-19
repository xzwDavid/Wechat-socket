package com.imooc.controller;


import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class UploaderController {

    @GetMapping("file")
    public String upload(HttpServletRequest request, HttpServletResponse response){
        return "hello zw";
    }
}
