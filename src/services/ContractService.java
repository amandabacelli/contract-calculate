package services;

import models.Contract;
import models.Installment;

import java.util.Calendar;
import java.util.Date;

public class ContractService  {

    private PaymentService paymentService;

    public ContractService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    //calculo de parcelas utilizando os metodos da interface e nao da classe de regras de negocio, assim nao acoplo o sistema
    public void processContract(Contract contract, int months) {

        double basicValue = contract.getTotalValue() / months;
        for(int i = 1; i<= months; i++) {
            Date date = addMonths(contract.getDate(), i);
            double updateValue = basicValue + paymentService.interest(basicValue, i);
            double fullValue = updateValue + paymentService.paymentFee(updateValue);
            contract.addInstallment(new Installment(date, fullValue));
        }

    }
    //adicionar 1 mes para cada parcela
    private Date addMonths(Date date, int n) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, n);
        return cal.getTime();
    }

}
