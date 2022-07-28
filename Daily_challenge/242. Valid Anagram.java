import java.util.*;

class ValidAnagram {
    public static void main(String[] args) {
        System.out.println();
    }
  public boolean isAnagram(String s, String t) {
      
      HashMap<Character,Integer> hm = new HashMap<>();
      
      for(int i=0;i<s.length();i++){
          char c = s.charAt(i);
          if(hm.containsKey(c)){
              hm.put(c,hm.get(c)+1);
          }
          else{
              hm.put(c,1);
          }
      }
      boolean flag = true;
      for(int i=0;i<t.length();i++){
          char c = t.charAt(i);
          
          if(hm.containsKey(c)){
              hm.put(c,hm.get(c)-1);
          }
          else{
              flag = false;
              break;
          }
      }
      
      for(char c : hm.keySet()){
          int val = hm.get(c);
          if(val>0){
              flag = false;
              break;
          }
      }
      
      return flag;
  }
}

//"ab"
//"a"
// "a"
// "ab"    