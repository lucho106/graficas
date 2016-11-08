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
public class TestPaintComponet extends JFrame{
    public TestPaintComponet(){
        add(new NewPanel());
    }

public static void main(String[] args) {
      
TestPaintComponet frame = new TestPaintComponet();
frame.setTitle("TextPintComponent");
frame.add(new tablero());
frame.setSize(900, 900);
frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);

}
}