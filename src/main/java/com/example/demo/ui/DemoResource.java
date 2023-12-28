package com.example.demo.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.application.DemoService;

@Controller
@RequestMapping("/")
public class DemoResource {
  @Autowired DemoService service;

  @RequestMapping("/")
  public String index(@RequestParam(name = "name", required = false) String reqName, Model model) {
    final String name = service.greeting(reqName);
    model.addAttribute("name", name);
    return "index";
  }

}
