/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_carloslagos;

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
/**
 *
 * @author clago
 */
public class Partido {
    
    private String tipoLV;
    private int goles,posesion, tirosMeta,tirosTotal, faltasCometidas;
    private ArrayList<Jugador> jugadoresFaltas = new ArrayList();
    private ArrayList<Jugador> jugadoresAmarillas = new ArrayList();
    private ArrayList<Jugador> jugadoresRojas = new ArrayList();
    private ArrayList<Jugador> jugadoresGol = new ArrayList();
    private ArrayList<Partido> partido = new ArrayList();
    private File archivo = null;

    public Partido() {
    }

    public Partido(String tipoLV, int goles, int posesion, int tirosMeta, int tirosTotal, int faltasCometidas) {
        this.tipoLV= tipoLV;
        this.goles = goles;
        this.posesion = posesion;
        this.tirosMeta = tirosMeta;
        this.tirosTotal = tirosTotal;
        this.faltasCometidas = faltasCometidas;
    }

    public String getTipoLV() {
        return tipoLV;
    }

    public void setTipoLV(String tipoLV) {
        this.tipoLV = tipoLV;
    }

    public ArrayList<Partido> getPartido() {
        return partido;
    }

    public void setPartido(ArrayList<Partido> partido) {
        this.partido = partido;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
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
        return   tipoLV + "|" + goles + "|" + posesion + "|" + tirosMeta + "|" + tirosTotal + "|" + faltasCometidas + "|" + jugadoresFaltas + "|" + jugadoresAmarillas + "|" + jugadoresRojas + "|" + jugadoresGol;
    }
    
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Partido t : partido) {
                bw.write(partido.toString());
            }
            bw.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo() {
        Scanner sc = null;
        partido = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("|");
                while (sc.hasNext()) {
                    partido.add(new Partido(sc.next(),
                                    sc.nextInt(),
                                    sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()));
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            sc.close();
        }
    }       
    
}//fin clase
