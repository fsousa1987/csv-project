package com.francisco.services;

import com.francisco.domain.Cpgf;
import com.francisco.services.formatter.NumberFormatter;

import java.util.List;

public class TotalSumMovCpgf {

    public static String totalSumMovCpgf(List<Cpgf> beans) {
        double sum = beans.stream().mapToDouble(
                o -> Double.parseDouble(o.getValorTransacao().replace(',', '.'))).sum();

        return NumberFormatter.formatNumber(sum);
    }
}
