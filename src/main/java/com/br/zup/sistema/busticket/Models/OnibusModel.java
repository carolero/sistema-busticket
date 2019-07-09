package com.br.zup.sistema.busticket.Models;

import java.util.List;

public class OnibusModel {

	private int onibusId;
	private String empresa;
	private String destino;
	private double tempoDeViagem;
	private int lugares;
	private int lugaresDisponiveis;
	private List<ClienteModel> clientes;
	public OnibusModel() {
		super();
	}
	public OnibusModel(int onibusId, String empresa, String destino, double tempoDeViagem, int lugares,
			int lugaresDisponiveis, List<ClienteModel> clientes) {
		super();
		this.onibusId = onibusId;
		this.empresa = empresa;
		this.destino = destino;
		this.tempoDeViagem = tempoDeViagem;
		this.lugares = lugares;
		this.lugaresDisponiveis = lugaresDisponiveis;
		this.clientes = clientes;
	}
	public int getOnibusId() {
		return onibusId;
	}
	public void setOnibusId(int onibusId) {
		this.onibusId = onibusId;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public double getTempoDeViagem() {
		return tempoDeViagem;
	}
	public void setTempoDeViagem(double tempoDeViagem) {
		this.tempoDeViagem = tempoDeViagem;
	}
	public int getLugares() {
		return lugares;
	}
	public void setLugares(int lugares) {
		this.lugares = lugares;
	}
	public int getLugaresDisponiveis() {
		return lugaresDisponiveis;
	}
	public void setLugaresDisponiveis(int lugaresDisponiveis) {
		this.lugaresDisponiveis = lugaresDisponiveis;
	}
	public List<ClienteModel> getCliente() {
		return clientes;
	}
	public void setClientes(ClienteModel clientes) {
		this.clientes.add(clientes);
	}

	public String toString () {
		StringBuilder modelo = new StringBuilder();
		modelo.append("Onibus Id : " + this.onibusId);
		modelo.append("\nEmpresa :" + this.empresa);
		modelo.append("\nPostou :" + this.destino);
		modelo.append("\nTempo de viagem : " + this.tempoDeViagem);
		modelo.append("\nLugares : " + this.lugares);
		modelo.append("\nLugares disponíveis : " + this.lugaresDisponiveis);
		modelo.append("\nClientes: " + this.clientes);
		modelo.append("\n");
		return modelo.toString();
	}


}
