/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author sitian.chen
 */
public class AgentFactory {
    //declare variables
    private static int id = 1000;
    public static double cover_THRES = 0.6;
    
    //Hand out a random stealthness number to each agent
    public static Agent genAgent(){
        Random r = new Random();
        Agent agent = new Agent();
        agent.setID(id++);
        agent.setStealth(r.nextDouble());
        return agent;
    }//close method
    
    //country risk 
    public static void main(String[] args){
        Country c1 = new Country();
        c1.name="USA";
        c1.risk=0.2;
        Country c2 = new Country();
        c2.name="UK";
        c2.risk=0.1;
        Country c3 = new Country();
        c3.name="Iran";
        c3.risk=0.88;
        Country c4 = new Country();
        c4.name="Spain";
        c4.risk=0.3;
        Country c5 = new Country();
        c4.name="Austrilia";
        c4.risk=0.05;
        
        Map<String,Double> map = new HashMap<>();
        map.put(c1.name,c1.risk);
        map.put(c2.name, c2.risk);
        map.put(c3.name, c3.risk);
        map.put(c4.name,c4.risk);
        map.put(c5.name,c5.risk);
        
        map.keySet().size();
        //simulate misson
        System.out.println(genAgent().getID());
        
        if(genAgent().getID()*c1.risk>cover_THRES){
            
            
        }
        
        //coverupheld list
        Agent[] coveruphold  = new Agent[5];
        coveruphold[0]=new Agent();
        coveruphold[1]=new Agent();
        coveruphold[2]=new Agent();
        coveruphold[3]=new Agent();
        coveruphold[4]=new Agent();
    
        
    
    
        

        
        
    }//close main
}
