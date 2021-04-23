package string;

public class FirstNonRepeatingChar {
    public static void main(String[] args){
        String str="eonpsiryokqwtcmpqtiquvaaqggtrurewodspbfrrlfindojeuhpnbjxkemgetyltlvinznntxqkulaabjzd";
        int count[]=new int[26];
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)-'a']++;
        int index = -1, i;

        for (i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)-'a'] == 1) {
                index = i;
                break;
            }
        }
//  char a=(char)(index+'a');
        if(index>=0) System.out.println(str.charAt(index));
        else System.out.println("$");

    }
}
