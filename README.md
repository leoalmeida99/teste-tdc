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

**Nota**: Optei pelo OpenShift Sandbox para hospedagem por ter experiência prévia com a ferramenta. O OpenShift é uma plataforma robusta de containerização e orquestração baseada em Kubernetes, que também é adequada para hospedagem da aplicação, como o **Amazon Web Services**.

# Como rodar esse projeto localmente?
Para esse projeto, eu primeiramente analisei a possibilidade de utilizar DevBox, ferramenta essa que até então não conhecia, achei bem interessante o propósito de disponibilizar um ambiente padronizado e isolado, e resolvi usa-la nesse projeto. Então será necessário o uso do DevBox.

### Pré-requisitos
- [DevBox](https://www.jetify.com/docs/devbox/installing_devbox/) em sua máquina/ambiente.