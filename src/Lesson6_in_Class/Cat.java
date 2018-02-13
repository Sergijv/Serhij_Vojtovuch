package Lesson6_in_Class;

public class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("Meow!");
    }
    @Override
    public void feed() {
        System.out.println("I like milk!");
    }
}
