/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

/**
 *
 * @author sitian.chen
 */
public class Agent {
    private int id;
    private double stealthiness;
    private boolean secretCoverUpheld;
    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append(id);
        sb.append(' ');
        sb.append(stealthiness);
        sb.append(' ');
        sb.append(secretCoverUpheld);
        return sb.toString();
    }
    //id
    public void setID(int i){
        id = i;
    }
    
    public int getID(){
        return id;
    }//close method
    
    //stealthiness
    public void setStealth(double s){
        stealthiness = s;
    }
    
    public double getStealth(){
        return stealthiness;
    }
    
    public void setCoverUpheld(boolean c){
        secretCoverUpheld = c;
    }
    
    public boolean getCoverUpheld(){
        return secretCoverUpheld;
    }
    
}
