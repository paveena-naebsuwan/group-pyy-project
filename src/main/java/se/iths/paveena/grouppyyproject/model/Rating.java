package se.iths.paveena.grouppyyproject.model;

public class Rating {

    private Long id;
    private String author;
    private Double value;

    public Rating(Long id, String name, Double value) {
        this.id = id;
        this.author = author;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}