# Diamante Cinema

Bem-vindo ao Diamante Cinema, uma aplicação Java abrangente construída com Maven. Este README fornece orientações sobre como configurar e executar o projeto.

## Pré-requisitos

Antes de começar, certifique-se de que o seguinte está instalado:
- [Java JDK 21.0.1 LTS](https://www.oracle.com/java/technologies/downloads/#java21) - Esta versão oferece suporte de longo prazo e recursos estáveis para o desenvolvimento e execução de aplicações Java.
- [Maven](https://maven.apache.org/download.cgi)

## Instalação

Clone o repositório para sua máquina local:

```bash
git clone https://github.com/JosineyJr/poo-tp
cd poo-tp
```

## Construindo o Projeto

Para construir o projeto, navegue até o diretório que contém o arquivo `pom.xml` e execute o seguinte comando Maven:

```bash
mvn clean install
```

Este comando limpa o diretório `target`, compila seu projeto e empacota o projeto construído (se aplicável).

## Executando o Aplicativo

Após construir o projeto, você pode executá-lo usando:

```bash
mvn exec:java -Dexec.mainClass="poo.tp.Main"
```

Substitua `com.yourpackage.Main` pela classe principal do seu projeto. Alternativamente, se o projeto estiver empacotado como um jar, você pode executá-lo com:

```bash
java -jar target/your-artifactId-version.jar
```

Certifique-se de substituir `your-artifactId-version.jar` pelo nome real do seu arquivo jar gerado.

## Contribuindo

Nós damos as boas-vindas a contribuições! Sinta-se à vontade para fazer fork do repositório, fazer alterações e enviar pull requests. Para alterações importantes, por favor, abra uma issue primeiro para discutir o que você gostaria de mudar.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE.md](LICENSE) para detalhes.
