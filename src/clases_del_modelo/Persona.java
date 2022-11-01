package clases_del_modelo;

import exceptions.IdInvalidException;
import exceptions.StringVoidAtribException;

/**
 * @author Marlon E. Zambrano Z.
 */
public class Persona {

    private long identificador;
    private String nombres;
    private String apellidos;
    private Genero genero;

    public Persona(long identificador, String nombres, String apellidos, Genero genero) 
            throws Exception {
        if(!((1000000L >= identificador && identificador <= 9999999L)
                || (1000000000L >= identificador && identificador <= 9999999999L))) {
            throw new IdInvalidException("El numero debe identificacion debe "
                    + "contener 7 o 10 caracteres");
        }
        if ("".equals(nombres.trim())) {
            throw new StringVoidAtribException(
                    "Los nombres no pueden ser una cadena de texto vacio");
        }
        if ("".equals(apellidos.trim())) {
            throw new StringVoidAtribException(
                    "Los apellidos no pueden ser cadenas de texto vacio");
        }

        this.identificador = identificador;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
    }

    public long getIdentificador() {
        return identificador;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.identificador != other.identificador) {
            return false;
        }
        return true;
    }
}
