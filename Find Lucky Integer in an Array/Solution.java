import java.lang.*;
import java.util.*;

class Solution {


    public static void main(String args[]) {
	
	int[] arr = {2,2,3,4};
        System.out.println(findLucky(arr));
    }


    public static int findLucky(int[] arr) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int value = map.get(arr[i]);
                map.put(arr[i],value+1);
            }
            else{
                map.put(arr[i],1);
                
            }
        }
        
        int maxKey = -1;
        
        for(Integer i:map.keySet()){
            if(i==map.get(i)){
                if(i>maxKey){
                    maxKey = i;
                }
            }
        }
        
        
        return maxKey;
    }
}