/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2inheritance;
import java.util.LinkedList;
/**
 *
 * @author sitian.chen
 */
public class TimeLineTest {
    public static void main(String[] args){
        
    Component[] CompArr = new Component[3];
    CompArr[0]=new Component();
    CompArr[1]=new Component();
    LinkedList<Component> timelineList = new LinkedList<>();
    //iterate over the array : visit each shelf
    //extract item, then add to CollectionClass
    
    for(int i=0;i<CompArr.length;i++){
        timelineList.add(CompArr[i]);
    }
    //alternatively thanks to Mr scott we can do some fancy magix
    //timelineList.addAll(java.util.Arryas.asList(compArr));
    
    }//close main
    
}
