package iit.uni.miskolc.hu.softwaretesting.model;

public class Complains {
    private int id;
    private String description;
    private int req_id;

    public Complains(int id, String description, int req_id) {
        this.id = id;
        this.description = description;
        this.req_id = req_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReq_id() {
        return req_id;
    }

    public void setReq_id(int req_id) {
        this.req_id = req_id;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Complains{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", req_id=" + req_id +
                '}';
    }
}