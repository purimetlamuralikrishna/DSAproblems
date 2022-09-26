import java.lang.*;
import java.util.*;

class CountDistinctSubStrings{
    public static void main(String[] args){

            int n = 5;
            char[] str =  {'a','b','c','d','e'};
            System.out.println(findCount(n,str));

    }
    public static int findCount(int n,char[] str){
        
        HashMap<String,Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=i;j<n;j++){
                sb.append(str[j]);
                map.put(new String(sb),1);
            }
        }
        return map.size();
        
    }
}