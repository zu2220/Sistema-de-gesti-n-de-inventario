package modelo;

import java.util.UUID;

/**
 *
 *  @author Grupo 1
 */
public class Usuario {

    //Atributos
    private String idUsuario;
    private String nombre;
    private String apellido;
    private String usuario;
    private String password;
    private String telefono;
    private int estado;

    //Contructor vacío
    public Usuario() {
        this.idUsuario = UUID.randomUUID().toString();
        this.nombre = "";
        this.apellido = "";
        this.usuario = "";
        this.password = "";
        this.telefono = "";
        this.estado = 0;
    }

    public Usuario(String nombre, String apellido, String usuario, String password, String telefono, int estado) {
        this.idUsuario = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.password = password;
        this.telefono = telefono;
        this.estado = estado;
    }
    

    public String getIdUsuario() {
        return idUsuario;
    }

    //set and get
    public void setIdUsuario(String idUsuario) {    
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
