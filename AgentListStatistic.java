/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author sitian.chen
 */
public class AgentListStatistic {
    double avg;
    double min=1;
    double max=0;
    double total=0;
    double activedouble;
    double currentSteal;
    
    /**
    public double getMax(double currentSteal){
        if(currentSteal>max){
            max=currentSteal;
        }
        return max;
    }//close method
    
    public double getMin(double currentSteal){
        if(currentSteal<min){
            min=currentSteal;
        }
        return min;
    }//close method
    
    public double getit(double it){
        return it;
    }
    
    public double getAvg(List<Agent> x){
        Iterator<Agent> i = x.iterator();
        while(i.hasNext()){
            total=total+i.next().getStealth();
            avg=total/x.size();
        }//close loop
        return avg;
    }//close method
    **/
}
