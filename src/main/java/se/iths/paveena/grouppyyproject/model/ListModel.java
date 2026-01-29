package se.iths.paveena.grouppyyproject.model;

public class ListModel {
    private String name;

    //model maker
    public ListModel(String name) {
        this.name = name;
    }


    //Getters/setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }

}
