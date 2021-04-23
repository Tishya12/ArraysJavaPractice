package string;

import java.util.Scanner;

public class GoodOrBadString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        String s=sc.nextLine();
        for(int i=0;i<t;i++){
            String s1=sc.nextLine();
            int vowel=0;
            int consonants=0;

            for(int j=0;j<s1.length();j++){
             char c=s1.charAt(j);
             if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                 vowel++;
                 consonants=0;
             }
             else if(c=='?'){
                 consonants++;
                 vowel++;
             }
             else{
                 consonants++;
                 vowel=0;
             }
            }
            if(vowel>5||consonants>3) System.out.println("0");
            else System.out.println("1");
        }
    }
}
