/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis3238lab1;

import java.lang.Math;

/**
 *
 * @author tuf46632
 */
public class Date {
    public int year;
    public int month;
    public int day;
    
    public Date(int startYear, int startMonth, int startDay) {
        year = startYear;
        month = startMonth;
        day = startDay;
    }
    
    public int daysTo(Date d) {
        int sum = 0;
        int yearDif = Math.abs(this.year - d.year);
        int monthDif = Math.abs(this.month - d.month);
        int dayDif = Math.abs(this.day - d.day);
        sum += (yearDif * 365);
        sum += (monthDif * 30);
        sum += dayDif;
        return sum;
    }
}
