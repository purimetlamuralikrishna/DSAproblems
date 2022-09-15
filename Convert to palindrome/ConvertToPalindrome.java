import java.lang.*;
import java.util.Map;
import java.util.HashMap;

class ConvertToPalindrome{
    public static void main(String[] args){
            
            int n = 5;
            String str = "abcba";
            String ans = findPalindrome(n,str)?"YES":"NO";
            System.out.println(ans);
        }
    }
    public static Boolean findPalindrome(int n,String str){
        
        Map<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++){
            map.put(str.charAt(i),1);
        }
        
        for(Character c : map.keySet()){
            if(isPalindrome(str,c,n)==false){
                return false;
            }
        }
        return true;
        
    }
    public static boolean isPalindrome(String str,char c,int n){
        
        int left = 0;
        int right = n-1;
        
        while(left<right){
            
            if(str.charAt(left)==c){
                left++;
            }
            else if(str.charAt(right)==c){
                right--;
            }
            else if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
        
    }
}