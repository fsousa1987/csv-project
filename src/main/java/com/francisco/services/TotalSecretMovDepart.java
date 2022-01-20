package com.francisco.services;

import com.francisco.domain.Cpgf;
import com.francisco.services.formatter.NumberFormatter;

import java.util.List;

public class TotalSecretMovDepart extends DataManipulation {

    private static final String PARAMETER = "Sigiloso";

    public void filterByDepartment(List<Cpgf> beans) {
        List<String> departmentsWithConfidentialTransactions =
                beans.stream()
                        .filter(o -> o.getNomePortador()
                                .equalsIgnoreCase(PARAMETER))
                        .map(Cpgf::getNomeOrgao).toList();

        String departmentName = retrieveData(departmentsWithConfidentialTransactions);
        String totalAmountExpended = recoverTotalValueExpenditure(departmentName, beans);
        Integer maxDepartmentWithSecretTransaction = maxValueFoundInMap();
        mountExit(departmentName, totalAmountExpended, maxDepartmentWithSecretTransaction);
    }

    @Override
    protected String retrieveData(List<String> listOfData) {
        return super.retrieveData(listOfData);
    }

    @Override
    protected Integer maxValueFoundInMap() {
        return super.maxValueFoundInMap();
    }

    private String recoverTotalValueExpenditure(String departmentName, List<Cpgf> beans) {

        double totalValue = beans.stream().filter(o -> o.getNomePortador().equalsIgnoreCase(PARAMETER))
                .filter(o -> o.getNomeOrgao().equalsIgnoreCase(departmentName))
                .mapToDouble(o -> Double.parseDouble(o.getValorTransacao().replace(',', '.'))).sum();

        return NumberFormatter.formatNumber(totalValue);
    }

    private void mountExit(String departmentName, String totalAmountExpended,
                           Integer maxDepartmentWithSecretTransaction) {

        System.out.println("O ÓRGÃO QUE MAIS REALIZOU MOVIMENTAÇÕES SIGILOSAS FOI: " +
                departmentName + ", COM " + maxDepartmentWithSecretTransaction +
                " TRANSAÇÕES, TENDO UM TOTAL DE GASTOS SIGILOSOS DE: R$ " + totalAmountExpended);
    }
}
