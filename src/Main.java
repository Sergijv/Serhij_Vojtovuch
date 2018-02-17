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
        for (char a:cAr) {
           s4=s4+a;
        }
        System.out.println(s4);

       //Home task
        //1. Enter in the console sentence of five words.
        Scanner sc4 =new Scanner(System.in);
        String s6=sc4.nextLine();
        String[] sArr=new String[]{"","","","",""};
        int j=0;
        char[]cArr=new char[s6.length()];
        cArr=s6.toCharArray();
        for (int i=0; i<s6.length();i++){
            String s="";
            s=s+cArr[i];
            sArr[j]=sArr[j]+cArr[i];
            if (" ".equals(s)) j++;
        }
        for (String s:sArr) {
            System.out.println(s);
        }

        //display the longest word in the sentence
        int longSt=sArr[0].length();
        for (int i=1; i<5; i++) {
            if (sArr[i].length()>longSt) longSt=i;
            }
        System.out.println("The longest word in the sentence:  "+sArr[longSt]);
        //determine the number of its letters
        System.out.println("The number of its letters:  "+sArr[longSt].length());
        //bring the second word in reverse order
        char[]cArr1=new char[sArr[2].length()];
        cArr1=sArr[1].toCharArray();
        for (int i=0; i<cArr1.length; i++)
            System.out.print(cArr1[cArr1.length-i-1]);
        System.out.println();

        //2. Enter a sentence that contains the words between more than
        //one space. Convert all spaces, consecutive, one. For example, if
        //we introduce the sentence "I am learning Java Core»,
        //we have to get the "I am learning Java Core»


        Scanner sc5 =new Scanner(System.in);
        String s7=sc5.nextLine();
        while (s7.contains("  "))s7=s7.replace("  "," ");
        System.out.println(s7);
}


    }


