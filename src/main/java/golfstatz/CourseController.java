package golfstatz;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/courses")
    public Course courses(@RequestParam(value="name", defaultValue="World") String name) {
        return new Course(counter.incrementAndGet(),
                            String.format(template, name));
    }
}