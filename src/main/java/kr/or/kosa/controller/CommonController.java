package kr.or.kosa.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class CommonController {
	@GetMapping("/customLogin")
	public String loginInput(String error, String logout, Model model) {
//		log.info("error : [" + error.toString() + "]");
		log.info("logout : " + logout);
		
		if(error != null && !"".equals(error.toString())) {
			model.addAttribute("error","로그인 실패 아이디비밀번호를 확인하세요");
		}
		
		if(logout != null) {
			model.addAttribute("logout","로그아웃");
		}
		
		return "customLogin";
	}
	
	@GetMapping("/accessError")
	public void accessDenied(Authentication auth, Model model) {
		log.info("access Denied : "+ auth);
		model.addAttribute("msg", "접근권한이 없습니다.");
	}
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest request, HttpServletResponse response, Authentication auth) {
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "redirect:customLogin";
	}
}
