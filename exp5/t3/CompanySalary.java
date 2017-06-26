package exp5.t3;
/**
 * 這題的數字我不知道怎麼輸入
 * @author fengge
 *
 */
abstract class Employee {
	public abstract double earnings();
}

class YearWorker extends Employee {
	// 【代码1】 重写earnings()方法
	@Override
	public double earnings() {
		
		return 12*2300;
	}
}

class MonthWorker extends Employee {
	// 【代码2】 重写earnings()方法
	@Override
	public double earnings() {
		
		return 2300;
	}
}

class WeekWorker extends Employee {
	// 【代码3】重写earnings()方法。
	@Override
	public double earnings() {
		
		return 2300/4;
	}
}

class Company {
	Employee[] employee;
	double salaries = 0;

	/**
	 * 构造函数
	 * @param employee 职员类
	 */
	Company(Employee[] employee) {
		this.employee = employee;
	}

	/**
	 * 支付薪资
	 * @return 薪资
	 */
	public double salariesPay() {
		salaries = 0;
		
		// 【代码4】计算salaries。
		for (int i = 0; i < employee.length; i++) {
			salaries = salaries +employee[i].earnings();
		}
		
		return salaries;
	}
}

public class CompanySalary {
	public static void main(String args[]) {

		Employee[] employee = new Employee[29]; // 公司有29名雇员
		
		for (int i = 0; i < employee.length; i++) { // 雇员简单地分成三类
			if (i % 3 == 0)
				employee[i] = new WeekWorker();
			else if (i % 3 == 1)
				employee[i] = new MonthWorker();
			else if (i % 3 == 2)
				employee[i] = new YearWorker();
		}
		
		Company company = new Company(employee);
		System.out.println("公司薪水总额:" + company.salariesPay() + "元");
		
	}
}
