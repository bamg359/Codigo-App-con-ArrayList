package crud;

public class Profesor extends Usuario implements Crud{

    @Override
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
    @Override
    public void imprimirRegistro(){
        for(int i= 0; i< usuarios.size(); i++){
            System.out.println(usuarios.get(i));
        }
    }
    @Override
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
