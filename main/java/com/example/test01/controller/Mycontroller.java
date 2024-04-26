package com.example.test01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.test01.dao.ISimpleBbsDao;

@Controller
public class Mycontroller {
	
	@Autowired
	private ISimpleBbsDao dao; //구현체있어야함 - 클래스 안만들어도 됨 xml파일로 대체됨
	//객체일때는 제이슨으로 바꿔준다?
	@RequestMapping("/")
	public @ResponseBody String root() {
		return "Hi~Test~~";
	}
	
	@GetMapping("/main")
	public String mainPage() {
		return "main";
	}

	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("list",dao.getList() );
		
		return "list";
	}

	
}
