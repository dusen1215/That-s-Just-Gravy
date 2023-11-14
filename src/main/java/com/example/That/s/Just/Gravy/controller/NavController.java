package com.example.That.s.Just.Gravy.controller;

import com.example.That.s.Just.Gravy.DTO.GravyRecipeDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//this is the controller for the navbar in the application
@Controller
public class NavController {
    @GetMapping("/index")
    public String getIndex(){
        return "index";
    }

    /*@GetMapping ("/gravyBlog")
    public String getBlog(Model model){
        return "gravyBlog";
    }*/

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

    /*@GetMapping ("/gravyTime")
    public String getTime(){
        return "gravyTime";
    }*/
}
