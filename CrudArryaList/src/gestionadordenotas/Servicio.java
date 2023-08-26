package gestionadordenotas;

public class Servicio {

    private static GestionNota listaNota = new ModuloProfesor();

    public static GestionNota getModuloProfesor(){
        return listaNota;
    }
}
