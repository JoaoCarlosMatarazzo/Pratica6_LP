package meupacote;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
public class pratica6 {	
	public static void main(String args[]) throws IOException {
/*Fazer um Programa com a seguinte interface (gr�fica ou no terminal)

	1- Definir caminho e nome de Arquivo TXT para grava��o

	2- Cadastrar Projeto

	3- Abrir Arquivo do Projeto

	4- Sair

	-Op��o 1 - solicitar ao usu�rio o nome e caminho do arquivo para grava��o.

	-Op��o 2 - dever� permitir cadastrar em uma estrutura de arraylist os dados de um Projeto Social como: 
t�tulo, objetivo, endere�o completo, data de in�cio e status.

Os dados ser�o salvos em um arquivo de texto, cujo nome e caminho s�o definidos na op��o 1

Ap�s salvar os dados no arquivo TXT, o programa dever� mostrar mensagem de sucesso.

 	-Op��o 3 - dever� ser solicitado o caminho e nome do arquivo para abertura, ap�s ler o arquivo, 
o sistema dever� mostrar na tela o seu conte�do, ou a mensagem que n�o conseguiu abrir.*/
	
	ArrayList<String> cadastro = new ArrayList();
	ArrayList<String> proj = new ArrayList();
	Scanner ler = new Scanner(System.in);
	
	int i=0, j,k;
	int num, data;
	
	String documento="", nome, busca, projeto;
	String titulo, objetivo,status,rua;
	do {
	System.out.println("Por favor, apresente a op��o desejada:");
	System.out.println("1-Arquivar.");
	System.out.println("2-Cadastrar projeto.");
	System.out.println("3-Abrir arquivo do projeto.");
	System.out.println("4-Sair");
	
	i=ler.nextInt();
	switch(i) {
	
	case 1:
		System.out.println("Show, ser� um pazer te ajudar a cadastrar o seu projeto.");
		System.out.println("Por favor, me informe o seu nome de usu�rio:");
		nome = ler.next();
		System.out.println("Perfeito, agora por favor me informe o nome com que deseja que o arquivo seja gravado:");
		documento = ler.next();
		cadastro.add(nome+";"+documento);
		System.out.println("Cadastro efetuado com sucesso: Nome: "+nome+";Arquivo: "+documento+".");
		
		break;
	
	case 2:
		System.out.println("Show, ser� um pazer te ajudar a arquivar.");
		System.out.println("Por favor, apresente o titulo do projeto:");
		titulo=ler.next();
		System.out.println("Por favor, apresente o objetivo do projeto:");
		objetivo=ler.next();
		System.out.println("Por favor, apresente o nome da sua rua:");
		rua=ler.next();
		System.out.println("Por favor, apresente o seu n�mero residencial:");
		num=ler.nextInt();
		System.out.println("Por favor, apresente a data de inicio do seu projeto:");
		data=ler.nextInt();
		System.out.println("Por fim, defina o status do projeto:");
		status=ler.next();
		projeto = titulo+";"+objetivo+";"+rua+";"+num+";"+data+";"+status;
		proj.add(projeto);
		ManipuladorArquivo.escritor(documento,projeto);
		System.out.println("Perfeito, projeto cadastrado com sucesso!");
		
		break;
	case 3:
		/*-Op��o 3 - dever� ser solicitado o caminho e nome do arquivo para abertura, ap�s ler o arquivo, 
o sistema dever� mostrar na tela o seu conte�do, ou a mensagem que n�o conseguiu abrir.*/
		System.out.println("Show, ser� um pazer te ajudar a abrir o projeto.");
		System.out.println("Por favor, informe a informa��o desejada para o seu projeto ser encontrado:");
		busca=ler.next();
		
		int n = proj.size();
   	 for(j=0; j<n ; j++) {
   		
			if(proj.get(j).contains(busca)) 
			{                	 
				System.out.println(proj);
			}
			else if(!proj.get(j).contains(busca) && j==n-1)
				System.out.println("Registro n�o encontrado.");
   	 	} 
   	 
   	 break;
	case 4:
		System.out.println("Agrade�o por usufruir dos nossos servi�os.");
		System.out.println("Tenha um �timo dia .^-^.");
		
		break;
			
			}
		} while (i!=4);
	
	}
	
}
