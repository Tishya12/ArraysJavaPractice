package string;
import java.util.*;
import java.lang.*;
import java.io.*;
public class MergeStrings {


        public static void main (String[] args) {
            Scanner sc=new Scanner(System.in);
            Scanner sc1=new Scanner(System.in);
            int t=sc.nextInt();
            String s=sc.nextLine();
            for(int j=0;j<t;j++){
                String a=sc1.nextLine();
                String b=sc1.nextLine();
                StringBuilder result=new StringBuilder();
                for(int i=0;i<a.length()||i<b.length();i++){
                    if(i<a.length()){
                        result.append(a.charAt(i));
                    }
                    if(i<b.length()){
                        result.append(b.charAt(i));
                    }
                }
                String ans=result.toString();
                System.out.println(ans);
            }
        }
    }

