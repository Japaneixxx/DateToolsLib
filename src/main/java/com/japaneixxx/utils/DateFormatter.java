package com.japaneixxx.utils;

/**
 * @author Japaneixxx
 * @version 1.0.0
 * @since 1.0.0
 */
public class DateFormatter {

    /** Metodo para transformar uma data formatada (01/01/2000)
     * em uma data não formatada (01012000)
     *
     * @param date ‘String’ - Recebe uma data no formato DD/MM/YYYY
     * @return String - Retorna a data no formato DDMMYYYY
     */
    public String formatDateRemoveBars(String date) {
        String[] newDateArray = date.split("/");

        StringBuilder newDate = new StringBuilder();
        for(String item : newDateArray){
            newDate.append(item);
        }

        return newDate.toString();
    }

    /** Metodo para transformar uma data não formatada (01012000)
     * em uma data formatada (01/01/2000)
     *
     * @param date String - Recebe uma data no formato DDMMYYYY
     * @return String - Retorna a data no formato DD/MM/YYYY
     */
    @Deprecated(since = "1.1.0") String formatDateAddBarsDMY(String date){
        String day = date.substring(0,2);
//        System.out.println(day);
        String month = date.substring(2,4);
//        System.out.println(month);
        String year = date.substring(4,8);
//        System.out.println(year);

        return day+"/"+month+"/"+year;
    }

    /** Metodo para transformar uma data nao formatada (01012000)
     * em uma data formatada (01/01/2000), usando um separador espescifico ('/' por padrão)
     *
     * @param date String - Recebe uma data no formato DDMMYYYY
     * @param separator char - Recebe um caractere para ser usado como separador
     * @return String - Retorna a data no formato DD/MM/YYYY usando o separador especificado
     * @since 1.1.0
     */
    String formatDateDMY(String date, char separator){
        String day = date.substring(0,2);
//        System.out.println(day);
        String month = date.substring(2,4);
//        System.out.println(month);
        String year = date.substring(4,8);
//        System.out.println(year);

        return day+separator+month+separator+year;
    }
    String formatDateDMY(String date){
        char separator = '/';
        String day = date.substring(0,2);
//        System.out.println(day);
        String month = date.substring(2,4);
//        System.out.println(month);
        String year = date.substring(4,8);
//        System.out.println(year);

        return day+separator+month+separator+year;
    }

    /** Metodo para transformar uma data não formatada (20000101)
     * em uma data formatada (2000/01/01)
     *
     * @param date String - Recebe uma data no formato YYYYMMDD
     * @return String - Retorna a data no formato YYYY/MM/DD
     */
    @Deprecated(since = "1.1.0") public String formatDateAddBarsYMD(String date){
        String year = date.substring(0,4);
//        System.out.println(day);
        String month = date.substring(4,6);
//        System.out.println(month);
        String day = date.substring(6,8);
//        System.out.println(year);
        return year+"/"+month+"/"+day;
    }

    /** Metodo para transformar uma data nao formatada (20000101)
     * em uma data formatada (2000/01/01), usando um separador espescifico ('/' por padrão)
     *
     * @param date String - Recebe uma data no formato YYYYMMDD
     * @param separator char - Recebe um caractere para ser usado como separador
     * @return String - Retorna a data no formato YYYY/MM/DD usando o separador especificado
     * @since 1.1.0
     */
    String formatDateYMD(String date, char separator){
        String year = date.substring(0,4);
        String month = date.substring(4,6);
        String day = date.substring(6,8);
        return day+separator+month+separator+year;
    }
    String formatDateYMD(String date){
        String year = date.substring(0,4);
        String month = date.substring(4,6);
        String day = date.substring(6,8);
        return day+"/"+month+"/"+year;
    }

    /** Metodo para transformar uma data DDMMYYYY(01012000) em YYYYMMDD(20000101)
     *
     * @param date String - Recebe uma data no formato DDMMYYYY
     * @return String - Retorna a data no formato YYYYMMDD
     */
    public String formatDMYToYMD(String date){
        DateFormatter dF = new DateFormatter();
        String newDate = dF.formatDateRemoveBars(date);

        String day = newDate.substring(0,2);
        String month = newDate.substring(2,4);
        String year = newDate.substring(4,8);

        return year+month+day;
    }

    /** Metodo para transformar uma data YYYYMMDD(20000101) em DDMMYYYY(01012000)
     *
     * @param date String - Recebe uma data no formato YYYYMMDD
     * @return String - Retorna a data no formato DDMMYYYY
     */
    public String formatYMDToDMY(String date){
        DateFormatter dF = new DateFormatter();
        String newDate = dF.formatDateRemoveBars(date);

        String day = newDate.substring(6,8);
        String month = newDate.substring(4,6);
        String year = newDate.substring(0,4);

        return day+month+year;
    }

}
