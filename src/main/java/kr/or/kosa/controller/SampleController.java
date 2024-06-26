package kr.or.kosa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/sample")
public class SampleController {
	
	@GetMapping("/all")
	public String doAll() {
		log.info("do all can access everybody");
		return "all";
	}
	
	@GetMapping("/member")
	public String doMember() {
		log.info("logined member");
		return "member";
	}
	
	@GetMapping("/admin")
	public String doAdmin() {
		log.info("admin only");
		return "admin";
	}
	
}