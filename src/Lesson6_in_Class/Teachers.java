package Lesson6_in_Class;

public class Teachers extends Staff{
    @Override
    void print() {
        super.print();
        System.out.println("Teacher");
    }

    @Override
    public void solary() {
        System.out.println("My solary is 6200, i am a teacher");
    }
}
