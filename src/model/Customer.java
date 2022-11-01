package model;

/**
 *
 * @author Marlon
 */
public class Customer extends Person {

    private long telefono;
    private String correo;
    private int puntos;

    public Customer(long telefono, String correo, long identificacion,
            String nombre, String apellido, Gender genero) throws Exception {
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
