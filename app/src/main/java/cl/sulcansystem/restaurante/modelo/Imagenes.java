package cl.sulcansystem.restaurante.modelo;

public class Imagenes {
    private int id;
    private String imagenNombre;
    private String imagen;

    public Imagenes() {
    }

    public Imagenes(int id, String imagenNombre, String imagen) {
        this.id = id;
        this.imagenNombre = imagenNombre;
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Imagenes{" +
                "id=" + id +
                ", imagenNombre='" + imagenNombre + '\'' +
                ", imagen='" + imagen + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImagenNombre() {
        return imagenNombre;
    }

    public void setImagenNombre(String imagenNombre) {
        this.imagenNombre = imagenNombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}