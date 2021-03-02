package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TripletsOfSumZero {

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//
//        for (int a=0;a<t;a++) {
//            int n = sc.nextInt();
//            int ar[] = new int[n];
//            for (int i = 0; i < n; i++){
//                ar[i]= sc.nextInt();
//            }
//            boolean isTripletIsZero=findTriplet(ar,n);
//            if(isTripletIsZero){
//                System.out.println("1");
//            }
//            else{
//                System.out.println("0");
//            }
//
//
//        }
//    }
//
//    static boolean findTriplet(int a[], int n){
//        //sort the array bcoz 2 pointer algo work on sorted array
//        Arrays.sort(a);
//        for(int i=0;i<n-2;i++){
//            //sum of other 2 should be equal to - of a[i]
//            if(twoSum(a,-a[i],i+1)) return true;
//        }
//        return false;
//    }
//
//    static boolean twoSum(int a[], int x, int j){
//        int k=a.length-1;
//        while(j<k){
//            if(a[j]+a[k]>x){
//                k--;
//            }
//            else if(a[j]+a[k]<x){
//                j++;
//            }
//            else{
//                return true;
//            }
//        }
//        return false;
//    }

}
