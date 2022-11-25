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
    
    
    
}//fin clase 
