package Lesson6_in_Class;

public class Dog implements Animal{
    @Override
    public void voice() {
        System.out.println("Woof!");
    }

    @Override
    public void feed() {
        System.out.println("I like meet!");
    }
}
