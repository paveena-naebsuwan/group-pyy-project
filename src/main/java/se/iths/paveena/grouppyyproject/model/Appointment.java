package se.iths.paveena.grouppyyproject.model;

public class Appointment {
    private int id;
    private String date;
    private String time;

    public Appointment(int id, String date, String time) {
        this.id = id;
        this.date = date;
        this.time = time;
    }

    public Appointment() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
