package gestionadordenotas;

import java.util.Scanner;

public class MenuApp {
    Scanner sc = new Scanner(System.in);
    ModuloProfesor mp = new ModuloProfesor();
    ModuloEstudiante me = new ModuloEstudiante();

    public void ejecutarMenuApp(){

        System.out.println("Oprima 1 para iniciar:");
        int ini = sc.nextInt();

        do{

            System.out.println(" Seleccione un usuario: 1. Profesor\n 2. Estudiante");
            int opcUser = sc.nextInt();
            if(opcUser == 1){
                int opc;
                System.out.println("Seleccione 1. Registrar nota\n" +
                        "2. Listar notas\n" +
                        "3. Actulizar nota\n" +
                        "4. Eliminar nota" +
                        "5. Salir");
                opc = sc.nextInt();
                switch (opc){
                    case 1:
                        System.out.println("Agregue nota");
                        mp.registrarNota();
                        break;
                    case 2:
                        System.out.println("Listado de notas");
                        mp.listarNotas();
                        break;
                    case 3:
                        System.out.println("Actualice notas: ");
                        mp.actualizarNota();
                        break;
                    case 4:
                        System.out.println("Borrar notas");
                        mp.eliminarNota();
                        break;
                    case 5:
                        System.out.println("Salir");
                        break;
                    default:
                        System.out.println("Seleccione una opción Valida");

                }
            }else if(opcUser == 2){
                System.out.println("listado de notas");
                me.listarNotas();

            }else{
                System.out.println("Seleccione un usuario");
            }

        }while(ini != 0);



    }




}
