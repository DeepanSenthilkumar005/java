package simple;

import java.util.Scanner;

public class SwapVal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1=s.nextLine();
        String str2 = s.nextLine();
        str2=str2.concat(str1.substring(0,str1.length()/2));
        System.out.println(str2);
    }
}
