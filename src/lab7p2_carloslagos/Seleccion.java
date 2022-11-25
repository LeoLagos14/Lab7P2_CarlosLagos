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
 *
 * @author clago
 */
public class Seleccion {
    
    private String nombre;
    private int PJ, PG, PE, PP, GF, GC, dif;
    private ArrayList<Jugador> jugadores = new ArrayList();
    private ArrayList<Seleccion> seleccion = new ArrayList();
    private File archivo = null;

    public Seleccion() {
    }

    public Seleccion(String path){
        archivo = new File(path);
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

    public ArrayList<Seleccion> getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(ArrayList<Seleccion> seleccion) {
        this.seleccion = seleccion;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    
  
    @Override
    public String toString() {
        return nombre + "|" + PJ + "|" + PG + "|" + PE + "|" + PP + "|" + GF + "|" + GC + "|" + dif + "|" + jugadores + ',';
    }
    
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Seleccion t : seleccion) {
                bw.write(seleccion.toString());
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
        seleccion = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("|");
                while (sc.hasNext()) {
                    seleccion.add(new Seleccion(sc.next(),
                                    sc.nextInt(),
                                    sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()
                                    ));
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            sc.close();
        }
    }
    
}//fin clase
