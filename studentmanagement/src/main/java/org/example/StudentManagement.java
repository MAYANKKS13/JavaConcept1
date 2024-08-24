package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    private List<Student> students;
    private List<Course> courses;

    public StudentManagement() {
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void addCourse(Course course) {
        courses.add(course);
        System.out.println("Course added successfully.");
    }

    public void removeStudent(Student student) {
        if (students.remove(student)) {
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void removeCourse(Course course) {
        if (courses.remove(course)) {
            System.out.println("Course removed successfully.");
        } else {
            System.out.println("Course not found.");
        }
    }

    public List<Student> searchStudentByName(String name) {
        List<Student> searchStudentByNameList = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                searchStudentByNameList.add(student);
            }
        }
        return searchStudentByNameList;
    }

    public List<Student> searchStudentByAge(int age) {
        List<Student> searchStudentByAgeList = new ArrayList<>();
        for (Student student : students) {
            if (student.getAge() == age) {
                searchStudentByAgeList.add(student);
            }
        }
        return searchStudentByAgeList;
    }

    public List<Student> searchStudentByCourseName(String name) {
        List<Student> searchStudentByCourseList = new ArrayList<>();
        for (Student student : students) {
            for (Course course : student.getCourses()) {
                if (course.getCourseName().equalsIgnoreCase(name)) {
                    searchStudentByCourseList.add(student);
                    break;
                }
            }
        }
        return searchStudentByCourseList;
    }

    public List<Student> searchStudentByCourseId(int id) {
        List<Student> searchStudentByCourseIdList = new ArrayList<>();
        for (Student student : students) {
            for (Course course : student.getCourses()) {
                if (course.getCourseId() == id) {
                    searchStudentByCourseIdList.add(student);
                    break;
                }
            }
        }
        return searchStudentByCourseIdList;
    }

    public void addCourseToStudent(String studentName, int courseId) {
        Student studentToAddCourse = null;
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(studentName)) {
                studentToAddCourse = student;
                break;
            }
        }
        if (studentToAddCourse != null) {
            Course courseToAdd = null;
            for (Course course : courses) {
                if (course.getCourseId() == courseId) {
                    courseToAdd = course;
                    break;
                }
            }
            if (courseToAdd != null) {
                studentToAddCourse.addCourse(courseToAdd);
                System.out.println("Course " + courseToAdd.getCourseName() + " added to student " + studentName + " successfully.");
            } else {
                System.out.println("Course with ID " + courseId + " not found.");
            }
        } else {
            System.out.println("Student with name " + studentName + " not found.");
        }
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public static void main(String[] args) {
        StudentManagement sM = new StudentManagement();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Remove Student");
            System.out.println("4. Remove Course");
            System.out.println("5. List All Students");
            System.out.println("6. Add Course to Student");
            System.out.println("7. Search Students by Name");
            System.out.println("8. Search Students by Age");
            System.out.println("9. Search Students by Course Name");
            System.out.println("10. Search Students by Course ID");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter student age: ");
                    int studentAge = scanner.nextInt();
                    scanner.nextLine();
                    Student newStudent = new Student(studentName, studentAge);
                    sM.addStudent(newStudent);
                    break;
                case 2:
                    System.out.print("Enter course ID: ");
                    int courseId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter course name: ");
                    String courseName = scanner.nextLine();
                    Course newCourse = new Course(courseId, courseName);
                    sM.addCourse(newCourse);
                    break;
                case 3:
                    System.out.print("Enter student name to remove: ");
                    String studentToRemove = scanner.nextLine();
                    List<Student> studentsToRemove = sM.searchStudentByName(studentToRemove);
                    if (!studentsToRemove.isEmpty()) {
                        sM.removeStudent(studentsToRemove.get(0));
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter course name to remove: ");
                    String courseToRemove = scanner.nextLine();
                    List<Course> coursesToRemove = new ArrayList<>();
                    for (Course course : sM.getCourses()) {
                        if (course.getCourseName().equalsIgnoreCase(courseToRemove)) {
                            coursesToRemove.add(course);
                        }
                    }
                    if (!coursesToRemove.isEmpty()) {
                        sM.removeCourse(coursesToRemove.get(0));
                    } else {
                        System.out.println("Course not found.");
                    }
                    break;
                case 5:
                    List<Student> allStudents = sM.getAllStudents();
                    System.out.println("All students:");
                    for (Student student : allStudents) {
                        System.out.println(student);
                    }
                    break;
                case 6:
                    System.out.print("Enter student name to add course: ");
                    String studentNameToAddCourse = scanner.nextLine();
                    System.out.print("Enter course ID to add: ");
                    int courseIdToAdd = scanner.nextInt();
                    scanner.nextLine();
                    sM.addCourseToStudent(studentNameToAddCourse, courseIdToAdd);
                    break;
                case 7:
                    System.out.print("Enter student name to search: ");
                    String searchName = scanner.nextLine();
                    List<Student> studentsByName = sM.searchStudentByName(searchName);
                    System.out.println("Students named " + searchName + ": " + studentsByName);
                    break;
                case 8:
                    System.out.print("Enter student age to search: ");
                    int searchAge = scanner.nextInt();
                    scanner.nextLine();
                    List<Student> studentsByAge = sM.searchStudentByAge(searchAge);
                    System.out.println("Students aged " + searchAge + ": " + studentsByAge);
                    break;
                case 9:
                    System.out.print("Enter course name to search: ");
                    String searchCourseName = scanner.nextLine();
                    List<Student> studentsByCourseName = sM.searchStudentByCourseName(searchCourseName);
                    System.out.println("Students enrolled in " + searchCourseName + ": " + studentsByCourseName);
                    break;
                case 10:
                    System.out.print("Enter course ID to search: ");
                    int searchCourseId = scanner.nextInt();
                    scanner.nextLine();
                    List<Student> studentsByCourseId = sM.searchStudentByCourseId(searchCourseId);
                    System.out.println("Students enrolled in course with ID " + searchCourseId + ": " + studentsByCourseId);
                    break;
                case 11:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 11.");
            }
        }
    }
}
