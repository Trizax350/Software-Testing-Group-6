package iit.uni.miskolc.hu.softwaretesting.model;

public class Request {
    private int id;
    private String priority;
    private String type;
    private String description;
    private String reference_to_the_Course;
    private String status;

    public Request(int id, String priority, String type, String description, String reference_to_the_Course, String status) {
        this.id = id;
        this.priority = priority;
        this.type = type;
        this.description = description;
        this.reference_to_the_Course = reference_to_the_Course;
        this.status = status;
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

    public String getReference_to_the_Course() {
        return reference_to_the_Course;
    }

    public void setReference_to_the_Course(String reference_to_the_Course) {
        this.reference_to_the_Course = reference_to_the_Course;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Request{" +
                "id=" + id +
                ", priority='" + priority + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", reference_to_the_Course='" + reference_to_the_Course + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
