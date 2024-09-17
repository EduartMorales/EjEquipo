/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Helpers.HelperImpresion;
import Helpers.HelperValidacion;
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
        int rta, conteo;
       
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
                         
                          System.out.println("Digite el nombre del jugador");
                          Nombre=scan.nextLine();
                          rta=HelperValidacion.ValidarVacio(Nombre);
                          
                          while (rta > 0) {                              
                             System.out.println("Digite el nombre del jugador");
                             Nombre = scan.nextLine();
                             rta = HelperValidacion.ValidarVacio(Nombre);
                          }
                          
                          conteo = HelperValidacion.ValidarTodo(Nombre);
                          
                          while (conteo != 0) {                              
                             System.out.println("Digite el nombre del jugador");
                             Nombre = scan.nextLine();
                             conteo = HelperValidacion.ValidarTodo(Nombre);
                          }
                          
                          //Termina Nombre de jugadores
                          
                          System.out.println("Digite el apellido del jugador");
                          Apellido=scan.nextLine();
                          rta = HelperValidacion.ValidarVacio(Apellido);
                          
                          while (rta > 0) {                              
                             System.out.println("Digite el apellido del jugador");
                             Apellido=scan.nextLine();
                             rta = HelperValidacion.ValidarVacio(Apellido);
                          }
                          
                          conteo = HelperValidacion.ValidarTodo(Apellido);
                          
                          while (conteo != 0) {
                             System.out.println("Digite el apellido del jugador");
                             Nombre = scan.nextLine();
                             conteo = HelperValidacion.ValidarTodo(Apellido);
                        }

                          // Termina Apellido
                          
                          System.out.println("Digite el id del jugador");
                          id=scan.nextLine();
                          rta = HelperValidacion.ValidarVacio(id);
                          
                          while (rta > 0) {                              
                             System.out.println("Digite el id del jugador");
                             id=scan.nextLine();
                             rta = HelperValidacion.ValidarVacio(id);
                          }
                          
                          conteo = HelperValidacion.ValidarTodoSerial(id);
                          
                          while (conteo != 0) {                              
                             System.out.println("Digite el id del jugador");
                             id = scan.nextLine();
                             conteo = HelperValidacion.ValidarTodoSerial(id);
                          }
                          
                          // Termina id
                          
                          System.out.println("Digite la posicion del jugador");
                          Posicion=scan.nextLine();
                          rta = HelperValidacion.ValidarVacio(Posicion);
                          
                          while (rta > 0) {                              
                              System.out.println("Digite la posicion del jugador");
                              Posicion=scan.nextLine();
                              rta = HelperValidacion.ValidarVacio(Posicion);
                          }
                          
                          conteo = HelperValidacion.ValidarTodo(Posicion);
                          
                          while (conteo != 0) {                              
                              System.out.println("Digite la posicion del jugador");
                              Posicion=scan.nextLine();
                              conteo = HelperValidacion.ValidarTodo(Posicion);
                          }
                          
                          // Termina Posicion
                          
                          System.out.println("Digite el numero de la camisa del jugador");
                          num_camisa=scan.nextInt();
                          rta = (num_camisa == 0)? 1:0;
                          
                          while (rta > 0) {                              
                              System.out.println("Digite el numero de la camisa del jugador");
                              num_camisa=scan.nextInt();
                              rta = (num_camisa == 0)? 1:0;
                          }
                          
                          conteo = HelperValidacion.ValidarCantidadRango(num_camisa);
                          
                          while (conteo == 0) {                              
                              System.out.println("Digite el numero de la camisa del jugador");
                              num_camisa=scan.nextInt();
                              conteo = HelperValidacion.ValidarCantidadRango(num_camisa);
                          }
                         
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
