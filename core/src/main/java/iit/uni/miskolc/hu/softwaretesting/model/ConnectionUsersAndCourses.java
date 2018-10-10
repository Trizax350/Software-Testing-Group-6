package iit.uni.miskolc.hu.softwaretesting.model;

//This class is for represent database many-many connection between users and courses
public class ConnectionUsersAndCourses {
    private int user_id;
    private int course_id;

    public ConnectionUsersAndCourses(int user_id, int course_id) {
        this.user_id = user_id;
        this.course_id = course_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    @Override
    public String toString() {
        return "ConnectionUsersAndCourses{" +
                "user_id=" + user_id +
                ", course_id=" + course_id +
                '}';
    }
}
