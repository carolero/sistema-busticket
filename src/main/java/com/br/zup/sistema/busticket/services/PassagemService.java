package com.br.zup.sistema.busticket.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.br.zup.sistema.busticket.Models.ClienteModel;
import com.br.zup.sistema.busticket.Models.OnibusModel;



@Service
public class PassagemService {
	
	// Iniciando a criação de ônibus
		private List<OnibusModel> onibus = new ArrayList<OnibusModel>(Arrays.asList(new OnibusModel(1, "Xablau", "Inferno", 0.10, 5, 5, null), 
				new OnibusModel(2, "Xpto", "Céu", 1.0, 5, 1, adicionarPassageirosOnibusUm()), new OnibusModel(3, "NoDestiny", "Setealem", 10.0, 5, 0, adicionarPassageirosOnibusDois())));

	// Adicionando clientes ao ônibu 2 (para lotação dos assentos não disponiveis)
	public List<ClienteModel> adicionarPassageirosOnibusUm() {
		List<ClienteModel> clientes = new ArrayList<ClienteModel>();
		clientes.add(new ClienteModel("Jurema da Silva", "jurema123@bol.com.br", 74, 2));
		clientes.add(new ClienteModel("Carlos Alberto", "carlinhos2000@gmail.com", 82, 4));
		clientes.add(new ClienteModel("Capitão América", "cap1970@america.com", 99, 6));
		clientes.add(new ClienteModel("Loki Laufeyson", "lokifeyson@gmail.com", 2984, 1));
		return clientes;
	}
	
	// Adicionando clientes ao ônibu 3 (para lotação dos assentos não disponiveis)
	public List<ClienteModel> adicionarPassageirosOnibusDois() {
		List<ClienteModel> clientes = new ArrayList<ClienteModel>();
		clientes.add(new ClienteModel("Vitor", "jurema123@bol.com.br", 42, 5));
		clientes.add(new ClienteModel("Joao", "carlinhos2000@gmail.com", 30, 4));
		clientes.add(new ClienteModel("Felipe", "cap1970@america.com", 19, 2));
		clientes.add(new ClienteModel("Vinicius", "lokifeyson@gmail.com", 29, 2));
		clientes.add(new ClienteModel("Michael Jackson", "jaquinho@bol.com", 100, 32));
		return clientes;
	}
	
	// Método para mostrar os ônibus na tela de início
	public List<OnibusModel> mostrarOnibus() {
		return this.onibus;
	}

}
