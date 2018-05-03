package com.bestnbest.satyajeetjena.utils;

import android.app.Dialog;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by mathivanan on 09/10/16.
 */
public class AllValidation {

    public static Dialog dialog;
    public static TextView dis;
    public static TextView warn;
    public static TextView msg;


    public static boolean validate(final String hex) {
        final String EMAIL_PATTERN =
                "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(hex);
        return matcher.matches();

    }

    public static boolean validatephonenum(final String hex) {
        // final String EMAIL_PATTERN ="((\\+*)((0[ -]+)*|(91 )*)(\\d{12}+|\\d{10}+))|\\d{5}([- ]*)" +"\\d{6}";
        final String ph = "^([+][9][1]|[9][1]|[0]){0,1}([7-9]{1})([0-9]{9})$";
        Pattern pattern = Pattern.compile(ph);
        Matcher matcher = pattern.matcher(hex);
        return matcher.matches();

    }



}
