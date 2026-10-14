package JavaLista5;

public class Atividade9 {
    public static void main(String[] args) {
        int soma = 0;
        int numero = 2;
        while (numero <= 50) {
            soma += numero;
            numero += 2;
        }
        System.out.println("A soma dos pares de 1 a 50 é: " + soma);
    }
}
