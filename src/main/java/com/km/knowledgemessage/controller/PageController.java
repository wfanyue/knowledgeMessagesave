package com.km.knowledgemessage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
@RequestMapping("/")
    public String index(){
    return "/static/static/index.html";
}

}
