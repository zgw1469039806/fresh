package org.fresh.gd.commons.consts.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * @DATA 2019-04-29 16:41
 * @Author 张国伟  WeChat:17630376104
 * @Description 时间工具类
 */
public class DateUtils {
    public static final String DATE_FORMAT_FULL = "yyyy-MM-dd HH:mm:ss";

    public static final String DATE_FORMAT_SHORT = "yyyy-MM-dd";

    public static final String DATE_FORMAT_COMPACT = "yyyyMMdd";

    public static final String DATE_FORMAT_COMPACTFULL = "yyyyMMddHHmmss";

    public static final String DATE_FORMAT_FULL_MSEL = "yyyyMMddHHmmssSSSS";

    public static final String DATE_YEAR_MONTH = "yyyyMM";

    public static final String DATE_FORMAT_FULL_MSE = "yyyyMMddHHmmssSSS";

    /**
     * 获取系统当前日期
     *
     * @return
     */
    public static Date getCurrentDate() {
        return new Date();
    }

    /**
     * 获取系统当前日期
     *
     * @return
     */
    public static LocalDateTime getCurrentLocalDateTime() {
        return LocalDateTime.now();
    }


    /**
     * 功能描述
     * 获取当前时间
     * @return java.lang.String
     * @author zgw
     */
    public static String getDateFormatFullDe() {
        return getCurDateTime(DATE_FORMAT_SHORT);
    }

    /**
     * 根据时间格式返回对应的String类型的时间
     *
     * @param format
     * @return
     */
    public static String getCurDateTime(String format) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(format);
        String dataTime = now.format(dateTimeFormatter);
        return dataTime;
    }

    /**
     * 得到当前日期
     *
     * @return String 当前日期 yyyy-MM-dd HH:mm:ss格式
     * @author kevin
     */
    public static String getCurDateTimeFull() {
        return getCurDateTime(DATE_FORMAT_FULL);
    }


    /**
     * 得到当前日期
     *
     * @return String 当前日期 yyyyMMddHHmmss格式
     * @author kevin
     */
    public static String getCurDateTime1() {
        return getCurDateTime(DATE_FORMAT_FULL);
    }

    /**
     * 得到当前日期YYYYMM格式
     *
     * @return String 当前日期 yyyyMM格式
     * @author kevin
     */
    public static String getCurDateYYYYMM() {
        return getCurDateTime(DATE_YEAR_MONTH);
    }


    /**
     * 得到当前日期
     *
     * @return String 当前日期 yyyyMMdd格式
     * @author kevin
     */
    public static String getCurDateYYYYMMDD() {
        return getCurDateTime(DATE_FORMAT_COMPACT);
    }

    /**
     * 当前日期时间戳(yyyyMMddHHmmssSSSS)
     *
     * @return
     * @author liangxuekai
     */
    public static String getTimeStamp() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(DATE_FORMAT_FULL_MSEL);
        return now.format(dateTimeFormatter);
    }


    /**
     * 得到当前日期的前N天时间 yyyymmdd
     *
     * @param format
     * @param day
     * @return
     */
    public static String beforeNDaysDate(String format, int day) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(format);
        if (day > 0) {
            return LocalDateTime.now().minusDays(day).format(dateTimeFormatter);
        }
        return null;
    }

    /**
     * 获得N个月后的日期
     * <p>
     * theDate 日期
     * <p>
     * int month 月数
     * <p>
     * format 格式
     */
    public static String afterNMonthDate(String theDate, int month, String format) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(format);
        return LocalDateTime.parse(theDate, dateTimeFormatter)
                .plusMonths(month)
                .format(dateTimeFormatter);

    }

    /**
     * 得到N天后的日期
     *
     * @param theDate 某日期
     *                格式 yyyy-MM-dd
     * @param nDayNum N天
     * @return String N天后的日期
     * @author kevin
     */
    public static String afterNDaysDate(String theDate, Integer nDayNum, String format) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(format);

        return LocalDateTime.parse(theDate, dateTimeFormatter)
                .plusDays(nDayNum)
                .format(dateTimeFormatter);
    }

    /**
     * 得到N小时后的日期
     *
     * @param theDate  时间
     * @param nHourNum N小时数
     * @param format   时间格式
     * @return
     */
    public static String afterNHoursDate(String theDate, Integer nHourNum, String format) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(format);
        return LocalDateTime.parse(theDate, dateTimeFormatter)
                .plusHours(nHourNum)
                .format(dateTimeFormatter);
    }

    /**
     * 得到N分钟后的日期
     *
     * @param theDate
     * @param nMinNum
     * @param format
     * @return
     */
    public static String afterNMinsDate(String theDate, Integer nMinNum, String format) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(format);
        return LocalDateTime.parse(theDate, dateTimeFormatter)
                .plusMinutes(nMinNum)
                .format(dateTimeFormatter);
    }

    /**
     * 得到N秒后的日期
     *
     * @param theDate
     * @param nSecNum
     * @param format
     * @return
     */
    public static String afterNSecondsDate(String theDate, Integer nSecNum, String format) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(format);
        return LocalDateTime.parse(theDate, dateTimeFormatter)
                .plusSeconds(nSecNum)
                .format(dateTimeFormatter);
    }


    /*
     * 得到上一个月或者下一个月的日期
     */
    public static String getDayafterMonth(String theDate, int month, String formatStr) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(formatStr);
        return LocalDateTime.parse(theDate).plusMonths(month).format(dateTimeFormatter);
       /* Calendar now = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
        Date dat1 = parseStringToDate(theDate, formatStr);
        now.setTime(dat1);
        sdf.setTimeZone(TimeZone.getDefault());
        now.add(Calendar.MONTH, month);
        return sdf.format(now.getTime());*/
    }

    /**
     * 将秒转换为小时分秒等
     *
     * @param sec
     * @return
     */
    public String changeTime(int sec) {
        String temp = "";
        if (sec < 60) {
            temp = "" + sec + "秒";
        } else if (sec < 3600) {
            temp = "" + sec / 60 + "分" + sec % 60 + "秒";
        } else {
            temp = "" + sec / 3600 + "小时" + (sec % 3600) / 60 + "分" + sec % 60 + "秒";
        }
        return temp;
    }

    /**
     * 方法描述:
     * 计算两个日期相差天数
     *
     * @param end   结束日期
     * @param start 开始日期
     * @return 作者：liangxuekai
     * 日期：2018 2018年1月31日
     */
    public static int getSubDays(String end, String start) {
        LocalDate startDate = LocalDate.parse(start);
        LocalDate endDate = LocalDate.parse(end);
        Long between = ChronoUnit.DAYS.between(startDate, endDate);
        return between.intValue();
    }


    public static String getTimeDiff(Date time1, Date time2) throws Exception {
        long l = time1.getTime() - time2.getTime();
        String returnStr = "";
        long day = l / (24 * 60 * 60 * 1000);
        if (day > 0) {
            returnStr += (day + "天");
        }
        long hour = (l / (60 * 60 * 1000) - day * 24);
        if (hour > 0) {
            returnStr += (hour + "小时");
        }
        long min = ((l / (60 * 1000)) - day * 24 * 60 - hour * 60);
        if (min > 0) {
            returnStr += (min + "分");
        }
        long s = (l / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
        if (s > 0) {
            returnStr += (s + "秒");
        }
        return returnStr;
    }

}
