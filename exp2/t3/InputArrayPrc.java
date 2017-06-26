package exp2.t3;

import java.util.Arrays;

public class InputArrayPrc {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,500,600,700,800};
		int [] b,c,d;
		
		System.out.println(Arrays.toString(a));
		b = Arrays.copyOf(a, a.length);
		System.out.println(Arrays.toString(b));
		c=Arrays.copyOf(a, 4);	//代码1调用copyOf方法复制数组a的前4个元素

		System.out.println(Arrays.toString(c));	//代码2返回数组c的元素值的表示格式
		
		d=Arrays.copyOfRange(a, 4, a.length);	//代码3 调用copyRange方法复制数组a的后4个元素
		
		System.out.println(Arrays.toString(d));
		c[c.length-1] = -100; //代码4将-100赋给数组c最后一个元素
	//-------------(1)在代码4之后增加语句---------------
		System.out.println("数组tom：");
		int [] tom = Arrays.copyOf(c, 6);
		System.out.println(Arrays.toString(tom));
	//--------------------------------------------
		d[d.length-1] = -200;
		System.out.println("数组a：");
		System.out.println(Arrays.toString(a));
		
	//-------------(1)在程序的最后一个语句之后增加语句---------------
		System.out.println("数组Jerry：");
		int [] jerry = Arrays.copyOfRange(d,1,8);
		System.out.println(Arrays.toString(jerry));
	//--------------------------------------------
		
	}

}