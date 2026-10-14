package JavaLista5;

public class Atividade10 {
    public static void main(String[] args) {
        int multiplicador = 7;
        int n,resultado;
        n= 1;
        System.out.println("--- Tabuada do 7 ---");
        while (n <= 10) {
             resultado = multiplicador * n;
            System.out.println(multiplicador + " x " + n + " = " + resultado);
            n++;
        }
    }
}
