# Java POO Learning Repository

Repositório destinado a expor as atividades feitas durante o meu aprendizado sobre Java POO no Curso do Gustavo Guanabara.

## 📌O que é POO?
Modelar sistemas computacionais como conjuntos de **objetos** que interagem entre si, espelhando entidades do mundo real, contendo:
    - **Dados** (atributos)
    - **Comportamentos** (métodos)

### Principais Conceitos

| **Componente** | Descrição                          | Exemplo Java                  |
|----------------|------------------------------------|-------------------------------|
| **Classe**     | Molde para criar objetos           | `class Carro { ... }`         |
| **Objeto**     | Instância de uma classe            | `Carro fusca = new Carro();`  |
| **Atributo**   | Características do objeto          | `String cor; int ano;`        |
| **Método**     | Ações que o objeto pode realizar   | `void acelerar() { ... }`     |

### Vantagens Principais
    - **Reutilização** de código
    - **Manutenção** simplificada
    - Melhor **organização**
    - **Abstração** de complexidade
    - **Escalabilidade** facilitada

### Exemplo
    class Animal {
        String nome;
        void emitirSom() {
            System.out.println("Som característico");
        }
    }
