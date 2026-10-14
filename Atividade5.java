
package JavaLista5;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número limite: ");
        int limite = sc.nextInt();
        int num = 0;
        while (num <= limite) {
            System.out.println(num);
            num += 5;
        }
        sc.close();
    }
}