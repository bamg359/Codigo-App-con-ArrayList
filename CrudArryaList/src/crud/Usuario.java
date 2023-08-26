package crud;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Scanner;

public class Usuario {

    Scanner sc = new Scanner(System.in);
    ArrayList<String> usuarios= new ArrayList<>();



    protected int id;
    protected String name;
    protected String lastName;
    protected String email;
    protected String password;
    protected String rol;

    public Usuario(){

    }

    public Usuario(int id, String name, String lastName, String email, String password, String rol) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.rol = rol;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }


    public void crearUsuario(){
        System.out.println("Id Usuario: ");
        id = sc.nextInt();
        String idString = Integer.toString(id);
        usuarios.add("Id: " + idString);
        System.out.println("Ingrese su nombre: ");
        name = sc.next();
        usuarios.add("Nombre: " + name);
        System.out.println("INgrese su apellido: ");
        lastName = sc.next();
        usuarios.add("Apellido: " + lastName);
        System.out.println("Ingrese su correo: ");
        email = sc.next();
        usuarios.add(email);
        System.out.println("INgrese su contraseña: ");
        password = sc.next();
        usuarios.add( password);
        System.out.println("Ingrese su rol: ");
        rol = sc.next();
        usuarios.add("rol: " + rol);
    }

    public void imprimirRegistro(){
        for(int i= 0; i< usuarios.size(); i++){
            System.out.println(usuarios.get(i));
        }
    }

    public void login(){

        System.out.println("Ingrese su usuario: ");
        String user = sc.next();
        System.out.println("INgrese su correo: ");
        String passwordUser = sc.next();
        if (user.equals(usuarios.get(3) ) && passwordUser.equals(usuarios.get(4))){
            System.out.println("Bienvenido " + usuarios.get(1));

        }else{
            System.out.println("Valide su contraseña");
        }



    }

}
