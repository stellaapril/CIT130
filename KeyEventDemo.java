/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author sitian.chen
 */
public class KeyEventDemo extends JFrame {
    
    private KeyboardPanel keyboardPanel = new KeyboardPanel();
    
    
    public KeyEventDemo(){
        add(keyboardPanel);
        
        keyboardPanel.setFocusable(true);
    }
    
    public static void main(String[] args){
        KeyEventDemo frame = new KeyEventDemo();
        frame.setTitle("KeyEventDemo");
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    
    static class KeyboardPanel extends JPanel{
        private int x =100;
        private int y=100;
        private char keyChar='A';
        
        public KeyboardPanel(){
            addKeyListener(new KeyAdapter(){
                @Override
                public void keyPressed(KeyEvent e){
                    switch(e.getKeyCode()){
                        case KeyEvent.VK_DOWN: y+=10;break;
                        default: keyChar = e.getKeyChar();
                    }
                    repaint();
                
                }//cloose keypressed
            
            });//close key listener
            
        }//close keyboardpanel
        
        

       
            
   
    
    
    }
     
     
}


