package com.fund.util.tools;

import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class TTime {

	public static int getTime()
	{
		return (int)(System.currentTimeMillis()/1000);
	}
	
	public static Date getDate()
	{
		return new Date();
	}
	
	
	public static Date getlastDate()
	{
		Calendar   cal   =   Calendar.getInstance();
		  cal.add(Calendar.DATE,   -1);
		return  cal.getTime();
	}
	/**
	* @Title: getValid 
	* @Description: TODO(ʱ����ڵ���Ľ�ֹʱ���ڸ�ֵΪ��ǰ���ڵĽ�ֹʱ��) 
	* @param @param time
	* @param @return    �趨�ļ� 
	* @return int    �������� 
	* @throws
	 */
	public int getValid(int time) {
		int cTime = getTime();
		String data = TTime.toDate(cTime, "yyyy-MM-dd")+" 23:59:59";
		int end = TTime.toTime(data, "yyyy-MM-dd HH:mm:ss");
		if(time>end){
			return end;
		}else{
			return time;
		}
	}
	
	
	public static Date format(String date,String fromat) {
		SimpleDateFormat sdf = new SimpleDateFormat(fromat);
		try {
			return sdf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static String format(String fromat, int seconds) {
		Calendar cd = Calendar.getInstance();
		cd.setTimeInMillis((long)seconds*1000);
		SimpleDateFormat sdf = new SimpleDateFormat(fromat);
		return sdf.format(cd.getTime());
	}
	public static int toTime(String source,String format)
	{
		if(format == null || source == null)
		{
			return -1;
		}
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		Date date= null;
		try {
			date=  simpleDateFormat.parse(source);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(date!=null)
		{
			return (int)(date.getTime()/1000);
		}
		return -1;
	}
	
	public static String toDate(int source,String format)
	{
		String s=String.valueOf(source);
		 if(s == null || StringUtils.isEmpty(s) || s.equals("null")){
	            return "";  
	        }  
	        if(format == null || StringUtils.isEmpty(format)) format = "yyyy-MM-dd HH:mm:ss";
	        SimpleDateFormat sdf = new SimpleDateFormat(format);  
	        return sdf.format(new Date(Long.valueOf(s+"000"))); 
	}
	
	public static int diffDate(long starttime){
		return (int)(System.currentTimeMillis()/1000-starttime)/86400;
	}
	public static int diffDate(int start,int end){
		return (end-start)/86400;
	}
	public static Date addTimeForMinute(Date date, int value) {
		return addTime(date, Calendar.MINUTE, value);
	}

	public static Date addTimeForHour(Date date, int value) {
		return addTime(date, Calendar.HOUR, value);
	}

	public static Date addTimeForDay(Date date, int value) {
		return addTime(date, Calendar.DATE, value);
	}

	public static Date addTimeForMonth(Date date, int value) {
		return addTime(date, Calendar.MONTH, value);
	}

	public static Date addTimeForWeek(Date date, int value) {
		return addTime(date, Calendar.WEEK_OF_MONTH, value);
	}

	public static Date addTime(Date date, int field, int value) {
		if (date == null) {
			return null;
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(field, value);
		return cal.getTime();
	}
	/**
	 * ��ȡ���ڵľ���ֵ�����磬��ȡ���ڵ��ꡢ�졢�ա�ʱ���֡������Ϣ��
	 * 
	 * @param date
	 *            ����
	 * @param field
	 *            ��ȡ�ֶΣ�Calendar.YEAR ��������ݵȡ�
	 * @return ���ؾ������ֵ
	 */
	public static int getNumberFromDate(Date date, int field) {
		Calendar cal = Calendar.getInstance();
		if (date != null) {
			cal.setTime(date);
		}
		return cal.get(field);
	}

	/**
	 * ��ȡ���ڵġ��ꡯ��
	 * 
	 * @param date
	 *            ����
	 * @return ���ؾ������ֵ
	 */
	public static int getYear(Date date) {
		return getNumberFromDate(date, Calendar.YEAR);
	}
	/**
	 * ��ȡ���ڵġ��¡���
	 * 
	 * @param date
	 *            ����
	 * @return ���ؾ������ֵ
	 */
	public static int getMonth(Date date) {
		return getNumberFromDate(date, Calendar.MONTH) + 1;
	}

	/**
	 * ��ȡ���ڵġ��ա���
	 * 
	 * @param date
	 *            ����
	 * @return ���ؾ������ֵ
	 */
	public static int getDayOfMonth(Date date) {
		return getNumberFromDate(date, Calendar.DAY_OF_MONTH);
	}
	/**
	 * ��ȡ���ڵ�Сʱ
	 * @param date
	 * @return
	 */
	public static int getHourOfDay(Date date){
		return getNumberFromDate(date, Calendar.HOUR_OF_DAY);
	}
	/**
	 * ��ȡ���ڵķ���
	 * @param date
	 * @return
	 */
	public static int getMinuteOfDay(Date date){
		return getNumberFromDate(date, Calendar.MINUTE);
	}

	/**
	 * ָ����dateʱ���Сʱ�����Ӻ������Ϣ��
	 * 
	 * @param date
	 *            ָ������ʱ��
	 * @param hour
	 * @param minute
	 * @param second
	 * @return
	 */
	public static Date setTime(Date date, int hour, int minute, int second) {
		return setTime(date, hour, minute, second, -1);
	}

	public static Date setTime(Date date, int hour, int minute, int second,
			int millSecond) {
		if (date == null) {
			return null;
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		if (hour > -1) {
			cal.set(Calendar.HOUR_OF_DAY, hour);
		}
		if (minute > -1) {
			cal.set(Calendar.MINUTE, minute);
		}
		if (second > -1) {
			cal.set(Calendar.SECOND, second);
		}
		if (millSecond > -1) {
			cal.set(Calendar.MILLISECOND, millSecond);
		}
		return cal.getTime();
	}

	public static String parseStringFromDate(Date date, String format) {
		return parseStringFromDate(date, format, Locale.US);
	}

	public static String parseStringFromDate(Date date, String format,
			Locale locale) {
		return parseStringFromDate(date, format, locale, null);
	}

	public static String parseStringFromDate(Date date, String format,
			Locale locale, TimeZone tz) {
		if (date == null) {
			return null;
		}
		SimpleDateFormat fm = new SimpleDateFormat(format, locale);
		if (tz != null) {
			fm.setTimeZone(tz);
		}
		return fm.format(date);
	}
	/**
	* @Title: getDaysByYearAndMonth 
	* @Description: TODO(����ĳ�꣬ĳ�»�ȡ�����м���) 
	* @param @param month
	* @param @return    �趨�ļ� 
	* @return int    �������� 
	* @throws
	 */
	public static int getDaysByYearAndMonth(int year,int month){
		Calendar time=Calendar.getInstance(); 
		time.clear(); 
		time.set(Calendar.YEAR,year); 
		//year��
		time.set(Calendar.MONTH,month-1);
		//Calendar����Ĭ��һ��Ϊ0,month�� 
		int days=time.getActualMaximum(Calendar.DAY_OF_MONTH);//���·ݵ�����
		return days;
	}
	/**
	 * 
	* @Title: getYear 
	* @Description: TODO(��ȡ��ĸ�ʽ  #-01-01 00:00:00) 
	* @param @param time
	* @param @return    �趨�ļ� 
	* @return int    �������� 
	* @throws
	 */
	public static int getYear(int time){
		Date date = new Date(Long.valueOf(time+"000"));
		int year = getYear(date);
		String years = year+"-01-01 00:00:00";
		year = toTime(years, "yyyy-MM-dd HH:mm:ss");
		return year;
	}
	
	/**
	 * 
	* @Title: getMonth 
	* @Description: TODO(��ȡ�µĸ�ʽ  2015-#-01 00:00:00��ʱ���) 
	* @param @param time
	* @param @return    �趨�ļ� 
	* @return int    �������� 
	* @throws
	 */
	public static int getMonth(int time){
		Date date = new Date(Long.valueOf(time+"000"));
		int year = getYear(date);
		int month = getMonth(date);
		String months = String.valueOf(year)+"-"+String.valueOf(month)+"-01 00:00:00";
		month = toTime(months, "yyyy-MM-dd HH:mm:ss");
		return month;
	}
	
	/**
	 * 
	* @Title: getDay 
	* @Description: TODO(��ȡ�յĸ�ʽ  2015-01-# 00:00:00��ʱ���) 
	* @param @param time
	* @param @return    �趨�ļ� 
	* @return int    �������� 
	* @throws
	 */
	public static int getDay(int time){
		Date date = new Date(Long.valueOf(time+"000"));
		int year = getYear(date);
		int month = getMonth(date);
		int day = getDayOfMonth(date);
		String days = String.valueOf(year)+"-"+String.valueOf(month)+"-"+String.valueOf(day)+" 00:00:00";
		day = toTime(days, "yyyy-MM-dd HH:mm:ss");
		return day;
	}
	/**
	 * 
	* @Title: getDay 
	* @Description: TODO(��ȡ�յĸ�ʽ  2015-01-# 00:00:00��ʱ���) 
	* @param @param time
	* @param @return    �趨�ļ� 
	* @return int    �������� 
	* @throws
	 */
	public static int getHoursOfDay(int time){
		Date date = new Date(Long.valueOf(time+"000"));
		int year = getYear(date);
		int month = getMonth(date);
		int day = getDayOfMonth(date);
		int hour = getHourOfDay(date);
		String days = String.valueOf(year)+"-"+String.valueOf(month)+"-"+String.valueOf(day)+" "+String.valueOf(hour)+":00:00";
		day = toTime(days, "yyyy-MM-dd HH:mm:ss");
		return day;
	}
	
	public static void main(String[] args){
		int year = getYear(1446188776);
		System.out.println(year);
//		String data = TTime.toDate(cTime, "yyyy-MM-dd")+" 23:59:59";
//		int end = TTime.toTime(data, "yyyy-MM-dd HH:mm:ss"); 
	}
	
    /**��������
     * @param date1
     * @param date2
     * @return
     * @throws ParseException
     */
    public static int getYearSpace(Date date1, Date date2){

        int result = 0;

        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();

        c1.setTime(date1);
        c2.setTime(date2);

        result = c2.get(Calendar.YEAR) - c1.get(Calendar.YEAR);

        return result == 0 ? 1 : Math.abs(result);

    }

}
