package io.github.ricardoandradem;

import io.github.ricardoandradem.exception.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    private static final String PROMPT_PARAMETRO_UM = "Digite o primeiro parâmetro";
    private static final String PROMPT_PARAMETRO_DOIS = "Digite o segundo parâmetro";
    private static final String OUTPUT_MESSSAGE = "Imprimindo o número %d%n";

    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.println(PROMPT_PARAMETRO_UM);
        int parametroUm = input.nextInt();
        System.out.println(PROMPT_PARAMETRO_DOIS);
        int parametroDois = input.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem ; i++) {
            System.out.printf(OUTPUT_MESSSAGE, i);
        }
    }
}
