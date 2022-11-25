/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_carloslagos;

import java.util.ArrayList;

/**
 *
 * @author clago
 */
public class Partido {
    
    private Seleccion local,visitante;
    private int goles,posesion, tirosMeta,tirosTotal, faltasCometidas;
    private ArrayList<Jugador> jugadoresFaltas = new ArrayList();
    private ArrayList<Jugador> jugadoresAmarillas = new ArrayList();
    private ArrayList<Jugador> jugadoresRojas = new ArrayList();
    private ArrayList<Jugador> jugadoresGol = new ArrayList();

    public Partido() {
    }

    public Partido(Seleccion local, Seleccion visitante, int goles, int posesion, int tirosMeta, int tirosTotal, int faltasCometidas) {
        this.local = local;
        this.visitante = visitante;
        this.goles = goles;
        this.posesion = posesion;
        this.tirosMeta = tirosMeta;
        this.tirosTotal = tirosTotal;
        this.faltasCometidas = faltasCometidas;
    }

    public Seleccion getLocal() {
        return local;
    }

    public void setLocal(Seleccion local) {
        this.local = local;
    }

    public Seleccion getVisitante() {
        return visitante;
    }

    public void setVisitante(Seleccion visitante) {
        this.visitante = visitante;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getPosesion() {
        return posesion;
    }

    public void setPosesion(int posesion) {
        this.posesion = posesion;
    }

    public int getTirosMeta() {
        return tirosMeta;
    }

    public void setTirosMeta(int tirosMeta) {
        this.tirosMeta = tirosMeta;
    }

    public int getTirosTotal() {
        return tirosTotal;
    }

    public void setTirosTotal(int tirosTotal) {
        this.tirosTotal = tirosTotal;
    }

    public int getFaltasCometidas() {
        return faltasCometidas;
    }

    public void setFaltasCometidas(int faltasCometidas) {
        this.faltasCometidas = faltasCometidas;
    }

    public ArrayList<Jugador> getJugadoresFaltas() {
        return jugadoresFaltas;
    }

    public void setJugadoresFaltas(ArrayList<Jugador> jugadoresFaltas) {
        this.jugadoresFaltas = jugadoresFaltas;
    }

    public ArrayList<Jugador> getJugadoresAmarillas() {
        return jugadoresAmarillas;
    }

    public void setJugadoresAmarillas(ArrayList<Jugador> jugadoresAmarillas) {
        this.jugadoresAmarillas = jugadoresAmarillas;
    }

    public ArrayList<Jugador> getJugadoresRojas() {
        return jugadoresRojas;
    }

    public void setJugadoresRojas(ArrayList<Jugador> jugadoresRojas) {
        this.jugadoresRojas = jugadoresRojas;
    }

    public ArrayList<Jugador> getJugadoresGol() {
        return jugadoresGol;
    }

    public void setJugadoresGol(ArrayList<Jugador> jugadoresGol) {
        this.jugadoresGol = jugadoresGol;
    }

    @Override
    public String toString() {
        return "Partido{" + "local=" + local + ", visitante=" + visitante + ", goles=" + goles + ", posesion=" + posesion + ", tirosMeta=" + tirosMeta + ", tirosTotal=" + tirosTotal + ", faltasCometidas=" + faltasCometidas + ", jugadoresFaltas=" + jugadoresFaltas + ", jugadoresAmarillas=" + jugadoresAmarillas + ", jugadoresRojas=" + jugadoresRojas + ", jugadoresGol=" + jugadoresGol + '}';
    }
    
    
}//fin clase
