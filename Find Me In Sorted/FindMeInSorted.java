import java.lang.*;
import java.util.*;

class FindMeInSorted{
    public static void main(String[] args){
        
            int n = 7;
            int index = 2;
            int[] arr = {4,1,4,3,4,2,0};
            System.out.println(findPosition2(n,index,arr));
	    System.out.println(findPosition1(n,index,arr));
    }
    
    public static int findPosition1(int n,int index,int[] arr){
        
        int value = arr[index];
        int count = 0;
        
        for(int i=0;i<=index;i++){
            if(arr[i]==value){
                count++;
            }
        }
        
        Arrays.sort(arr);
        
        for(int i=0;i<n;i++){
            
            if(arr[i]==value){
                count--;
                while(count--!=0){
                    i++;
                }
                return i;
            }
        }
        return 0;
    }

    public static int findPosition2(int n,int k,int[] arr){
        
        int count = 0;
        
        for(int i=0;i<n;i++){
            
            if(arr[i]<arr[k]){
                count++;
            }
            else if(arr[i]==arr[k]&&i<k){
                count++;
            }
            
        }
        return count;
        
    }
    
}