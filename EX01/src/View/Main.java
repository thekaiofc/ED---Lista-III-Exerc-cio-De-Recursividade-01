package View;

import java.util.Scanner;
import Controller.Digitos;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        // Se a entrada for um número negativo
        if (numero < 0) {
            numero = numero * -1;
        }

        Digitos controller = new Digitos();

        int totalDigitos = controller.contarDigitos(numero);

        System.out.println("Quantidade de dígitos: " + totalDigitos);

        sc.close();
    }
}
