class Gcd {
    public static void main(String[] args) {
       System.out.println("GCD of 12 and 15 is: " + gcd(12, 15));
    }
   static int gcd(int a, int b) {
      while(b!=0){
        int oldValueOfb = b;
        b = a%b;
        a = oldValueOfb;
      }
      return a;
    }}