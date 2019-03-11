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
public class HumanInterestComponent extends Component{
    public String EventName;
    public int Eventyear;
    private int yourAge;
    private String referenceSourceURL;
    
    //set your age when this human interest event happen
    public void setyourage(int age){
        yourAge = age;
    }//close method
    
    //get your age when this human interest event happen
    public int getyourage(){
        return yourAge;
    }//close method
    
    private void setyourURL(String url){
        referenceSourceURL = url;
    }//close method
    
}//close class
