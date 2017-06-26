package exp2.t2;
/**
 * 实验2 数组的引用与元素
 * @author fengge
 *
 */
public class InputArray {

	public static void main(String[] args) {
		int [] a = {100,200,300};
		//代码【1】输出数组的长度
		System.out.println("数组a的长度为："+a.length);
		//代码【2】输出数组的引用
		System.out.println("数组a的引用： "+a);
		int [][] b = {{1},{1,1},{1,2,1},{1,3,3,1},{1,4,6,4,1}};
		//代码【3】输出二维数组中一维数组的个数
		System.out.println("二维数组b中一维数组的个数为："+b.length);
		System.out.println(b[4][2]);
		//代码【4】将数组a的引用赋给b[4]
		b[4]=a;
		System.out.println(b[4][2]);
	}

}
