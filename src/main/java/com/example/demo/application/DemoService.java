package com.example.demo.application;

import java.util.Objects;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

@Service
@ApplicationScope
public class DemoService {
  public String greeting(String name) {
    if (Objects.isNull(name) || name.equals("")) {
      return "?name=Michaelのようにクエリを追加してね！";
    }
    return name + "さん、こんにちは！";
  }
}
