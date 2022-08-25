package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ContractApplication {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter contract data");
        System.out.print("Number: ");
        int contractNumber = scanner.nextInt();
        System.out.print("Pickup (dd/MM/yyyy): ");
        Date contractDate = sdf.parse(scanner.next());
        System.out.print("Contract Value: ");
        double contractValue = scanner.nextDouble();

        Contract contract = new Contract(contractNumber, contractDate, contractValue);

        System.out.print("Enter number of installments: ");
        int installmentNumber = scanner.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, installmentNumber);

        System.out.println("Installments:");
        for (Installment installment : contract.getInstallmentList()) {
            System.out.println(installment);
        }

        scanner.close();
    }
}
