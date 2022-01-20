import com.francisco.domain.Cpgf;
import com.francisco.services.*;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;


public class Program {

    public static void main(String[] args) throws FileNotFoundException {

        String path = "C:\\temp\\202110_CPGF.csv";
        List<Cpgf> beans = createListFromCsv(path);

        String totalSumCpgf = TotalSumMovCpgf.totalSumMovCpgf(beans);
        System.out.println("SOMA TOTAL DAS MOVIMENTAÇÕES UTILIZANDO o CPGF: R$ " + totalSumCpgf);

        String totalSumStealthCpgfMov = TotalSumMovStealth.totalStealthMovCpgf(beans);
        System.out.println("SOMA TOTAL DAS MOVIMENTAÇÕES SIGILOSAS UTILIZANDO o CPGF: R$ " + totalSumStealthCpgfMov);

        TotalSecretMovDepart totalSecretMovDepart = new TotalSecretMovDepart();
        totalSecretMovDepart.filterByDepartment(beans);

        WithdrawMov withdrawMov = new WithdrawMov();
        withdrawMov.filterByNomePortador(beans);

        MostFavored mostFavored = new MostFavored();
        mostFavored.filterByFavored(beans);
    }

    private static List<Cpgf> createListFromCsv(String path) throws FileNotFoundException {
        return (List<Cpgf>) new CsvToBeanBuilder(new FileReader(path))
                .withSeparator(';')
                .withSkipLines(1)
                .withType(Cpgf.class)
                .build()
                .parse();
    }
}
