# 🧬 Herança e Interfaces em Java

Atividade desenvolvida na **FATEC Praia Grande** para a aula de **Técnicas de Programação** com foco nos conceitos de **Herança** e **Interfaces** da Programação Orientada a Objetos (POO).

## 📋 Sobre o Projeto

Este projeto reúne **3 exercícios práticos** que exploram a reutilização de código, a definição de contratos e o polimorfismo através de herança e interfaces em Java.

O objetivo principal é aplicar conceitos como:

*   **Herança:** Reutilização de atributos e métodos entre classes.
*   **Interfaces:** Definição de contratos e comportamentos que classes devem seguir.
*   **Polimorfismo:** Capacidade de objetos de diferentes classes responderem ao mesmo método de formas distintas.
*   **Separação entre Model e View:** Organização do código em camadas distintas para lógica de negócio e interface com o usuário.
*   **Interação com o usuário via terminal (Scanner):** Implementação de entradas e saídas de dados simples.

## 🚀 Tecnologias Utilizadas

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)<br>
![Eclipse](https://img.shields.io/badge/Eclipse-2C2255?style=for-the-badge&logo=eclipse&logoColor=white)

## 📁 Estrutura do Projeto

```
src/
└── br/
    └── edu/
        └── fatecpg/
            └── tecprog/
                └── heranca/           
                    ├── atividade1/
                    │   ├── model/
                    │   │   ├── Funcionario.java
                    │   │   ├── Gerente.java
                    │   │   ├── Vendedor.java
                    │   │   └── Faxineiro.java
                    │   └── view/
                    │       └── Main.java
                    │
                    ├── atividade2/
                    │   ├── model/
                    │   │   ├── Pagamento.java
                    │   │   ├── PagamentoCartao.java
                    │   │   └── PagamentoDinheiro.java
                    │   └── view/
                    │       └── Main.java
                    │
                    └── atividade3/
                        ├── model/
                        │   ├── Autenticavel.java
                        │   └── SistemaSeguranca.java
                        └── view/
                            └── Main.java
```

## 🧱 Exercícios e Modelagem Orientada a Objetos

### 🔹 1. Gestão de Funcionários (Herança)

**Enunciado:** Crie a interface `Funcionario` e as classes `Gerente`, `Vendedor` e `Faxineiro`. Implemente métodos genéricos para todos e métodos específicos para cada cargo.

| Tipo | Descrição |
| --- | --- |
| **Interface** | `Funcionario` (Define métodos genéricos como `baterPonto()`) |
| **Classe** | `Gerente` (Herda de `Funcionario`, implementa `fecharCaixa()`) |
| **Classe** | `Vendedor` (Herda de `Funcionario`, implementa `realizarVenda()`) |
| **Classe** | `Faxineiro` (Herda de `Funcionario`, implementa `solicitarMaterial()`) |

*   **Observação:** Utilize a linguagem Java e siga as dicas sobre como criar classes. Faça a relação de herança de acordo com a aula.

---

### 🔹 2. Sistema de Pagamentos (Interfaces)

**Enunciado:** Crie uma interface chamada `Pagamento` com os métodos `calcularPagamento()` e `emitirRecibo()`. Implemente essa interface em duas classes: `PagamentoCartao` e `PagamentoDinheiro`.

| Tipo | Descrição |
| --- | --- |
| **Interface** | `Pagamento` (Define contrato para cálculo e emissão de recibo) |
| **Classe** | `PagamentoCartao` (Implementa `Pagamento`, adiciona taxa de **5%**) |
| **Classe** | `PagamentoDinheiro` (Implementa `Pagamento`, aplica desconto de **10%**) |

*   **Teste:** Uma classe de teste simula o pagamento de **R$ 100,00** com as duas formas, exibindo o valor final e o recibo detalhado.

---

### 🔹 3. Sistema de Segurança (Autenticação)

**Enunciado:** Crie uma interface chamada `Autenticavel` com os métodos `login(String usuario, String senha)` e `logout()`. Implemente essa interface na classe `SistemaDeSeguranca`.

| Tipo | Descrição |
| --- | --- |
| **Interface** | `Autenticavel` (Define contrato para login e logout) |
| **Classe** | `SistemaDeSeguranca` (Implementa `Autenticavel`, gerencia autenticação) |

*   **Configuração:** Login padrão: **"adm"** | Senha padrão: **"123"**.
*   **Lógica:** O sistema valida as credenciais e armazena o estado de autenticação (booleano).
*   **Tarefa:** Uma classe de teste solicita os dados ao usuário via terminal e mantém um loop até que o login seja bem-sucedido, permitindo também o logout.

## 👤 Autor

| Nome |
| --- |
| Carlos Roberto |
