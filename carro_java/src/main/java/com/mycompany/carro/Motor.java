package com.mycompany.carro;

public class Motor {

    public boolean ligarDesligar;
    public int acelerar = 0;
    public int frear = 0;

    public void ligarDesligar(boolean ligarDesligar) {
        if (ligarDesligar == true) {
            this.ligarDesligar = true;
            System.out.println("Carro ligado");
        } else {
            System.out.println("Carro desligado");
        }
    }

    public void acelerar(int valor) {
        if (this.ligarDesligar == true) {
            this.acelerar = this.acelerar + 10;
            System.out.println("Acelerando...");
            System.out.println("Sua velocidade e: " + this.acelerar);
        } else {
            System.out.println("Carro nao esta ligado");
        }

    }

    public void frear(int valor) {
        if (this.ligarDesligar == true) {
            this.acelerar= this.acelerar - 10;
            System.out.println("Sua velocidade e:" + this.acelerar);
        } else {
            System.out.println("Carro nao esta ligado");
        }
    }

}
