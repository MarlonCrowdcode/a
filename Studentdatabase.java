package com.example.marlonjavagrundlagen;

public interface Studentdatabase {

    public String[] readallstudents() throws Studentdatabaseexception;
    public void addStudents(String name) throws Studentdatabaseexception;
}
