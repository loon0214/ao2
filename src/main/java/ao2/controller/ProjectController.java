package ao2.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ao2.service.ProjectService;
import ao2.vo.Project;

@Controller
public class ProjectController {
	
	@Resource
	ProjectService service;
	
	@RequestMapping("/main")
	private ModelAndView main() throws Exception{
		List<Project> projectList = service.projectListService();
		ModelAndView mv = new ModelAndView("main");
		mv.addObject("projectList", projectList);
		return mv;
	}
	
	@RequestMapping("project/projectPost")
	private String projectPostForm() {
		return "project/projectPost";
	}
}