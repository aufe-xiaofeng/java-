package exp3.t1;

/**回文数
 * @author 张海峰
 */

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		
		int number=0,d5,d4,d3,d2,d1;
		Scanner reader = new Scanner(System.in);
		System.out.println("输入一个1至99999之间的数");
		number = reader.nextInt();
		if (number>=1&&number<=99999) {	//代码1 判断number在1~99999之间的数
			d5 = number/10000;	 		//代码2 计算number的最高（万）位d5
			d4 = number%10000/1000; 	//代码3 计算number的千位d4
			d3 = number%1000/100; 		//代码4 计算number的百位d3
			d2 = number%100/10;
			d1 = number%10;
			if(number>=10000&&number<=99999){//代码5 判断number是5位数的条件
				System.out.println(number+"是5位数");
				if(d1==d5&&d2==d4){//代码6 判断number是回文数的条件
					System.out.println(number+"是回文数");
				}else {
					System.out.println(number+"不是回文数");
				}
			}else if (number>=1000&&number<=9999) {//代码 7 判断number是4位数的条件
				System.out.println(number+"是4位数");
				if(d1==d4&&d2==d3){//代码8 判断number是回文数的条件
					System.out.println(number+"是回文数");
				}else {
					System.out.println(number+"不是回文数");
				}
			}else if (number>=100&&number<=999) {
				System.out.println(number+"是3位数");
				if(d1==d3){//代码10 判断number是回文数的条件
					System.out.println(number+"是回文数");
				}else {
					System.out.println(number+"不是回文数");
				}
			}else if (d2!=0) {
				System.out.println(number+"是2位数");
				if (d1==d2) {
					System.out.println(number+"是回文数");
				}else {
					System.out.println(number+"不是回文数");
				}
			}else if (d1!=0) {
				System.out.println(number+"是1位数");
				System.out.println(number+"是回文数");
			}
				
			
		}else {
			System.out.printf("\n%d不在1至99999之间", number);
		}

	}//main

}
