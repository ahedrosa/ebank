/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alberto
 */
public class Banco implements Serializable{
    
    // Constante publicas de clase
    public final static int LIMITE_REINTEGRO = 600;
    public final static int LIMITE_INGRESO = 1000;
    
    private TarjetaCredito[] tTarjetas;
    
    public Banco(int numTarjetas){
        
        tTarjetas = new TarjetaCredito[numTarjetas];
        
        for (int i = 0; i < tTarjetas.length; ++i){
            tTarjetas[i] = new TarjetaCredito();
        }
    }

    public TarjetaCredito[] gettTarjetas() {
        return tTarjetas;
    }
    
    public int buscaPosLibre(){
        for (int i = 0; i < tTarjetas.length; ++i){
            if (tTarjetas[i].getNumTarjeta().length() == 0){
                return i;
            }
        }
        return -1;
    }
    
    public void alta(String numTar, String PIN, double saldoTar){
        //Desde teclado se introducen los atributos de la tarjeta validandolos
        
        int posLibre = buscaPosLibre();
            
            tTarjetas[posLibre].setNumTarjeta(numTar);
            tTarjetas[posLibre].setPin(PIN);
            tTarjetas[posLibre].setSaldo(saldoTar);
            //tTarjetas[posLibre].setBloqueada(true); //Para hacer pruebas con tarjetas bloqueadas
        
        
    }
    
    public void baja(int posTar){
        
        tTarjetas[posTar].limpiarTarjeta();
        
    }
    
    public void modificacion(int posTar, Double saldo,String PIN, Boolean bloq ){
        
        tTarjetas[posTar].setSaldo(saldo);
        tTarjetas[posTar].setPin(PIN);
        tTarjetas[posTar].setBloqueada(bloq);
    }
    
    
    
    
    
    @Override
    public String toString(){
        boolean hayCuentas = false;
        String cad =  "Banco\n";
               cad += "-----\n";
               for (int i = 0; i < tTarjetas.length; ++i){
                   if (tTarjetas[i].getNumTarjeta().length() != 0){
                       cad += tTarjetas[i] + "\n";
                       hayCuentas = true;
                   }
               }
        if (!hayCuentas){
            cad += "Banco sin cuentas\n";
        }
        return cad;
    }
    
    public int buscaPosicion(String numTarjeta){
        // Busca la posición de numTarjeta en el array tTarjetas,
        // si no está devuelve -1
        
        for (int i = 0; i < tTarjetas.length; ++i){
            if (numTarjeta.compareTo(tTarjetas[i].getNumTarjeta()) == 0){
                return i;
            }
        }
        
        return -1;
    }
    
    public Banco cargar(String nombreFichBanco){
        Banco b = null;
        try{
                FileInputStream fis = new FileInputStream(nombreFichBanco);
                ObjectInputStream ois = new ObjectInputStream(fis);
                b =  (Banco) ois.readObject(); //Lee integramente el estado del parking almacenado 
                tTarjetas = b.gettTarjetas();
                ois.close();
            }catch(IOException e){
                System.out.println("Error al leer el banco:" + nombreFichBanco);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
            }
            return b;
    }
    
    public void guardar(String nombreFichBanco){
        try{
                FileOutputStream fos = new FileOutputStream(nombreFichBanco);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(this); //Guarda todo el estado del parking 
                oos.close();
            }
            catch (IOException e){
                System.out.println("Error al grabar el banco:" + nombreFichBanco);
            }
       
    }
    
    public boolean existe(String nombreFichBanco){
        File f = new File(nombreFichBanco);
        return f.exists();
    }
    
}
