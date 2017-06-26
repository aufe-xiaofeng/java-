package exp5.t2;

public class Commercial extends Bank {
	double year;

	public double computerInterest() {
		super.year = (int) year;
		double r = year - (int) year;
		int day = (int) (r * 1000);
		double yearInterest = super.computerInterest();
		double dayInterest = day * 0.00022 * savedMoney;
		interest = yearInterest + dayInterest;
		System.out.printf("%d元存在商业银行%d年零%d天的利息:%f元\n", savedMoney, super.year, day, interest);
		return interest;
	}
}
