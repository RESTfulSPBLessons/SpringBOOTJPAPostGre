package service;

import model.Person;

import java.util.Hashtable;
import java.util.List;

public interface PersonServiceInt {

    public Person getPerson(String id);
    Hashtable<String, Person> getAll();

}
