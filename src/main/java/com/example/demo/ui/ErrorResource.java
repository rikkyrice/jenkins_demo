package com.example.demo.ui;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorResource implements ErrorController {
  @RequestMapping("/error")
  public String handleError(HttpServletRequest request, Model model) {
    Object statusCode = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
    model.addAttribute("error", statusCode.toString());
    return "error";
  }

  @Override
  public String getErrorPath() {
    return "/error";
  }
}
