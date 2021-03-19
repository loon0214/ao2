package ao2.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ao2.mapper.ProjectMapper;
import ao2.vo.Project;

@Service
public class ProjectService {

	@Resource
	ProjectMapper mapper;
	
	public List<Project> projectListService() throws Exception{
		return mapper.projectList();
		
	}
}
