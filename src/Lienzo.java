
import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juani
 */
public class Lienzo extends Canvas{
    Mas mascota;
    Hilo hilo = new Hilo(this);
    public Lienzo(){
        mascota = new Mas();
        hilo.start();
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g); 
                
        Graphics2D g2 = (Graphics2D) g;
        
        mascota.pintar(g2);
    }
}
