import java.lang.*;
import java.util.*;

class NationalAwardCeremony{
   public static void main(String[] args){
            
	    int n = 5;
	    int[] arr = {0,1,0,1,2};
            sortMedals(n,arr);
	    for(int i=0;i<n;i++)System.out.print(arr[i]+" ");
    }

    public static void sortMedals(int n,int[] nums) {
        
        int left = 0;
        int right = n-1;
        int index = 0;
        
        while(index<=right){
            
            if(nums[index]==0){
                swap(nums,index,left);
                left++;
                index++;
            }
            else if(nums[index]==1){
                 index++;
            }
            else{
                swap(nums,index,right);
                right--;
            }
            
        }
        
    }
    
    public static void swap(int[] arr,int left,int right){
        
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}