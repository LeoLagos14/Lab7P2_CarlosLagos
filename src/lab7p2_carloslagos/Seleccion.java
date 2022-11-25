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
public class Seleccion {
    
    private String nombre;
    private int PJ, PG, PE, PP, GF, GC, dif;
    private ArrayList<Jugador> jugadores = new ArrayList();

    public Seleccion() {
    }

    public Seleccion(String nombre, int PJ, int PG, int PE, int PP, int GF, int GC, int dif) {
        this.nombre = nombre;
        this.PJ = PJ;
        this.PG = PG;
        this.PE = PE;
        this.PP = PP;
        this.GF = GF;
        this.GC = GC;
        this.dif = dif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPJ() {
        return PJ;
    }

    public void setPJ(int PJ) {
        this.PJ = PJ;
    }

    public int getPG() {
        return PG;
    }

    public void setPG(int PG) {
        this.PG = PG;
    }

    public int getPE() {
        return PE;
    }

    public void setPE(int PE) {
        this.PE = PE;
    }

    public int getPP() {
        return PP;
    }

    public void setPP(int PP) {
        this.PP = PP;
    }

    public int getGF() {
        return GF;
    }

    public void setGF(int GF) {
        this.GF = GF;
    }

    public int getGC() {
        return GC;
    }

    public void setGC(int GC) {
        this.GC = GC;
    }

    public int getDif() {
        return dif;
    }

    public void setDif(int dif) {
        this.dif = dif;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    
  
    @Override
    public String toString() {
        return "Seleccion{" + "nombre=" + nombre + ", PJ=" + PJ + ", PG=" + PG + ", PE=" + PE + ", PP=" + PP + ", GF=" + GF + ", GC=" + GC + ", dif=" + dif + ", jugadores=" + jugadores + '}';
    }
    
    
}//fin clase
