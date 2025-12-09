package com.gaja.store;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        String viewName=getViewname();
        return viewName;

        //return "index.html"; //return this view
    }

    private String getViewname(){
        return "index";
    }

}
