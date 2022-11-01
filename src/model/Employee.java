package model;

/**
 *
 * @author Marlon
 */
public class Employee extends Person {

    private String usuario;
    private String contrasenia;

    public Employee(String usuario, String contrasenia, int identificacion,
            String nombre, String apellido, Gender genero) throws Exception {
        super(identificacion, nombre, apellido, genero);
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }   
    
}
