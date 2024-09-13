/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Helpers.HelperImpresion;
import Logica_Negocio.Equipo;
import Logica_Negocio.Jugador;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 1061688186
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Nombre, Apellido, id, Posicion, Nombre_equipo;
        int num_camisa, opc=0, num_jugadores=0;
        Scanner scan = new Scanner(System.in);
        ArrayList listajugadoresglobal;
        Jugador objJugador;
        Equipo objEquipo;
        ArrayList<Equipo> listaequipos= new ArrayList<>();
       
        do{
            System.out.println("1. Registrar jugadores");
            System.out.println("2. Mostrar equipo");
            System.out.println("3. Salir");
           
             do {
                try {

                    System.out.println("Digite una opcion valida");
                    opc = scan.nextInt();

                } catch (InputMismatchException e) {
                    System.out.println("Error");
                }
                scan.nextLine();
            } while (opc <= 0);
             
             
             switch(opc)
             {
                 case 1:
                     ArrayList<Jugador> listajugadoreslocal= new ArrayList<>();
                      do {
                        try {

                            System.out.println("Digite el numero de jugadores");
                            num_jugadores = scan.nextInt();

                        } catch (InputMismatchException e) {
                            System.out.println("Error");
                        }
                        scan.nextLine();

                    } while (num_jugadores <= 0);
                     
                      for (int i = 0; i < num_jugadores; i++) {
                         
                          System.out.println("Digite el nomnre del jugador");
                          Nombre=scan.nextLine();
                          System.out.println("Digite el apellido del jugador");
                          Apellido=scan.nextLine();
                          System.out.println("Digite el id del jugador");
                          id=scan.nextLine();
                          System.out.println("Digite la posicion del jugador");
                          Posicion=scan.nextLine();
                          System.out.println("Digite el numero de la camisa del jugador");
                          num_camisa=scan.nextInt();
                         
                          scan.nextLine();
                         
                          objJugador= new Jugador(Nombre, Apellido, id, Posicion, num_camisa); //aqui se hace la agregacion
                          listajugadoreslocal.add(objJugador);
                     }
                      listajugadoresglobal=listajugadoreslocal;
                      listajugadoreslocal=null;
                     
                      System.out.println("Digite el nombre del equipo");
                      Nombre_equipo= scan.nextLine();
                     
                      objEquipo= new Equipo(Nombre_equipo, listajugadoresglobal);
                      listaequipos.add(objEquipo);
                     break;
                     
                 case 2:
                     HelperImpresion.ImprimirInformacionEquipo(listaequipos);
                     break;
                     
                 case 3:
                     break;
             }
           
           
        }while(opc!=3);
    }
    
}
