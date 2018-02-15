import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Practical tasks
        // Enter the two variables of type String. Determine whether the
        //first variable substring second. For example, if you typed «IT»
        //and «IT Academy» you must receive true.
        Scanner sc =new Scanner(System.in);
        String s1,s2;
        s1= sc.next();
        s2= sc.next();
        System.out.println(s2.contains(s1));
        //To "capitalize" a string means to change the first letter of each
        //word in the string to upper case (if it is not already upper case).
        //For example, a capitalized version of "Now is the time to act!" is
        //"Now Is The Time To Act!".
        Scanner sc3 =new Scanner(System.in);
        String s3=sc3.nextLine();
        String s4="",s5="";

       char[]cAr=new char[s3.length()];
       cAr=s3.toCharArray();
       for (int i=0; i<s3.length()-1;i++){
           s5="";
           s5=s5+cAr[i];
           if (i==0)cAr[i]=Character.toUpperCase(cAr[i]);
           if (" ".equals(s5)) cAr[i+1]=Character.toUpperCase(cAr[i+1]);
       }
        for (char a:cAr) {s4=s4+a;

        }
        System.out.println(s4);
    }
}
