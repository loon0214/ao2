package ao2.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
		System.out.println("project List");
		return mv;
	}
		
//	@RequestMapping("project/projectPost")
//	private String projectPostForm() {
//		System.out.println("project post");
//		return "project/projectPost";
//	}
//	
	@RequestMapping("/projectPostProc")
	private int projectPostProc(HttpServletRequest request) throws Exception{
		Project project = (Project) request.getParameterMap();
		System.out.println("project post process");
		return service.projectPostService(project);
	}
	
	@RequestMapping("project/projectPost")
	public String projectPost(Model model) {
		
		String pj_id = "제목";
		String pj_content = "내용";
		
		model.addAttribute("t", pj_id);
		model.addAttribute("c", pj_content);
		
		return "project/projectPost";
	}
}