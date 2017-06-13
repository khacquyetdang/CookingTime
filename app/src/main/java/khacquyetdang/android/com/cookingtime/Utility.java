package khacquyetdang.android.com.cookingtime;

import java.util.Formatter;

/**
 * Created by dang on 13/06/2017.
 */

public class Utility {

    public static String timeToStr(int timeInSecondes) {
        int hours = timeInSecondes / 3600; //since both are ints, you get an int
        int minutes = (timeInSecondes % 3600) / 60;
        int sec = timeInSecondes % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, sec);
    }

    public static  int timeStrToSec(String time) {
        String[] units = time.split(":"); //will break the string up into an array
        int hours = Integer.parseInt(units[0]); //first element
        int minutes = Integer.parseInt(units[1]); //first element
        int seconds = Integer.parseInt(units[2]); //second element
        int duration = 60*60* hours + 60 * minutes + seconds; //add up our values
        return duration;
    }

}
