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
    public static double cover_THRES = 0.4;
    public static List<Agent> upheldCover = new LinkedList<>();
    public static List<Agent> blownCover = new LinkedList<>();
    public static String listname;
    
    
    //Hand out a random stealthness number to each agent
    public static Agent genAgent(){
        Random r = new Random();
        Agent agent = new Agent();
        agent.setID(id++);
        agent.setStealth(r.nextDouble());
        return agent;
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
    
    
    //simulator 
    public static Agent simulator(Agent a, double risk){
        if(a.getStealth()*risk>cover_THRES){
            a.setCoverUpheld(true);
        }else{
            a.setCoverUpheld(false);
        }
        return a;
    }//close method
    
    
    //store agents in two list
    public static void setlist(Agent o){
        if(o.getCoverUpheld()){
            upheldCover.add(o);
        }else{
            blownCover.add(o);
        }
    }//close method
    
    
    public static AgentListStatistic computeListstatistic(List<Agent> g){
        AgentListStatistic agenti = new AgentListStatistic();
        
        Iterator<Agent> iter = g.iterator();
        while(iter.hasNext()){
            Agent b = iter.next();
            //System.out.println(b+"");
            //calculate Min Max
            if(agenti.min>b.getStealth()){
                agenti.min=b.getStealth();
            }else if(agenti.max<b.getStealth()){
                agenti.max=b.getStealth();
            }//close if/else
            
            //calculate average of stealthness in the list
            agenti.total+=b.getStealth();
            agenti.avg=agenti.total/g.size();
            
        }//close loop
    return agenti; 
    }//close mehtod
    
    public static void display(){
        System.out.println("_________________________________________________ ");
        System.out.println("                 AGENT REPORT                    ");
        System.out.println("_________________________________________________ ");
        System.out.println("List Name: "+"UpheldCover");
        System.out.println("Max of stealthiness: "+computeListstatistic(upheldCover).max);
        System.out.println("Min of stealthiness: "+computeListstatistic(upheldCover).min);
        System.out.println("Average of stealthiness: "+computeListstatistic(upheldCover).avg);
        System.out.println("-------------------------------------------------");
        System.out.println("List Name: "+"BlownCover");
        System.out.println("Max of stealthiness: "+computeListstatistic(blownCover).max);
        System.out.println("Min of stealthiness: "+computeListstatistic(blownCover).min);
        System.out.println("Average of stealthiness: "+computeListstatistic(blownCover).avg);
        System.out.println("_________________________________________________ ");
        
    }
    
    public static void main(String[] args){
        //coverupheld list
        
        int number=0;
        while(number<100){
            setlist(simulator(genAgent(),getcountryrisk()));
            number++;
        }//close loop
        
        display();
        
        
        
        //System.out.println("Min: "+computeListstatistic(upheldCover).min);
        //System.out.println("Max: "+computeListstatistic(upheldCover).max);
        //System.out.println("AVG: "+computeListstatistic(upheldCover).avg);
        //System.out.println(computeListstatistic(notupheldCover).min);
     
    }//close main
}
