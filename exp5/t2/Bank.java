package exp5.t2;

public class Bank {
	int savedMoney;// 存钱数量
	int year;// 存入时间
	double interest;// 利息
	double interestRate = 0.29;// 默认利率

	/**
	 * 计算利息
	 * 
	 * @return 一共的利息
	 */
	public double computerInterest() {
		interest = year * interestRate * savedMoney;
		return interest;
	}

	/**
	 * 设置利率
	 * 
	 * @param rate 利率
	 */
	public void setInterestRate(double rate) {
		interestRate = rate;
	}
}
