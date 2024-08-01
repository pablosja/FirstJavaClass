package models;

import javax.management.ConstructorParameters;

public final class App {
    private App() {

    }
}

public static void main(String[] args) {
    Person goofy = new Person (name:"Goofy", lastName: "Disney");
    Person minnie = new Person (name:"Minnie", lastName: "Disney");

    goofy.print();
    minnie.print();
}