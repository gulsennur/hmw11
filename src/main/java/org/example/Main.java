package org.example;
import org.example.tasarimdesenleri.Person;
import org.example.tasarimdesenleri.Singleton;

public class Main {

    public static void main(String[] args) {

       //singleton main
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

       //Builder (person) main
            Person person = new Person.Builder()
                    .withFirstName("Nur")
                    .withLastName("Toy")
                    .withAge(29)
                    .build();

            System.out.println(person);


    }
}