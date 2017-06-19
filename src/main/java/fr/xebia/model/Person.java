package fr.xebia.model;

import lombok.Data;

import java.util.UUID;

/**
 * Created by joseam on 16/06/2017.
 */
@Data
public class Person {

    private String id;

    private String firstName;

    private String lastName;

    public static Person newRandomInstance() {
        Person person = new Person();
        person.setId(UUID.randomUUID().toString());
        person.setLastName("Lastname " + person.getId());
        person.setFirstName("Firstname " + person.getId());

        return person;
    }

}
