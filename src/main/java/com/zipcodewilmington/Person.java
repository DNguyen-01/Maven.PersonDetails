package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class Person {
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) { //provides the attributes to the blueprint - these are constructors
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() { //getters
        return firstName;
    }

    public String getLastName() { //getters
        return lastName;
    }

    @Override // all objects have inate methods, .toStrings-gives us the memory address (object type @ series of number)
    public String toString() { //created method for us to dictate what we want the toString to do.
        return new StringBuilder()
                .append("\nMy first name is " + firstName)
                .append("\nMy last name is " + lastName)
                .toString();
    }
}
