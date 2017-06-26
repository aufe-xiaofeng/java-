package exp5.t1;

public class Example {
	public static void main(String args[]) {
		ChinaPeople chinaPeople = new ChinaPeople();
		AmericanPeople americanPeople = new AmericanPeople();
		BeiJingPeople beijingPeople = new BeiJingPeople();

		chinaPeople.speakHello();
		americanPeople.speakHello();
		beijingPeople.speakHello();

		chinaPeople.averageHeight();
		americanPeople.averageHeight();
		beijingPeople.averageHeight();

		chinaPeople.averageWeight();
		americanPeople.averageWeight();
		beijingPeople.averageWeight();

		chinaPeople.chinaGongfu();
		americanPeople.americanBoxing();

		beijingPeople.beijingOpera();
		beijingPeople.chinaGongfu();
	}
}
