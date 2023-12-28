package com.example.demo.application;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DemoServiceTest {
  @Test
  public void greetingTest01() throws Exception {
    DemoService service = new DemoService();
    String name = "xxx";
    String expected = "xxxさん、こんにちは！";
    String actual = service.greeting(name);
    assertEquals(expected, actual);
  }

  @Test
  public void greetingTest02() throws Exception {
    DemoService service = new DemoService();
    String name = "";
    String expected = "?name=Michaelのようにクエリを追加してね！";
    String actual = service.greeting(name);
    assertEquals(expected, actual);
  }

  @Test
  public void greetingTest03() throws Exception {
    DemoService service = new DemoService();
    String name = null;
    String expected = "?name=Michaelのようにクエリを追加してね！";
    String actual = service.greeting(name);
    assertEquals(expected, actual);
  }
}
