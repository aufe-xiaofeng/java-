package exp2.t2;

public class InputArrayPrc {

	public static void main(String[] args) {
		int [] a = {100,200,300};
		
		System.out.println("数组a的长度为："+a.length);//代码【1】输出数组的长度
		
		System.out.println(""+a);//代码【2】输出数组的引用
		int [][] b = {{1},{1,1},{1,2,1},{1,3,3,1},{1,4,6,4,1}};
		
		System.out.println("二维数组b中一维数组的个数为："+b.length);//代码【3】输出二维数组中一维数组的个数
		System.out.println(b[4][2]);
		
		//（2）在代码4之前输出二维数组b的各个一位数组的长度和引用
		for(int i=0;i<b.length;i++)
		{
			System.out.printf("b[%d]的长度为：%d 引用为：",i,b[i].length);
			System.out.println(""+b[i]);
		}
		b[4]=a;//代码【4】将数组a的引用赋给b[4]
		
		//（3）在代码4之后输出二维数组b的各个一位数组的长度和引用
		System.out.println("----代码4分割线----");
				for(int i=0;i<b.length;i++)
				{
					System.out.printf("b[%d]的长度为：%d 引用为：",i,b[i].length);
					System.out.println(""+b[i]);
				}
		//a[3]=200;	//(1)在代码4 之后增加语句"a[3]=200" 
		//错误Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
		
		
		System.out.println(b[4][2]);
	}

}
