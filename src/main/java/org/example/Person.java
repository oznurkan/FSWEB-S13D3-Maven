package org.example;

public class Person {
    private String firstname;
    private String lastName;
    private int age;
    private boolean isWomen;
    private String jobTitle;
    private double salary;

    public Person(String firstname, String lastName){
        this.firstname = firstname;
        this.lastName = lastName;
    }

    public Person( String firstname, String lastName, int age){
        this(firstname, lastName);
        this.age = age;
    }

    public Person( String firstname, String lastName, int age, boolean isWomen, String jobTitle, double salary){
        this(firstname, lastName, age);
        this.isWomen = isWomen;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getFirstName(){
        return firstname;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }


    public boolean isTeen(){
        return age >= 13 && age < 19;
    }


}
