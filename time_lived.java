package com.tawfeeqbarik.time_you_have_lived;
import java.util.Scanner;

public class time_lived {
    static void n(){
        System.out.println("\n");
    }
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        System.out.println(",,,//...HOW__MUCH__TIME__HAVE__YOU__LIVED__???...\\\\,,,");
        
        System.out.println("\n");
        
        System.out.println("...//A.B.O.U.T..M.E\\\\...");
        System.out.println("\tHello, I am TIM and I will tell you that how much time\n"
                + "it has been you living on this earth.");
        
        System.out.println("\n");
        
        System.out.println("...//I.N.S.T.R.U.C.T.I.O.N.S\\\\...");
        System.out.println("* I will not show you the accurate time.");
        System.out.println("** I will just estimate the time.");
        System.out.println("*** There will be a large difference between the result and the actual time.");
        System.out.println("**** In future, I will be updated with more functions and I can give a more accurate result.");
        
        System.out.println("\n");
        int bd;
        while (true) {
            System.out.println("Enter YES to CONTINUE and NO to EXIT...");
            String exit = a.nextLine();
            
            if (exit.equalsIgnoreCase("No")||exit.equalsIgnoreCase("N")) {
                System.out.println("\nOK! MAY BE NEXT TIME!!!");
                break;
            }
            else if (exit.equalsIgnoreCase("Yes")||exit.equalsIgnoreCase("Y")) {
                System.out.println("\nOK! LETS BEGIN!\n");
                
                while (true) {
                    System.out.println("How many years old are you???");
                    String b = a.nextLine();
                    
                    try {
                        bd = Integer.parseInt(b);
                    } catch (Exception e) {
                        System.out.println("\nINVALID CHOICE ENTERED!!!\n");
                        continue;
                    }
                    if (bd<0||bd==0||bd>100) {
                        System.out.println("\nINVALID CHOICE ENTERED!!!\n");
                        continue;
                    }
                    else {
                        break;
                    }
                }
                long yl, ml, dl, hl, mil, sl;
                yl = bd;
                ml = (yl*12);
                dl = (ml*30);
                hl = (dl*24);
                mil = (hl*60);
                sl = (mil*60);
                
                System.out.println("\n");
                
                System.out.println("Years you have lived = "+yl);
                System.out.println("Months you have lived = "+ml);
                System.out.println("Days you have lived = "+dl);
                System.out.println("Hours you have lived = "+hl);
                System.out.println("Minutes you have lived = "+mil);
                System.out.println("Seconds you have lived = "+sl);
                System.out.println("\n");
            }
            else {
                System.out.println("\nINVALID CHOICE ENTERED!!!\n");
                continue;
            }
        }
    }  
}