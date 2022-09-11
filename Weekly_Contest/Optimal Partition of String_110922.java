import java.util.*;
/**
 * Given a string s, partition the string into one or more substrings such that the characters in each substring are unique. That is, no letter appears in a single substring more than once.

Return the minimum number of substrings in such a partition.

Note that each character should belong to exactly one substring in a partition.
 */
class Optimal {
  public int partitionString(String s) {
      HashMap<Character,Integer> map = new HashMap<>();
      int ans = 0;
      
      for(int i=0;i<s.length();i++){
          char c = s.charAt(i);
          
          if(map.containsKey(c)){
              ans++;
              map.clear();
          }
          map.put(c,1);
          
      }
      
      if(map.size()!=0){
          return ans+1;
      }
      return ans;
      
  }
}