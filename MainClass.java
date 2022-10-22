package atmmachine;
import java.util.*;
public class MainClass {
	public static void main(String args[]){
		AtmOperationInterf ob;
		ob = new AtmOperations();
		try{
			int atmnumber = 12345;
			int atmpin = 123;
			Scanner in = new Scanner(System.in);
			System.out.println("Welcome to ATM machine");
			System.out.print("Enter ATM Number : ");
			int atmNumber = in.nextInt();
			System.out.print("Enter atm pin : ");
			int atmPin = in.nextInt();
			if((atmnumber == atmNumber) && (atmpin == atmPin)){
				System.out.println("Successfully Validated the User");
				while(true){
					System.out.println("1. View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
					System.out.println("Enter Choice");
					int ch = in.nextInt();
					switch(ch){
					case 1:
						ob.viewBalance();
						break;
					case 2:
						System.out.println("Enter amount to be withdraw : ");
						double withdrawAmount = in.nextDouble();
						ob.withdrawAmount(withdrawAmount);
						break;
					case 3:
						System.out.println("Enter amount to be deposit : ");
						double depositAmount = in.nextDouble();
						ob.depositAmount(depositAmount);
						break;
					case 4:
						ob.viewMiniStatement();
						break;
					case 5:
						System.out.println("Collect Your card\n Thank you for choosing ATM!");
						System.exit(0);
						break;
					default:
						System.out.println("OPPS! try again");
					}
				}
			}else{
				System.out.println("Invalid atmPin or atmNumber");
				System.exit(0);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
