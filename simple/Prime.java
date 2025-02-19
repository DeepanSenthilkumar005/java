package simple;

class Prime {
    public static void main(String[] args) {
        for(int i=2;i<1000;i++){
            // make this for upto the i to 31 to make the code working for 1000
            if(i==2 || i==3|| i==5 || i==7 || i==11 || i==13){
                System.out.print(" "+i);                
                                
            }
            else if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0 && i%11!=0 && i%13!=0){
                System.out.print(" "+i);                
            }
        }

    }
}
