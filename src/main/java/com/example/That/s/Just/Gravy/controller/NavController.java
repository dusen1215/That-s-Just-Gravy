package com.example.That.s.Just.Gravy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class NavController {
    @GetMapping ("/index")
    public String getIndex(){
        return "index";
    }

    @GetMapping ("/gravyBlog")
    public String getBlog(){
        return "gravyBlog";
    }

    @GetMapping ("/gravyClub")
    public String getClub(){
        return "gravyClub";
    }

    @GetMapping ("/gravyGatherings")
    public String getGatherings(){
        return "gravyGatherings";
    }

    @GetMapping ("/gravyPast")
    public String getPast(){
        return "gravyPast";
    }

    @GetMapping ("/gravyWinner")
    public String getWinner(){
        return "gravyWinner";
    }
}