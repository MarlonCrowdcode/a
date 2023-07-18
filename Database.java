package com.example.marlonjavagrundlagen;

public class Database  {

    public static void main(String[] args){
        Studentdatabase sd = new Filestudentdatabase();
        try {
            sd.addStudents("12334");
            String[] students = sd.readallstudents();
            for (String student : students){
                System.out.println(student);
            }
        } catch (Studentdatabaseexception e){
            System.out.println("Es ist ein Fehler aufgetreten");
            e.printStackTrace();
        }

    }
}
