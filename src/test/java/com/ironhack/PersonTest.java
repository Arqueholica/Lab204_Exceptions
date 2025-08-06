package com.ironhack;


import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;
/*

1. Tengo que crear una persona
2. Asignarle la edad 0
3. Mirar si son iguales

 */
class PersonTest {





    @Test
    void setAge_zero() {
        Person human1 = new Person("Mari","Sánchez", 1, "Unemployed");
        human1.setAge(1);

        assertEquals(1, human1.getAge(), "El test funciona");

    }
}