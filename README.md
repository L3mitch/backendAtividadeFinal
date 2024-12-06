# Projeto final Backend

### Michel Almeida da Rosa, Elias Enns, Pedro Virtuozo

## Sobre

Este projeto consiste em uma API que controla a criação de Kits de produtos para uma empresa, com o fim em realizar projetos e pesquisas. Um Kit é composto de produtos acabados, que por sua vez são compostos de insumos. Para criar um produto, é necessário dizer quais insumos serão utilizados, e assim por diante.

## Requisitos

-   _Java_ (versão 8 ou superior)
-   _Maven_ (para gerenciamento de dependências)
-   _Docker_ (para execução em container)

## Compilação

Para compilar o código, execute o seguinte comando no diretório raiz do projeto:

```bash
mvn clean package
```

## Execução com Docker

Para criar e iniciar o container Docker:

```bash
docker-compose up --build
```

## API

### /Insumos

-   POST /Insumos

    Utilizado para criar um novo insumo

          Exemplo de corpo de requisição:

          {
              "codigo": "String",
              "descricao": "String",
              "unidadeMedida": "PC, L, G, M",
              "fornecedor": "String",
              "preco": 0.0
          }

          Exemplo de resposta:

          201 Created

          {
              "id": 0,
              "codigo": "String",
              "descricao": "String",
              "unidadeMedida": "PC, L, G, M",
              "fornecedor": "String",
              "preco": 0.0
          }

-   GET /Insumos

    Utilizado para listar os insumos

          Exemplo de resposta:

          200 OK

          [
              {
                  "id": 0,
                  "codigo": "String",
                  "descricao": "String",
                  "unidadeMedida": "PC, L, G, M",
                  "fornecedor": "String",
                  "preco": 0.0
              }
          ]

-   PUT /Insumos/{id}

    Utilizado para editar um insumo

          Exemplo de requisilção

          {
              "codigo": "INS001",
              "descricao": "Parafuso Atualizado",
              "unidadeMedida": "PC",
              "fornecedor": "Fornecedor A",
              "preco": 2
          }

          Exemplo de resposta:

        200 OK

        {
            "id": 0,
            "codigo": "String",
            "descricao": "String",
            "unidadeMedida": "PC, L, G, M",
            "fornecedor": "String",
            "preco": 0.0
        }

-   DELETE /Insumos/{id}

    Utilizado para deletar um Insumo

        Exemplo de resposta:

        200 OK (Sem corpo de resposta)

## /Produtos

-   POST /Produto

    Utilizado para criar um novo produto

          Exemplo de corpo de requisição:

            {
                "codigo": "PROD001",
                "descricao": "Produto Final",
                "unidadeMedida": "PC, L, G, M",
                "preco": 50.00,
                "precoVenda": 75.00,
                "tipo": "PE, PA",
                "estruturaPadrao": [{
                    "insumoOuProdutoId": 0,
                    "quantidade": 0
                }]
            }

          Exemplo de resposta:

          201 Created

            {
                "id": 0,
                "codigo": "String",
                "descricao": "String",
                "unidadeMedida": "PC, L, G, M",
                "preco": 0.0,
                "precoVenda": 0.0,
                "tipo": "PE, PA",
                "estruturaPadrao": [{
                    "insumoOuProdutoId": 0,
                    "quantidade": 0
                }]
            }

-   GET /Produtos

    Utilizado para listar os produtos

          Exemplo de resposta:

          200 OK

          [
            {
                "id": 0,
                "codigo": "String",
                "descricao": "String",
                "unidadeMedida": "PC, L, G, M",
                "preco": 0.0,
                "precoVenda": 0.0,
                "tipo": "PE, PA",
                "estruturaPadrao": [{
                    "insumoOuProdutoId": 0,
                    "quantidade": 0
                }]
            }
          ]

-   PUT /Produtos/{id}

    Utilizado para editar um produto

          Exemplo de requisilção

            {
                "codigo": "String",
                "descricao": "String",
                "unidadeMedida": "PC, L, G, M",
                "preco": 0.0,
                "precoVenda": 0.0,
                "tipo": "PE, PA",
                "estruturaPadrao": [{
                    "insumoOuProdutoId": 0,
                    "quantidade": 0
                }]
            }

          Exemplo de resposta:

            200 OK

            {
                "id": 0,
                "codigo": "String",
                "descricao": "String",
                "unidadeMedida": "PC, L, G, M",
                "preco": 0.0,
                "precoVenda": 0.0,
                "tipo": "PE, PA",
                "estruturaPadrao": [{
                    "insumoOuProdutoId": 0,
                    "quantidade": 0
                }]
            }

