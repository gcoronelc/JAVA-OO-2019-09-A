/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.applet.Applet;
import java.applet.AudioClip;

/**
 *
 * @author Walter P B
 */
public class Sonidos {
   public static final AudioClip fondo =Applet.newAudioClip(Sonidos.class.getResource("/fondo.wav"));
   public static final AudioClip rebote  =Applet.newAudioClip(Sonidos.class.getResource("/rebote.wav"));
   public static final AudioClip juegoteminado =Applet.newAudioClip(Sonidos.class.getResource("/inicio.wav"));
   public static final AudioClip fondo2 =Applet.newAudioClip(Sonidos.class.getResource("/fondo2.wav"));
   public static final AudioClip rebote2=Applet.newAudioClip(Sonidos.class.getResource("/rebote2.wav"));
}
