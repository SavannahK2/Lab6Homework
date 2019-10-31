/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0786954
 */
public class MonthMain 
{
    public static void main(String[] args)
   {
      // Use no-arg constructor here
      Month m = new Month();
      System.out.println("Month " + m.getMonthNumber() +
                         " is " + m);
      for (int i = 0; i <= 12; i++)
        {
         m.setMonthNumber(i);
         System.out.println("Month " + m.getMonthNumber() +
                         " is " + m);
        }
   }
}