-   DELETE /Produtos/{id}

    Utilizado para deletar um Produto

        Exemplo de resposta:

        200 OK (Sem corpo de resposta)

## /Kits

-   POST /Kits

    Utilizado para criar um novo kit

          Exemplo de corpo de requisição:

            {
                "codigo": "String",
                "descricao": "String",
                "precoVenda": 0.0,
                "estruturaKit": [{
                    "produtoPAId": 0,
                    "quantidade": 0
                }]
            }

          Exemplo de resposta:

          201 Created

            {
                "id": 0,
                "codigo": "String",
                "descricao": "String",
                "precoVenda": 0.0,
                "estruturaKit": [{
                    "produtoPAId": 0,
                    "quantidade": 0
                }]
            }

-   GET /Kits

    Utilizado para listar os kits

          Exemplo de resposta:

          200 OK

          [
            {
                "id": 0,
                "codigo": "String",
                "descricao": "String",
                "precoVenda": 0.0,
                "estruturaKit": [{
                    "produtoPAId": 0,
                    "quantidade": 0
                }]
            }
          ]

-   PUT /Kits/{id}

    Utilizado para editar um kit

          Exemplo de requisição

            {
                "codigo": "String",
                "descricao": "String",
                "precoVenda": 0.0,
                "estruturaKit": [{
                    "produtoPAId": 0,
                    "quantidade": 0
                }]
            }

          Exemplo de resposta:

            200 OK

            {
                "id": 0,
                "codigo": "String",
                "descricao": "String",
                "precoVenda": 0.0,
                "estruturaKit": [{
                    "produtoPAId": 0,
                    "quantidade": 0
                }]
            }

-   DELETE /Kits/{id}

    Utilizado para deletar um kit

        Exemplo de resposta:

        200 OK (Sem corpo de resposta)

## /Kits/{kitId}/estruturas

-   POST /Kits/{kitId}/estruturas

    Utilizado para criar uma nova estrutura de kit

          Exemplo de corpo de requisição:

            [{
                "produtoPAId": 0,
                "quantidade": 0
            }]

          Exemplo de resposta:

          201 Created

            [{
                "produtoPAId": 0,
                "quantidade": 0
            }]

-   GET /Kits/{kitId}/estruturas

    Utilizado para listar a estrutura de kit

          Exemplo de resposta:

          200 OK

            [{
                "produtoPAId": 0,
                "quantidade": 0
            }]

-   PUT /Kits/{kitId}/estruturas

    Utilizado para editar uma estrutura de kit

          Exemplo de requisição

            [{
                "produtoPAId": 0,
                "quantidade": 0
            }]

          Exemplo de resposta:

            200 OK

            [{
                "produtoPAId": 0,
                "quantidade": 0
            }]

-   DELETE /Kits/{kitId}/estruturas

    Utilizado para deletar uma estrutura de kit

        Exemplo de resposta:

        200 OK (Sem corpo de resposta)

## /Produtos/{produtoId}/estruturas

-   POST /Produtos/{produtoId}/estruturas

    Utilizado para criar uma nova estrutura de produto

          Exemplo de corpo de requisição:

            [
                {
                    "insumoOuProdutoId": 0,
                    "quantidade": 0
                }
            ]

          Exemplo de resposta:

          201 Created

            [
                {
                    "insumoOuProdutoId": 0,
                    "quantidade": 0
                }
            ]

-   GET /Produtos/{produtoId}/estruturas

    Utilizado para listar a estrutura de produto

          Exemplo de resposta:

          200 OK

            [
                {
                    "insumoOuProdutoId": 0,
                    "quantidade": 0
                }
            ]

-   PUT /Produtos/{produtoId}/estruturas

    Utilizado para editar uma estrutura de produto

          Exemplo de requisição

            [
                {
                    "insumoOuProdutoId": 0,
                    "quantidade": 0
                }
            ]

          Exemplo de resposta:

            200 OK

            [
                {
                    "insumoOuProdutoId": 0,
                    "quantidade": 0
                }
            ]

-   DELETE /Produtos/{produtoId}/estruturas

    Utilizado para deletar uma estrutura de produto

        Exemplo de resposta:

        200 OK (Sem corpo de resposta)
