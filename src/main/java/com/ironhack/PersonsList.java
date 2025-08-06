package com.ironhack;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/*
2. Create a PersonsList class that holds a list of Person objects

- Create a findByName method that takes in a string name and returns the Person object
with a name that matches exactly. The name parameter should be formatted as "firstName lastName".
This method should throw an exception if the name parameter is not properly formatted.✅
        - Create a clone method that takes in a Person object and
returns a new Person object with the same properties, except with a new id.✅
        - Create a method that takes in a Person object as a parameter
and uses the toString method to write the Person information to a file.
This method should handle any errors as necessary.✅
        */

public class PersonsList  {

    List<Person> personList = new ArrayList<>();

    public Person findByName(String name){

        for (Person p: personList){
            String fullName = p.getFirstName() + " " + p.getLastName();

            if(name.equalsIgnoreCase(fullName)){

                System.out.println("\nPersona encontrada: ");
                System.out.println(p);
                return p;
            }
        }
        throw new RuntimeException("No se encontró a: " + name);
    };

        public Person clonePlusId(Person person){

            Person clonePlusId = new Person(person.getFirstName(), person.getLastName(), person.getAge(), person.getOccupation());
            System.out.println("Clone created:\n" + clonePlusId);
            return clonePlusId;

            }



public void toFile(Person person) throws IOException {
            String filepath = "src/main/info.txt";

    FileWriter filewriter = new FileWriter(filepath);

    filewriter.write(person.toString());
    System.out.println("File created!");
    filewriter.close();
}


    public void showHuman(){
        for (Person p: personList){
            System.out.println(p);
        }
    }



}
