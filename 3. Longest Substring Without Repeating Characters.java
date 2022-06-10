class Solution10 {
  public int lengthOfLongestSubstring(String s) {
      
      String test = "";
      
      int maxLngth = -1;
      
      if(s.isEmpty()){
          return 0;
      }
      else if(s.length() == 1){
          return 1;
      }
      
      for(char c : s.toCharArray()){
          
          String ch = c+"";
          
          if(s.contains(ch)){
              
              test = test.substring(test.indexOf(ch)+1);
              
          }
          test = test+ch;
          maxLngth = Math.max(maxLngth,test.length());
      }
      
      return maxLngth;
      
  }
}