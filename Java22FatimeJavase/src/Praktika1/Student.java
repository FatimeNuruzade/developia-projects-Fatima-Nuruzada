package Praktika1;

public class Student {
private String name;
private Teacher teacher;
private Course course;

public Student(String name) {
	this.name=name;
}

public void chooseTeacher(Teacher teacher) {
	this.teacher=teacher;
}

public void chooseCourse(Course course) {
	this.course=course;
}

public String getName() {
	return name;
}
}
