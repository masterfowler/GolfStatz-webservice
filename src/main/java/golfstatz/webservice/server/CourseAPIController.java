package golfstatz.webservice.server;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import golfstatz.modal.Course;

@RestController
public class CourseAPIController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/courses")
    public Course courses(@RequestParam(value="name", defaultValue="Jason") String name) {
        return new Course(counter.incrementAndGet(),
                            String.format(template, name));
    }
}