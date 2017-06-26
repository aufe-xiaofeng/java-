package exp5.t2;

public class SaveMoney {
	public static void main(String args[]) {
		int amount = 8000;
		ConstructionBank bank1 = new ConstructionBank();
		bank1.savedMoney = amount;
		bank1.year = 8.236;
		bank1.setInterestRate(0.035);
		double interest1 = bank1.computerInterest();
		
		BankOfDalian bank2 = new BankOfDalian();
		bank2.savedMoney = amount;
		bank2.year = 8.236;
		bank2.setInterestRate(0.035);
		double interest2 = bank2.computerInterest();
		System.out.printf("两个银行利息相差%f元\n", interest2 - interest1);
		
		//-------练习题 输出商业银行在8000存在商业银行8年236天的利息
		/*System.out.println("----------------------------------------");
		Commercial bank3=new Commercial();
		bank3.savedMoney=amount;
		bank3.year = 8.236;
		bank3.setInterestRate(0.033);
		bank3.computerInterest();*/
	}
}
