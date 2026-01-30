package se.iths.paveena.grouppyyproject.model;

public class Person {
    private int id;
    private String name;
    private String telephoneNumber;
    private String address;

    public Person(int id, String name, String telephoneNumber, String address) {
        this.id = id;
        this.name = name;
        this.telephoneNumber = telephoneNumber;
        this.address = address;

    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
