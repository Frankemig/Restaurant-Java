package cl.sulcansystem.restaurante.modelo;

import java.util.ArrayList;
import java.util.List;

public class ImagenesData {
    private static List<Imagenes>listaImagenes = new ArrayList<>();

    public ImagenesData() {
    }

    public static List<Imagenes> getListaImagenes() {
        return listaImagenes;
    }

    public static void setListaImagenes(List<Imagenes> listaImagenes) {
        ImagenesData.listaImagenes = listaImagenes;
    }
    static {
        int id = 0;
        listaImagenes.add(new Imagenes(id++,"Nuestra Barra","https://firebasestorage.googleapis.com/v0/b/restaurante-373af.appspot.com/o/Empleados%2FDSC_0037.jpg?alt=media&token=d56a6eb4-46c5-4214-bdd1-8231aa193f7b"));

    }
}
