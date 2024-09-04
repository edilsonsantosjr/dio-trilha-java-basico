package org.example;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da sua conta!");
        int number = scanner.nextInt();

        System.out.println("Digite a agencia!");
        String agency = scanner.next();

        System.out.println("Digite seu nome!");
        String name = scanner.next();

        System.out.println("Digite seu saldo!");
        Double balance = scanner.nextDouble();

        System.out.println("Olá ".concat(name)+ ", obrigado por criar uma conta em nosso banco, sua agência é ".concat(agency) +", conta " + "e seu saldo " + balance + " já está disponível para saque.");

    }

}
