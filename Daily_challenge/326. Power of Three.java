class Power_Three {
  public boolean isPowerOfThree(int n) {
      
      if(n==0 || n<0){
          return false;
      }
      
      double i = Math.log10(n) / Math.log10(3);

      // return true if `log4(n)` is an integer
      return i == Math.floor(i);
      
  }
}