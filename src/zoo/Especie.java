/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoo;

/**
 *
 * @author Sergio
 */
public class Especie {
    private static int id;
    private static String name;

    public Especie(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Especie(String name) {
        this.name = name;
    }
    
    
    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Especie.id = id;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Especie.name = name;
    }
    
    
    
    @Override
    public String toString(){
        return name;
    }
    
    
}
