package objeto;

public class Endereco {
	String logradouro;
	String complemento;
	String numero;
	String bairro;
	String cidade;
	String estado;
	String cep;
	
	public void receberEndereco(String logradouroRecebido, String complementoRecebido, String numeroRecebido, String bairroRecebido, String cidadeRecebido, String estadoRecebido, String cepRecebido) {
		logradouro = logradouroRecebido;
		complemento = complementoRecebido;
		bairro = bairroRecebido;
		cidade = cidadeRecebido;
		estado = estadoRecebido;;
		cep = cepRecebido;
	} // Fim do m�todo receberEndereco().

} // Fim da classe Endereco.
