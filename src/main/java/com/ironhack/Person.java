package com.ironhack;

import java.util.Objects;

public class Person {

    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private String ocupation;

//    CONSTRUCTORES


    public Person(String id, String firstName, String lastName, int age, String ocupation) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ocupation = ocupation;
    }




    //    GETTERS AND SETTERS
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0 || age >= 100) {
            throw new IllegalArgumentException("La edad no es correcta");
        }
        this.age = age;

    }

    public String getOcupation() {
        return ocupation;
    }

    public void setOcupation(String ocupation) {
        this.ocupation = ocupation;
    }

//    EQUAL MÉTHOD minus ID + HASH

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && Objects.equals(getFirstName(), person.getFirstName()) && Objects.equals(getLastName(), person.getLastName()) && Objects.equals(getOcupation(), person.getOcupation());
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(getFirstName(), getLastName(), getAge(), getOcupation());
//    }


//    VISUALIZADORES


    @Override
    public String toString() {
        return "Human" + '\n' +
                "________________" + '\n' +
                "ID: " + id + '\n' +
                "Name: " + firstName + " " + lastName + '\n' +
                "Age: " + age + '\n' +
                "Occupation: " + ocupation + '\n' +
                "____________________________________";
    }
}
