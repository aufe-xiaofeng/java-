package exp6.t2;

interface ComputerWeight {
    public double computeWeight();
}

class Television implements ComputerWeight {
    //【代码1】重写computeWeight()方法
	@Override
	public double computeWeight() {
		// TODO Auto-generated method stub
		return 0;
	}
}
class Computer implements ComputerWeight {
    //【代码2】重写computeWeight()方法
	@Override
	public double computeWeight() {
		// TODO Auto-generated method stub
		return 0;
	}
}  

class WashMachine implements ComputerWeight {
    //【代码3】重写computeWeight()方法
	@Override
	public double computeWeight() {
		// TODO Auto-generated method stub
		return 0;
	}
}


class Truck {
   ComputerWeight [] goods;
   double totalWeights=0;
   
   /**
    * 构造方法
    * @param goods ComputerWeight[]型对象
    */
   
   Truck(ComputerWeight[] goods) {
       this.goods=goods;
   }
   
   public void setGoods(ComputerWeight[] goods) {
       this.goods=goods;
   }
   
   public double getTotalWeights() {
      totalWeights=0;
      //【代码4】计算totalWeights
      for (int i = 0; i < goods.length; i++) {
		totalWeights += goods[i].computeWeight();
      }
      return totalWeights;
   }    
}

/**
 * 
 * @author fengge
 *
 */
public class CheckCarWeight {
   public static void main(String args[]) {
	   
      ComputerWeight[] goods=new ComputerWeight[650]; //650件货物
      
      for(int i=0;i<goods.length;i++) { //简单分成三类
           if(i%3==0)
             goods[i]=new Television();
           else if(i%3==1)
             goods[i]=new Computer();
           else if(i%3==2)
             goods[i]=new WashMachine();
     } 
      
     Truck truck=new Truck(goods);
     System.out.printf("\n货车装载的货物重量:%-8.5f kg\n",truck.getTotalWeights());
     
     goods=new ComputerWeight[68]; //68件货物
     
     for(int i=0;i<goods.length;i++) { //简单分成两类
          if(i%2==0)
            goods[i]=new Television();
          else 
            goods[i]=new WashMachine();
     } 
     truck.setGoods(goods);
     System.out.printf("货车装载的货物重量:%-8.5f kg\n",truck.getTotalWeights());
     
   }
}

