# Movies-with-file-reading
Gerenciamento de Cinemas – Parte 2

Objetivo: Implementar um gerenciador de Filmes de acordo com o Diagrama de Classes abaixo:
 
![image](https://user-images.githubusercontent.com/85631998/181791952-31c9ff3c-50b3-40b7-bf0f-1df9f32de438.png)


Implemetação:
1.	Classe Filme: deve conter o identificador, nome e ano do filme. Criar os métodos construtores necessários e o método toString.

2.	Classe Sala: deve conter o identificador, nome e capacidade da sala Criar os métodos construtores necessários e o método toString.

3.	Classe Horario: deve conter o identificador e o horário. Criar os métodos construtores necessários e o método toString.

4.	Classe Funcionario: deve conter o identificador e o nome do funcionário. Criar os métodos construtores necessários e o método toString.

5.	Classe Premiacao: deve conter o identificador e o nome da premiação. Criar os métodos construtores necessários e o método toString.

6.	Classe Premio: é subclasse de Premiacao e contem o ano do prêmio recebido.

7.	Classe Indicacoes: é subclasse de Premiacao e contem o ano da indicação recebida.

8.	Classe Arquivo: classe responsável por ler as informações do arquivo.

9.	Classe Servico: classe responsável por armazenar as coleções de dados (Filme, Sala, Funcionario, Horario, Premiacao) lidas do arquivo.

10.	Classe Exibicao: classe responsável por vincular os dados relativos as exibições dos filmes. Essa Classe deve solicitar ao usuário que selecione um filme, selecione uma sala, selecione um horário (ou mais de um sem repetir os dados anteriores), bem como, faça a atribuição de uma Indicação ou de um Prêmio para um Filme (fazer uma vez só para o mesmo Filme).

11.	Classe Main: essa classe é responsável pelas opções de ações do usuário que envolvem:
•	ler os dados do arquivo

•	gerar as coleções na classe Serviço

•	gerenciar a montagem e mostrar os valores das visualizações

•	permitir que pesquisas sejam feitas sobre as exibições

•	gravar em arquivo texto a montagem das exibições de forma ordenada (use as interfaces Comparator ou Comparable)

•	ler de um arquivo texto as exibições

Observações
1.	Todas as classes acima devem ser desenvolvidas. Outras classes podem ser acrescentadas ao projeto.

2.	Crie duas exceções e demonstre a sua chamada

3.	Use corretamente a coleção de objetos

4.	Use corretamente os conceitos de orientação a objetos vistos em aula (classe, objeto, atributo, método, construtor, encapsulamento e polimorfismo).

5.	Não é permitido o uso do modificador de acesso static

6.	Este trabalho pode ser feito em duplas

7.	Entregar o código fonte, um texto explicativo do funcionamento do mesmo e a descrição de onde foi utilizado os conceitos de orientação a objetos descritos no item 2.
