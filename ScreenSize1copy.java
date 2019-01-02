// Program written by:
// Date program was written: 
// Name of the program: ScreenSize1
// This program is designed to number each row and column on the output screen.

import java.util.Scanner; // Imports a scanner to be used for user input

public class ScreenSize1copy
{
   public static void main(String[] args)
   {
        // Constant declarations
      final int ROW = 47;
      final int COLUMN = 139;
      final String STOPMSG = "Press <ENTER> to stop: ";
        
        // Variable declaration
      int pauseInput;
      int columnNum;
            
      System.out.println("         1         2         3         4         5         6         7         8         9         0         1         2         3");
        
      for (int i = 2; i < ROW; i++)
      {
         if (i != 2)
            System.out.println(i);
         else
         {
            columnNum = 1;
            for (int j = 1; j < COLUMN; j++)
            {
               System.out.print(columnNum);
               columnNum = columnNum + 1;
               if (columnNum == 10)
                  columnNum = 0;
            }
            System.out.println();
            System.out.println("End system");
         }     
      }
              
      Scanner input = new Scanner(System.in); //Declaration to allow user input
      int space;
      space = (COLUMN - STOPMSG.length()) / 2;
      for (int i = 1; i <= space; i++)
         System.out.print(" ");        
      System.out.print(STOPMSG);
      pauseInput = input.nextInt(); 
      input.close();       
   }//test2
}//test