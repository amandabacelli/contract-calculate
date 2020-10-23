package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

    private Integer id;
    private Double totalValue;
    private Date date;

    private List<Installment> installments = new ArrayList<>();

    public Contract(Integer id, Double totalValue, Date date) {
        this.id = id;
        this.totalValue = totalValue;
        this.date = date;
    }

    public int getId() {
        return id;
    }


    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double value) {
        this.totalValue = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

    public void addInstallment(Installment installment){
        installments.add(installment);
    }

    public void removeInstallment(Installment installment) {
        installments.remove(installment);
    }
}
