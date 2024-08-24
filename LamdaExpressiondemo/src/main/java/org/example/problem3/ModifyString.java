package org.example.problem3;


interface StringConcat {
    public String joinString(String s1, String s2);
}
public class ModifyString {
    public static void main(String[] args) {
        StringConcat sC = (firstName, secondName) -> {return firstName + " " + secondName;};

        System.out.println(sC.joinString("Mayank", "Sinha"));
    }
}
