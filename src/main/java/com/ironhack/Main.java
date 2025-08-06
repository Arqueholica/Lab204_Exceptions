package com.ironhack;
/*
1. Create a Person class that has the following properties:

id: an integer
name: a string formatted as "firstName lastName"
age: an integer
occupation: a string
all ✅
The Person class should have the following methods:

-e is less than 0. A constructor that takes in an integer id, a string name,
an integer age and a string occupation as arguments and sets their respective properties.✅
- A setAge method that takes in an integer age and sets the age property,
but throws an error if ag ✅
- An equals method that takes in a Person object and returns true
if their properties are the same, excluding the id property.✅


 */

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Person human1 = new Person( "Mari", "Sánchez", 27, "Influencer");
        Person human2 = new Person( "Josefina", "Rodríguez", 15, "Estudiante");

//        System.out.println(human1);
//     human1.setAge(205);

        PersonsList list = new PersonsList();

        list.personList.add(human1);
        list.personList.add(human2);

        list.showHuman();
        list.findByName("Josefina Rodríguez");
        list.clonePlusId(human1);
        list.clonePlusId(human2);

        list.toFile(human1);



    }
}