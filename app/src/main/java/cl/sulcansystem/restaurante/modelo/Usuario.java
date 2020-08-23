package cl.sulcansystem.restaurante.modelo;

public class Usuario {

    private String Nombre;
    private String Comuna;
    private String Contraseña;
    private String Direccion;
    private String Estatus;
    private String Mail;
    private String Registrado_Por;
    private String Tipo_Usuario;

    public Usuario() {
    }

    public Usuario(String nombre, String comuna, String contraseña, String direccion, String estatus, String mail, String registrado_Por, String tipo_Usuario) {
        Nombre = nombre;
        Comuna = comuna;
        Contraseña = contraseña;
        Direccion = direccion;
        Estatus = estatus;
        Mail = mail;
        Registrado_Por = registrado_Por;
        Tipo_Usuario = tipo_Usuario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "Nombre='" + Nombre + '\'' +
                ", Comuna='" + Comuna + '\'' +
                ", Contraseña='" + Contraseña + '\'' +
                ", Direccion='" + Direccion + '\'' +
                ", Estatus='" + Estatus + '\'' +
                ", Mail='" + Mail + '\'' +
                ", Registrado_Por='" + Registrado_Por + '\'' +
                ", Tipo_Usuario='" + Tipo_Usuario + '\'' +
                '}';
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getComuna() {
        return Comuna;
    }

    public void setComuna(String comuna) {
        Comuna = comuna;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getEstatus() {
        return Estatus;
    }

    public void setEstatus(String estatus) {
        Estatus = estatus;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public String getRegistrado_Por() {
        return Registrado_Por;
    }

    public void setRegistrado_Por(String registrado_Por) {
        Registrado_Por = registrado_Por;
    }

    public String getTipo_Usuario() {
        return Tipo_Usuario;
    }

    public void setTipo_Usuario(String tipo_Usuario) {
        Tipo_Usuario = tipo_Usuario;
    }
}