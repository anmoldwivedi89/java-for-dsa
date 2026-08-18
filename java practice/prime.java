class prime {
    public static void main(String args[]){
        int i, j;
        for(i=2; i<=100;i++){
            boolean isPrime = true;
            for(j=2;j<i;j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
    }
}