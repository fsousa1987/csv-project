package com.francisco.services;

import com.francisco.domain.Cpgf;
import com.francisco.services.formatter.NumberFormatter;

import java.util.List;
import java.util.Objects;

public class WithdrawMov extends DataManipulation {

    private static final String PARAMETER = "SAQUE";

    public void filterByNomePortador(List<Cpgf> beans) {
        List<String> carriers = beans.stream().filter(o -> o.getTransacao().contains(PARAMETER))
                .map(Cpgf::getNomePortador).toList();

        String carrier = retrieveData(carriers);
        Integer maxCarrierTransaction = maxValueFoundInMap();
        String amountTotalSpendWithdrawal = recoverTotalValueSpendBearer(carrier, beans);
        String orgaoPortador = nomeOrgaoPortador(beans, carrier);
        montarSaida(carrier, amountTotalSpendWithdrawal, orgaoPortador, maxCarrierTransaction);

    }

    private String recoverTotalValueSpendBearer(String nomePortador, List<Cpgf> beans) {

        double saque = beans.stream().filter(o -> o.getTransacao().contains("SAQUE"))
                .filter(o -> o.getNomePortador().equalsIgnoreCase(nomePortador))
                .mapToDouble(o -> Double.parseDouble(o.getValorTransacao().replace(',', '.'))).sum();

        return NumberFormatter.formatNumber(saque);
    }

    private String nomeOrgaoPortador(List<Cpgf> beans, String portador) {
        return Objects
                .requireNonNull(beans.stream()
                        .filter(b -> portador.equals(b.getNomePortador()))
                        .findFirst().orElse(null))
                .getNomeOrgao();
    }

    private void montarSaida(String portador, String valorTotalGastoSaque, String orgaoPortador, Integer max) {
        System.out.println("O PORTADOR QUE MAIS REALIZOU SAQUES NO PERÍODO FOI: " + portador + ", COM " + max +
                " SAQUES, TOTALIZANDO UM VALOR DE: R$ " + valorTotalGastoSaque);
        System.out.println("O NOME DO ORGAO DO PORTADOR É: " + orgaoPortador);
    }

    @Override
    protected String retrieveData(List<String> listOfData) {
        return super.retrieveData(listOfData);
    }

    @Override
    protected Integer maxValueFoundInMap() {
        return super.maxValueFoundInMap();
    }
}
