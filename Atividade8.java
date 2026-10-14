package JavaLista5;

import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        int contador = 1;
        while (contador <= 5) {
            System.out.print("Digite a nota " + contador + ": ");
            double nota = sc.nextDouble();
            soma += nota;
            contador++;
        }
        double media = soma / 5;
        System.out.println("A média final é: " + media);
        sc.close();
    }
}