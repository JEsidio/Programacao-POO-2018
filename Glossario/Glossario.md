# Glossário

## Construtor
Os construtores são os responsáveis por criar o objeto, instanciar a classe que foi definida.
```java
public class Carro{
 	private String cor;
	private double preco;
	private String modelo;
 
	/* CONSTRUTOR */
	public Carro(){
	}

	/* CONSTRUTOR COM 3 PARÂMETROS */
	public Carro(String cor, String modelo, double preco){
	   this.cor = cor;
	   this.modelo = modelo;
	   this.preco = preco;
	}
}
```

## Instanciação
A instanciação realiza a _cópia_ de um objeto (classe) existente para que se possa utilizá-la.
```java
public class Pessoa{
	public char sexo;
	public string nome;
	public int idade;
}
public static void Main (String args[]){
	Pessoa objetoPessoa = new Pessoa();
}
```

## Palavra reservada new 
Faz o papel de _instanciador_, reservando memória o suficiente para o objeto e criar automaticamente uma referência para ele.
```java
public class TV {
	int tamanho;
	int canal;
	boolean ligada;

	TV() {
		tamanho = 21;
		canal = 0;
		ligada = false;
    	}

	public static void main(String[] args) {
		TV objeto1 = new TV();
		TV objeto2;
		objeto2 = new TV();
	}
}
```

## Palavra reservada instanceof
Instanceof indica se um objeto, já instanciado, _pertence a uma classe_.
```java
if(object instanceof Ponto){
	System.out.println("É uma instância da classe Ponto");
}else{
	System.out.println("Não é uma instância da classe Ponto");
}
```

## Encapsulamento 
Serve para separar o programa em partes, _controlar o acesso_ aos atributos e métodos de uma classe, forma eficiente de proteger os dados manipulados dentro da classe. O encapsulamento que é dividido em **dois níveis**:

* Nível de **classe**: Quando é determinado o acesso de uma classe inteira que pode ser public ou Package-Private (padrão);

* Nível de **membro**: Quando é determinado o acesso de atributos ou métodos de uma classe que podem ser public, private, protected ou Package-Private (padrão).
```java
public class Funcionario {
	private double salario;
	private String nome;
 
	public String getNome() {
		return nome;
	}
 
	public void setNome(String nome) {
		this.nome = nome;
	}
     
	public void setSalario(double salario) {
		this.salario = salario;
	}
     
	public double getSalario() {
		return salario;
	}
}
```

## Palavra reservada this 
Variável de referência que diz respeito a instancia atual de um objeto.
```java
public class Pessoa{
	private String nome;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
```

## Getters/Setters
Métodos _assessores_ (getters), servem para pegar algum valor de variáveis e Métodos _modificadores_ (setters), servem para mudar o valor de variáveis.
```java
	public int getX(){
		return x;
	}

	public int setX(){
		this x = 5;
	}
```

## Palavra reservada public/private 
O modificador **public** deixará visível a classe ou membro para _todas_ as outras classes, subclasses e pacotes do projeto Java. O modificador **private** deixará visível o atributo _apenas_ para a classe em que este atributo se encontra.
```java
public class MinhaClasse {
	public String nome;
	private int inteiro;
	protected float decimal;
	boolean ativado;
}
```

## Assinatura de Método 
Combinação do nome do método, tipos e ordem dos parâmetros.
```java
	public void setIdade(int newIdade){
		idade = newIdade;
	}
```

## Sobrecarga de Método 
Permitir, dentro da mesma classe, mais de um método com o mesmo nome. Porém, devem possuir argumentos diferentes para funcionar.
```java
public class Calculadora{
	public int calcula(int a, int b){
		return a+b;
	}
	
	public double calcula(double a, double b){
		return a+b;
	}
	
	public String calcula(String a, String b){
		return a+b;
	}
}
```

## Escopo de Classe
Escopo refere-se à vida e acessibilidade. Quão grande é o alcance depende de onde é declarada. Existem **quatro**:
* Variáveis estáticas vivem pelo mesmo tempo da classe.

* Variáveis de instância vivem pelo mesmo tempo do objeto.

* Variáveis locais vivem pelo mesmo tempo que os seus métodos na pilha, se o método chamar outro método, estas ficam temporariamente indisponíveis.

* As variáveis de bloco (for, if...) vivem até a conclusão do bloco.
```java
public class MinhaClasse {// início do escopo
	private int inteiro;
	boolean ativado;
} // fim do escopo
```

## Escopo de Objeto
O escopo de um objeto é sua visibilidade de outras partes do programa, o que implica não apenas quanto tempo existe a variável, como também quando foi criada e quando se tornou disponível. Um objeto definido dentro de uma função tem escopo local, e se é definido fora de qualquer função tem escopo global.
```java
public static void main(String args[]){
	Pessoa pessoa1;
	pessoa1 = new Pessoa(“Fulano”, 25, ’M’);
}
```

## Palavra reservada final 
Na variável final uma vez atribuído um valor a ela esse valor não pode ser modificado. Quando final é usado a variável, classe, método, etc não pode ser modificado.
```java
public class MyClass {
	private final int teste = 10;
	 
	public MyClass() {
		teste = 10; // Não é permitido
	}
}
```

## Relacionamento de Dependência 
Classe A não consegue ser executado e compilada sem a Classe B. Uma classe utiliza o serviço de outra. Método da Classe. UML símbolo = seta tracejada.

![Diagrama Relacionamento de Dependência](http://blogedsonbelem.com.br/blog/java/img/uml03.jpg)


## Associação Simples
Relação 1 para 1. Quando uma classe possui um atributo de outra classe. Atributo da Classe. UML símbolo = linha contínua.

![Diagrama Relacionamento de Associação Simples](https://es2fatec.files.wordpress.com/2016/04/associacao.jpg?w=612)


## Relacionamento de Agregação
Parte **existe** sem o todo. _Aluno pode existir sem uma disciplina_ Relação Todo-Parte. Atributo da Classe. UML símbolo = linha com losango na ponta.

![Diagrama Relacionamento de Agregação](https://i.stack.imgur.com/iTy9r.png)


## Relacionamento de Composição
Parte **não** existe sem o todo. _Ser vivo não pode existir sem o coração_. Relação Todo-Parte. Atributo da Classe.  UML símbolo = linha com losango preto na ponta.

![Diagrama Relacionamento de Composição](https://userscontent2.emaze.com/images/e97f38a6-b598-412c-a707-7d1ff5d1efca/938ef303-72ce-4f5c-8f38-6ece529814a0image12.png)
