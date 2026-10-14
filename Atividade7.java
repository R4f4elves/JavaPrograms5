package JavaLista5;

import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int numero = 1;
        System.out.print("Digite um número limite (N): ");
        int limiteN = sc.nextInt();
        while (numero <= limiteN) {
            soma = soma + numero;
            numero = numero + 1;
        }
        System.out.println("A soma de 1 até " + limiteN + " é: " + soma);
        sc.close();
    }
}

