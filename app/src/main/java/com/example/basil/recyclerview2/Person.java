package com.example.basil.recyclerview2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by basil on 01/06/2016.
 */
class Person {
    String name;
    String age;
    int photoId;

    Person(String name, String age, int photoId) {    //
        this.name = name;
        this.age = age;
        this.photoId = photoId;
    }

    private List<Person> persons;

    // This method creates an ArrayList that has three Person objects

    private void initializeData(){
        persons = new ArrayList<>();
        persons.add(new Person("Emma Wilson", "23 years old", R.drawable.luigi));  //
        persons.add(new Person("Lavery Maiss", "25 years old", R.drawable.mammut));  //
        persons.add(new Person("Lillie Watts", "35 years old", R.drawable.chiby_cthulhu));  //
    }
}
