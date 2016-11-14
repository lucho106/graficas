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
    g.drawLine(500, 560, 540, 440);//p d
    g.drawLine(440, 190, 500, 300);//a d
    g.drawLine(320, 300, 440, 190);//a i
    g.drawLine(400, 360, 500, 300);//b d*
    g.drawLine(320, 300, 210, 260);//b i 
    g.drawLine(340, 460, 440, 390);//muslo i
    g.drawLine(320, 560, 340, 460);//p i
    g.drawString("Banner", 0, 0);
    
    g.drawRect(435, 187, 10, 5);//cuello
    g.drawRect(435, 387, 10, 5);
    g.drawRect(535, 437, 10, 5);
    g.drawRect(495, 297, 10, 5);
    g.drawRect(315, 297, 10, 5);
    g.drawRect(335, 457, 10, 5);
    g.drawRect(435, 187, 10, 5);
    
    g.drawRect(395, 357, 10, 5);
    g.drawRect(205, 257, 10, 5);
    g.drawRect(495, 557, 10, 5);
    g.drawRect(315, 557, 10, 5);
    
    int xbd[] = { 400, 500, 500 , 400}; int ybd[] = {350,  290, 310, 370}; g.drawPolygon(xbd, ybd,4);
    int xbi[] = { 320, 210, 210 , 320}; int ybi[] = {290,  250, 270, 310}; g.drawPolygon(xbi, ybi,4);
    int xto[] = { 430, 450, 450 , 430}; int yto[] = {190,  190, 390, 390}; g.drawPolygon(xto, yto,4);
    int xmd[] = { 440, 540, 540 , 440}; int ymd[] = {380,  430, 450, 400}; g.drawPolygon(xmd, ymd,4);
    int xmi[] = { 340, 440, 440 , 340}; int ymi[] = {450,  380, 400, 470}; g.drawPolygon(xmi, ymi,4);
    int xpd[] = { 500, 540, 540 , 500}; int ypd[] = {550,  430, 450, 570}; g.drawPolygon(xpd, ypd,4);
    int xpi[] = { 320, 340, 340 , 320}; int ypi[] = {550,  450, 470, 570}; g.drawPolygon(xpi, ypi,4);
    int xad[] = { 440, 500, 500 , 440}; int yad[] = {180,  290, 310, 200}; g.drawPolygon(xad, yad,4);
    int xai[] = { 320, 440, 440 , 320}; int yai[] = {290,  180, 200, 310}; g.drawPolygon(xai, yai,4);
   
    
    
    
    
    g.drawOval(390, 90,100,100);
}    
}
