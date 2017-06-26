package exp7.t1;

class MobileShop {
	// 【代码1】//用内部类InnerPurchaseMoney声明对象purchaseMoney1
	InnerPurchaseMoney purchaseMoney1;
	// 【代码2】 //用内部类InnerPurchaseMoney声明对象purchaseMoney1
	InnerPurchaseMoney purchaseMoney2;
	
	private int mobileAmount; // 手机的数量

	MobileShop() {
		// 【代码3】 //创建价值为20000的purchaseMoney1
		purchaseMoney1=new InnerPurchaseMoney(20000);
		// 【代码4】 //创建价值为10000的purchaseMoney2
		purchaseMoney2=new InnerPurchaseMoney(10000);
	}

	void setMobileAmount(int m) {
		mobileAmount = m;
	}

	int getMobileAmount() {
		return mobileAmount;
	}

	class InnerPurchaseMoney {
		int moneyValue;
		
		/**
		 * 构造方法
		 * @param m 优惠券金额
		 */
		InnerPurchaseMoney(int m) {
			moneyValue = m;
		}

		void buyMobile() {
			if (moneyValue >= 20000) {
				mobileAmount = mobileAmount - 6;
				System.out.println("用价值" + moneyValue + "的内部购物卷买了6部手机");
			} else if (moneyValue < 20000 && moneyValue >= 10000) {
				mobileAmount = mobileAmount - 3;
				System.out.println("用价值" + moneyValue + "的内部购物卷买了3部手机");
			}
		}
	}//内部类结束
}

public class NewYear {
	public static void main(String args[]) {
		MobileShop shop = new MobileShop();
		shop.setMobileAmount(30);
		System.out.println("手机专卖店目前有" + shop.getMobileAmount() + "部手机");
		shop.purchaseMoney1.buyMobile();
		shop.purchaseMoney2.buyMobile();
		System.out.println("手机专卖店目前有" + shop.getMobileAmount() + "部手机");
	}
}
