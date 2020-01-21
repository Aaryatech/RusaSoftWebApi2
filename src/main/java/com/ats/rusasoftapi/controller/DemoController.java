package com.ats.rusasoftapi.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping(value = { "/getMonthEnds" }, method = RequestMethod.POST)
	public @ResponseBody List<Date> saveFacultyAcademic(@RequestParam("fromDate") String fromDate,
			@RequestParam("toDate") String toDate) {
		System.err.println("Hello  ");
		List<Date> arryadate = new ArrayList<Date>();
List<DateValues> dateList=new ArrayList<>();
		SimpleDateFormat yydate = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat dddate = new SimpleDateFormat("dd-MM-yyyy");
		int totalcount = 0;
		String sundayDates = new String();
		try {
			for (Date j = yydate.parse(fromDate); j.compareTo(yydate.parse(toDate)) <= 0;) {
				// System.err.println("a");
				Calendar c = Calendar.getInstance();
				c.setTime(j);
				int dayOfWeek = c.get(Calendar.DAY_OF_WEEK) - 1;
				 System.err.println("WEEK_OF_YEAR of  " + c.get(Calendar.WEEK_OF_YEAR));
				if (dayOfWeek == 0) {
					System.err.println("J " +j);
					//arryadate.add(j);
					DateValues dv=new DateValues();
					dv.setDate(c.getTime());
					dv.setValue("WEEK" +c.get(Calendar.WEEK_OF_YEAR));
					dateList.add(dv);
					System.err.println("arr " +dateList.toString());
					sundayDates = sundayDates + "," + dddate.format(j);
					//System.out.println("Sunday " + dddate.format(j));
					totalcount++;
				}
				
				/*
				 * if (c.get(Calendar.DAY_OF_MONTH) == c.getActualMaximum(Calendar.DAY_OF_MONTH)
				 * || 15 == c.get(Calendar.DAY_OF_MONTH)) {
				 * System.out.println("Hello Bi Weekly " + dddate.format(j)); }
				 * 
				 * if (c.get(Calendar.DAY_OF_MONTH) ==
				 * c.getActualMaximum(Calendar.DAY_OF_MONTH)) { //c.set(Calendar.DAY_OF_MONTH,
				 * c.getActualMaximum(Calendar.DAY_OF_MONTH)); System.err.println("Month End " +
				 * dddate.format(j)); }
				 * 
				 * if (c.get(Calendar.DAY_OF_MONTH) == 30 && c.get(Calendar.MONTH)==5
				 * ||c.get(Calendar.DAY_OF_MONTH) == 30 && c.get(Calendar.MONTH)==8
				 * ||c.get(Calendar.DAY_OF_MONTH) == 31 && c.get(Calendar.MONTH)==11
				 * ||c.get(Calendar.DAY_OF_MONTH) == 31 && c.get(Calendar.MONTH)==2){
				 * System.out.println("Hello Quarterly  " + dddate.format(j));
				 * 
				 * }
				 * 
				 * if (c.get(Calendar.DAY_OF_MONTH) == 30 && c.get(Calendar.MONTH)==8
				 * ||c.get(Calendar.DAY_OF_MONTH) == 31 && c.get(Calendar.MONTH)==2){
				 * System.err.println("Half Yearly   " + dddate.format(j)); }
				 * 
				 * if (c.get(Calendar.DAY_OF_MONTH) == 31 && c.get(Calendar.MONTH)==2){
				 * System.out.println("Hello  Yearly   " + dddate.format(j)); }
				 */
				j.setTime(j.getTime() + 1000 * 60 * 60 * 24);
			} // end of for
System.err.println("dateList " +dateList.toString());
		} catch (Exception e) {
			System.err.println("exce in getting data between two dates " + e.getMessage());
			e.printStackTrace();// TODO: handle exception
		}

		return arryadate;

	}

}
