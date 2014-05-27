/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reconocedorletras;

import edu.frp.image.Moments;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author holaalex2204
 */
public class PaintPanel extends JPanel implements MouseListener, MouseMotionListener {

    //================================================================ constants
    private static final int SIZE = 300;     // Size of paint area.    
    private static final Color INITIAL_COLOR = Color.BLACK;
    private static final Color COLOR_BACKGROUND = Color.WHITE;

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    private enum State {

        IDLE, DRAGGING
    }

    //=================================================================== fields
    private State _state = State.IDLE;
    private Color _color = INITIAL_COLOR;
    private boolean limpia = false;
    private Point _start = null; // Where mouse is pressed.
    private Point _end = null; // Where mouse is dragged to or released.

    //... BufferedImage stores the underlying saved painting.
    //    Initialized first time paintComponent is called.
    private BufferedImage _bufImage = null;

    //============================================================== constructor
    public PaintPanel() {
        setPreferredSize(new Dimension(SIZE, SIZE));
        setBackground(Color.white);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    //================================================================= setShape
    //================================================================= setColor
    public void setColor(Color color) {
        _color = color;
    }

    //=========================================================== paintComponent
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;  // Downcast to Graphics2D

        //... One time initialization of in-memory, saved image.
        if (_bufImage == null | limpia==true) {
            //... This is the first time, initialize _bufImage
            int w = this.getWidth();
            int h = this.getHeight();
            _bufImage = (BufferedImage) this.createImage(w, h);
            Graphics2D gc = _bufImage.createGraphics();
            gc.setColor(COLOR_BACKGROUND);
            gc.fillRect(0, 0, w, h); // fill in background
            limpia = false;
        }

        //... Display the saved image.
        g2.drawImage(_bufImage, null, 0, 0);

        //... Overwrite the screen display with currently dragged image.
        if (_state == State.DRAGGING) {
            //... Write shape that is being dragged over the screen image,
            //    but not into the saved buffered image.  It will be written
            //    on the saved image when the mouse is released.
            drawCurrentShape(g2);
        }
    }

    //========================================================= drawCurrentShape
    private void drawCurrentShape(Graphics2D g2) {
        //... Draws current shape on a graphics context, either
        //    on the context passed to paintComponent, or the
        //    context for the BufferedImage.

        g2.setColor(_color);    // Set the color.
        g2.setStroke(new BasicStroke(10));
        g2.drawLine(_start.x, _start.y, _end.x, _end.y);
        _start.x = _end.x;
        _start.y = _end.y;
    }

    //============================================================= mousePressed
    @Override
    public void mousePressed(MouseEvent e) {
        _state = State.DRAGGING;   // Assume we're starting a drag.

        _start = e.getPoint();     // Save start point, and also initially
        _end = _start;           // as end point, which drag will change.
    }

    //============================================================= mouseDragged
    @Override
    public void mouseDragged(MouseEvent e) {
        _state = State.DRAGGING;   // We're dragging to create a shape.

        _end = e.getPoint();       // Set end point of drag.  May change.
        drawCurrentShape(_bufImage.createGraphics());
        this.repaint();            // After change, show new shape
    }

    //============================================================ mouseReleased
    @Override
    public void mouseReleased(MouseEvent e) {
        //... If released at end of drag, write shape into the BufferedImage,
        //    which saves it in the drawing.
        _end = e.getPoint();      // Set end point of drag.
        if (_state == State.DRAGGING) {
            _state = State.IDLE;

            //... Draw current shape in saved buffered image.
            drawCurrentShape(_bufImage.createGraphics());

            this.repaint();
        }
    }

    public void limpiar() {
        limpia = true;        
    }

    //================================================== ignored mouse listeners
    public BufferedImage getBufImage() {
        return _bufImage;
    }

    public void setBufImage(BufferedImage _bufImage) {
        this._bufImage = _bufImage;
    }
    public String reconoce()
    {
        double cadena[] = getCadenaPatron();
        double resultado[] = new double[1];        

        DatosEntrenamiento.n.computeOutputs(cadena);        
        System.out.println(resultado[0]);
        /*if(carac ==65){
           JOptionPane.showMessageDialog(null, carac );
        } else {
            JOptionPane.showMessageDialog(null, "La letra es E" );
        }
        */
        return "Hola";        
    }
    private double[] getCadenaPatron()
    {
        double cadenaPatron[] = new double[_bufImage.getHeight()*_bufImage.getWidth()];
        int pos =0;
        System.out.println(_bufImage.getWidth()*_bufImage.getWidth());
        for(int fila = 0 ; fila< _bufImage.getHeight(); fila ++)
        {
            for (int col = 0; col < _bufImage.getWidth(); col++) {
                cadenaPatron[pos] = _bufImage.getRGB(col, fila);
            }
        }
        return cadenaPatron;
    }
    public void aprender(char a)
    {
        double cadena[] = getCadenaPatron();
        double resultado[] = new double[1];
        resultado[0] = (int)a;
        DatosEntrenamiento.addPatron(new Patron(cadena,resultado));
    }
}
