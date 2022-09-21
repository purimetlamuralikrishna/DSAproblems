import java.lang.*;
import java.util.*;

class GenerateSubSequence{
    
    public static void main(String[] args){
        
        int n = 4;
        String str = "abcd";

        char[] charArr = str.toCharArray();
        
        Stack<Character> stk = new Stack<>();
        
        findSubSequence(n,charArr,0,stk);
        
    }
    
    public static void findSubSequence(int n,char[] charArr,int index,Stack<Character> stk){
        
        if(index>=n){
            return;
        }
        
        stk.push(charArr[index]);
        
        for(Character c:stk)System.out.print(c);
        System.out.println();
        
        findSubSequence(n,charArr,index+1,stk);
        stk.pop();
        findSubSequence(n,charArr,index+1,stk);
        
    }
}