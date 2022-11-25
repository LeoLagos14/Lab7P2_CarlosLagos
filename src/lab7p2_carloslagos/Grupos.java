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
public class Grupos {
    
    private ArrayList<Seleccion> equipos = new ArrayList();
    private ArrayList<Grupos> gruposs = new ArrayList();
    private File archivo = null;
    

    public Grupos() {
    }

    public ArrayList<Seleccion> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Seleccion> equipos) {
        this.equipos = equipos;
    }

    @Override
    public String toString() {
        return "Grupos{" + "equipos=" + equipos + '}';
    }
    
     public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Grupos t : gruposs) {
                bw.write(gruposs.toString());
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
        gruposs = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("|");
                while (sc.hasNext()) {
                    gruposs.add(new Grupos());
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            sc.close();
        }
    }       
    
}//fin clase 
