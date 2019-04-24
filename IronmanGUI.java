/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.Container;
import java.awt.Event;
import java.awt.*;
/**
 *
 * @author sitian.chen
 */
public class IronmanGUI {
    private static JFrame frame;
    
    public static void main(String[] args){
        //add a new frame
        frame = new JFrame("Iron Man 3");
        
        JButton masterbt = new JButton("Master");
        masterbt.setBounds(100, 0, 20, 10);
        frame.add(masterbt);
        
        JButton p1bt = new JButton("P1");
        p1bt.setBounds(120, 0, 20, 10);
        frame.add(p1bt);
        
        
        
        frame.setSize(400,200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        //add a button to the frame

        
        //Container container = frame.getContentPane();
        //container.add(masterbt);
        
        //add color
        
        
    }//close main method
    

    
   
    
    
}
