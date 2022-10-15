package clases_del_modelo;

/**
 *
 * @author Marlon
 */
public class Cliente extends Persona {

    private long telefono;
    private String correo;
    private int puntos;

    public Cliente(long telefono, String correo, long identificacion,
            String nombre, String apellido, Genero genero) throws Exception {
        super(identificacion, nombre, apellido, genero);
        this.telefono = telefono;
        this.correo = correo;
        this.puntos = 0;
    }

    public long getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
