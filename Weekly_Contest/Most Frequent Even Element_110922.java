import java.util.*;


/**
 * Given an integer array nums, return the most frequent even element.

If there is a tie, return the smallest one. If there is no such element, return -1.

 

Example 1:

Input: nums = [0,1,2,2,4,4,1]
Output: 2
Explanation:
The even elements are 0, 2, and 4. Of these, 2 and 4 appear the most.
We return the smallest one, which is 2.
 */


class Frequent_even_element {
  public int mostFrequentEven(int[] nums) {
      
      HashMap<Integer, Integer> hm = new HashMap<>();
      
      for(int i=0;i<nums.length;i++){
          hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
      }
      
      int val = -1;
      int ky = -1;
      
      for(int key : hm.keySet()){
          if(key%2 == 0 && hm.get(key)>val){
              val = hm.get(key);
              ky =  key;
          }
          if(key%2 == 0 && hm.get(key)==val && ky>key){
              ky  = key;
          }
      }
      
      return ky;
      
  }
}