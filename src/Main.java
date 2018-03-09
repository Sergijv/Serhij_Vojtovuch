import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	    // Output text «I study Java» 10 times with the intervals of one
        //second (Thread.sleep(1000);).
        for (int i=0; i<10; i++){
            System.out.println("I study Java");
            Thread.sleep(1000);
        }
        //Output two messages «Hello, world» and «Peace in the peace»
        //5 times each with the intervals of 2 seconds, and the second - 3
        //seconds. After printing messages, print the text «My name is …»
        MyThread t1=new MyThread(2000,5,"Hello, world");
        MyThread t2=new MyThread(3000,5,"Peace in the peace");
        t1.start();
        t2.start();
        System.out.println("My name is Serhij");

        //Prepare mytext.txt file with a lot of text inside.
        //Read context from file into array of strings.
        //Each array item contains one line from file.
        //Complete next tasks:
        //1) count and write the number of symbols in every line.
        //2) find the longest and the shortest line.
        //3) find and write only that lines, which consist of word «var»


        String fileName = "mytext.txt";
        MyArrayList arSt=new MyArrayList();
             try (FileInputStream fis = new FileInputStream(fileName);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr) ) {
            String str = null;
            while ((str = br.readLine()) != null) {
                arSt.add(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //1) count and write the number of symbols in every line.
        arSt.info();
        //2) find the longest and the shortest line.
        arSt.myCast();
        //3) find and write only that lines, which consist of word «var»
        arSt.myVar();
}
}
