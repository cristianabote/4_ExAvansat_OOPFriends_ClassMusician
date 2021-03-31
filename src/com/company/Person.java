package com.company;

public class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person() {
        this.name = null;
        this.age = 0;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
    public String toString(){
        return (this.getName()+" is "+this.getAge()+" years old and ");
    }

    @Override
    public int compareTo(Person o) {
        if (age > o.age) {
            return -1;
        } else {
            if (age == o.age) {
                return 0;
            } else {
                return 1;
            }
        }
    }
}
