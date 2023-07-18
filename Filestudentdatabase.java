package com.example.marlonjavagrundlagen;

import java.io.*;
import java.util.Arrays;

public class Filestudentdatabase implements Studentdatabase {
    @Override
    public String[] readallstudents() throws Studentdatabaseexception {
        try (BufferedReader b = new BufferedReader(new FileReader("/Users/crowdcodeapplikant/IdeaProjects/Marlon Java Grundlagen/src/main/java/com/example/marlonjavagrundlagen/datenbank"))) {
            String[] students = new String[0];
            while (b.ready()) {
                String student = b.readLine();
                students = Arrays.copyOf(students, students.length + 1);
                students[students.length - 1] = student;
            }
            return students;
        } catch (FileNotFoundException e) {
            throw new Studentdatabaseexception();
        } catch (IOException e) {
            throw new Studentdatabaseexception();
        }

    }

    @Override
    public void addStudents(String name) throws Studentdatabaseexception {
        try (BufferedWriter b = new BufferedWriter(new FileWriter("/Users/crowdcodeapplikant/IdeaProjects/Marlon Java Grundlagen/src/main/java/com/example/marlonjavagrundlagen/datenbank",true))) {
        b.write("\n"+name);
        } catch (FileNotFoundException e) {
            throw new Studentdatabaseexception();
        } catch (IOException e) {
            throw new Studentdatabaseexception();
        }
        }
    }
