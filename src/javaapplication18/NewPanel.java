/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;
import javax.swing.*;
import java.awt.Graphics;
/**
 *
 * @author Estudiante
 */
public class NewPanel extends JPanel{
    @Override
protected void paintComponent(Graphics g){
    super.paintComponent(g);
    g.drawLine(440, 190, 440, 390);//torso
    g.drawLine(440, 390, 540, 440);//muslo d
    g.drawLine(540, 440, 500, 560);//p d
    g.drawLine(440, 190, 500, 300);//a d
    g.drawLine(440, 190, 320, 300);//a i
    g.drawLine(500, 300, 400, 360);//b d
    g.drawLine(320, 300, 210, 260);//b i 
    g.drawLine(440, 390, 340, 460);//muslo i
    g.drawLine(340, 460, 320, 560);//p i
    g.drawString("Banner", 0, 0);
    
    g.drawRect(435, 190, 10, 5);//cuello
    g.drawRect(435, 390, 10, 5);
    g.drawRect(535, 440, 10, 5);
    g.drawRect(495, 300, 10, 5);
    g.drawRect(315, 300, 10, 5);
    g.drawRect(335, 460, 10, 5);
    g.drawRect(435, 190, 10, 5);
    
    g.drawRect(395, 360, 10, 5);
    g.drawRect(205, 260, 10, 5);
    g.drawRect(495, 560, 10, 5);
    g.drawRect(315, 560, 10, 5);
    
    int xpoints[] = {25, 145, 25, 145, 25};
    int ypoints[] = {25, 25, 145, 145, 25};
    int npoints = 4;
    
    g.drawPolygon(xpoints, ypoints, npoints);
    
    g.drawOval(390, 90,100,100);
}    
}
