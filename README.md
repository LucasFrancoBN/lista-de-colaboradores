# Exercício

Projeto criado com o objetivo de treinar o uso de listas em Java. O programa deve ler um número X de funcionários e, em seguida, seus respectivos dados (id, nome e salário). 
Posteriormente, deve-se ler o percentual Y para o aumento de salário, depois ler o id e aplicar o aumento. As regras do projeto são:

1. **Não deve haver repetição de id**

2. **Se o id não existir ao tentar realizar o aumento salarial, mostrar uma mensagem e abortar a operação.**

3. **Exibir a lista de funcionários ao final do processo.**

4. **Seguir o seguinte diagrama de classe:**
   
   ![Diagrama de classe](https://github.com/LucasFrancoBN/combate-java/blob/master/img/diagrama_classe.png)

## Exemplo
```plaintext
How many employees will be registered? 3

Emplyoee #1:
Id: 333
Name: Maria Brown
Salary: 4000.00

Emplyoee #2:
Id: 536
Name: Alex Grey
Salary: 3000.00

Emplyoee #3:
Id: 772
Name: Bob Green
Salary: 5000.00

Enter the employee id that will have salary increase : 536
Enter the percentage: 10.0

List of employees:
333, Maria Brown, 4000.00
536, Alex Grey, 3300.00
772, Bob Green, 5000.00
```

## Ferramentas
Desafio desenvolvido utilizando a linguagem Java e a IDE Intellij Community.


## Instruções de Uso
Antes de prosseguir com as instruções de uso, é requerido que você tenha em sua máquina o Java 20 e o git.

### Instalação
Antes de tudo, recomendo que você, pelo terminal, navegue até o diretório Desktop e rode o comando
```bash
# Clone o repositório
git clone https://github.com/LucasFrancoBN/lista-de-colaboradores.git

# Acesse o diretório do projeto
cd lista-de-colaboradores/src
```
Agora basta você digitar no seu terminal
```bash
# Compile o projeto
javac Program.java

# Execute o programa
java Program
```
