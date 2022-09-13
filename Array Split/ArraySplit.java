import java.lang.*;
import java.util.*;

class ArraySplit{
   public static void main(String[] args){
            
	    int n = 4;
	    int[] arr = {10,4,-8,7};
            int sum = 0;
            for(int i=0;i<n;i++)sum += arr[i];
            System.out.println(arraySplit(n,sum,arr));
    }

    public static int arraySplit(int n,int sum,int[] arr){
        
        int leftSum = arr[0];
        int rightSum = sum-arr[0];
        int index = 0;
        int count = 0;
        while(index<n-1){
            
            //System.out.println(leftSum+" "+rightSum);
            
            if(leftSum>=rightSum){
                count++;
            }
            
            index++;
                leftSum += arr[index];
                rightSum -= arr[index]; 
            
            
        }
        return count;
        
    }
}