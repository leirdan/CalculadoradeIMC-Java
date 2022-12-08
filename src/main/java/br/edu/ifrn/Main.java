package br.edu.ifrn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static float calculate(float h, float w) {
        final var imc = (w / (h * h));
        return imc;
    }

    public static void main(String[] args) throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Qual o seu nome? ");
            String name = sc.nextLine();

            System.out.printf("%s, qual é a sua altura em metros? ", name);
            float height = sc.nextFloat();

            System.out.printf("Por fim, %s, qual o seu peso em quilogramas? ", name);
            float weight = sc.nextFloat();

            final User user = new User(name, height, weight);

            final var imc = calculate(user.getHeight(), user.getWeight());

            verifyIMC(imc);

        } catch (InputMismatchException err) {
            throw new InputMismatchException(
                    "O valor não deve ser digitado com um '.' nem com unidades de medida, apenas o valor puro com ',' caso necessário.");
        } finally {
            sc.close();
        }
    }

    public static void verifyIMC(float imc) {
        if (imc < 18.5) {
            System.out.printf("Seu nível de IMC é %f, considerado como magreza. Tome cuidado.", imc);
        } else if (imc > 18.5 && imc <= 24.9) {
            System.out.printf("Seu nível de IMC é %f, está aceitável. Parabéns! ;)", imc);
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.printf("Seu nível de IMC é %f, considerado como sobrepeso. Tome cuidado.", imc);
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.printf(
                    "Seu nível de IMC é %f, considerado como obesidade de grau I. Considere procurar um médico caso ainda não o tenha feito.",
                    imc);
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.printf(
                    "Seu nível de IMC é %f, considerado como obesidade de grau II. Considere procurar um médico caso ainda não o tenha feito.",
                    imc);
        } else if (imc >= 40) {
            System.out.printf(
                    "Seu nível de IMC é %f, considerado como obesidade de grau III. Considere procurar um médico caso ainda não o tenha feito.",
                    imc);
        }
    }

}