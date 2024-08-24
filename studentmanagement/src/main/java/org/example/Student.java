package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
    private String name;
    private int age;
    private List<Course> courses;

    public Student() {
        this.courses = new ArrayList<>();
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        }
    }



    public void removeCourse(Course course) {
        courses.remove(course);
        course.removeStudent(this);
    }

    @Override
    public String toString() {
        return "Student - " + "name: '" + name + ", age:" + age +
                ", courses:" + courses.stream().map(Course::getCourseName).collect(Collectors.toList());
    }

}
