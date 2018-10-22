package iit.uni.miskolc.hu.softwaretesting.model;

public class Teacher extends User {
    private String department; //intezet/tanszek
    public Teacher(int id, String name, String email, String username, String password, String department) {
        super(id, name, email, username, password);
        this.department = department;
    }
}
