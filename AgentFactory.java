./*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */./*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;
import java.util.Random;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author sitian.chen
 */
public class AgentFactory {
    //declare variables
    private static int id = 1000;
    public static double cover_THRES = 0.6;
    public static List<Agent> upheldCover = new LinkedList<>();
    public static List<Agent> notupheldCover = new LinkedList<>();
    
    
    //Hand out a random stealthness number to each agent
    public static Agent genAgent(){
        Random r = new Random();
        Agent agent = new Agent();
        agent.setID(id++);
        agent.setStealth(r.nextDouble());
        return agent;
    }//close method
    
    
    //simulator 
    public static Agent simulator(Agent a, double d){
        if(a.getStealth()*d>cover_THRES){
            a.setCoverUpheld(true);
        }else{
            a.setCoverUpheld(false);
        }
        return a;
    }//close method
    
    
    //store agents in two list
    public static void setlist(Agent o){
        int number = 0;
        while(number<10000){
            if(o.getCoverUpheld()){
                upheldCover.add(o);
            }else{
                notupheldCover.add(o);
            }//close if else
            number++;
        }//close loop
    }//close method
    
    
    //country risk 
    public static double getcountryrisk(){
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
        
        List<Country> countrylist = new LinkedList<>();
        countrylist.add(0, c1);
        countrylist.add(1, c2);
        countrylist.add(2, c3);
        countrylist.add(3, c4);
        countrylist.add(4, c5);
        Random t = new Random();
        double randomrisk =countrylist.get(t.nextInt(countrylist.size())).risk;
        
        return randomrisk;
    }//close
    
    public static AgentListStatistic computeListstatistic(List<Agent> g){
        Iterator<Agent> iter = g.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next()+"");
        }//close loop
        System.out.println("");
        
        AgentListStatistic agenti = new AgentListStatistic();
        if(agenti.currentSteal>agenti.max){
            agenti.max=agenti.currentSteal;
        }else{
        }//close if/else
        
       return agenti; 
    }//close mehtod
    
    
    public static void main(String[] args){
        //coverupheld list
        setlist(simulator(genAgent(),getcountryrisk()));
        computeListstatistic(upheldCover);
        computeListstatistic(notupheldCover);
        
        
        //Agent[] coveruphold  = new Agent[5];
        //coveruphold[0]=new Agent();
        //coveruphold[1]=new Agent();
        //coveruphold[2]=new Agent();
        //coveruphold[3]=new Agent();
        //coveruphold[4]=new Agent();
        
    }//close main
}
