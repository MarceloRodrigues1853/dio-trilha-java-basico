# Projeto iPhone DIO trilha Java

## Introdução
Este projeto consiste na **implementação** de um **iPhone** em `Java`, com **funcionalidades** de `reprodutor musical`,   `aparelho telefônico`  e  `navegador de internet`.

## Estrutura de Arquivos

```` java
desafio_POO
└── src
      ├── IPhone.java
      ├── Main.java
      ├── ReprodutorMusical.java
      ├── AparelhoTelefonico.java
      ├── NavegadorInternet.java
      ├── iPhone.puml
      └── README.md
````

## Funcionalidades

### Reprodutor Musical
- `tocar()`: Inicia a reprodução de música.
- `pausar()`: Pausa a reprodução de música.
- `selecionarMusica()`: Seleciona uma música para reprodução.

### Aparelho Telefônico
- `ligar()`: Liga o aparelho telefônico.
- `atender()`: Atende uma chamada telefônica.
- `iniciarCorreioVoz()`: Inicia o correio de voz.

### Navegador na Internet
- `exibirPagina()`: Exibe uma página na internet.
- `adicionarNovaAba()`: Adiciona uma nova aba no navegador.
- `atualizarPagina()`: Atualiza a página atual no navegador.

## Teste de Funcionalidades
classe `Main` com um método `main` para testar a funcionalidade do iPhone.

```java
public class Main {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        
        // Teste de funcionalidades do iPhone
        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica();
        iPhone.ligar();
        iPhone.atender();
        iPhone.iniciarCorreioVoz();
        iPhone.exibirPagina();
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
    }
}
````


