package Controller;

public class Digitos {

    // Construtor
    public Digitos() {
        super();
    }

    public int contarDigitos(int n) {

        /*
         * Se o número for menor que 10,
         * significa que possui apenas 1 dígito.
         */
        if (n < 10) {
            return 1;
        }

        /*
         * A quantidade de dígitos de n
         * é igual a 1 + quantidade de dígitos de (n / 10).
         */
        return 1 + contarDigitos(n / 10);
    }
}