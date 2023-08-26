package gestionadordenotas;

public class ModuloEstudiante extends CrudNota {

    private int idEst;
    private String nombreEst;

    public ModuloEstudiante(){

    }

    public ModuloEstudiante(int idEst,String nombreEst) {
        this.idEst = idEst;
        this.nombreEst = nombreEst;
    }

    public int getIdEst() {
        return idEst;
    }

    public void setIdEst(int idEst) {
        this.idEst = idEst;
    }

    public String getNombreEst() {
        return nombreEst;
    }

    public void setNombreEst(String nombreEst) {
        this.nombreEst = nombreEst;
    }

    @Override
    public void listarNotas() {
        super.listarNotas();
        Servicio.getModuloProfesor().listarNotas();

    }
}
