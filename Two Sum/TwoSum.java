import java.lang.*;
import java.util.*;

class TwoSum{
    public static void main(String[] args){
      
        int n = 4;
	int target = 17;
        int[] arr = {2,7,11,15};

        int ansI[] = findTargetSumIndexBruteForceSolution(n,arr,target);
	System.out.println(Arrays.toString(ansI));
	
	int ansII[] = findTargetSumIndexHashMapSolutionI(n,arr,target);
	System.out.println(Arrays.toString(ansII));

	int ansIII[] = findTargetSumIndexHashMapSolutionII(n,arr,target);
	System.out.println(Arrays.toString(ansIII));
    }
    public static int[] findTargetSumIndexBruteForceSolution(int n,int[] arr,int target){
     
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]+arr[j]==target) return new int[] {i,j};
			}
		}
		
		return new int[] {0,0};
		   
    }

    public static int[] findTargetSumIndexHashMapSolutionI(int n,int[] arr,int target){
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<n;i++) map.put(arr[i],i);
		
		for(int i=0;i<n;i++){
			if(map.get(target-arr[i])!=null){
				return new int[] {i,map.get(target-arr[i])};
			}
		}
		return new int[] {0,0};
    }
    public static int[] findTargetSumIndexHashMapSolutionII(int n,int[] arr,int target){
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		int index = 0;
		
		while(index<n&&map.get(target-arr[index])==null){
			
			map.put(arr[index],index);
			index++;
		}
		
		
		return new int[] {map.get(target-arr[index]),index};
    }
}