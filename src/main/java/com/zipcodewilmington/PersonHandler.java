package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;}

    public String whileLoop(){ //while loops requires you to have something to end the loop
        String result ="";
        int counter = 0;
        // create a `counter`
        while(counter < this.personArray.length) { // begin loop - while the counter(position 0) is less than the constructor (this.personArray.length) continue the counter
            // while `counter` is less than length of array
            Person currentPerson = personArray[counter];  // use `counter` to identify the `current Person` in the array - this variable holds the current position of the while loop
            String currentPersonString = currentPerson.toString(); // get `string Representation` of `currentPerson`
            result += currentPersonString;  // append `stringRepresentation` to `result` variable
            System.out.println("Current Person(counter="+ counter + ") : " + currentPersonString);
            counter++;  // end loop, by incrementing the counter until it meets the condition
        }

        return result;
    }



    public String forLoop() {
        String result = "";
        for(int i=0; i<personArray.length; i++) { // identify initial value,  // identify terminal condition,// identify increment
            // use the above clauses to declare for-loop signature
            Person currentPerson = personArray[i];   // use `counter` to identify the `current Person` in the array
            String currentPersonString = currentPerson.toString();   // get `string Representation` of `currentPerson
            result += currentPersonString; // append `stringRepresentation` to `result` variable
            // end loop - because it ends after the condition are met
            System.out.println("Current Person(i="+ i + ") : " + currentPersonString);
        }

        return result;

    }



    public String forEachLoop() { //will iterate on each element in a loop
        String result = "";

        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
        for (Person currentPerson : personArray) { // (for each current person in person array do something) - verbalize form - (variable encapsulating the : array)
            String currentPersonString = currentPerson.toString(); // get `string Representation` of `currentPerson`
            result += currentPersonString;
            System.out.println("Current Person : " + currentPersonString);
        }

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
