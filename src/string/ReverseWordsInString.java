package string;

import java.util.Scanner;

public class ReverseWordsInString {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
        String s="muk.kjf.klyfc";
            String a[]=s.split("[.]");


        for(int i=a.length;i>0;i--)
            System.out.print(a[i-1] +" ");


    }
}
