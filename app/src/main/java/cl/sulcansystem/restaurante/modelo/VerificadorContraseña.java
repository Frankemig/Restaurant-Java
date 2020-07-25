package cl.sulcansystem.restaurante.modelo;

public class VerificadorContraseña implements IVerificador {

    public int verificar(String contraseña) {
        boolean largo = evaluateLength(contraseña);
        boolean mayus = evaluateUpper(contraseña);
        boolean numero = evaluateHasNumber(contraseña);

        if (!largo) {
            return 0;
        } else if (largo && !mayus) {
            return 1;
        } else if (largo && mayus && !numero) {
            return 2;
        } else if (largo && mayus && numero) {
            return 3;
        } else {
            return 0;
        }
    }


    @Override
    public boolean evaluateLength(String contraseña) {
        return contraseña.length() >= 5;
    }

    @Override
    public boolean evaluateUpper(String contraseña) {
        return !contraseña.toLowerCase().equals(contraseña);
    }

    @Override
    public boolean evaluateHasNumber(String contraseña) {

        return contraseña.contains("0") ||
                contraseña.contains("1") ||
                contraseña.contains("2") ||
                contraseña.contains("3") ||
                contraseña.contains("4") ||
                contraseña.contains("5") ||
                contraseña.contains("6") ||
                contraseña.contains("7") ||
                contraseña.contains("8") ||
                contraseña.contains("9");
    }
}
