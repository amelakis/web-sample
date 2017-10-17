package com.coding.web.controllers;

import com.coding.web.dto.GreetingDto;
import com.coding.web.service.GreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    private static final String indexTemplate = "index";
    private static final String greeting="greeting";

    @Autowired
    private GreetService greetService;

    @RequestMapping("/**")
    public String greetMe(@RequestParam(required = false) String input, Model model) {
        GreetingDto greetingDto = greetService.getGreeting(input);
        model.addAttribute("greeting", greetingDto.getMessage());

        return indexTemplate;
    }

}
