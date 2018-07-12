package objeto;
import java.util.Scanner;

public class Professor {
	int codigo;
	String nomeProfessor;
	String cpf;
	String rg;
	Endereco endereco;
	Date dataNascimento;
	int idade;
	String disciplina;
	String telefone;
	String celular;
	String email;
	
	public void receberDados(){
		// int codigoRecebido, String nomeProfessorRecebido, String cpfRecebido, String rgRecebido, Endereco enderecoRecebido, Date dataNascimentoRecebido, int idadeRecebido, String disciplinaRecebido, String telefoneRecebido, String celularRecebido, String emailRecebido
		// Colocar a parte do Scanner toda nesse método.
		/* codigo = codigoRecebido;
		nomeProfessor = nomeProfessorRecebido;
		cpf = cpfRecebido;
		rg = rgRecebido;
		endereco = enderecoRecebido;
		dataNascimento = dataNascimentoRecebido;
		idade = idadeRecebido;
		disciplina = disciplinaRecebido;
		telefone = telefoneRecebido;
		celular = celularRecebido;
		email = emailRecebido;
		*/
		
		Scanner teclado = new Scanner(System.in);
		Date date = new Date();
		Endereco endereco = new Endereco();
		System.out.println("*** DIGITE OS DADOS DO PROFESSOR ***");
		System.out.println("Digite o código do professor: ");
		codigo = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Digite o nome do professor: ");
		nomeProfessor = teclado.nextLine();
		System.out.println("Digite o CPF: ");
		cpf = teclado.nextLine();
		System.out.println("Digite o RG: ");
		rg = teclado.nextLine();
		System.out.println("Digite o endereço: Logradouro: ");
		endereco.logradouro = teclado.nextLine();
		System.out.println("Digite complemento: ");
		endereco.complemento = teclado.nextLine();
		System.out.println("Digite o número: ");
		endereco.numero = teclado.nextLine();
		System.out.println("Digite o bairro: ");
		endereco.bairro = teclado.nextLine();
		System.out.println("Digite a cidade: ");
		endereco.cidade = teclado.nextLine();
		System.out.println("Digite o estado: ");
		endereco.estado = teclado.nextLine();
		System.out.println("Digite o CEP: ");
		endereco.cep = teclado.nextLine();
		//teclado.nextInt();
		System.out.println("Data de Nascimento: Digite o dia: ");
		date.dia = teclado.nextInt();
		System.out.println("Digite o mês: ");
		date.mes = teclado.nextInt();
		System.out.println("Digite o ano: ");
		date.ano = teclado.nextInt();
		System.out.println("Digite a idade atual: ");
		idade = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Digite a disciplina: ");
		disciplina = teclado.nextLine();
		System.out.println("Digite o telefone: ");
		telefone = teclado.nextLine();
		System.out.println("Digite o celular: ");
		celular = teclado.nextLine();
		System.out.println("Digite o email: ");
		email = teclado.nextLine();
		
		this.endereco = endereco;
		dataNascimento = date;
		
		
	}//Fim do método receberDados().
	
	public void exibirDados(){
		System.out.println("***** DADOS DO PROFESSOR *****");
		System.out.println("Codigo: " + codigo);
		System.out.println("Nome: " + nomeProfessor);
		System.out.println("CPF: " + cpf);
		System.out.println("RG: " + rg);
		System.out.println("Endereço: ");
		System.out.println("Logradouro: " + endereco.logradouro);
		System.out.println("Complemento: " + endereco.complemento);
		System.out.println("Número: " + endereco.numero);
		System.out.println("Bairro: " + endereco.bairro);
		System.out.println("Cidade: " + endereco.cidade);
		System.out.println("Estado: " + endereco.estado);
		System.out.println("CEP: " + endereco.cep);
		System.out.println("Data de Nascimento: " + dataNascimento.dia + "/" + dataNascimento.mes + "/" + dataNascimento.ano);
		System.out.println("Idade Atual: " + idade);
		System.out.println("Disciplina: " + disciplina);
		System.out.println("Telefone: " + telefone);
		System.out.println("Celular: " + celular);
		System.out.println("E-mail: " + email);
		
	}
	
	

}
