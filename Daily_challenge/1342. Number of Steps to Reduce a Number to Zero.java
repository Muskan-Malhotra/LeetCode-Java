class Solution5 {
  public int numberOfSteps(int num) {
      int count = 0;
      if(num == 0){
          System.out.println(count);
          return count;
      }
      
      if(num%2 == 0){
          // i.e even
          count++;
          num = num/2;
      }
      else if(num%2 != 0){
          //i.e odd
          count++;
          num = num-1;
      }
      
      int numb = count+numberOfSteps(num);
      System.out.println("numb"+numb);
      return numb;
      
  }
}