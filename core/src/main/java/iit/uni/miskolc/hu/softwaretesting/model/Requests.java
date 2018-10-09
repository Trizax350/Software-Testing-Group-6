package iit.uni.miskolc.hu.softwaretesting.model;

public class Requests {
    private int id;
    private String priority;
    private String type;
    private String description;
    private String course_name;
    private String statusz;

    public Requests(int id, String priority, String type, String description, String course_name, String statusz) {
        this.id = id;
        this.priority = priority;
        this.type = type;
        this.description = description;
        this.course_name = course_name;
        this.statusz = statusz;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getStatusz() {
        return statusz;
    }

    public void setStatusz(String statusz) {
        this.statusz = statusz;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Requests{" +
                "id=" + id +
                ", priority='" + priority + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", course_name='" + course_name + '\'' +
                ", statusz='" + statusz + '\'' +
                '}';
    }
}
