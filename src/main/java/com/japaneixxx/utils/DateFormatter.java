package com.japaneixxx.utils;

public class DateFormatter {
    public String formatDateRemoveBars(String date) {
        String[] newDateArray = date.split("/");

        StringBuilder newDate = new StringBuilder();
        for(String item : newDateArray){
            newDate.append(item);
        }

        return newDate.toString();
    }
    public String formatDateAddBarsDMY(String date){
        String day = date.substring(0,2);
//        System.out.println(day);
        String month = date.substring(2,4);
//        System.out.println(month);
        String year = date.substring(4,8);
//        System.out.println(year);

        return day+"/"+month+"/"+year;
    }

    public String formatDateAddBarsYMD(String date){
        String year = date.substring(0,4);
//        System.out.println(day);
        String month = date.substring(4,6);
//        System.out.println(month);
        String day = date.substring(6,8);
//        System.out.println(year);

        return year+"/"+month+"/"+day;
    }
    public String formatDMYToYMD(String date){
        DateFormatter dF = new DateFormatter();
        String newDate = dF.formatDateRemoveBars(date);

        String day = newDate.substring(0,2);
        String month = newDate.substring(2,4);
        String year = newDate.substring(4,8);

        return year+month+day;
    }

    public String formatYMDToDMY(String date){
        DateFormatter dF = new DateFormatter();
        String newDate = dF.formatDateRemoveBars(date);

        String day = newDate.substring(6,8);
        String month = newDate.substring(4,6);
        String year = newDate.substring(0,4);

        return day+month+year;
    }

}
