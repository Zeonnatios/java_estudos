package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.util.Calendar;
import java.util.Date;

public class ContractService {

    double MONTHLY_FEE = 0.01;

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months) {
        double basicQuota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i += 1) {
            Date date = addMonths(contract.getDate(), i);
            double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
            System.out.println(updatedQuota);
            double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
            contract.getInstallmentList().add(new Installment(date, fullQuota));
        }
    }

    private Date addMonths(Date date, int n) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, n);
        return cal.getTime();
    }

}
