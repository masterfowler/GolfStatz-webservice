package golfstatz.webservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.UUID;

import org.springframework.stereotype.Service;

import golfstatz.core.ICourseService;
import golfstatz.modal.Course;
import golfstatz.modal.CourseHole;
import golfstatz.dataaccess.ConnectionManager;

@Service
public class CourseService implements ICourseService {

	private ConnectionManager _connectionManager = new ConnectionManager();

	@Override
	public List<Course> getCourses() {
		CourseHole[] hororataHoles = { 
										new CourseHole(UUID.randomUUID(), 1, 4),
										new CourseHole(UUID.randomUUID(), 2, 4),
										new CourseHole(UUID.randomUUID(), 3, 4),
										new CourseHole(UUID.randomUUID(), 4, 5),
										new CourseHole(UUID.randomUUID(), 5, 4),
										new CourseHole(UUID.randomUUID(), 6, 3),
										new CourseHole(UUID.randomUUID(), 7, 4),
										new CourseHole(UUID.randomUUID(), 8, 4),
										new CourseHole(UUID.randomUUID(), 9, 4),
										new CourseHole(UUID.randomUUID(), 10, 4),
										new CourseHole(UUID.randomUUID(), 11, 3),
										new CourseHole(UUID.randomUUID(), 12, 4),
										new CourseHole(UUID.randomUUID(), 13, 4),
										new CourseHole(UUID.randomUUID(), 14, 3),
										new CourseHole(UUID.randomUUID(), 15, 5),
										new CourseHole(UUID.randomUUID(), 16, 4),
										new CourseHole(UUID.randomUUID(), 17, 3),
										new CourseHole(UUID.randomUUID(), 18, 5)
									 };
		
		_connectionManager.Connect();
		
		List<Course> courses = new ArrayList<Course>();
    	courses.add(new Course(UUID.randomUUID(), "Hororata", 71, hororataHoles));
    	courses.add(new Course(UUID.randomUUID(), "Lincoln", 68, new CourseHole[18]));
		return courses;
	}

}
