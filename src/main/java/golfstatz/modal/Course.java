package golfstatz.modal;

public class Course {

    private final long id;
    private final String name;
    private final int par;

    public Course(long id, String name, int par) {
        this.id = id;
        this.name = name;
        this.par = par;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public int getPar() {
    	return par;
    }
}