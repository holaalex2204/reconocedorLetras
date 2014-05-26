/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reconocedorletras;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author holaalex2204
 */
public class PaintDemo extends JApplet {
    PaintPanel _canvas = new PaintPanel();
    public PaintDemo() {
        JPanel shapePanel = new JPanel();        
        JPanel colorPanel = new JPanel();
        JPanel buttonPanel = new JPanel();
        JButton aceptar = new JButton("Aceptar");
        aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Acepte");
                System.out.println(_canvas.reconoce());
            }
        });
        JButton limpiar = new JButton("Limpiar");
        limpiar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {                
                _canvas.limpiar();
            }
        });
        buttonPanel.add(aceptar);
        buttonPanel.add(limpiar);
        
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        buttonPanel.add(shapePanel);
        buttonPanel.add(colorPanel);
        buttonPanel.add(Box.createHorizontalGlue());        
        
        
        setLayout(new BorderLayout(5,5));
        add(buttonPanel, BorderLayout.NORTH);
        add(_canvas    , BorderLayout.CENTER);
    }
}
