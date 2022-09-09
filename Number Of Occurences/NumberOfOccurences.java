import java.lang.*;
import java.util.*;

class NumberOfOccurences{
    public static void main(String[] args){
        int n = 6;
        int k = 3;
        int[] arr = {2,3,3,3,6,9};
        
        int upper = upperBound(n,k,arr);
        int lower = lowerBound(n,k,arr);
        int ans = 0;
        
        if(upper == -1){
            
            ans = n-lower;
        }
        else{
            ans = upper-lower;
        }
        System.out.println(ans);
    }
    
    public static int lowerBound(int n,int k,int[] arr){
        
        int l = 0;
        int r = n-1;
        int ans = -1;
        
        while(l<=r){
            
            int mid = (l+r)/2;
            
            if(arr[mid]==k){
                ans = mid;
                r = mid-1;
            }
            else if(arr[mid]>k){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
            
        }
        return ans;
    }
    
    public static int upperBound(int n,int k,int[] arr){
        
        int l = 0;
        int r = n-1;
        int ans = -1;
        
        while(l<=r){
            
            int mid = (l+r)/2;
            
            if(arr[mid]>k){
                ans = mid;
                r = mid-1;
            }
            else{
                l = mid+1;
            }
            
        }
        return ans;
        
    }
}