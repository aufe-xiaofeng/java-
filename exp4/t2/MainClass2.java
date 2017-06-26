package exp4.t2;

/*思考题
(1)
haierTV的频道是0
zhangSanFamily开始看电视节目
不能收看0频道
hangSanFamily将电视更换到2频道
haierTV的频道是2
hangSanFamil在看电视节目
经济频道
(2)
 */
public class MainClass2 {
	public static void main(String args[]) {
		TV haierTV = new TV();
		haierTV.setChannel(5); // 【代码2】haierTV调用setChannel(int m),并向参数m传递5
		System.out.println("haierTV的频道是" + haierTV.getChannel());
		Family zhangSanFamily = new Family();
		zhangSanFamily.buyTV(haierTV);// 【代码3】zhangSanFamily调用void buyTV(TV
										// tv)方法,并将haierTV传递给参数TV
		System.out.println("zhangSanFamily开始看电视节目");
		zhangSanFamily.seeTV();
		int m = 2;
		System.out.println("hangSanFamily将电视更换到" + m + "频道");
		zhangSanFamily.remoteControl(m);
		System.out.println("haierTV的频道是" + haierTV.getChannel());
		System.out.println("hangSanFamil在看电视节目");
		zhangSanFamily.seeTV();
		//------添加的代码------
		System.out.println("--------我是分割线--------");
		Family lisiFamily=new Family();
		lisiFamily.buyTV(haierTV);
		lisiFamily.seeTV();
	}
}
