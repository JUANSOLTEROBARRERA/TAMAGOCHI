
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juani
 */
public class Mascota extends Thread{
    Image img;
    int incremento=0;
    public void Mascota(){
        Toolkit herramienta = Toolkit.getDefaultToolkit();
        //img = new Image(getClass().getResource("/Obeja Script.png"));
        img = herramienta.getImage(getClass().getResource("/Obeja Script.png"));
    }
    @Override
    public void run() {
        super.run();
        while(true){
            try {
                sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Mascota.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void pintar(Graphics2D g){
        /*Graphics2D g2d;
        g2d = (Graphics2D)g;
        
        int mx = (incremento/6)*147;
        int my = (incremento/6)*147;
        g2d.drawImage(img,200,200,200+147,200+147,mx,my,mx+147,my+147,);
        repaint();*/
    }
}
