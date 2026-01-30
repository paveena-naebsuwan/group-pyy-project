package se.iths.paveena.grouppyyproject.model;

import java.util.ArrayList;

public class ListModel {

    private ArrayList<String> items;

    private String name;

    public ListModel() {
        items = new ArrayList<>();
        items.add("Water");
        items.add("Egg");
        items.add("Bread");
        this.name = name;
    }
    public ArrayList<String> getItems() {
        return items;
    }
    public void setItems(ArrayList<String> items) {
        this.items = items;
    }
    //Getters/setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }

}
