package Lesson6_in_Class;

abstract class Staff extends Person {
    @Override
    void print() {
        System.out.print("I am a ");
    }
    public abstract void solary();
}
