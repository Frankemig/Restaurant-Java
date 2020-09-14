package cl.sulcansystem.restaurante;

import java.util.ArrayList;
import java.util.List;

import cl.sulcansystem.restaurante.modelo.Productos;

public class SingletonCar {

    private static SingletonCar INSTANCE;

    private List<Productos> productsList;

    private SingletonCar() {
        productsList = new ArrayList<>();
    }

    public static SingletonCar getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new SingletonCar();
            fakeData();
        }
        return INSTANCE;
    }

    private static void fakeData() {
        INSTANCE.productsList.add(new Productos("Pisco Sour Tabernero", "Pisco, Limón, Jarabe de Goma Casero y Gotas de Amargo de Angostura", "3.890", "https://firebasestorage.googleapis.com/v0/b/restaurante-ea6bb.appspot.com/o/Piscos%20Y%20Sour's%2FPisco%20Sour.jpg?alt=media&token=99c3dffd-ee0a-428e-9832-308bb879ba26"));
        INSTANCE.productsList.add(new Productos("Pisco Sour Tabernero", "Pisco, Limón, Jarabe de Goma Casero y Gotas de Amargo de Angostura", "3.890", "https://firebasestorage.googleapis.com/v0/b/restaurante-ea6bb.appspot.com/o/Piscos%20Y%20Sour's%2FPisco%20Sour.jpg?alt=media&token=99c3dffd-ee0a-428e-9832-308bb879ba26"));
        INSTANCE.productsList.add(new Productos("Pisco Sour Tabernero", "Pisco, Limón, Jarabe de Goma Casero y Gotas de Amargo de Angostura", "3.890", "https://firebasestorage.googleapis.com/v0/b/restaurante-ea6bb.appspot.com/o/Piscos%20Y%20Sour's%2FPisco%20Sour.jpg?alt=media&token=99c3dffd-ee0a-428e-9832-308bb879ba26"));
        INSTANCE.productsList.add(new Productos("Camarones al Pil Pil", "Colitas de Camarones Salteadas en Mantequilla y Vino Blanco, Aceite de Oliva y Ajo Crocante.", "7.400", "https://firebasestorage.googleapis.com/v0/b/restaurante-373af.appspot.com/o/Entradas%20Calientes%2FCamarones%20Pil%20Pil.png?alt=media&token=fc62bd88-6fd1-4aab-a307-73f67a750b71"));
    }


    public void add(Productos product) {
        productsList.add(product);
        productsList.sort((productos, t1) -> productos.getNombre().compareTo(t1.getNombre()));
    }

    public List<Productos> getProductsList() {
        return productsList;
    }

    public void remove(Productos producto) {
        productsList.remove(producto);
    }
}
