class Solution8 {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
      int p1 = m-1 , p2 = n-1 ,i = m+n-1;
      while(p2 >=0 ){
          if(p1 >=0 && nums1[p1] > nums2[p2]){
              nums1[i--] = nums1[p1--];
          } 
          else{
              nums1[i--] = nums2[p2--];
          }
      }
     }
    }


//      class Solution {
//       public:
//        void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
//            int i = m - 1, j = n - 1, k = m + n - 1;
//            while(i >= 0 and j >= 0) {
//                if(nums1[i] < nums2[j]) {
//                    nums1[k--] = nums2[j--];
//                } else {
//                    nums1[k--] = nums1[i--];
//                }
//            }
//            while(j >= 0) {
//                nums1[k--] = nums2[j--];
//            }
//        }
//       };
// }