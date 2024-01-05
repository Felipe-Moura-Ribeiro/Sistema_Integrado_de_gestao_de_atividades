# Sistema_Integrado_de_gestao_de_atividades

## 1. Descrição do Projeto

O Sistema Integrado de Gestão de Atividades (SIGA) é uma aplicação Java que oferece funcionalidades para cadastrar disciplinas, cadastrar alunos nessas disciplinas, preencher notas dos alunos, gerar relatórios das disciplinas com as notas dos alunos e mostrar os aprovados e reprovados. O usuário interage com o programa através de entradas de teclado para realizar essas operações.


## 2. Funcionalidades

- **Cadastro de Disciplinas:** Permite ao usuário cadastrar novas disciplinas, informando o nome e outros detalhes relevantes.

- **Cadastro de Alunos nas Disciplinas:** Permite o cadastramento de alunos em disciplinas específicas.

- **Preenchimento de Notas dos Alunos nas Disciplinas:** Permite ao usuário inserir notas para os alunos nas disciplinas cadastradas.

- **Relatório de Disciplinas:** Gera um relatório com as informações das disciplinas cadastradas e as notas dos alunos em cada disciplina.

- **Aprovados e Reprovados:** Mostra uma lista de alunos aprovados e reprovados em cada disciplina com base nas notas inseridas.

- **Sair do Sistema:** Encerra a execução do programa.

## 3. Estrutura
/Sistema_Integrado_de_gestao_de_atividades
│
├── src
│   ├── sigaafake
│   │   ├── controllers      # Controladores da aplicação
│   │   │   ├── DisciplinaController.java   # Controlador para operações relacionadas às disciplinas
│   │   │   ├── AlunoController.java        # Controlador para operações relacionadas aos alunos
│   │   │   └── Main.java    # Ponto de entrada da aplicação
│   │   ├── models           # Modelos de dados
│   │   │   ├── Disciplina.java   # Modelo para representar uma disciplina
│   │   │   └── Aluno.java        # Modelo para representar um aluno
│   │   ├── views            # Interfaces de usuário
│   │   │   └── ConsoleView.java   # Interface de console para interação com o usuário
│   │   └── Application.java  # Classe principal que gerencia a aplicação
│   │
│   └── resources            # Recursos adicionais (arquivos de configuração, etc.)
│
├── .gitignore               # Lista de arquivos e diretórios ignorados pelo Git
├── LICENSE                  # Licença do projeto
└── README.md                # Este arquivo README

