import models.Contract;
import models.Installment;
import services.ContractService;
import services.PaypalService;

import javax.sound.midi.Soundbank;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");

        System.out.println("Insira os dados do contrato");

        System.out.println("Numero: ");
        int numero = sc.nextInt();

        System.out.println("Data (dd/mm/yyyy: ");
        Date data = simpleDateFormat.parse(sc.next());

        System.out.println("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        //crio um novo contrato
        Contract contract = new Contract(numero, totalValue, data);

        System.out.println("Insira o numero de parcelas: ");
        int n = sc.nextInt();

        //defino o tipo de taxa, caso tenha mais de um tipo eu instancio as respectivas classes
        ContractService contractService = new ContractService(new PaypalService());

        //calculo as parcelas de acordo com o tipo de taxa definida
        contractService.processContract(contract, n);

        System.out.println("Parcelas: ");
        for(Installment x : contract.getInstallments()) {
            System.out.println(x);
        }

        sc.close();

    }
}
