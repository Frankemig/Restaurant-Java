package cl.sulcansystem.restaurante.modelo;

public interface IVerificador {

    boolean evaluateLength(String contraseña);

    boolean evaluateUpper (String contraseña);

    boolean evaluateHasNumber (String contraseña);

    int verificar(String contraseña);
}

