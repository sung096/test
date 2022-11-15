package com.korea.db;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.DeptDAO;
import vo.DeptVO;

@Controller
public class DeptController {
	
	//jsp실행경로 준비!
	public static final String VIEW_PATH = "/WEB-INF/views/dept/";
	
	DeptDAO dept_dao;
	
	public DeptController(DeptDAO dept_dao) {
		this.dept_dao = dept_dao;
	}
	
	@RequestMapping(value= {"/","/list.do"}) //여러개 매핑
	public String list(Model model) {
		//dao로부터 부서 목록을 요청
		List<DeptVO> list = dept_dao.selectList();
		
		//model을 통해 list를 바인딩
		model.addAttribute("list",list);
		return VIEW_PATH + "dept_list.jsp"; //포워딩
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
