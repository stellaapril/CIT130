/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author edarsow
 */
public class Controller {
    final int HOURS_THRESHOLD = 10;
    final double CHANCE_THRESHOLD = .8;
    final int PLANES_TO_TEST = 12;
    //Refactor 2
    final int CYLCES_THRESHOLD=7000;
    
    private PlaneObjectModel model;
    private View view;
    
    private List<Aircraft> failureList;
    private List<Aircraft> safeList;
    
    public Controller(){
        failureList = new LinkedList<>();
        safeList = new LinkedList<>();
    }
    
    public static void main(String[] args) {
        Controller cont = new Controller();
        cont.setupMVC();
    }
    
    public void setupMVC(){
        model = new PlaneObjectModel();
        view = new View();
        view.cont = this;
        view.initiateUI();
    }
    
    public void generateAndTestAircrafts(int numToTest){
        int counter = 0;
        int upperBound;
        if(numToTest == 0){
            upperBound = PLANES_TO_TEST;
        } else {
            upperBound = numToTest;
        }
        Aircraft craft;
        while(counter <= upperBound ){
            craft = assignFailureOutcome(model.getAircraft());
            if(craft.isCatastrophicFailure()){
                failureList.add(craft);
            } else {
                safeList.add(craft);
            }
            counter++;
        } // close while
    }
    
    public Aircraft assignFailureOutcome(Aircraft aircraft){
        Random r = new Random();
        /**
        if(aircraft.getHours()>= HOURS_THRESHOLD || aircraft.getCycles()>=CYLCES_THRESHOLD){
            //cycle uncertain boolean
            boolean b = r.nextBoolean();
            //hour uncertain double
            double d = r.nextDouble();
            aircraft.setUncertaintly(d);
            if(aircraft.getUncertaintly()<CHANCE_THRESHOLD && !b){
                aircraft.setCatastrophicFailure(false);
            }else{
                aircraft.setCatastrophicFailure(true);
            }//close inner if/else
        }else{
            aircraft.setCatastrophicFailure(false);
        }//close outside if/else
        
        if(aircraft.getHours() >= HOURS_THRESHOLD){
            double d = r.nextDouble();
            aircraft.setUncertaintly(d);
            if(aircraft.getUncertaintly()>=CHANCE_THRESHOLD){
                aircraft.setCatastrophicFailure(true);
            } else {
                aircraft.setCatastrophicFailure(false);
            }
        } else if(aircraft.getCycles()>=CYLCES_THRESHOLD){
            boolean b = r.nextBoolean();
            if(b){
                aircraft.setCatastrophicFailure(true);
            }else{
                aircraft.setCatastrophicFailure(false);
        }//close
        **/
            
        if(aircraft.getCycles()>=CYLCES_THRESHOLD){
            boolean b = r.nextBoolean();
            if(b){
                aircraft.setCatastrophicFailure(true);
            }
        }else if(aircraft.getHours() >= HOURS_THRESHOLD){
            double d = r.nextDouble();
            aircraft.setUncertaintly(d);
            if(aircraft.getUncertaintly()>=CHANCE_THRESHOLD){
                aircraft.setCatastrophicFailure(true);
     
            }
        }
            
        
        return aircraft;
    }

    /**
     * @return the failureList
     */
    public List<Aircraft> getFailureList() {
        return failureList;
    }

    /**
     * @param failureList the failureList to set
     */
    public void setFailureList(List<Aircraft> failureList) {
        this.failureList = failureList;
    }

    /**
     * @return the safeList
     */
    public List<Aircraft> getSafeList() {
        return safeList;
    }

    /**
     * @param safeList the safeList to set
     */
    public void setSafeList(List<Aircraft> safeList) {
        this.safeList = safeList;
    }
    
}
