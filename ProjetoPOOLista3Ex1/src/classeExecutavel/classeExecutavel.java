package classeExecutavel;

import javax.swing.JOptionPane;

import model.Cliente;
import model.Empresa;
import model.Endereco;
import model.Funcionario;

public class classeExecutavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		Empresa empresa = new Empresa();
		Funcionario funcionario = new Funcionario();
		String telefone = JOptionPane.showInputDialog("Digite o telefone:");
		empresa.setTelefone(Long.parseLong(telefone));
		String email = JOptionPane.showInputDialog("Digite o email:");
		empresa.setEmail(email);
		String matriz = JOptionPane.showInputDialog("Matriz? (SIM | NÃO)?:");
		if (matriz == "SIM") {
			empresa.setMatriz(true);

		} else {
			empresa.setMatriz(false);

		}

		Endereco endereco = new Endereco();
		String nomeRua = JOptionPane.showInputDialog("Nome da rua da empresa:");
		endereco.setNomeRua(nomeRua);
		String numero = JOptionPane.showInputDialog("Numero:");
		endereco.setNumero(Integer.parseInt(numero));
		String bairro = JOptionPane.showInputDialog("Bairro:");
		endereco.setBairro(bairro);
		String cidade = JOptionPane.showInputDialog("cidade:");
		endereco.setCidade(cidade);
		String uf = JOptionPane.showInputDialog("Estado da Empresa:");
		endereco.setUf(uf);
		String complemento = JOptionPane.showInputDialog("Complemento:");
		endereco.setComplemento(complemento);

		String cep = JOptionPane.showInputDialog("Cep:");
		endereco.setCep(Long.parseLong(cep));

		empresa.setEndereco(endereco);

		Funcionario funcionario1 = new Funcionario();

		String nomeF = JOptionPane.showInputDialog("Nome do Funcionario:");
		funcionario1.setNome(nomeF);
		String setorF = JOptionPane.showInputDialog("Setor do Funcionario:");
		funcionario1.setSetor(setorF);

		String ramalF = JOptionPane.showInputDialog("Setor do Funcionario:");
		funcionario1.setRamal(Long.parseLong(ramalF));

		String matriculaF = JOptionPane.showInputDialog("Matricula do Funcionario:");
		funcionario1.setMatricula(Integer.parseInt(matriculaF));

		String cargoF = JOptionPane.showInputDialog("Cargo do Funcionario:");
		funcionario1.setCargo(cargoF);

		nomeRua = JOptionPane.showInputDialog("Nome da rua do Funcionario:");
		endereco.setNomeRua(nomeRua);
		numero = JOptionPane.showInputDialog("Numero do endereco do Funcionario:");
		endereco.setNumero(Integer.parseInt(numero));
		bairro = JOptionPane.showInputDialog("Bairro do endereco do Funcionario:");
		endereco.setBairro(bairro);
		cidade = JOptionPane.showInputDialog("cidade do endereco do Funcionario:");
		endereco.setCidade(cidade);
		uf = JOptionPane.showInputDialog("Estado Funcionario:");
		endereco.setUf(uf);
		complemento = JOptionPane.showInputDialog("Complemento:");
		endereco.setComplemento(complemento);
		cep = JOptionPane.showInputDialog("Cep do endereco do Funcionario:");
		endereco.setCep(Long.parseLong(cep));
		funcionario.setEndereco(endereco);
		empresa.setFuncionario(funcionario1);

		Cliente cliente = new Cliente();
		String nomeC = JOptionPane.showInputDialog("Nome do Cliente:");
		cliente.setNome(nomeC);
		String cpf = JOptionPane.showInputDialog("Cpf do Cliente:");
		cliente.setCpf(Integer.parseInt(cpf));
		String telefoneC = JOptionPane.showInputDialog("Telefone do Cliente:");
		cliente.setTelefone(Long.parseLong(telefoneC));
		
		nomeRua = JOptionPane.showInputDialog("Nome da rua do Cliente:");
		endereco.setNomeRua(nomeRua);
		numero = JOptionPane.showInputDialog("Numero do endereco do Cliente:");
		endereco.setNumero(Integer.parseInt(numero));
		bairro = JOptionPane.showInputDialog("Bairro do endereco do Cliente:");
		endereco.setBairro(bairro);
		cidade = JOptionPane.showInputDialog("cidade do endereco do Cliente:");
		endereco.setCidade(cidade);
		uf = JOptionPane.showInputDialog("Estado Cliente:");
		endereco.setUf(uf);
		complemento = JOptionPane.showInputDialog("Complemento:");
		endereco.setComplemento(complemento);
		cep = JOptionPane.showInputDialog("Cep do endereco do Cliente:");
		endereco.setCep(Long.parseLong(cep));
		cliente.setEndereco(endereco);
		empresa.setCliente(cliente);
		
		*/

	
		  Endereco enderecoCliente1 = new Endereco(); enderecoCliente1.setNomeRua("Rua 740");
		  enderecoCliente1.setNumero(488); enderecoCliente1.setBairro("Morgado Rosa");
		  enderecoCliente1.setCidade("Bage"); 
		  enderecoCliente1.setUf("RS");
		  enderecoCliente1.setComplemento("Abcdefg"); enderecoCliente1.setCep(1234567);
		  
		  Endereco enderecoFuncionario1 = new Endereco();
		  enderecoFuncionario1.setNomeRua("Rua 120");
		  enderecoFuncionario1.setNumero(18); enderecoFuncionario1.setBairro("Prado Velho");
		  enderecoFuncionario1.setCidade("Bage");
		  enderecoFuncionario1.setUf("RS");
		  enderecoFuncionario1.setComplemento("bhs9s");
		  enderecoFuncionario1.setCep(12845);
		  
		  Endereco enderecoEmpresa = new Endereco(); enderecoEmpresa.setNomeRua("Rua 789");
		  enderecoEmpresa.setNumero(250); 
		  enderecoEmpresa.setBairro("SaoJudas"); 
		  enderecoEmpresa.setCidade("Bage"); enderecoEmpresa.setUf("RS");
		  enderecoEmpresa.setComplemento("mercado jdjs");
		  enderecoEmpresa.setCep(62548);
		  
		  // Sobrecarregado 
		  Cliente cliente1 = new Cliente("Ricardo", 4040999, 1234567,enderecoCliente1);
		  // Sobrecarregado
		  
		  Funcionario funcionario1 = new Funcionario("Pedro", "RH", 1234567, 1212,"Supervisor", enderecoFuncionario1);
		  Empresa empresa1 = new Empresa(9874564, "empresa@gmail.com", true, enderecoEmpresa, funcionario1, cliente1);
		  System.out.println("Informacoes da Empresa: ");
		  
		  System.out.println("Telefone: " + empresa1.getTelefone());
		  System.out.println("Email: " + empresa1.getEmail());
		  System.out.println("Matriz? " + empresa1.isMatriz()); System.out.println("");
		  System.out.println("Endereco da Empresa"); System.out.println("");
		  System.out.println("Rua: " + empresa1.getEndereco().getNomeRua());
		  System.out.println("Numero: " + empresa1.getEndereco().getNumero());
		  System.out.println("Bairro: " + empresa1.getEndereco().getBairro());
		  System.out.println("Cidade: " + empresa1.getEndereco().getCidade());
		  System.out.println("Uf: " + empresa1.getEndereco().getUf());
		  System.out.println("Complemento: " +
		 empresa1.getEndereco().getComplemento()); System.out.println("Cep: " +
		  empresa1.getEndereco().getCep());
		  System.out.println("-----------------------------------");
		  System.out.println("Informacoes do Funcionario: ");
		  
		  System.out.println("Nome: " + empresa1.getFuncionario().getNome());
		  System.out.println("Setor: " + empresa1.getFuncionario().getSetor());
		  System.out.println("Ramal: " + empresa1.getFuncionario().getRamal());
		  System.out.println("Matricula: " + empresa1.getFuncionario().getMatricula());
		  System.out.println("Cargo: " + empresa1.getFuncionario().getCargo());
		  System.out.println(""); System.out.println("Endereco do Funcionario");
		  System.out.println(""); System.out.println("Rua: " +
		  empresa1.getFuncionario().getEndereco().getNomeRua());
		  System.out.println("Numero: " +
		  empresa1.getFuncionario().getEndereco().getNumero());
		  System.out.println("Bairro: " +
		  empresa1.getFuncionario().getEndereco().getBairro());
		  System.out.println("Cidade: " +
		  empresa1.getFuncionario().getEndereco().getCidade()); System.out.println("Uf:" + empresa1.getFuncionario().getEndereco().getUf());
		  System.out.println("Complemento: " +
		  empresa1.getFuncionario().getEndereco().getComplemento());
		  System.out.println("Cep: " +
		  empresa1.getFuncionario().getEndereco().getCep());
		  System.out.println("-----------------------------------");
		  System.out.println("Informacoes do Cliente: "); System.out.println("Nome: " +
		  empresa1.getCliente().getNome()); System.out.println("Cpf: " +
		  empresa1.getCliente().getCpf()); System.out.println("Telefone: " +
		  empresa1.getCliente().getTelefone()); System.out.println("");
		  System.out.println("Endereco do Cliente"); System.out.println("");
		  System.out.println("Rua: " +
		  empresa1.getCliente().getEndereco().getNomeRua());
		  System.out.println("Numero: " +
		  empresa1.getCliente().getEndereco().getNumero()); System.out.println("Bairro:" + empresa1.getCliente().getEndereco().getBairro());
		  System.out.println("Cidade: " +
		  empresa1.getCliente().getEndereco().getCidade()); System.out.println("Uf: " +empresa1.getCliente().getEndereco().getUf());
		  System.out.println("Complemento: " +empresa1.getCliente().getEndereco().getComplemento());
		  System.out.println("Cep: " + empresa1.getCliente().getEndereco().getCep());
		 
	}

}
