# 📚 FASEH - Estruturas de Dados e Análise de Algoritmos

## Implementação de Lista Ligada (Linked List) em Java

Este projeto apresenta a implementação das operações básicas de uma **Lista Ligada Simples (Singly Linked List)** utilizando a linguagem **Java**. A estrutura foi desenvolvida para fins acadêmicos na disciplina de **Estruturas de Dados e Análise de Algoritmos** da FASEH.

---

## 🎯 Objetivo

Implementar uma lista ligada genérica capaz de armazenar elementos de qualquer tipo utilizando **Generics (`<T>`)**, oferecendo operações fundamentais de inserção, remoção e visualização dos dados.

---

## 🏗️ Estrutura do Projeto

```text
br.edu.faseh.lista
│
├── FasehList.java
└── Node.java
```

### Classe `Node`

Representa cada elemento da lista.

**Atributos:**

- `value` → valor armazenado no nó.
- `next` → referência para o próximo nó.

---

### Classe `FasehList<T>`

Responsável pelo gerenciamento da lista ligada.

#### Atributos

| Atributo | Descrição |
|-----------|-----------|
| `firstNode` | Referência para o primeiro elemento da lista |
| `lastNode` | Referência para o último elemento da lista |
| `totalElements` | Quantidade total de elementos armazenados |

---

## ⚙️ Funcionalidades Implementadas

### ➕ Inserir no início

**Método:**

```java
insertAtBeginning(T value)
```

Insere um novo elemento no começo da lista.

**Complexidade:** `O(1)`

---

### ➕ Inserir no final

**Método:**

```java
insertAtTheEnd(T value)
```

Insere um novo elemento ao final da lista.

A utilização da referência `lastNode` elimina a necessidade de percorrer toda a lista.

**Complexidade:** `O(1)`

---

### ➖ Remover do início

**Método:**

```java
removeAtBeginning()
```

Remove e retorna o primeiro elemento da lista.

**Complexidade:** `O(1)`

---

### 📄 Exibir lista

**Método:**

```java
toString()
```

Retorna todos os elementos da lista em formato textual.

**Exemplo:**

```text
[10, 20, 30]
```

---

## 🚀 Exemplo de Utilização

```java
public class Main {
    public static void main(String[] args) {

        FasehList<Integer> lista = new FasehList<>();

        lista.insertAtBeginning(20);
        lista.insertAtBeginning(10);

        lista.insertAtTheEnd(30);
        lista.insertAtTheEnd(40);

        System.out.println(lista);

        lista.removeAtBeginning();

        System.out.println(lista);
    }
}
```

### Saída Esperada

```text
[10, 20, 30, 40]

[20, 30, 40]
```

---

## 📊 Análise de Complexidade

| Operação | Complexidade |
|-----------|------------|
| Inserção no início | O(1) |
| Inserção no final | O(1) |
| Remoção no início | O(1) |
| Impressão da lista | O(n) |

Onde:

- **n** = quantidade de elementos armazenados na lista.

---

## 🔍 Diferencial da Implementação

A implementação utiliza um ponteiro para o último elemento (`lastNode`), permitindo que inserções ao final da lista sejam realizadas em **tempo constante O(1)**.

Sem essa otimização, seria necessário percorrer todos os nós da lista para localizar o último elemento, resultando em uma complexidade **O(n)**.

---

