package iit.uni.miskolc.hu.softwaretesting.model;

public class Courses {
    private String name;
    private int credits;
    private int rec_sem;

    public Courses(String name, int credits, int rec_sem) {
        this.name = name;
        this.credits = credits;
        this.rec_sem = rec_sem;
    }

    public String getName(){
        return name;
    }

    public int getCredits(){
        return credits;
    }

    public int getRec_sem(){
        return rec_sem;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Courses{" +
                "name='" + name + '\'' +
                ", credits=" + credits +
                ", rec_sem=" + rec_sem +
                '}';
    }
}
