package string;

import java.util.Locale;
import java.util.Scanner;

public class StringFunctions {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String temp=s.toLowerCase();
        char ar[]=s.toCharArray();
//        s.toLowerCase()
//        System.out.println(a[2]);
        StringBuilder sb=new StringBuilder();
        //   int freq[]=new int[27];
        for(char c:temp.toCharArray()){
            if(c>='a' && c<='z'){
                sb.append(c);
            }
        }

        StringBuilder sb2=new StringBuilder(sb);
        sb2.reverse();
        String a=sb.toString();
        String b=sb2.toString();
        if(a.equals(b)) System.out.println("true");
        else System.out.println("false");

    }
}
