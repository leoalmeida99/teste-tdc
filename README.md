# Teste Técnico GlobalCode/TDC
Aplicação para submissão e visualização de propostas de palestras (Call for Papers), desenvolvida como teste técnico para a GlobalCode/TDC.

# Tecnologias

A escolha das tecnologias para a solução foi pensada para ter a mesmo ambiente de trabalho na GlobalCode, por mais que não seja um critério de avaliação.

- **Backend**: Java 21+ com Quarkus + Renarde
- **Frontend**: Vaadin
- **Banco de dados relacional**: MariaDB
- **Containerização**: Docker
- **Hospedagem**: OpenShift Sandbox
- **Versionamento**: GitHub
- **Ambiente para desenvolvimento**: DevBox

**Nota**: Optei pelo OpenShift Sandbox para hospedagem por ter experiência prévia com a ferramenta. O OpenShift é uma plataforma robusta de containerização e orquestração baseada em Kubernetes, que também é adequada para hospedagem da aplicação. Esta escolha oferece funcionalidades similares às que seriam utilizadas no **Amazon Web Services**.

# Como rodar esse projeto localmente?
Para esse projeto, eu primeiramente analisei a possibilidade de utilizar DevBox, ferramenta essa que até então não conhecia, achei bem interessante o propósito de disponibilizar um ambiente padronizado e isolado, e resolvi usa-la nesse projeto. Então será necessário o uso do DevBox.

### Pré-requisitos
- Instale o [DevBox](https://www.jetify.com/docs/devbox/installing_devbox/) em sua máquina/ambiente.

### Passo a passo

1. Já com o DevBox instalado, inicialize o DevBox:
```bash
devbox init
```

2. Vai ser criado um **devbox.json**, abra ele com um editor de texto (nano ou vscode).

Pelo nano:
```bash
nano devbox.json
```

Pelo Visual Studio Code:
```bash
code .
```
(ola).

(_e entre devbox.json_)
()

Substitua o conteúdo pelo seguinte:
```jsx
{
  "$schema": "https://raw.githubusercontent.com/jetify-com/devbox/0.14.0/.schema/devbox.schema.json",
  "packages": [
    "quarkus",
    "mariadb",
    "docker",
    "git",
    "jdk21@latest"
  ],
  "shell": {
    "init_hook": [
            "echo 'Ambiente de desenvolvimento para o teste do TDC configurado com sucesso!'",
      "echo 'Java version:' && java -version",
      "echo 'Maven version:' && mvn -version"
    ],
    "scripts": {
      "test": [
        "echo \"Error: no test specified\" && exit 1"
      ]
    }
  }
}

```

Se quiser verificar se todas as ferramentas foram instaladas:

```bash
java -version
mvn -version
docker --version
mariadb --version
```

3. O banco por padrão vem desconfigurado, porém é simples configura-lo para rodar ele.

Já temos o ambiente pronto para rodar o projeto, agora clone de fato o projeto: 

```bash
git clone https://github.com/leoalmeida99/teste-tdc
```

