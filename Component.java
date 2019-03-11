/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Timeline;

/**
 *
 * @author sitian.chen
 */
public class Component {
    public int year;
    public String description;
    public String author;
    public String referenceSourceURL;
    public int currentYear;
    public int yearSince;
    
    //get currentyear
    public int generateYearSince(int y){
        currentYear = y;
        yearSince = currentYear-year;
        return currentYear;
        
   }//close method
    
}
