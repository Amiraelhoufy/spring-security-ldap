package com.agcodes.spring_security_ldap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResourceController {

  @GetMapping("/")
  public String index(){
    return "<h1>Welcome to the home page!</h1>";
  }

}
