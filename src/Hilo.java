
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juani
 */
public class Hilo extends Thread{
    Lienzo puntero; //JFRAME
    int random;
    public Hilo(Lienzo b){
        puntero = b;
    }

    @Override
    public void run() {
        while(true){
            try {
                sleep(120);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
            puntero.mascota.incremento++;
            if(puntero.mascota.estado==0){puntero.mascota.posx+=5;}
            if(puntero.mascota.estado==1){puntero.mascota.posx+=-5;}
            if(puntero.mascota.estado==1 && puntero.mascota.jugar==1){puntero.mascota.posx+=-5;}
            if(puntero.mascota.posx==730)puntero.mascota.estado=1;
            if(puntero.mascota.posx==0){puntero.mascota.estado=0;puntero.mascota.jugar=1;}
            
            if(puntero.mascota.incremento>4){
                puntero.mascota.incremento=0;
            }
            //random = (int) (Math.random()*10);
            //System.out.println(random);
            //if(puntero.mascota.jugar==1 && puntero.mascota.incremento>10){
            //    puntero.mascota.incremento=0;
            //}
            puntero.repaint();
        }
    }
    
}
