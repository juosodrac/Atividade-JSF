# Atividade-JSF
🗂️ Projeto de aplicação Java com Eclipse 

> Projeto acadêmico de desenvolvimento Back-End utilizando JavaServer Faces (JSF) 2.3, HTML5, CSS3 e Git/GitHub.

## Conteúdo do Repositório

- **Atividade1**: Projeto de currículo web estático em HTML5 e CSS3.
- **Atividade2**: Formulário de contato em JSF 2.3, com `FormBean`, CSS de estilização e WildFly.
- **Atividade3**: Aplicação JSF para cadastro de usuários em `ArrayList`, usando `@Named`, `@ViewScoped` e exibição dinâmica.
- **Atividade4**: Integração de repositórios Git locais e remotos; instruções de clone, commit e push via Eclipse.

## Tecnologias Utilizadas

- Java 8 (OpenJDK 1.8)
- JavaServer Faces 2.3 (Mojarra)
- Eclipse IDE for Enterprise Java and Web Developers
- WildFly 27
- HTML5, CSS3
- Git & GitHub

## Estrutura de Pastas

```
Atividade-JSF/
├── Atividade1/        # Currículo web em HTML/CSS
├── Atividade2/        # Formulário de contato JSF
├── Atividade3/        # Cadastro de usuários JSF
├── css/               # Estilos comuns
└── README.md
```

## Como Executar Cada Atividade

## Atividade 1 – Currículo Web (HTML5/CSS3)

+ Familiarização com o ambiente Eclipse e WildFly.
+ Criação de projeto dinâmico no Eclipse e estrutura de pastas padrão (webapp e WEB-INF).
+ Elaboração de index.html com seções de dados pessoais, formação e experiências profissionais usando tags semânticas e hierárquicas.
+Aplicação de estilos em CSS3 (tipografia, cores, layout responsivo básico) em arquivo externo vinculado via <link>.

## Atividade 2 – Formulário de Contato com JSF

+ Configuração de projeto JSF 2.3 no Eclipse com javax.faces-2.3.0.jar em WEB-INF/lib.
+ Criação de formulario.xhtml usando namespace JSF (xmlns:h) e tags <h:form>, <h:inputText>, <h:commandButton>.
+ Desenvolvimento de FormBean anotado com @ManagedBean e @RequestScoped, capturando dados do formulário.
+ Estilização dos campos e botões via CSS externo, organizando layout vertical e centralizado.

## Atividade 3 – Cadastro de Usuários dinâmico com JSF e CDI

+ Criação de novo projeto JSF com @Named e @ViewScoped (ou @RequestScoped) para managed bean.
+ Implementação de classe Pessoa com atributo nome e ArrayList<String> usuarios para armazenar inserções.
+ Desenvolvimento de cadastro.xhtml com <h:inputText> para nome e <ui:repeat> ou <h:dataTable> para exibir lista de usuários.
+  Aplicação de CSS para estilização de formulário e botões, e utilização de AJAX (<f:ajax>) para atualização parcial da lista.

## Atividade 4 – Integração Eclipse, Git e GitHub

+ Geração de conta e repositório no GitHub (Atividade-JSF) com README inicial.
+ Upload inicial do projeto via interface web (Commit changes).
+ Configuração do plugin EGit no Eclipse: abertura da view Git Repositories, clone do repositório remoto.
+ Importação do projeto clonado como projeto Eclipse.
+  Realização de alterações (inserção de comentário em cadastro.xhtml), commit local e Push para o GitHub usando token de acesso pessoal.
  
## Autor

**Jullyana Cardoso** – Curso de Desenvolvimento Back‑End  – Universidade UNOPAR|ANHANGUERA

## Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](https://github.com/juosodrac/Atividade-JSF/blob/main/LICENSE) para mais detalhes.


