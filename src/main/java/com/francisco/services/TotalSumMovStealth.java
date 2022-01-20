package com.francisco.services;

import com.francisco.domain.Cpgf;
import com.francisco.services.formatter.NumberFormatter;

import java.util.List;

public class TotalSumMovStealth {

    private static final String PARAMETER = "Sigiloso";

    public static String totalStealthMovCpgf(List<Cpgf> beans) {

        double totalStealthMov = beans.stream().filter(o -> o.getNomePortador().equalsIgnoreCase(PARAMETER))
                .mapToDouble(o -> Double.parseDouble(o.getValorTransacao().replace(',', '.'))).sum();

        return NumberFormatter.formatNumber(totalStealthMov);
    }
}
