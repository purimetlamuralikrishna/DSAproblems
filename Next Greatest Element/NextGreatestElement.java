import java.util.*;
class NextGreatestElement{

	public static void main(String[] args){
	
	int[] arr = {1,3,2,4};
	int[] ansArr = tofindNearestGreatestElement(arr);
	System.out.println(Arrays.toString(ansArr));
		
	}
	public static int[] tofindNearestGreatestElement(int[] arr){
	
		Stack<Integer> stack = new Stack<>();
		int index = arr.length-1;
		int[] ans = new int[index+1];
		
		while(index>=0){
			
			int value = arr[index];
			while(!stack.isEmpty()&&stack.peek()<=value){
				stack.pop();
			}
			if(stack.isEmpty()){
				ans[index] = -1;
			}
			else{
				ans[index] = stack.peek();
					
			}
			stack.add(value);
			index--;
		}
		return ans;
		
	}
	
}