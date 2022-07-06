package ExemplosAula36;

public class Teste {

	public static void main(String[] args) {

		Contato contato = new Contato();
		contato.setNome("Marcos");
		
		//criar objeto endereço
		Endereco endereco = new Endereco();
		endereco.setNomeRua("Rita Parma");
		endereco.setNumero("100");
		endereco.setComplemento("n/a");
		endereco.setCidade("Gaspar");
		endereco.setEstado("SC");
		endereco.setCep("89113-540");
		
		//criar objeto telefone
		Telefone telefone = new Telefone();
		telefone.setDdd("47");
		telefone.setNumero("99718-0917");
		telefone.setTipo("Celular");
		
		Telefone telefone2 = new Telefone();
		telefone2.setDdd("47");
		telefone2.setNumero("99932-2776");
		telefone2.setTipo("Casa");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		contato.setEndereco(endereco);
		contato.setTelefones(telefones);
		
		System.out.println(contato.getNome());
		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		
		if (contato != null && contato.getTelefones() != null) {
			for (int i = 0; i < contato.getTelefones().length; i++) {
				System.out.println(contato.getTelefones()[i].getDdd()+ " " +contato.getTelefones()[i].getNumero());
			}
		}
	}

}
