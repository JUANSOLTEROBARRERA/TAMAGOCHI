
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juani
 */
public class Mas {
    int AnchoVentana = 800;
    int AltoVentana = 600;
    Image img;
    Image img2;
    Image imginv;
    Image jump;
    
    int incremento = 0;
    int estado=0;
    int jugar=0;
    
    int posx=0;
    BufferedImage bi;
    Lienzo puntero; //JFRAME
    public Mas(Lienzo b){
        puntero = b;
    }
    public Mas(){
        bi = new BufferedImage(AnchoVentana, AltoVentana, BufferedImage.TYPE_INT_RGB);
        Toolkit herramienta = Toolkit.getDefaultToolkit();
        img = herramienta.getImage(getClass().getResource("/Sprites/Walk.png"));
        imginv= herramienta.getImage(getClass().getResource("/Sprites/WalkInv.png"));
        img2 = herramienta.getImage(getClass().getResource("/Otros/Background.jpg"));
        jump = herramienta.getImage(getClass().getResource("/Sprites/Run.png"));
    }
    public void pintar(Graphics g){
        Graphics2D g2d;
        
        //g2d = (Graphics2D)g;
        g.drawImage(bi, 0, 0, puntero);
        g2d=bi.createGraphics();
        g2d.fillRect(0, 0, AnchoVentana, AltoVentana);
        int mx = (incremento%5)*73;
        int my = (incremento/5)*73;
        int mx2 = (incremento%12)*103;
        int my2 = (incremento/12)*103;
        g2d.drawImage(img2,0,0,800,600,puntero);
        //g2d.fillRect(200, 450, 111, 550);
        if(estado==0){g2d.drawImage(imginv,posx,350,posx+73,350+111,mx,my,mx+73,my+111,puntero);}
        if(estado==1 && jugar==0){g2d.drawImage(img,posx,350,posx+73,350+111,mx,my,mx+73,my+111,puntero);}
        if(estado==1 && jugar==1){g2d.drawImage(jump,posx,337,posx+103,337+124,mx2,my2,mx2+103,my2+124,puntero);}
    }
}
