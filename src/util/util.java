/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import util.Lista;
import zoo.Animal;
        
/**
 *
 * @author Sergio
 */
public class util {
    public static ArrayList guardar (ArrayList lista, String ruta) throws FileNotFoundException, IOException{
            FileOutputStream fos = new FileOutputStream(ruta);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lista);
            oos.close();
            return lista;
    }
    
    public static ArrayList cargar (ArrayList lista,String ruta) throws IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream(ruta);
        ObjectInputStream ois = new ObjectInputStream(fis);
        lista = (ArrayList<Animal>) ois.readObject();
        return lista;
    }
    
}