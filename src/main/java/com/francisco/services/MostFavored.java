package com.francisco.services;

import com.francisco.domain.Cpgf;

import java.util.List;

public class MostFavored extends DataManipulation {

    private static final String PARAMETER = "Sigiloso";
    private static final String PARAMETER_2 = "NAO SE APLICA";
    private static final String PARAMETER_3 = "SEM INFORMACAO";

    public void filterByFavored(List<Cpgf> beans) {

        List<String> favored = beans.stream().map(Cpgf::getNomeFavorecido)
                .filter(nomeFavorecido -> !nomeFavorecido.isEmpty())
                .filter(nomeFavorecido -> !nomeFavorecido.contains(PARAMETER))
                .filter(nomeFavorecido -> !nomeFavorecido.contains(PARAMETER_2))
                .filter(nomeFavorecido -> !nomeFavorecido.contains(PARAMETER_3))
                .toList();

        String retrieveNameCompanyMostFavored = retrieveData(favored);
        Integer retrieveTimesIncidenceCompany = maxValueFoundInMap();

        mountExit(retrieveNameCompanyMostFavored, retrieveTimesIncidenceCompany);
    }

    @Override
    protected String retrieveData(List<String> listOfData) {
        return super.retrieveData(listOfData);
    }

    @Override
    protected Integer maxValueFoundInMap() {
        return super.maxValueFoundInMap();
    }

    public void mountExit(String favoredName, Integer companyMostFavored) {
        System.out.println("FAVORECIDO QUE MAIS RECEBEU COMPRAS REALIZADAS UTILIZANDO O " +
                "CPGF: " + favoredName + " COM INCIDÊNCIA DE: " + companyMostFavored + " VEZES");
    }
}
