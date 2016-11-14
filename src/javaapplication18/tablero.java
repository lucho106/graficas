/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Estudiante
 */
public class tablero extends JPanel implements ActionListener {

    private Timer timer;
private int x,y;
    public tablero() {
        this.x=10;
        this.y=20;
                
        timer = new Timer(20,this);
        timer.start();
    }

   
    
    @Override
    public void actionPerformed(ActionEvent e) {
         this.x+=5;
        if (x==1000){
          this.x-=1000;
        }
        
        repaint();
        
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(this.x, this.y,100,100);
        
        
    }
    
    
}
