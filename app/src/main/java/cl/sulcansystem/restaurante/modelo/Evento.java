package cl.sulcansystem.restaurante.modelo;

public class Evento {
    private int id;
    private String nombreEvento;
    private String imagenEvento;

    public Evento() {
    }

    public Evento(int id, String nombreEvento, String imagenEvento) {
        this.id = id;
        this.nombreEvento = nombreEvento;
        this.imagenEvento = imagenEvento;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", nombreEvento='" + nombreEvento + '\'' +
                ", imagenEvento='" + imagenEvento + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getImagenEvento() {
        return imagenEvento;
    }

    public void setImagenEvento(String imagenEvento) {
        this.imagenEvento = imagenEvento;
    }
}
