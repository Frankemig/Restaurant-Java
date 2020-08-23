package cl.sulcansystem.restaurante.modelo;

import java.util.ArrayList;
import java.util.List;

import cl.sulcansystem.restaurante.R;

public class BaseDatosEmpleados {
    private static List<Empleado> listaEmpleados = new ArrayList<>();

    public BaseDatosEmpleados() {
    }

    public static List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    static {
        int id = 0;
        listaEmpleados.add(new Empleado(id++, "Abis Alex Zavaleta León", "BarTender con más de 12 años en el mundo gastronómico.\n" +
                "En busca de desarrollar un equilibrio entre el 'Buen Servicio' y 'La Buena Comida'",
                "https://firebasestorage.googleapis.com/v0/b/restaurante-373af.appspot.com/o/Empleados%2FFB_IMG_1598172976949.jpg?alt=media&token=1035385a-ea07-44f4-a0ad-c074d7f866a8",
                "Gerente"));
        listaEmpleados.add(new Empleado(id++, "Angel Jhonathan Morales Cruz", "Bartender preocupado por buscar el equilibrio entre sabor y maridaje para la creación de los cócteles de la casa y un delicado cuidado en mantener las recetas originales de los cócteles clásicos",
                "https://firebasestorage.googleapis.com/v0/b/restaurante-373af.appspot.com/o/Empleados%2FFB_IMG_1598173041706.jpg?alt=media&token=398e23d1-e10e-4a32-b30e-1a1e401a6259", "BarTender"));
    }

}
