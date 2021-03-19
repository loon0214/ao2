package ao2.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ao2.mapper.ProjectMapper;

@Controller
public class ao2Controller {
	
	@Resource
	ProjectMapper mapper;
	
	@RequestMapping("/project")
	private String project() throws Exception{
		
		System.out.println(mapper.projectCount());
		
		return "project";
	}
	
	
}
