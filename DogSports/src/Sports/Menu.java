package Sports;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero,tipo;
		
		String nome, modelo, tamanho;
		float preco;
		
		int op;
		
		do{
        System.out.println("                                                     ");
        System.out.println("\t                 Dog Sports                        ");
        System.out.println("\t             Training with Your                    ");
        System.out.println("*****************************************************");
        System.out.println("                                                     ");
        System.out.println("            1 - Cadastrar produto                    ");
        System.out.println("            2 - Listar todos os produtos             ");
        System.out.println("            3 - Buscar produto por nome              ");
        System.out.println("            4 - Atualizar produto                    ");
        System.out.println("            5 - Apagar Produto                       ");
        System.out.println("            6 - Sair                                 ");
        System.out.println("                                                     ");
        System.out.println("*****************************************************");
        System.out.println("\tEntre com a opção desejada:                        ");
        op = leia.nextInt();
        switch(op) {
        case 1:
        	System.out.println("Criar Produto");
        	
        }
        
		}while(op != 6);
	}
}

