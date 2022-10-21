package com.example.doancuoiky.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class DateTimeHelper {


        private static final String Pattern = "dd/MM/yyyy";
        public static Date toDate(String st) throws ParseException{
            SimpleDateFormat sdf = new SimpleDateFormat(Pattern);

            return sdf.parse(st);
        }

        public static  String toString(Date date){
            SimpleDateFormat sdf = new SimpleDateFormat(Pattern);

            return sdf.format(date);
        }
    }

