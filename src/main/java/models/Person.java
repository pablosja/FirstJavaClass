package models;

public class Person {
    private String name;
    private String lastName;
    private String id;
    private int year;

    public Person(String name, String lastName, String id, int year) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}

