package gestionadordenotas;

public class ModuloProfesor extends CrudNota{

    private int idProfesor;
    private String nombreProfe;

    public ModuloProfesor(){

    }

    public ModuloProfesor(int idProfesor, String nombreProfe) {
        this.idProfesor = idProfesor;
        this.nombreProfe = nombreProfe;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombreProfe() {
        return nombreProfe;
    }

    public void setNombreProfe(String nombreProfe) {
        this.nombreProfe = nombreProfe;
    }

    @Override
    public void registrarNota() {
        super.registrarNota();
    }

    @Override
    public void listarNotas() {
        super.listarNotas();
    }

    @Override
    public void actualizarNota() {
        super.actualizarNota();
    }

    @Override
    public void eliminarNota() {
        super.eliminarNota();
    }
}
