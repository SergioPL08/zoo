/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoo;

/**
 *
 * @author sergio
 */
public class Especialidad {
    private String nombreEspecialidad;
    private float salarioMedio;
    private float extraPeligrosidad;

    public Especialidad(String nombreEspecialidad, float salarioMedio, float extraPeligrosidad) {
        this.nombreEspecialidad = nombreEspecialidad;
        this.salarioMedio = salarioMedio;
        this.extraPeligrosidad = extraPeligrosidad;
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }

    public float getSalarioMedio() {
        return salarioMedio;
    }

    public void setSalarioMedio(float salarioMedio) {
        this.salarioMedio = salarioMedio;
    }

    public float getExtraPeligrosidad() {
        return extraPeligrosidad;
    }

    public void setExtraPeligrosidad(float extraPeligrosidad) {
        this.extraPeligrosidad = extraPeligrosidad;
    }
    
    
}
