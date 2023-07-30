package eat.pay;

import eat.buy.Battery;
import eat.buy.PowerBank;

public class PowerBankKiller {

	public static void main(String[] args) {
		System.out.println("Invoking main in PowerbankKiller");
		PowerBank powerbank=new PowerBank();
		powerbank.recharge();
		powerbank.store();
	}

}
