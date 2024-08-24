package org.example;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private int courseId;
    private String courseName;
    private List<Student> students;

    public Course() {
        this.students = new ArrayList<>();
    }

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
        student.addCourse(this);
    }

    public void removeStudent(Student student) {
        students.remove(student);
        student.removeCourse(this);
    }

    @Override
    public String toString() {
        return "Course - " + "courseId: " + courseId + ", courseName:" + courseName ;
    }

}
