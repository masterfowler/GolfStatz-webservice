package golfstatz.modal;

import java.util.UUID;

public class CourseHole {
	
	private final UUID id;
	private final int number;
	private final int par;
	
	public CourseHole(UUID id, int number, int par) {
		this.id = id;
		this.number = number;
		this.par = par;
	}
	
	public UUID getId() {
		return id;
	}
	
	public int getNumber() {
		return number;
	}
	
	public int getPar() {
		return par;
	}
}
