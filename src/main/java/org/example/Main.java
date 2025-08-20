package org.example;


public class Main {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        Iphone iphone1 = new Iphone();

        System.out.println("Iphone1 ");
        iphone1.ligar();

        System.out.println("Iphone");
        iphone.iniciarCorreioVoz();

        System.out.println("Iphone");
        iphone.atender();

        System.out.println("Iphone1");
        iphone1.selecionarMusica();
        iphone1.tocar();
        iphone1.pausar();

        System.out.println("Iphone");
        iphone.exibirPagina();
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();

    }
}