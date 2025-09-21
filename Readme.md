# Gerenciador de Estoque

## Descrição
Projeto em Java com Spring Boot que simula um sistema de gerenciamento de estoque. Permite cadastrar produtos, categorias e fornecedores, além de funcionalidades extras para facilitar o controle de estoque, como alertas de produtos com baixo estoque e cálculo do valor total do estoque.

Ideal para aprendizado de **POO, Spring Boot, JPA/Hibernate, boas práticas de desenvolvimento e APIs RESTful**.

---

## Funcionalidades
- **CRUD de Produtos**: criar, listar, atualizar e excluir produtos.
- **CRUD de Categorias**: criar, listar, atualizar e excluir categorias.
- **CRUD de Fornecedores**: criar, listar, atualizar e excluir fornecedores.
- **Funcionalidades Extras**:
    - Listar produtos com estoque baixo
    - Calcular valor total do estoque
    - Gerar relatórios em CSV ou PDF (opcional)

---

## Tecnologias utilizadas
- Java 8+
- Spring Boot
- Spring Data JPA / Hibernate
- MySQL
- Lombok
- Spring Validation

---

## Estrutura do Projeto
- **entidades**: classes que representam o banco de dados (`Produto`, `Categoria`, `Fornecedor`).
- **repositories**: interfaces para persistência no banco.
- **services**: regras de negócio e funcionalidades extras.
- **controllers**: endpoints da API REST.

---

## Como rodar o projeto
1. Clone o repositório:
   ```bash
   git clone <URL_DO_REPOSITORIO>
