package exp7.t2;

public class Machine {
  public void checkBag(Goods goods) throws DangerException {
     if(goods.isDanger()) {
         DangerException danger=new DangerException();
         //【代码1】   //抛出danger
         throw danger;
     }
     else {
         System.out.print(goods.getName()+"不是危险品! ");
     }
  }
} 
