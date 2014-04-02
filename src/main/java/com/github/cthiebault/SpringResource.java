package com.github.cthiebault;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/spring")
public class SpringResource {

  @RequestMapping(method = RequestMethod.GET)
  @ResponseBody
  public String hello() {
    return "Hello World";
  }

}
