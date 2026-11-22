package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months){

        double parcela = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            double amount = parcela + onlinePaymentService.interest(parcela, i) + onlinePaymentService.paymentFee(parcela + onlinePaymentService.interest(parcela, i));

            LocalDate date = contract.getDate().plusMonths(i);

            contract.getInstallments().add(new Installment(date, amount));
        }

    }
}
