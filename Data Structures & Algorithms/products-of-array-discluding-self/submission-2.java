class Solution {
  public int[] productExceptSelf(int[] nums) {
		
		int l = nums.length;
		
		int[] result = new int[l];
		
		int leftProd[] = new int[l];
		int rightProd[] = new int[l];
		
		leftProd[0] = 1;
		for(int i = 1 ; i< nums.length ; i++) {
			leftProd[i] = leftProd[i-1] * nums[i-1];
		}
		
		rightProd[l-1] = 1;
		for(int i = l-2 ; i >= 0 ; i--) {
			rightProd[i] = rightProd[i+1] * nums[i+1];
		}
		
		for(int i = 0 ; i < l ; i++) {
			result[i] = leftProd[i] * rightProd[i];
		}

		return result;
    }
}  
