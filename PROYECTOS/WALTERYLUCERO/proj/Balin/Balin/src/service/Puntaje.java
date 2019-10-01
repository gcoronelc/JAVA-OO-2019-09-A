/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.awt.Canvas;
import java.awt.Color;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author Walter P B
 */
public class Puntaje extends Canvas {

    private int puntaje = 0;
    

    public void pintar(Graphics g) {
    Graphics2D g2d=(Graphics2D)g;
    g2d.setFont(new Font("verdana", Font.CENTER_BASELINE, 28));
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    g2d.setColor(Color.red);
    g2d.drawString(puntaje + "", 0, 28);
    }
    public void puntajeAumenta(){
    puntaje++;
    }
    public void reiniciarPuntaje(){
    puntaje=0;
    }
    public int puntajeObtinido(){
    return puntaje;
    }
}
