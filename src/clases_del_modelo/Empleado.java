package clases_del_modelo;
 import logic_encrypt.EncryptPassword;

/**
 *
 * @author Marlon
 */
public class Empleado extends Persona {

    private String usuario;
    private EncryptPassword contrasenia;

    public Empleado(String usuario, EncryptPassword contrasenia, int identificacion,
            String nombre, String apellido, Genero genero) throws Exception {
        super(identificacion, nombre, apellido, genero);
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public String getUsuario() {
        return usuario;
    }

    public EncryptPassword getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(EncryptPassword contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }   
    
}
