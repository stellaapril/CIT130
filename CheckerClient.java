/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2;

/**
 *
 * @author cst
 */
public class CheckerClient {
     public static void main(String[] args){
         
         StrengthChecker checker = new StrengthChecker();
         checker.setRequiredLength(8, 50);
         String[] reqChars = {"%","&","@"};
         checker.setReqChars(reqChars);
         
         if (checker.checkPassword("Hel1@world")){
             System.out.println("Password Ok!");
         }else{
             System.out.println("Password fails check");
         }
                
    }//close main
}//close class
