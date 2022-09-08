import java.lang.*;
import java.util.*;

class SpiralTraversal{

    public static void main(String[] args){
        
            int n = 3;
	    int m = 4;
	    int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
            int[] ans = spiralTraversial(n,m,matrix);
	    for(int i=0;i<n*m;i++){
            	System.out.print(ans[i]+" ");
            }
        	System.out.println();
		
        }
    }
    
    public static Integer[] spiralTraversial(int n,int m,int[][] matrix){
        
        Integer[] ans = new int[n*m];
        Integer count = 0;
        int left =0;
        int top = 0;
        int right = m-1;
        int bottom = n-1;
        
        while(count<n*m){
            
            for(Integer i=left;i<=bottom&&count<n*m;i++){
                ans[count]= matrix[i][left];
                count++;
            }
            left++;
            for(Integer i=left;i<=right&&count<n*m;i++){
                ans[count]= matrix[bottom][i];
                count++;
            }
            bottom--;
            for(Integer i=bottom;i>=top&&count<n*m;i--){
                ans[count]= matrix[i][right];
                count++;
            }
            right--;
            for(Integer i=right;i>=left&&count<n*m;i--){
                ans[count]= matrix[top][i];
                count++;
            }
            top++;
        }
	return ans;
        
        
    }
}
