package Lesson6_in_Class;

public class Cleaners extends Staff{
    @Override
    void print() {
        super.print();
        System.out.println("Cleaner");
    }

    @Override
    public void solary() {
        System.out.println("My solary is 3200, i am a cleaner");
    }
}