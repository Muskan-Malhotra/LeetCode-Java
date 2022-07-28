import java.util.*;

class Sol {
  public boolean containsDuplicate(int[] nums) {
      
      Arrays.sort(nums);
      // boolean flag = true;
      for(int i=1;i<nums.length;i++){
          if(nums[i] == nums[i-1]){
              return true;
          }
      }
      return false;
  }
}

// [1,2,3,1]
// [1,2,3,4]
// [1,1,1,3,3,4,3,2,4,2]