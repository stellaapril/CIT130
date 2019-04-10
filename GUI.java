/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Button;
import java.awt.Label;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



/**
 *
 * @author sitian.chen
 */
public class GUI {
    private static Frame mainFrame;
    private static Panel topPanel;
    private static Panel bottomPanel;
    private static Button button1;
    private static Button button2;
    private static Label instructionLabel;
    private static Label pushedButton1;
    private static Label pushedButton2;
    private static FlowLayout centeredText;
    private static Font labelFont;
    
    public static void main(String args[]){
        GUIMaker();
    }
    
    public static void GUIMaker(){
        
        mainFrame = new Frame("AWT Simple Demo");
        
        mainFrame.setLayout(new GridLayout(1,2));
    
        mainFrame.setSize(500,250);
    
        mainFrame.setVisible(true);
        
        mainFrame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });//close addlinstener
        
        
        //create top&bottom Panel
        centeredText = new FlowLayout(FlowLayout.CENTER,35,35);
        topPanel = new Panel(centeredText);
        bottomPanel=new Panel(centeredText);
        
        
    }
}
    

