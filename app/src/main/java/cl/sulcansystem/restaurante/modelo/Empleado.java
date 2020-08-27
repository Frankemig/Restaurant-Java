package cl.sulcansystem.restaurante.modelo;

public class Empleado {
    private int id;
    private String nombre;
    private String descripcion;
    private String imagenEmpleado;
    private String puesto;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String descripcion, String imagenEmpleado, String puesto) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagenEmpleado = imagenEmpleado;
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", imagen='" + imagenEmpleado + '\'' +
                ", puesto='" + puesto + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagenEmpleado() {
        return imagenEmpleado;
    }

    public void setImagenEmpleado(String imagenEmpleado) {
        this.imagenEmpleado = imagenEmpleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}
