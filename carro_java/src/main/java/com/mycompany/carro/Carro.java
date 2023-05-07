package com.mycompany.carro;

import java.util.Scanner;
import com.mycompany.carro.Motor;

public class Carro {

    public static void main(String[] args) {
        Motor motor = new Motor();
        int a = 0;
        while (a <= 4) {
            System.out.println("x-----x");
            System.out.println("|CARRO|");
            System.out.println("x-----x");
            System.out.println("x--------------------------------------------x");
            System.out.println("|1.LIGAR | 2.DESLIGAR | 3.ACELERAR | 4.FREAR |");
            System.out.println("x--------------------------------------------x");
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();

            switch (a) {
                case 1:
                    motor.ligarDesligar(true);
                    break;
                case 2:
                   motor.ligarDesligar(false);
                    break;
                case 3:
                   motor.acelerar(10);
                    break;
                case 4:
                    motor.frear(10);
                    break;
            }

        }

    }
}
