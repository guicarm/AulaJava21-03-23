package br.com.fiap.main;

import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Telefone;

public class TesteCliente {

	public static void main(String[] args) {
	
		// Instânciar objetos
	Cliente objCliente = new Cliente ();
	Endereco objEndereco = new Endereco ();
	Telefone objTelefone = new Telefone ();
	
	
	  // Setters Cliente
	objCliente.setNome("Verón Toscano");
	objCliente.setIdade(24);
	objCliente.setPeso(75.50);
	objCliente.setEndereco(objEndereco);
	objCliente.setTelefone(objTelefone);
	
	
	// Setters Endereco
	objEndereco.setLogradouro("Rua zika");
	objEndereco.setNumero(157);
	objEndereco.setCep("06950-000");
	objEndereco.setBairro("Bairrozão");
	objEndereco.setMunicipio("Juquicity");
	objEndereco.setEstado("São Paulo");
	objEndereco.setNacionalidade("Brasileiro");
	
   // Setters Telefone
	objTelefone.setFixo("157157157");
	objTelefone.setCelular("+55 11 97441-4510");
	objTelefone.setComercial("171171171");
	objTelefone.setContato("Lukinhas Veronzin");
	
		
	// GETTERS 
	
	System.out.println("Nome do Cliente: " + objCliente.getNome() +
					"\nIdade do Cliente: " + objCliente.getIdade() +
					"\nPeso do Cliente: " + objCliente.getPeso() +
					"\n=========================================" +
					"\nENDEREÇO" +
					"\nLogradouro: " + objCliente.getEndereco().getLogradouro() +
					"\nNúmero: " + objCliente.getEndereco().getNumero() + 
					"\nCEP: " + objCliente.getEndereco().getCep() +
					"\nBairro: " + objCliente.getEndereco().getBairro() + 
					"\nMunicípio: " + objCliente.getEndereco().getMunicipio() +
					"\nEstado: " + objCliente.getEndereco().getEstado() +
					"\nNacionalidade: " + objCliente.getEndereco().getNacionalidade() +
					"\n=========================================" +
					"\nINFORMAÇÕES DE CONTATO" +
					"\nTelefone Fixo: " + objCliente.getTelefone().getFixo() + 
					"\nTelefone Celular: " + objCliente.getTelefone().getCelular() +
					"\nTelefone Comercial: " + objCliente.getTelefone().getComercial() +
					"\nContato: " + objCliente.getTelefone().getContato());
	}
}
