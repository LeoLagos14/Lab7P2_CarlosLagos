/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_carloslagos;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
/**
 *
 * @author clago
 */
public class Jugador {
    
    private String nombreJugador;
    private int dorsal,goles,asistencias,partidosJugados,tarjetasAmarillas,tarjetasRojas, faltasRecibidas,posicion;
    private ArrayList<Jugador> jugadores = new ArrayList();
    private File archivo = null;
    
    public Jugador() {
    }

    public Jugador(String nombreJugador, int dorsal, int goles, int asistencias, int partidosJugados, int tarjetasAmarillas, int tarjetasRojas, int faltasRecibidas, int posicion) {
        this.nombreJugador = nombreJugador;
        this.dorsal = dorsal;
        this.goles = goles;
        this.asistencias = asistencias;
        this.partidosJugados = partidosJugados;
        this.tarjetasAmarillas = tarjetasAmarillas;
        this.tarjetasRojas = tarjetasRojas;
        this.faltasRecibidas = faltasRecibidas;
        this.posicion = posicion;
    }

    
    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }

    public void setTarjetasAmarillas(int tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }

    public int getTarjetasRojas() {
        return tarjetasRojas;
    }

    public void setTarjetasRojas(int tarjetasRojas) {
        this.tarjetasRojas = tarjetasRojas;
    }

    public int getFaltasRecibidas() {
        return faltasRecibidas;
    }

    public void setFaltasRecibidas(int faltasRecibidas) {
        this.faltasRecibidas = faltasRecibidas;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    

    @Override
    public String toString() {
        return nombreJugador + "|" + dorsal + "|" + goles + "|" + asistencias + "|" + partidosJugados + "|" + tarjetasAmarillas + "|" + tarjetasRojas + "|" + faltasRecibidas + "|" + posicion;
    }
    
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Jugador t : jugadores) {
                bw.write(jugadores.toString());
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
        jugadores = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("|");
                while (sc.hasNext()) {
                    jugadores.add(new Jugador(sc.next(),
                                    sc.nextInt(),
                                    sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),
                                    sc.nextInt()));
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            sc.close();
        }
    }       
    
}//fin clase 
