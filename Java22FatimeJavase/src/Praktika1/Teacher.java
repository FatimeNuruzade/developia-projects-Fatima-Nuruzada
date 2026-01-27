package Praktika1;

import java.util.HashSet;

public class Teacher {
	 private String name;
	    private Set<Course> courses = new HashSet<>();

	    public Teacher(String name) {
	        this.name = name;
	    }

	    public void addCourse(Course course) throws DuplicateCourseException {
	        if (!courses.add(course)) {
	            throw new DuplicateCourseException("Bu dərs artıq əlavə olunub");
	        }
	    }

	    public boolean hasCourse(String courseName) {
	        return Course.stream()
	                .anyMatch(c -> c.getName().equalsIgnoreCase(courseName));
	    }

	    public Course getCourseByName(String name) throws CourseNotFoundException {
	        return courses.stream()
	                .filter(c -> c.getName().equalsIgnoreCase(name))
	                .findFirst()
	                .orElseThrow(() ->
	                        new CourseNotFoundException("Müəllim bu dərsi keçmir"));
	    }

	    public String getName() {
	        return name;
	    }

	    public Set<Course> getCourses() {
	        return courses;
	    }
}
