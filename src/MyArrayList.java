import java.util.ArrayList;

public class MyArrayList extends ArrayList<String> {
    //1) count and write the number of symbols in every line.
    void info() {
        int count = this.size();
        System.out.println("Size: " + count);
        for (int i = 0; i < count; i++) {
            System.out.println(this.get(i).length());
        }
    }

    //2) find the longest and the shortest line.
    void myCast() {
        this.sort(String::compareTo);
        System.out.println("Sortest element: " + this.get(0));
        System.out.println("Longest element: " + this.get(this.size()-1));
    }

    //3) find and write only that lines, which consist of word «var»
    void myVar() {
        int count = this.size();
        for (int i = 0; i < count; i++) {
        if(this.get(i).contains("var"))System.out.println(this.get(i));
        }

    }
}

