import java.lang.*;
import java.util.*;

class MoneyVsBoss{
    public static void main(String[] args){
        
        int n = 3;
        int[] arr = {10,15,20};

        System.out.println(findCost(n,arr));
    }
    
    public static int findCost(int n,int[] arr){
        
        int[] ans = new int[n+1];
        
        for(int i=2;i<=n;i++){
            ans[i] = Math.min(ans[i-1]+arr[i-1],ans[i-2]+arr[i-2]);
        }
        System.out.println(Arrays.toString(ans));
        return ans[n];
        
    } 
}