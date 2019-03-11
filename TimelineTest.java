/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Timeline;

import java.util.LinkedList;

/**
 *
 * @author sitian.chen
 */
public class TimelineTest {
    public static Component[] CompArr; 
    
    public static void main(String[] args){
        
        Component compoA = new Component();
        compoA.author="Stella";
        compoA.year=1960;
        
        ComputerComponent ccomponent1 = new ComputerComponent();
        ccomponent1.manuufacturer="Intel";
        ccomponent1.modelName="PentiumP5";
        ccomponent1.releaseYear=1993;
        ccomponent1.price=2213;
        
        ComputerComponent ccomponent2 = new ComputerComponent();
        ccomponent2.manuufacturer="Commodore";
        ccomponent2.modelName="VIC20";
        ccomponent2.releaseYear=1980;
        ccomponent2.price=778.73;
        ccomponent2.getOtherCurrencyprice();
        
        
        HumanInterestComponent humancomponent1 = new HumanInterestComponent();
        humancomponent1.Eventyear=2016;
        humancomponent1.EventName="Trump elected President";
        humancomponent1.setyourage(20);
        humancomponent1.getyourage();
        
        HumanInterestComponent humancomponent2 = new HumanInterestComponent();
        humancomponent2.Eventyear=2001;
        humancomponent2.EventName="911";
        humancomponent2.setyourage(5);
        humancomponent2.getyourage();
        
        CompArr = new Component[3];
        CompArr[0]=new Component();
        CompArr[1]=new ComputerComponent();
        CompArr[2]=new HumanInterestComponent();
        //add to linkedlist
        LinkedList<Component> timelineList = new LinkedList<>();
        for(int i=0;i<CompArr.length;i++){
            timelineList.add(CompArr[i]);
        }//close for loop
        
        
        
        
        
    }//close main
    
}
