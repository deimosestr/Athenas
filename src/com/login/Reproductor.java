/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login;

import java.io.File;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaException;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import static javax.management.Query.value;
import javax.swing.GroupLayout.Group;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Alan
 */
public class Reproductor {
    
    private JFXPanel jxpanel;
    private JPanel jpanel
    private MediaPlayer mediaPlayer;
    private Media media;
    private Scene escena;
    private File file;
    private String ruta;

    public Reproductor() {
        this.jfxpanel = new JFXPanel();
        
        
        
        
    }

    /**
     * @param jpanel the jpanel to set
     */
    public void setJpanel(JPanel jpanel) {
        this.jpanel = jpanel;
    }

    /**
     * @return the mediaPlayer
     */
    public MediaPlayer getMediaPlayer() {
        return mediaPlayer;
    }

    /**
     * @param ruta the ruta to set
     */
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    public void reproducir(){
        try {
            this.getMediaPlayer().play();
        }catch (MediaException e){
                JOptionPane.showMessageDialog(null, 
                    "Error de reproduccion " + e.getMessage(),
                    "Error de reproduccion", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    public void pause(){
        try {
            this.getMediaPlayer().pause();
        }catch (MediaException e){
                JOptionPane.showMessageDialog(null, 
                    "Error al pausar: " + e.getMessage(),
                    "Error de MediaPlauer().pause", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    public void parar(){
        try {
            this.getMediaPlayer().stop();
        }catch (MediaException e){
                JOptionPane.showMessageDialog(null, 
                    "Error al detener: " + e.getMessage(),
                    "Error de MediaPlayer().Stop", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    public void setvolumen(double value){
        try {
            this.getMediaPlayer().setVolume(value);
        }catch (MediaException e){
                JOptionPane.showMessageDialog(null, 
                    "Error al ajustar el volumen: " + e.getMessage(),
                    "Error de Volumen", 
                    JOptionPane.ERROR_MESSAGE);
        }
        
    

        }
        public void mostrarVideo(){
            
            try {
                int altura = this.jpanel.getHeight();
                int ancho  = this.jpanel.getWidth();
                
                this.file = new File(this.ruta);
                
                this.media = new Media(this.file.toURI().toString());
                
                this.mediaPlayer = new MediaPlayer(this.media);
                
                this.mediaView = new MediaView(this.mediaPlayer);
                
                this.mediaView.setFitHeight(altura);
                this.mediaView.setFitWidth(ancho);
                
                this.escena = new Scene(new Group(thiss.mediaView));
                
                this.jfxpanel.setSize(this.jpanel.getSise());
                
                this.jfxpanel.setScene(this.escene);
                
                this.getMediaPlayer().setCycleCount(MediaPlayer.INDEFINITE);
                
                this.jpanel.add(this.jfxpanel,BorderLayout.center);
                
                
                
                
        }catch (MediaException e){
                JOptionPane.showMessageDialog(null, 
                    "Error el archivo no es compatible" + e.getMessage(),
                    "formato incorrecto", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}

