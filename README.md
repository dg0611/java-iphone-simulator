# 📱 java-iPhone-Simulator

Este projeto é um simulador simples das funcionalidades principais de um iPhone, desenvolvido em Java como parte de um desafio técnico. O foco está na aplicação de conceitos de orientação a objetos, uso de interfaces e modelagem UML.

---

## ✅ Objetivo

Simular as três principais funcionalidades do iPhone:

- **Reprodutor Musical**
- **Aparelho Telefônico**
- **Navegador de Internet**

Cada uma dessas funcionalidades foi abstraída por uma **interface Java**, e a classe `IPhone` implementa todas elas, centralizando os comportamentos esperados.

---

## 🔧 Estrutura do Projeto

```bash
java-iPhone-Simulator/
├── src/
│   └── main/
│       └── java/
│           └── iphone/
│               ├── IPhone.java
│               ├── ReprodutorMusical.java
│               ├── AparelhoTelefonico.java
│               └── NavegadorInternet.java
├── pom.xml
└── .gitignore
```

- `ReprodutorMusical.java`: Interface com métodos para tocar, pausar e selecionar músicas.
- `AparelhoTelefonico.java`: Interface com métodos para chamadas telefônicas.
- `NavegadorInternet.java`: Interface com métodos para navegação na web.
- `IPhone.java`: Classe que implementa todas as interfaces acima.

---

## 📐 UML — Diagrama de Classes

A modelagem UML foi feita utilizando o padrão **diagrama de classes UML**. 

<img width="1400" height="670" alt="uml" src="https://github.com/user-attachments/assets/6d369d31-dfdc-4558-a370-19af301ced60" />


- As três interfaces contêm os métodos esperados para cada funcionalidade.
- A classe `IPhone` implementa todas essas interfaces, formando um sistema modular e coeso.

---

## 🚀 Como Executar o Projeto

Este projeto utiliza **Java com Maven**. Para executar localmente:

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/java-iPhone-Simulator.git
   ```
2. Acesse a pasta do projeto:
   ```bash
   cd java-iPhone-Simulator
   ```
3. Compile e execute os arquivos via terminal ou IDE de sua preferência.

---

## 🧠 Conceitos Aplicados

- Programação orientada a interfaces
- Princípios SOLID (Interface Segregation Principle)
- Encapsulamento e modularidade
- Modelagem com UML


---

## ✍️ Autor

Desenvolvido por Diego Gonçalves. 
