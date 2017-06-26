/*
 (1)当然不可以，万一第一次输入的yourGuess<realNumber 无论怎么样都是 猜对了！
 (2)放在外面为了程序的简单易行，放在里面代码就比较冗杂
*/

package exp3.t2;

import java.util.Scanner;
import java.util.Random;
public class GuessNumberPrc {
   public static void main (String args[]) {
      Scanner reader = new Scanner(System.in);
      Random random = new Random();
      System.out.println("给你一个1至100之间的整数,请猜测这个数");
      int realNumber = random.nextInt(100)+1; //random.nextInt(100)是[0,100)中的随机整数
      int yourGuess = 0;
      System.out.print("输入您的猜测:");  
      yourGuess = reader.nextInt();
      while(yourGuess!=realNumber) //【代码1】 循环条件
      {
         if(yourGuess>realNumber)   //【代码2】 猜大了的条件代码
         {
             System.out.print("猜大了,再输入你的猜测:");
             yourGuess = reader.nextInt();
         }
         else if(yourGuess<realNumber) //【代码3】 猜小了的条件代码
         {
             System.out.print("猜小了,再输入你的猜测:");
             yourGuess = reader.nextInt();
         }
      }
      System.out.println("猜对了!");
   }
}

