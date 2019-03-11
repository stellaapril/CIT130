/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6map;

import java.util.Map;
import java.util.HashMap;
        
/**
 *
 * @author sitian.chen
 */
public class Expedition {
    //static memebers can be accessed without...
    static Map<String,String> expeditionMap;
    generateExpedMapData();
    //allow for user edits of individual values in the map
    //complete displays of all key:value pairs
    
    public static void generateExpedMapData(){
        expeditionMap=new HashMap<>();
        expeditionMap.put("location", "Scotland");
        expeditionMap.put("airline", "Spirit");
        expeditionMap.put("price", "700");
        expeditionMap.put("Pilot Name", "Jerry");
        expeditionMap.put("city", "Edinburgh");
        expeditionMap.put("Type of Accomadations", "Airb&b");
        expeditionMap.put("MonthVisiting", "1 month");
    }//close method
    
    public stat
}
