package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaticRecipePageController {
    @RequestMapping("/StaticRecipePage")
    public String homePage() {
        return "StaticRecipePage";
    }
    @RequestMapping("/HaiChicken")
    public String HaiChicken() {
        return "HaiChicken";
    }
    @RequestMapping("Shumai")
    public String Shumai() {
        return "Shumai";
    }
    @RequestMapping("ImageGallery")
    public String ImageGallery() {
        return "ImageGallery";
    }
}
