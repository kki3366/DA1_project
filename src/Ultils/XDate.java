/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ultils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class XDate {

    // gọi lớp SimpleDateFormat định danh formater
    static SimpleDateFormat formater = new SimpleDateFormat();

    /*
    Kiểu: Date
    Tên Hàm:  toDate
    @param: date kiểu String
    @param: pattern kiểu String
    dùng để chuyển một String ngày sang Date ngày theo mẫu gồm :dd- MM-yyyy, MM-dd-yyyy
     */
    public static Date toDate(String date, String pattern) {

        try {
            formater.applyPattern(pattern);
            return formater.parse(date);
        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        }
    }

    /*
    Kiểu: String
    Tên Hàm:  toString
    @param: date kiểu Date
    @param: pattern kiểu String
    dùng để chuyển một Date ngày sang String ngày theo mẫu gồm :dd- MM-yyyy, MM-dd-yyyy
     */
    public static String toString(Date date, String pattern) {
        formater.applyPattern(pattern);
        return formater.format(date);
    }

    /*
    Kiểu: Date
    Tên Hàm:  addDays
    @param: date kiểu Date
    @param: days kiểu long
    dùng để chuyển một Date ngày sang Date ngày theo mẫu gồm :dd- MM-yyyy HH:mm:ss Z
     */
    public static Date addDays(Date date, long days) {
        date.setTime(date.getTime() + days * 24 * 60 * 60 * 1000);
        return date;
    }

}
