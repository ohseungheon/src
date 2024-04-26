package com.example.test01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.test01.dao.ISimpleBbsDao;
import com.example.test01.domain.SimpleBbsDto;
import org.springframework.web.bind.annotation.RequestParam;


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

	@GetMapping("/writeForm")
	public String writeForm() {
		return "writeForm";
	}
	
//	@PostMapping("/write")
//	public String write(HttpServletRequest request, String writer, String title, String content) {
//		// 파라미터 받아서 db에 등록하기 
//		String writer_ = request.getParameter("writer");
//		String title_ = request.getParameter("title");
//		String content_ = request.getParameter("content");
//		
//		dao.write(writer_,title_,content);
//		
//		return "redirect:list"; // list컨트롤로러 들어가기 위해서는 redirect 사용해야함
//	}
	
//	@PostMapping("/write")
//	public String write(HttpServletRequest request, String writer, String title, String content) {
//		// 파라미터 받아서 db에 등록하기 
//		String writer_ = request.getParameter("writer");
//		String title_ = request.getParameter("title");
//		String content_ = request.getParameter("content");
//		
//		dao.write3(writer_,title_,content_);
//		
//		return "redirect:list"; // list컨트롤로러 들어가기 위해서는 redirect 사용해야함
//	}
//	
	
//	@PostMapping("/write")
//	public String write(@RequestParam("writer") String writer,@RequestParam("title") String title,@RequestParam("content") String content) {
//		// 파라미터 받아서 db에 등록하기 
//		//String writer_ = request.getParameter("writer");
//		//String title_ = request.getParameter("title");
//		//String content_ = request.getParameter("content");
//		
//		dao.write3(writer,title,content);
//		
//		return "redirect:list"; // list컨트롤로러 들어가기 위해서는 redirect 사용해야함
//	}

	
//	@PostMapping("/write")
//	public String write(SimpleBbsDto dto) {
//		// 파라미터 받아서 db에 등록하기 
//		//String writer_ = request.getParameter("writer");
//		//String title_ = request.getParameter("title");
//		//String content_ = request.getParameter("content");
//		
//		dao.write3(dto.getWriter(),dto.getTitle(),dto.getContent());
//		
//		return "redirect:list"; // list컨트롤로러 들어가기 위해서는 redirect 사용해야함
//	}
	
	
	
	@PostMapping("/write")
	public String write3(SimpleBbsDto dto) {
		// 파라미터 받아서 db에 등록하기 
		//String writer_ = request.getParameter("writer");
		//String title_ = request.getParameter("title");
		//String content_ = request.getParameter("content");
		
		dao.write3(dto);
		
		return "redirect:list"; // list컨트롤로러 들어가기 위해서는 redirect 사용해야함
	}

	@GetMapping("/command")
	public String command(SimpleBbsDto simpleBbsDto) {
		System.out.println(simpleBbsDto.getTitle());
		return "command";
	}
	
	
	@GetMapping("/detail")
	public String detail(@RequestParam("id") String id, Model model) {
		model.addAttribute("dto",dao.getDto(id));
		
		return "detail";
		
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("id") String id) {
		dao.delete(id);
		return "redirect:list";
		
	}
	
	
	
}
