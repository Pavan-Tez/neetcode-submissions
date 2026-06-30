class Solution {
 public int longestConsecutive(int[] nums) {
       Set<Integer> numSet = new HashSet<>();
      
        for(int i : nums){
            numSet.add(i);
        }

        int max = 0;

        for(int i : nums){
            if(!numSet.contains(i-1)){
                int currentNum = i;
                int count = 1;

                while(numSet.contains(currentNum+1)){
                    currentNum++;
                    count++;
                }
                
                    max = Math.max(count,max);
            }
        }

       
       return max;
    }
}
