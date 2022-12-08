package br.edu.ifrn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Qual o seu nome? ");
            String name = sc.nextLine();

            System.out.printf("%s, qual é a sua altura?", name);
            Double height = sc.nextDouble();

            System.out.printf("Por fim, %s, qual o seu peso?", name);
            Double weight = sc.nextDouble();

            final User user = new User(name, height, weight);

            final var imc = calculate(user.getHeight(), user.getWeight());

        } catch (InputMismatchException err) {
            throw new InputMismatchException("O valor não deve ser digitado com um '.', apenas com ','.");
        } finally {
            sc.close();
        }
    }

    public static Integer calculate(Double h, Double w) {
        return 0;
    }

}