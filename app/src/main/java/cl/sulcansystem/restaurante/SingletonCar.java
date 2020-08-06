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
        }
        return INSTANCE;
    }


    public void add(Productos product) {
        productsList.add(product);
    }

    public List<Productos> getProductsList() {
        return productsList;
    }

    public void remove(Productos producto) {
        productsList.remove(producto);
    }
}
