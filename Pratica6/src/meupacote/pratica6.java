package meupacote;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
public class pratica6 {	
	public static void main(String args[]) throws IOException {
/*Fazer um Programa com a seguinte interface (gráfica ou no terminal)

	1- Definir caminho e nome de Arquivo TXT para gravação

	2- Cadastrar Projeto

	3- Abrir Arquivo do Projeto

	4- Sair

	-Opção 1 - solicitar ao usuário o nome e caminho do arquivo para gravação.

	-Opção 2 - deverá permitir cadastrar em uma estrutura de arraylist os dados de um Projeto Social como: 
título, objetivo, endereço completo, data de início e status.

Os dados serão salvos em um arquivo de texto, cujo nome e caminho são definidos na opção 1

Após salvar os dados no arquivo TXT, o programa deverá mostrar mensagem de sucesso.

 	-Opção 3 - deverá ser solicitado o caminho e nome do arquivo para abertura, após ler o arquivo, 
o sistema deverá mostrar na tela o seu conteúdo, ou a mensagem que não conseguiu abrir.*/
	
	ArrayList<String> cadastro = new ArrayList();
	ArrayList<String> proj = new ArrayList();
	Scanner ler = new Scanner(System.in);
	
	int i=0, j,k;
	int num, data;
	
	String documento="", nome, busca, projeto;
	String titulo, objetivo,status,rua;
	do {
	System.out.println("Por favor, apresente a opção desejada:");
	System.out.println("1-Arquivar.");
	System.out.println("2-Cadastrar projeto.");
	System.out.println("3-Abrir arquivo do projeto.");
	System.out.println("4-Sair");
	
	i=ler.nextInt();
	switch(i) {
	
	case 1:
		System.out.println("Show, será um pazer te ajudar a cadastrar o seu projeto.");
		System.out.println("Por favor, me informe o seu nome de usuário:");
		nome = ler.next();
		System.out.println("Perfeito, agora por favor me informe o nome com que deseja que o arquivo seja gravado:");
		documento = ler.next();
		cadastro.add(nome+";"+documento);
		System.out.println("Cadastro efetuado com sucesso: Nome: "+nome+";Arquivo: "+documento+".");
		
		break;
	
	case 2:
		System.out.println("Show, será um pazer te ajudar a arquivar.");
		System.out.println("Por favor, apresente o titulo do projeto:");
		titulo=ler.next();
		System.out.println("Por favor, apresente o objetivo do projeto:");
		objetivo=ler.next();
		System.out.println("Por favor, apresente o nome da sua rua:");
		rua=ler.next();
		System.out.println("Por favor, apresente o seu número residencial:");
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
		/*-Opção 3 - deverá ser solicitado o caminho e nome do arquivo para abertura, após ler o arquivo, 
o sistema deverá mostrar na tela o seu conteúdo, ou a mensagem que não conseguiu abrir.*/
		System.out.println("Show, será um pazer te ajudar a abrir o projeto.");
		System.out.println("Por favor, informe a informação desejada para o seu projeto ser encontrado:");
		busca=ler.next();
		
		int n = proj.size();
   	 for(j=0; j<n ; j++) {
   		
			if(proj.get(j).contains(busca)) 
			{                	 
				System.out.println(proj);
			}
			else if(!proj.get(j).contains(busca) && j==n-1)
				System.out.println("Registro não encontrado.");
   	 	} 
   	 
   	 break;
	case 4:
		System.out.println("Agradeço por usufruir dos nossos serviços.");
		System.out.println("Tenha um ótimo dia .^-^.");
		
		break;
			
			}
		} while (i!=4);
	
	}
	
}
