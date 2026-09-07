class Gcd {
    public static void main(String[] args) {
       System.out.println("GCD of 12 and 15 is: " + gcd(12, 15));
       System.out.println("LCM of 12 and 15 is: " + lcm(12, 15));
       
    }
   static int gcd(int a, int b) {
      while(b!=0){
        int oldValueOfb = b;
        b = a%b;
        a = oldValueOfb;
      }
      return a;
    }
    static int lcm(int a, int b){
        int gcd = gcd(a,b);
        int product = a*b;
        int lcm = product/gcd;
        return lcm;
    }
}