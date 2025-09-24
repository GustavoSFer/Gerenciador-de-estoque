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
   

## Requisitos
Produto

Campos:

id (Long) – chave primária

nome (String) – nome do produto

descricao (String) – descrição do produto

preco (BigDecimal) – preço unitário

quantidade (Integer) – quantidade em estoque

categoria (Categoria) – relacionamento com categoria

dataCadastro (LocalDateTime) – data de inclusão do produto

Categoria

Campos:

id (Long) – chave primária

nome (String) – nome da categoria

descricao (String) – opcional

Relacionamento: Um produto pertence a uma categoria (ManyToOne) e uma categoria pode ter vários produtos (OneToMany).

Fornecedor (opcional, mas útil para aprendizado)

Campos:

id (Long)

nome (String)

telefone (String)

email (String)

endereco (String)

Um produto pode ter um fornecedor (ManyToOne).

2️⃣ Funcionalidades do sistema

Você pode implementar, gradualmente:

CRUD de produtos

Cadastrar novos produtos

Atualizar produto (nome, preço, quantidade, categoria)

Listar todos produtos

Buscar produto por ID ou nome

Excluir produto

CRUD de categorias

Cadastrar categorias

Listar todas

Atualizar categoria

Excluir categoria (apenas se não houver produtos vinculados)

CRUD de fornecedores (opcional)

Cadastrar fornecedores

Listar fornecedores

Atualizar e excluir

Funcionalidades extras

Alerta de estoque baixo: listar produtos com quantidade <= 5

Busca avançada: filtrar produtos por categoria ou fornecedor

Relatório de produtos: gerar PDF ou CSV de estoque
   


