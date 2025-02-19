import java.util.Scanner;

public class SubHour {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the hour in the HH:MM format-");
        String h = s.nextLine();
        String[] c = h.split(":");
        int hour = Integer.parseInt(c[0]);
        int min = Integer.parseInt(c[1]);

        System.out.println("Enter the Subtract hour in the HH:MM format-");
        String sh = s.nextLine();
        String[] sc = sh.split(":");
        int shour = Integer.parseInt(sc[0]);
        int smin = Integer.parseInt(sc[1]);

        min-=smin;
        if(min<0)
        {
            min+=60;
            hour--;
        }
        hour-=shour;
        if(shour<0)
        {
            shour+=24;
        }

        System.out.printf("Subtracted hour is %02d:%02d",hour,min);
    }
}
