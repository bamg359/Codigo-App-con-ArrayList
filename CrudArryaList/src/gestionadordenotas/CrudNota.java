package gestionadordenotas;

//import Estudiante.*;

import java.util.ArrayList;
import java.util.Scanner;


public abstract class CrudNota implements GestionNota{

    Scanner sc = new Scanner(System.in);
    ArrayList<Double> notas = new ArrayList<Double>();


    @Override
    public void registrarNota() {


        System.out.println("Ingrese nota 1:");
        double nota1 = sc.nextDouble();
        notas.add(nota1);

        System.out.println("Ingrese nota 2:");
        double nota2 = sc.nextDouble();
        notas.add(nota2);

        System.out.println("Ingrese nota 3:");
        double nota3 = sc.nextDouble();
        notas.add(nota3);

        double promNotas = (nota1+nota2+nota3)/3;
        notas.add(promNotas);

    }

    @Override
    public void listarNotas() {


        for (int i = 0 ; i< notas.size(); i++){

            System.out.println("Nota " + i + "es: " + notas.get(i));
        }

    }

    @Override
    public void actualizarNota() {


        System.out.println("Que nota desea actualizar? :");
        int i = sc.nextInt();
        System.out.println("Agregue la nueva nota");
        double value = sc.nextDouble();
        notas.set(i, value);

    }

    @Override
    public void eliminarNota() {

        System.out.println("Indique la posicion de la nota a eliminar");
        int i = sc.nextInt();
        notas.remove(i);

    }
}
