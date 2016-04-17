package golfstatz.webservice.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import golfstatz.core.ICourseService;
import golfstatz.modal.Course;

@RestController
public class CourseAPIController {
	
	@Autowired
	private ICourseService _service; 
	
    @RequestMapping("/courses")
    public List<Course> courses() {
    	return _service.getCourses();
    }
}