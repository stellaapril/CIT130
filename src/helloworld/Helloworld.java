/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author sitian.chen
 */
public class Helloworld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int CAR_RENTAL_AGE=25;
        //delcaring a variable of type String;
        String personName;
        //assigning a valuse to variable personName
        personName="stella";
        int age=26;
        //declare int variable
                
        if(age==CAR_RENTAL_AGE){
            System.out.println("Hello! "+personName+" you are too young");
        }else{
        System.out.println("Sorry,too young.You may rent a car");
        }//close if/else
        
        //declare and initialize numLoops
        int numLoops=10;
        //declare and initialize counter
        int counter=0;
        //as long as______________________
        while(counter<numLoops){
           System.out.println("Loop!");
           counter=counter+1;
        }//end while
    }//close main method      
} // close class
                                           