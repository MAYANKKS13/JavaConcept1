package org.example;

import java.io.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        FileInputStream fi = new FileInputStream("/home/zadmin/IdeaProjects/AssignmentFileIO/src/main/java/org/example/input.txt");
        FileReader fr = new FileReader("/home/zadmin/IdeaProjects/AssignmentFileIO/src/main/java/org/example/input.txt");
        FileWriter fw = new FileWriter("/home/zadmin/IdeaProjects/AssignmentFileIO/src/main/java/org/example/output.txt");
        String s = "";
        int ch = 0;
        while ((ch=fr.read()) != -1) {
            s = s + (char) ch;
        }
        s = s.replaceAll("USA", "INDIA");
        fw.write(s);
        fw.close();






    }
}
