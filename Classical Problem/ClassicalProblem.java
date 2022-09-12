import java.lang.*;
import java.util.*;

class ClassicalProblem{
    public static void main(String[] args){
        
        String str = "{[()]}";

	String ans = checkstring(str)?"balanced":"not balanced";
            
        System.out.println(ans);
    }
    
    public static boolean checkstring(String str){
        
        Stack<Character> stack = new Stack<>();
        int index = 0;
        int n = str.length();
        while(index<n){
            char value = str.charAt(index);
            if(value=='{'||value=='('||value=='['){
                stack.push(value);
            }
            
            else{
                if(!stack.isEmpty()){
                    
                    if(value=='}'){
                        if('{'!=stack.peek()){
                            return false;
                        }
                        stack.pop();
                    }
                    if(value==']'){
                        if('['!=stack.peek()){
                            return false;
                        }
                        stack.pop();
                    }
                    if(value==')'){
                        if('('!=stack.peek()){
                            return false;
                        }
                        stack.pop();
                    }
                }
                else{
                    return false;
                }
            }
            index++;
        }
        
        return stack.isEmpty()?true:false;
        
    }
}