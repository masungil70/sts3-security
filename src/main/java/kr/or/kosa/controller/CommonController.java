package kr.or.kosa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class CommonController {
	@GetMapping("/customLogin")
	public String loginInput(String error, String logout, Model model) {
		log.info("error : " + error);
		log.info("logout : " + logout);
		
		if(error != null) {
			model.addAttribute("error","로그인 실패 아이디비밀번호를 확인하세요");
		}
		
		if(logout != null) {
			model.addAttribute("logout","로그아웃");
		}
		
		return "customLogin";
	}
}
