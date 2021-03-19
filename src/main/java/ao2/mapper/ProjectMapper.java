package ao2.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import ao2.vo.Project;

@Repository
public interface ProjectMapper {
	
	public int projectCount() throws Exception;
	public List<Project> projectList() throws Exception;
	public Project projectDetail(int pj_id) throws Exception;
	public int projectPost(Project project) throws Exception;
	public int projectDelete(int pj_id) throws Exception;

}
