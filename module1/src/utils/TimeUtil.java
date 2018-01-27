package utils;

import java.text.SimpleDateFormat;

/**
 * 时间工具
 */
public class TimeUtil {

    /**
     * 返回当前时间，格式为： 2018-01-27 21:47:00
     */
    public static String  getCurrentTime(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timeStr = format.format(System.currentTimeMillis());
        return  timeStr;
    }

}
