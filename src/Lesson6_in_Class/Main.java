package Lesson6_in_Class;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
	//Practical tasks
    //Create interface Animal with methods voice() and feed(). Create two classes Cat and Dog,
    // which implement this interface. Create array of Animal and add some Cats and Dogs to it.
    // Call voice() and feed() method for all of it
        Animal [] animals=new Animal[4];
        animals[0]=new Cat();
        animals[1]=new Cat();
        animals[2]=new Dog();
        animals[3]=new Dog();
        for (Animal a:animals) {
            a.voice();
        }
        for (Animal a:animals) {
            a.feed();
        }
        System.out.println();
    //Create next structure. In abstract class Person with property name, declare abstract
    // method print(). In other classes in body of method print() output text “I am a …”.
    // In class Staff declare abstract method salary(). Create array of Person and add some
    // Teachers, Cleaners and Students to it. Call method print() for all of it. Call method
    // salary() for all Teachers and Cleaner
        Person[] person = new Person[6];
        person[0]= new Teachers();
        person[1]= new Teachers();
        person[2]= new Cleaners();
        person[3]= new Cleaners();
        person[4]= new Student();
        person[5]= new Student();
        for (Person p:person) {
            p.print();
            if (p instanceof Staff)((Staff) p).solary();
        }

    }
}
