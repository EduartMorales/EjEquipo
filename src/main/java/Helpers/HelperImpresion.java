/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import Logica_Negocio.Equipo;
import java.util.ArrayList;

/**
 *
 * @author 1061688186
 */
public class HelperImpresion { 

    public static void ImprimirInformacionEquipo(ArrayList<Equipo> listaequipos) {
        for (int i = 0; i < listaequipos.size(); i++) {
            System.out.println("El nombre del equipo es:" + "\t" + listaequipos.get(i).getNombre_equipo());

            for (int j = 0; j < listaequipos.get(i).getListajugadores().size(); j++) {

                System.out.println("El nombre del jugador es:" + "\t" + listaequipos.get(i).getListajugadores().get(j).getNombre());
                System.out.println("El apellido del jugador es" + "\t" + listaequipos.get(i).getListajugadores().get(j).getApellido());
                System.out.println("El id del jugador es" + "\t" + listaequipos.get(i).getListajugadores().get(j).getId());
                System.out.println("La posicion del jugador es" + "\t" + listaequipos.get(i).getListajugadores().get(j).getPosicion());
                System.out.println("El numero de la camisa jugador es" + "\t" + listaequipos.get(i).getListajugadores().get(j).getNum_camisa());

            }
        }

    }
}
