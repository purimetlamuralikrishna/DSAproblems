import java.lang.*;
import java.util.*;

class StairCase{
    public static void main(String[] args){
      
        int n = 4;
        System.out.println(countSteps(n));
    }
    public static int countSteps(int n){
     
	if(n==0) return 1;
	if(n<0)  return 0;

	return 	countSteps(n-1)+countSteps(n-2)+countSteps(n-3);
		   
    }
}