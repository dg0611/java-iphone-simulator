package org.example;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {


    //Aparelho Telefonico
    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    //Reprodutor Musical
    @Override
    public void tocar() {
        System.out.println("Tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }

    //Navegador Internet
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
}
