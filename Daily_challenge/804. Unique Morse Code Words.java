import java.util.*;

class Morse {
  public int uniqueMorseRepresentations(String[] words) {
      
      
      String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
      
      
      
      ArrayList<String> al = new ArrayList<>();
      for(int i=0;i<words.length;i++){
          String gotstr = strCode(words[i],codes);
          if(!al.contains(gotstr)){
              al.add(gotstr);
          }
          
      }
      // System.out.println(str);
      
      return al.size();
  }
  
  public static String strCode(String st,String[] codes){
      String str="";
       for(int i=0;i<st.length();i++){
          char c = st.charAt(i);
          int code=(int)(c-'a');
          str +=codes[code];
      }
      
      return str;
  }
}


/**
 * class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                         "....","..",".---","-.-",".-..","--","-.",
                         "---",".--.","--.-",".-.","...","-","..-",
                         "...-",".--","-..-","-.--","--.."};

        Set<String> seen = new HashSet();
        for (String word: words) {
            StringBuilder code = new StringBuilder();
            for (char c: word.toCharArray())
                code.append(MORSE[c - 'a']);
            seen.add(code.toString());
        }

        return seen.size();
    }
}
 */