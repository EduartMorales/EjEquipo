/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author 1061688186
 */
public class Jugador {
    public String Nombre;
    public String Apellido;
    public String id;
    public String Posicion;
    int Num_Camisa;

    public Jugador() {
    }

    public Jugador(String Nombre, String Apellido, String id, String Posicion, int Num_Camisa) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.id = id;
        this.Posicion = Posicion;
        this.Num_Camisa = Num_Camisa;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    public int getNum_camisa() {
        return Num_Camisa;
    }

    public void setNum_camisa(int num_camisa) {
        this.Num_Camisa = Num_Camisa;
    }
    
    
}
