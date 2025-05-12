# Fluveny | Back-End

Repositório destinado ao desenvolvimento do back-end da aplicação **Fluveny**.

## Dependências Necessárias

Certifique-se de ter as seguintes ferramentas instaladas na sua máquina:

- **JDK 21** ou superior
- **Docker-Compose**

## Como Rodar a Aplicação

Com as dependências instaladas, siga os passos abaixo para rodar a aplicação.

### Linux

Execute o seguinte comando no terminal, na raiz do projeto:

```bash
./run.sh

```

### Windows

Execute o seguinte comando no Poweshell, na raiz do projeto:
```
./run.ps1
```

Ambos os comandos irão buildar o jar com maven, subir os conteineres e iniciar a aplicação.

## Acesso
O acesso do banco de dados se dá pela URL:
```
mongodb://root:myfluveny@mongo:27017/fluvenydb?authSource=admin&authMechanism=SCRAM-SHA-256
```

E todos os endpoins estarão mapeados na porta 8090.
