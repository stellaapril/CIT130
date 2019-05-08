/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit130final;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author cst
 */
public class CIT130GUIproject {
    //declare JFrame
    private static JFrame frame;
    
    

    
    public static int s = 0;
    public static int c = 0;
    public static int m = 0;
    public static JLabel snumlabel = new JLabel();
    public static JLabel cnumlabel = new JLabel();
    public static JLabel mnumlabel = new JLabel();
    
    public static void main(String[] args) {
        ImageIcon CoffeeImage = new ImageIcon("src/large.jpg");
   
      
        //add sugarListener
        ActionListener addSugarListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s =s+1;
                snumlabel.setText(String.valueOf(s));
                frame.setVisible(true);
                
                //System.out.println(s);
            }
        };
        
        ActionListener redSugarListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s =s-1;
                snumlabel.setText(String.valueOf(s));
                frame.setVisible(true);
                //System.out.println(s);
            }
        };
        
        //add creamListener
        ActionListener addCreamListener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                c =c+1;
                cnumlabel.setText(String.valueOf(c));
                frame.setVisible(true);
                //System.out.println(s);
            }
        };
        
        ActionListener redCreamListener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                c =c-1;
                cnumlabel.setText(String.valueOf(c));
                frame.setVisible(true);
                //System.out.println(s);
            }
        };
        
        //add milkListener
        ActionListener addMilkListener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                m =m+1;
                mnumlabel.setText(String.valueOf(m));
                frame.setVisible(true);
                //System.out.println(s);
            }
        };
        
        ActionListener redMilkListener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                m =m-1;
                mnumlabel.setText(String.valueOf(m));
                frame.setVisible(true);
                //System.out.println(s);
            }
        };
        
        
                        
        
        //add new frame
        //add a new frame
        frame = new JFrame("Morning Coffee");
        
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        
        //set a new panel
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(820, 400));
        panel.setBackground(Color.lightGray);
        frame.add(panel);
        
        //inside panel
        JPanel screenpanel = new JPanel();
        screenpanel.setPreferredSize(new Dimension(450, 400));
        screenpanel.setBackground(Color.LIGHT_GRAY);
        panel.add(screenpanel);
        
        screenpanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        
        //in screenpanel
        JPanel welcomepanel = new JPanel();
        welcomepanel.setPreferredSize(new Dimension(450, 30));
        welcomepanel.setBackground(Color.GRAY);
        screenpanel.add(welcomepanel);
            //in welcomepanel
        JLabel welcomelabel = new JLabel("****************WELCOME TO MOENIBG COFFEE SHOP****************");
        welcomelabel.setPreferredSize(new Dimension(450, 25));
        welcomepanel.add(welcomelabel);
        
        //coffee pic panel
        JPanel coffeepanel = new JPanel();
        coffeepanel.setPreferredSize(new Dimension(450, 400));
        coffeepanel.setBackground(Color.PINK);
        screenpanel.add(coffeepanel);
        
        JLabel piclabel = new JLabel(CoffeeImage,JLabel.CENTER);
        piclabel.setPreferredSize(new Dimension(450, 400));
        coffeepanel.add(piclabel);
    
        
        //inside panel
        JPanel operatepanel = new JPanel();
        operatepanel.setPreferredSize(new Dimension(360, 400));
        operatepanel.setBackground(Color.LIGHT_GRAY);
        panel.add(operatepanel);
        
        //operat panel layout

        
        //sugarpanel
        JPanel sugarpanel = new JPanel();
        //sugarpanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        sugarpanel.setPreferredSize(new Dimension(115, 400));
        sugarpanel.setBackground(Color.cyan);
        operatepanel.add(sugarpanel);
            //sugarlabel
        JLabel sugarlabel = new JLabel("SUGAR");
        sugarlabel.setPreferredSize(new Dimension(115, 100));
        sugarlabel.setBackground(Color.red);
        sugarpanel.add(sugarlabel);
        
            //sugarnumber
        JPanel spanel = new JPanel();
        spanel.setPreferredSize(new Dimension(115, 200));
        spanel.setBackground(Color.WHITE);
        sugarpanel.add(spanel);
        
        //add number label
        snumlabel.setPreferredSize(new Dimension(115, 50));
        spanel.add(snumlabel);
        
        
            //sugar butoon panel
        JPanel sbpanel = new JPanel();
        sbpanel.setPreferredSize(new Dimension(115, 150));
        sbpanel.setBackground(Color.cyan);
        sugarpanel.add(sbpanel);
        
        //sugar button +
        JButton sugaradd = new JButton("+");
        sugaradd.setBounds(60, 0, 5, 5);
        sugaradd.setBackground(Color.LIGHT_GRAY);
        sbpanel.add(sugaradd);
        sugaradd.addActionListener(addSugarListener);
        
        //sugar button -
        JButton sugarred = new JButton("-");
        sugarred.setBounds(60, 0, 5, 5);
        sugarred.setBackground(Color.LIGHT_GRAY);
        sbpanel.add(sugarred);
        sugarred.addActionListener(redSugarListener);
        
        
        
        
        
        //creampanel
        JPanel creampanel = new JPanel();
        //creampanel.setLayout(FlowLayout(FlowLayout.CENTER, 0, 0));
        creampanel.setPreferredSize(new Dimension(115, 400));
        creampanel.setBackground(Color.GREEN);
        operatepanel.add(creampanel);
        
            //creamlael
        JLabel creamlabel = new JLabel("CREAM");
        creamlabel.setPreferredSize(new Dimension(115, 100));
        creamlabel.setBackground(Color.WHITE);
        creampanel.add(creamlabel);
            //creampic
        JPanel cpanel = new JPanel();
        cpanel.setPreferredSize(new Dimension(115, 200));
        cpanel.setBackground(Color.WHITE);
        creampanel.add(cpanel);
        
        //add number label
        cnumlabel.setPreferredSize(new Dimension(115, 50));
        cpanel.add(cnumlabel);
        
        
        JPanel cbpanel = new JPanel();
        cbpanel.setPreferredSize(new Dimension(115, 150));
        cbpanel.setBackground(Color.GREEN);
        creampanel.add(cbpanel);
        
        JButton creamadd = new JButton("+");
        creamadd.setBounds(60, 0, 5, 5);
        creamadd.setBackground(Color.LIGHT_GRAY);
        cbpanel.add(creamadd);
        creamadd.addActionListener(addCreamListener);
        
        JButton creamred = new JButton("-");
        creamred.setBounds(60, 0, 5, 5);
        creamred.setBackground(Color.LIGHT_GRAY);
        cbpanel.add(creamred);
        creamred.addActionListener(redCreamListener);
        
        
        
        
        //milkpanel
        JPanel milkpanel = new JPanel();
        //milkpanel.setLayout(FlowLayout(FlowLayout.CENTER, 0, 0));
        milkpanel.setPreferredSize(new Dimension(115, 400));
        milkpanel.setBackground(Color.PINK);
        operatepanel.add(milkpanel);
        
            //milklabel
        JLabel milklabel = new JLabel("MILKLABEL");
        milklabel.setPreferredSize(new Dimension(115, 100));
        milklabel.setBackground(Color.CYAN);
        milkpanel.add(milklabel);
            //milkopic
        JPanel mpanel = new JPanel();
        mpanel.setPreferredSize(new Dimension(115, 200));
        mpanel.setBackground(Color.WHITE);
        milkpanel.add(mpanel);
        
         //add number label
        mnumlabel.setPreferredSize(new Dimension(115, 50));
        mpanel.add(mnumlabel);
        
        //add button
        JPanel mbpanel = new JPanel();
        mbpanel.setPreferredSize(new Dimension(115, 150));
        mbpanel.setBackground(Color.PINK);
        milkpanel.add(mbpanel);
        
        JButton milkadd = new JButton("+");
        milkadd.setBounds(60, 0, 5, 5);
        milkadd.setBackground(Color.LIGHT_GRAY);
        mbpanel.add(milkadd);
        milkadd.addActionListener(addMilkListener);
        
        JButton milkred = new JButton("-");
        milkred.setBounds(60, 0, 5, 5);
        milkred.setBackground(Color.LIGHT_GRAY);
        mbpanel.add(milkred);
        milkred.addActionListener(redMilkListener);
        
        
        frame.setSize(1200, 1200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    
    }//close main

 
    
    
}
