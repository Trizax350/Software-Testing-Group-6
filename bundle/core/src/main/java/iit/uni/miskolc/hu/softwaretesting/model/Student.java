package iit.uni.miskolc.hu.softwaretesting.model;

public class Student extends User {


    //students can be active or passive
    private enum Status {
        ACTIVE, PASSIVE;
    }

        public Student(int id, String name, String email, String username, String password, Status status) {
        super(id, name, email, username, password);
        this.status = status;
    }

    public getStatus() {
        return status;
    }
}
