public class RollingDice
{
	
   public static void main (String[] args)
   {
      Die die1;

      //instantiation
      die1 = new Die();
      die1.roll();

      System.out.println(die1.toString());
   }
   
}
