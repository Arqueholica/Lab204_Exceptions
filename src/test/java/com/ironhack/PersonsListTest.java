package com.ironhack;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class PersonsListTest {

    private static PersonsList persons;


    @BeforeAll
    public static void beforeAll(){
        Person human = new Person("Mari","Sánchez", 56, "Unemployed");
        persons = new PersonsList();

        persons.personList.add(human);
    }

    @Test
    void findByNameCheck() {
            Person found = persons.findByName("Mari Sánchez");

            assertEquals("Mari", found.getFirstName());
            assertEquals("Sánchez", found.getLastName());

            System.out.println("\n✅ Test findByName completado con éxito");

    }


    @Test
    void clonePlusIdCheck() {
        Person human = new Person("Mari","Sánchez", 56, "Unemployed");
        Person cloned = persons.clonePlusId(human);
        assertEquals(human, cloned, "Todo ok");

        System.out.println("\n✅ Test clonePlusId completado con éxito");

    }
}