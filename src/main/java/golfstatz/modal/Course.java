package golfstatz.modal;

import java.util.UUID;

public class Course {

    private final UUID id;
    private final String name;
    private final int par;
    private final CourseHole[] holes;

    public Course(UUID id, String name, int par, CourseHole[] holes) {
        this.id = id;
        this.name = name;
        this.par = par;
        this.holes = holes;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public int getPar() {
    	return par;
    }
    
    public CourseHole[] getHoles() {
    	return holes;
    }
}