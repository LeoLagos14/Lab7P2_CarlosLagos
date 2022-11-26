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
public class Usuario {
    
    private int id;
    private String username, password, tipoUser;
    private ArrayList<Usuario> usersss = new ArrayList();
    private File archivo = null;
    
    public Usuario() {
    }

    public Usuario(int id, String username, String password, String tipoUser) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.tipoUser = tipoUser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipoUser() {
        return tipoUser;
    }

    public void setTipoUser(String tipoUser) {
        this.tipoUser = tipoUser;
    }

    public ArrayList<Usuario> getUsersss() {
        return usersss;
    }

    public void setUsersss(ArrayList<Usuario> usersss) {
        this.usersss = usersss;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    

    @Override
    public String toString() {
        return id + "|" + username + "|" + password + "|" + tipoUser;
    }
    
   public void escribirArchivo() throws IOException {
        
      FileWriter fw = null;
      BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo,false);
            bw = new BufferedWriter(fw);
            for (Usuario usuarios : usersss) {
                bw.write(usuarios.toString());
                
            }
            bw.flush();
        } catch (Exception e) {
        }
      bw.close();
      fw.close();
        
    }
    public void cargarArchivo(){
        Scanner sc = null;
        usersss = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("|");
                while(sc.hasNext()){
                    usersss.add(new Usuario
                    (sc.nextInt(),sc.next(),sc.next(),sc.next()));
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            sc.close();
        }
    }
    
}//fin clase
