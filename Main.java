import java.util.Scanner;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

public class Main {

   public static void main(String[] args) {
      int money;
      while(true){
          try{
              Scanner sc = new Scanner(System.in);
              System.out.print("Exchange to coin : ");
              money = sc.nextInt();
         
              if(money == 20)break;{
              }
              if(money == 50) break;{
              }
              if(money == 100) break;{
              }
          }
          catch(Exception e){}
      }
      if (money == 0){
         System.exit(0);
      }

      int[] cash = new int[3];

      int[] arrayCash = new int[]{10, 50, 1};
      for (int i= 0; i < arrayCash.length; i++) {
          cash[i] = money/arrayCash[i];
          money = money%arrayCash[i];
      }

      System.out.println("10 is : " + cash[0]);
      System.out.println("5 is : " + cash[1]);
      System.out.println("1 is : " + cash[2]);
   }

}