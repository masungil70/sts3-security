package kr.or.kosa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class IndexController {

	@Autowired
	private PasswordEncoder passwordEncoder;

	@GetMapping("/")
	public String index() {

		
		  System.out.println("member 비번 : " + passwordEncoder.encode("1234"));
		  System.out.println("admin 비번 : " + passwordEncoder.encode("1234"));
		  System.out.println("admin 비번 : " + passwordEncoder.encode("passwd"));
		  
		  return "index";
	}

}