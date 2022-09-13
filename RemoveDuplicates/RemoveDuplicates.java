import java.lang.*;
import java.util.*;

class RemoveDuplicates{
   public static void main(String[] args){
            
	    int n = 5;
	    int[] arr = {0,0,1,1,2};
            removeDuplicates(n,arr);
    }
    public static void removeDuplicates(int n,int[] arr){
        
       int left = 0;
        int right = 1;
        
        while(right<n){
            
            if(arr[left]<arr[right]){
                arr[left+1] = arr[right];
                left++;
            }
            right++;
            
        }
        System.out.println(left+1);
        for(int i=0;i<left+1;i++)System.out.print(arr[i]+" ");
        System.out.println();
        
    }
}