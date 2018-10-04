package iit.uni.miskolc.hu.softwaretesting.model;

import java.util.ArrayList;

public class Student {

    private int ID;
    private String name;
    private ArrayList<String> courses;

    public Student(int ID, String name, ArrayList<String> courses) {
        this.ID = ID;
        this.name = name;
        this.courses = courses;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }
}
