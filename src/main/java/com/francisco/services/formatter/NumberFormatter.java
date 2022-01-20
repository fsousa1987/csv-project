package com.francisco.services.formatter;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class NumberFormatter {

    static DecimalFormat df = new DecimalFormat("#,###.00");
    static DecimalFormatSymbols dfs = new DecimalFormatSymbols();

    public static String formatNumber(Double numberToFormat) {
        dfs.setGroupingSeparator('.');
        return df.format(numberToFormat);
    }
}
