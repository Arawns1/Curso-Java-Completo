package services;


import java.util.Calendar;

import entities.Contract;
import entities.Installment;

public class ContractService {
	
	public void processContract(Contract contract, Integer months) {
		
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(contract.getDate());
		
		OnlinePaymentService service = new PaypalService();
		double basicQuota = contract.getTotalValue() / months;
		
		
		for(int i = 1; i <= months; i++) {
			cal.add(Calendar.MONTH, +1);
			
			double interest = service.interest(basicQuota, i);
			double fee = service.paymentFee(basicQuota + interest);
			double quota = basicQuota + interest + fee;
			contract.addInstallment(new Installment(cal.getTime(), quota));
			
	
			
			
		}
		
	}
}
