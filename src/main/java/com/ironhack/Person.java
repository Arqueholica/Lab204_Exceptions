package com.ironhack;

import java.util.Objects;

public class Person {
    private static int counter = 0;

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String occupation;


//    CONSTRUCTORES


    public Person( String firstName, String lastName, int age, String occupation) {
        this.id = counter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.occupation = occupation;
    }




    //    GETTERS AND SETTERS


    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    //    EQUAL MÉTHOD minus ID + HASH

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && Objects.equals(getFirstName(), person.getFirstName()) && Objects.equals(getLastName(), person.getLastName()) && Objects.equals(getOccupation(), person.getOccupation());
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(getFirstName(), getLastName(), getAge(), getOccupation());
//    }


//    VISUALIZADORES


    @Override
    public String toString() {
        return "Human" + '\n' +
                "________________" + '\n' +
                "ID: " + id + '\n' +
                "Name: " + firstName + " " + lastName + '\n' +
                "Age: " + age + '\n' +
                "Occupation: " + occupation + '\n' +
                "____________________________________";
    }
}
