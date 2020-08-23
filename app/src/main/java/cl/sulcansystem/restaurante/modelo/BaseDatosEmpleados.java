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
                R.drawable.ic_idea_comodin,
                "Gerente"));
        listaEmpleados.add(new Empleado(id++, "Angel Jhonathan Morales Cruz", "Bartender preocupado por buscar el equilibrio entre sabor y maridaje para la creación de los cócteles de la casa y un delicado cuidado en mantener las recetas originales de los cócteles clásicos",
                R.drawable.ic_idea_comodin, "BarTender"));
    }

}
