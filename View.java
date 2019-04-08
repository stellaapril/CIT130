/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author edarsow
 */
public class View {
    
    Controller cont;
    
    public void initiateUI(){
        getInputAndRunTest();
        displayTestResults();
    }
    
    public void getInputAndRunTest(){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of planes to test and press enter (0 for default): ");
        int numPlanes = scan.nextInt();
        //refactor3
        System.out.println("Enter the number of the hours of operation threshold(0-130000): ");
        int numHourthreshold = scan.nextInt();
        System.out.println("Enter the number of the cylces threshold(0-8000): ");
        int numCyclethreshold =scan.nextInt();
        cont.setHourThr(numHourthreshold);
        cont.setCylcesThr(numCyclethreshold);
        cont.generateAndTestAircrafts(numPlanes);
    }
    
    public void displayTestResults(){
        Aircraft ac;
        Iterator<Aircraft> safeIter = cont.getSafeList().iterator();
        double safeSize = cont.getSafeList().size();
        double failureSize = cont.getFailureList().size();
        double ratio = safeSize/failureSize;
        
        System.out.println("*************");
        System.out.println("Safe list:");
        while(safeIter.hasNext()){
            ac = safeIter.next();
            System.out.println(ac);
        }
        System.out.println("*************");
        System.out.println("Failure list:");
        
        Iterator<Aircraft> failureIter = cont.getFailureList().iterator();
        while(failureIter.hasNext()){
            ac = failureIter.next();
            System.out.println(ac);
        }
        System.out.println("*************");
        System.out.println("Safelist Size: " + safeSize + " ");
        System.out.println("Failurelist Size: " + failureSize + " ") ;
        System.out.println("Safe/failure ratio: " + ratio);
    }
    
}
