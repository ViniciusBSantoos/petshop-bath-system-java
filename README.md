# 🐶 Sistema de Controle de Banho PetShop em Java

Projeto desenvolvido para simular o funcionamento de uma máquina de banho de petshop, aplicando regras de negócio realistas utilizando Java e Programação Orientada a Objetos.

---

## 🚀 Funcionalidades

- Colocar pet na máquina
- Retirar pet da máquina
- Dar banho no pet
- Abastecer água
- Abastecer shampoo
- Verificar nível de água
- Verificar nível de shampoo
- Verificar se há pet na máquina
- Limpar máquina
- Menu interativo no terminal

---

## 📋 Regras de Negócio

- A máquina permite apenas **1 pet por vez**

- O sistema solicita o **nome do pet** ao colocá-lo na máquina

- Cada banho consome:
  - 10 litros de água
  - 2 litros de shampoo

- Capacidade máxima da máquina:
  - 30 litros de água
  - 10 litros de shampoo

- Abastecimento:
  - Realizado de 2 em 2 litros por ação

- Caso o pet seja retirado sem banho:
  - A máquina fica suja
  - É necessário realizar limpeza antes de inserir outro pet

- Limpeza da máquina consome:
  - 3 litros de água
  - 1 litro de shampoo

- O sistema impede:
  - Colocar mais de um pet
  - Dar banho sem recursos suficientes
  - Inserir novo pet sem limpar a máquina

---

## 🧠 Lógica aplicada

O sistema controla estados importantes:

- Presença de pet (`temPet`)
- Se o pet está limpo (`petLimpo`)
- Se a máquina precisa de limpeza (`precisaLimpar`)
- Nome do pet (`nomePet`)

---

## 🛠 Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos (POO)
- Lógica de Programação

  ## 👨‍💻 Autor

  - Vinicius Batista Santos

---
