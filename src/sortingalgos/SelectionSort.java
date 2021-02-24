package sortingalgos;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           int n= sc.nextInt();
           int a[]=new int[n];
           for(int i=0;i<n;i++){
               a[i]= sc.nextInt();
           }

           for(int i=0;i<n-1;i++){
               int min_idx=i;
               for(int j=i+1;j<n;j++){
                  if(a[j]<a[min_idx])
                  {
                      min_idx=j;
                  }

                   }
               int temp=a[min_idx];
               a[min_idx]=a[i];
               a[i]=temp;
               }


           System.out.println("After Swapping");

           for(int i=0;i<n;i++){
               System.out.print(a[i] +" ");
           }
       }
}
