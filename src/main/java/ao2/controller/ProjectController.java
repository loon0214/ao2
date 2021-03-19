package ao2.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ao2.service.ProjectService;

@Controller
public class ProjectController {
	
	@Resource
	ProjectService service;
	
	@RequestMapping("/main")
	private String main(Model model) throws Exception{
		
		model.addAttribute("main", service.projectListService());
		System.out.println("project List");
		return "main";
	}
	
	@RequestMapping("project/projectPost")
	private String projectPostForm() {
		return "project/projectPost";
	}
}