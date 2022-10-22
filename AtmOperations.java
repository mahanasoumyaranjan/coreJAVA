package atmmachine;

import java.util.Map;
import java.util.HashMap;
public class AtmOperations implements AtmOperationInterf {
	ATM atm = new ATM();
	Map<Double,String> ministatement = new HashMap<>();
	@Override
	public void viewBalance() {
		System.out.println("Available balance is : "+atm.getBalance());
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount <= atm.getBalance()){
			ministatement.put(withdrawAmount," amount withdrawn");
			System.out.println("Collect the cash "+withdrawAmount);
			atm.setBalance(atm.getBalance()-withdrawAmount);
			viewBalance();
		}else{
			System.out.println("Insuffisicent balance to withdraw");
		}
	}

	@Override
	public void depositAmount(double depositAmount) {
		ministatement.put(depositAmount," amount is deposited");
		System.out.println(depositAmount+" is deposited successfully");
		atm.setBalance(atm.getBalance()+depositAmount);
		viewBalance();
	}

	@Override
	public void viewMiniStatement() {
		for(Map.Entry<Double, String> m:ministatement.entrySet()){
			System.out.println(m.getKey()+""+m.getValue());
		}
	}
	
}
