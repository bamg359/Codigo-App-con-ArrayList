package crud;

import java.util.Scanner;

public class MenuInicio {

    Scanner sc = new Scanner(System.in);
    Profesor profesor = new Profesor();
    Estudiante estudiante = new Estudiante();


    private int isOn;
    private int opc;

    public MenuInicio(){

    }

    public void ejecutarMenuInicio(){
        System.out.println("Selecciona 1 para iniciar tu aplición: ");
        int isOn= sc.nextInt();
        do{

            System.out.println("-----------------------");

            System.out.println("Binvenido a tu App");
            System.out.println("Selecciona: " +
                    "1. Registrarte\n" +
                    "2. Iniciar Sesión\n" +
                    "3. Salir de la Aplicación");

            opc = sc.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Realice su registro: ");
                    System.out.println("Indique 1, si es profesor o 2 si es Estudiente");
                    int rol = sc.nextInt();
                    if(rol == 1){
                        System.out.println("Registro Docentes");
                        profesor.crearUsuario();
                    }else if(rol==2 ){
                        System.out.println("Registro Estudientes");
                        estudiante.crearUsuario();
                }else{
                        System.out.println("Ingrese un rol valido");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese a la aplicación");
                    System.out.println("Indique 1, si es profesor o 2 si es Estudiente");
                    int rolRegistrado = sc.nextInt();
                    if(rolRegistrado == 1){
                        System.out.println("Inicio de sesión Docentes");
                        profesor.login();
                    }else if(rolRegistrado==2 ){
                        System.out.println("Inicio de Sesion Estudiantes");
                        estudiante.login();
                    }else{
                        System.out.println("Ingrese un rol valido");
                    }
                    break;
                case 3:
                    System.out.println("Salir de la aplicación");
                    isOn= 0;
                    break;
                default:
                    System.out.println("INgrese una opcion valida");

            }
            System.out.println("-----------------------");


        }while(isOn != 0);




    }


}
