import java.lang.*;
import java.util.*;

class CanYouFindTheSum{
    public static void main(String[] args){
      
        int n = 5;
        int[] arr = {5,4,1,3,2};
        System.out.println(canYouFindTheSum(n,arr));
    }
    public static String canYouFindTheSum(int n,int[] arr){
        
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> stack = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();
        
        
        int pointer = 0;
        
        while(pointer<n){
            
            while(!stack.isEmpty()&&stack.peek()<=arr[pointer]){
                stack.pop();
            }
            
            if(stack.isEmpty()){
                left[pointer] = -1;
            }
            else{
                int value = map.get(stack.peek());
                left[pointer] = value;
            }
            map.put(arr[pointer],pointer+1);
            stack.push(arr[pointer++]);
        }
        pointer--;
        stack.clear();
        map.clear();
        while(pointer>=0){
             while(!stack.isEmpty()&&stack.peek()<=arr[pointer]){
                stack.pop();
            }
            if(stack.isEmpty()){
                right[pointer] = -1;
            }
            else{
                int value = map.get(stack.peek());
                right[pointer] = value;
            }
            map.put(arr[pointer],pointer+1);
            stack.push(arr[pointer--]);
            
        }
        String ans = "";
        
        for(int i=0;i<n;i++){
            ans += left[i]+right[i]+" ";
        }
        
        // System.out.println(Arrays.toString(right));
        // System.out.println(Arrays.toString(left));
        return ans;
    }
}