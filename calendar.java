import java.util.Calendar;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class calendar {

   public static void dayprint(int day,int month,int year){
         Calendar cal = Calendar.getInstance();
         cal.set(Calendar.MONTH,month-1);
         cal.set(Calendar.DAY_OF_MONTH,day);
         cal.set(Calendar.YEAR,year);
         
         String[] day_of_week = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};

         System.out.print("Day of week : "+day_of_week[cal.get(Calendar.DAY_OF_WEEK)-1]);

   }

   public static void main(String[] args)
    throws IOException
   {
      BufferedReader In = new BufferedReader(new InputStreamReader(System.in));
      String st = In.readLine();
      int year = Integer.parseInt(st);
       st = In.readLine();
      int month =Integer.parseInt(st);
      st = In.readLine();
      int day = Integer.parseInt(st);
      In.close();
      dayprint(day,month,year);
   }   
}
