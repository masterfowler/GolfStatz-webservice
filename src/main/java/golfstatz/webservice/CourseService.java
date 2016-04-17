package golfstatz.webservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import golfstatz.core.ICourseService;
import golfstatz.modal.Course;

@Service
public class CourseService implements ICourseService {

	@Override
	public List<Course> getCourses() {
		List<Course> courses = new ArrayList<Course>();
    	courses.add(new Course(1, "Hororata", 71));
    	courses.add(new Course(2, "Lincoln", 68));
		return courses;
	}

}
