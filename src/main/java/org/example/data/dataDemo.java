package org.example.data;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class dataDemo {
    public static void main(String[] args) {
        System.out.println("==============jdk1.8之前===========");
        System.out.println("------------Date------------");
        Date date = new Date();
        System.out.println(date.getYear() + 1900); // 必须加上1900
        System.out.println(date.getMonth() + 1); // 0~11，必须加上1
        System.out.println(date.getDate()); // 1~31，不能加1
        // 转换为String:
        System.out.println("转换为String:"+date);
        // 转换为GMT时区:
        System.out.println("转换为GMT时区"+date.toGMTString());
        // 转换为本地时区:
        System.out.println("转换为本地时区"+date.toLocaleString());

        //格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("格式化日期"+sdf.format(date));

        System.out.println("------------Calendar------------");
        //Calendar

        Calendar calendar = Calendar.getInstance();
        int y = calendar.get(Calendar.YEAR);
        int m = 1 + calendar.get(Calendar.MONTH);
        int d = calendar.get(Calendar.DAY_OF_MONTH);
        int w = calendar.get(Calendar.DAY_OF_WEEK);
        int hh = calendar.get(Calendar.HOUR_OF_DAY);
        int mm = calendar.get(Calendar.MINUTE);
        int ss = calendar.get(Calendar.SECOND);
        int ms = calendar.get(Calendar.MILLISECOND);
        System.out.println(y + "-" + m + "-" + d + " " + w + " " + hh + ":" + mm + ":" + ss + "." + ms);

        // 清除所有:
        calendar.clear();
        // 设置2019年:
        calendar.set(Calendar.YEAR, 2019);
        // 设置9月:注意8表示9月:
        calendar.set(Calendar.MONTH, 8);
        // 设置2日:
        calendar.set(Calendar.DATE, 2);
        // 设置时间:
        calendar.set(Calendar.HOUR_OF_DAY, 21);
        calendar.set(Calendar.MINUTE, 22);
        calendar.set(Calendar.SECOND, 23);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(calendar.getTime()));
        // 2019-09-02 21:22:23

        System.out.println("------------TimeZone------------");
        TimeZone tzDefault = TimeZone.getDefault(); // 当前时区
        TimeZone tzGMT9 = TimeZone.getTimeZone("GMT+09:00"); // GMT+9:00时区
        TimeZone tzNY = TimeZone.getTimeZone("America/New_York"); // 纽约时区
        System.out.println(tzDefault.getID()); // Asia/Shanghai
        System.out.println(tzGMT9.getID()); // GMT+09:00
        System.out.println(tzNY.getID()); // America/New_York
    }
}
