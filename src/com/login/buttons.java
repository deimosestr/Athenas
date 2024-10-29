package com.login;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class buttons extends JButton {

    private boolean over;
    private Color color;
    private Color colorOver;
    private Color colorClick;
    private Color borderColor;
    private int radius = 0;
    private ImageIcon originalIcon;  // Agregamos el icono original

    public buttons() {
        // Init color con RGB
        setColor(255, 255, 255);  // Blanco
        setColorOver(200, 200, 200); // Morado claro
        setColorClick(197, 172, 204);  // Morado claro
        setBorderColor(255, 255, 255);  // Color del borde
      
        setContentAreaFilled(false);
        setBorderPainted(false);
        
        // Add event MouseListener
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                setBackground(colorOver);
                over = true;
            }
            @Override
            public void mouseExited(MouseEvent me) {
                setBackground(color);
                over = false;
            }
            @Override
            public void mousePressed(MouseEvent me) {
                setBackground(colorClick);  
            }
            @Override
            public void mouseReleased(MouseEvent me) {
                if (over) {
                    setBackground(colorOver);
                } else {
                    setBackground(color);
                }
            }
        });
    }

    // Métodos de colores con RGB
    public void setColor(int r, int g, int b) {
        this.color = new Color(r, g, b);
        setBackground(color);
    }

    public void setColorOver(int r, int g, int b) {
        this.colorOver = new Color(r, g, b);
    }

    public void setColorClick(int r, int g, int b) {
        this.colorClick = new Color(r, g, b);
    }

    public void setBorderColor(int r, int g, int b) {
        this.borderColor = new Color(r, g, b);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    // Método para establecer el icono
    public void setIconImage(String imagePath) {
        this.originalIcon = new ImageIcon(imagePath);
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Dibujar borde redondeado
        g2.setColor(borderColor);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        g2.setColor(getBackground());

        // Borde interno de 2 px
        g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, radius, radius);

        // Redimensiona y dibuja el icono si está disponible
        if (originalIcon != null) {
            Image img = originalIcon.getImage();
            Image scaledImage = img.getScaledInstance(getWidth() - 8, getHeight() - 8, Image.SCALE_SMOOTH);  // Resta un margen de 4px
            g2.drawImage(scaledImage, 4, 4, this);  // Dibuja el icono con margen
        }

        super.paintComponent(grphcs);  // Llamada única a super.paintComponent
    }
}
