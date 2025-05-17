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


## 📌O que é um Objeto?

### Objeto na POO
Entidade concreta de uma classe que possui:
- **Atributos**: Características (dados)
- **Métodos**: Ações/comportamentos
- **Estado**: Valores atuais dos atributos

### Classe na POO
Modelo abstrato que define:  
- **Atributos**: Dados/características  
- **Métodos**: Operações/comportamentos  

#### Características:  
- Serve como "planta" para criar objetos  
- Não é um objeto real (apenas define estrutura)  
- Pode ter múltiplas instâncias (objetos)  

## Classe vs Objeto
| **Classe**                 | **Objeto**                  |
|----------------------------|-----------------------------|
| Modelo/planta (abstrato)   | Instância (concreto)        |
| Define estrutura           | Usa a estrutura da classe   |
| Ex: `Receita`              | Ex: `boloDeChocolate`       |

## Elementos Básicos

### Classe
    public class Produto {
        // Atributos
        String nome;
        double preco;
        
        // Método
        void exibirDetalhes() {
            System.out.println(nome + " - R$" + preco);
        }
    }

### Instanciando objeto
    Produto meuProduto = new Produto();
    meuProduto.nome = "Caderno";
    meuProduto.preco = 19.90;

### Estado e Instância
Cada objeto tem estado único
Ex: Dois produtos podem ter preços diferentes

Instanciar = Criar objeto a partir da classe
(new + Construtor)