public class lengthOfString {
    public static void main(String[] args) {
        String s = "Deepak";
        System.out.println("Length of "+s+" is "+len(s));
    }
    public static int len(String s)
    {
        if(s=="")return 0;
        return 1+len(s.substring(1));
    }
}
