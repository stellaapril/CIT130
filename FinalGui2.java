/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author sitian.chen
 */
public class FinalGui2 extends JFrame {

    //private static JFrame frame;
    private static KeyboardPanel keyPanel = new KeyboardPanel();

    //initialize ui
    public FinalGui2() {
        //add(keyPanel);
        
        //set focus
        keyPanel.setFocusable(true);
    }

    //main method 
    public static void main(String[] args) {

        //add a new frame
        FinalGui2 frame = new FinalGui2();
        frame.setTitle("FinalGui2");
        
        
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(480, 300));
        panel.setBackground(Color.green);
        frame.add(panel);
        
        //inside panel
        JPanel paneltop = new JPanel();
        paneltop.setPreferredSize(new Dimension(480, 40));
        paneltop.setBackground(Color.yellow);
        panel.add(paneltop);

        //inside panel
        JPanel panelleft = new JPanel();
        panelleft.setPreferredSize(new Dimension(100, 220));
        panelleft.setBackground(Color.blue);
        panel.add(panelleft);

        //inside panel
        JPanel panelmid = new JPanel();
        panelmid.setPreferredSize(new Dimension(280, 220));
        panelmid.setBackground(Color.orange);
        panel.add(panelmid);

        //inside panelmid
        JPanel panelpic = new JPanel();
        panelpic.setPreferredSize(new Dimension(280, 160));
        panelpic.setBackground(Color.CYAN);
        panelmid.add(panelpic);
        
        
        //add keyboardpanel
        panelpic.add(keyPanel);
        
        
        //inside panelmid
        JPanel panelbutton = new JPanel();
        panelbutton.setPreferredSize(new Dimension(280, 40));
        panelbutton.setBackground(Color.black);
        panelmid.add(panelbutton);
        

        //add button
        JButton masterbt = new JButton("Master");
        masterbt.setBackground(Color.GRAY);
        masterbt.setBounds(10, 0, 5, 5);
        panelbutton.add(masterbt);

        JButton p1bt = new JButton("P1");
        p1bt.setBackground(Color.GRAY);
        p1bt.setBounds(20, 0, 5, 5);
        panelbutton.add(p1bt);

        JButton p2bt = new JButton("P2");
        p2bt.setBounds(40, 0, 5, 5);
        p2bt.setBackground(Color.GRAY);
        panelbutton.add(p2bt);

        JButton p3bt = new JButton("P3");
        p3bt.setBounds(60, 0, 5, 5);
        p3bt.setBackground(Color.GRAY);
        panelbutton.add(p3bt);
        
        
        JButton p4bt = new JButton("P4");
        p4bt.setBounds(80, 0, 5, 5);
        p4bt.setBackground(Color.GRAY);
        panelbutton.add(p4bt);
        

        //inside panel
        JPanel panelright = new JPanel();
        panelright.setPreferredSize(new Dimension(80, 220));
        panelright.setBackground(Color.blue);
        panel.add(panelright);
        
        
        
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        //Container container = frame.getContentPane();
        //container.add(masterbt);
        //add color
    }//close main method

    //inner class
    static class KeyboardPanel extends JPanel {

        private int x = 100;
        private int y = 100;
        private char keyChar = 'X';

        public KeyboardPanel() {
            addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    //test
                    System.out.println("hello inside listener");
                    switch (e.getKeyCode()) {
                        case KeyEvent.VK_DOWN:
                            y += 10;
                            break;
                        case KeyEvent.VK_UP:
                            y -= 10;
                            break;
                        case KeyEvent.VK_LEFT:
                            x -= 10;
                            break;
                        case KeyEvent.VK_RIGHT:
                            x += 10;
                            break;
                        default:
                            keyChar = e.getKeyChar();
                    }
                    repaint();
                }

            });
        }//close keyboardpnael

        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setFont(new Font("Times", Font.PLAIN, 20));
            g.drawString(String.valueOf(keyChar), x, y);

        }

    }
}
