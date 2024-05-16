# Desafio de POO

### Modelagem e Diagramação de um Componente Iphone
Nesse desafio, implementamos um componente simples Iphone com objetivo de praticar a diagramação UML e os conceitos de interface e classe.

#### Funcionalidades
1. **Reprodutor Musical**
   - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
    - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
    - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

#### Diagrama UML
```mermaid
classDiagram
   class ReprodutorMusical {
      <<interface>> 
      + tocar() void
      + pausar() void
      + selecionarMusica(String musica) void
  }
 class NavegadorInternet {
      <<interface>> 
      + exibirPagina(String url) void
      + adicionarNovaAba() void
      + atualizarPagina() void
  }
  class AparelhoTelefonico {
      <<interface>> 
      + ligar(String numero) void
      + atender() void
      + iniciarCorreioVoz() void
  }

  class Iphone {
  }
  Iphone --> ReprodutorMusical
  Iphone --> AparelhoTelefonico
  Iphone --> NavegadorInternet

```
