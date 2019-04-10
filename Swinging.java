/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author sitian.chen
 */
public class Swinging {
    //member variable allows all methods to access our top-level container
    private static JFrame frame;
    
    
    public static void main(String[] args){
        //GUI creation pattern
        
        //Step1 : Object creation; store in typed mem variable
        frame = new JFrame("Pattern Practice");
        
        //Step2: configure properties on our new object
        frame.setSize(400, 600);
        frame.setLocationRelativeTo(null);
        //Exit on Close is a final variable from JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setLayout(new GridLayout(2,4));
        frame.add(new JButton("click me"));
        frame.add(new JButton("click me"));
        frame.add(new JButton("click me"));
        frame.add(new JButton("click me"));
        frame.add(new JButton("click me"));
        frame.add(new JButton("click me"));
        frame.add(new JButton("click me"));
        frame.add(new JButton("click me"));
        
        
        
        //Step3 : set visibility and/or attach to parent component for display
        frame.setVisible(true);
        
    }
    
}
