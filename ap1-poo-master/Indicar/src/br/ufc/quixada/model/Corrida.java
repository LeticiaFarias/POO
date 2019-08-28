package br.ufc.quixada.model;

public class Corrida {
	private String partida;
	private String destino;
	private float precoKm;
	private float precoCorrida;

	public Corrida() {
		this.partida = "Praça";
		this.destino = "Campus UFC";
		this.precoKm = 1.00f;
		this.precoCorrida = 10.0f;
		
	}

	public Corrida(String partida, String destino, float precoKm) {
		this.partida = partida;
		this.destino = destino;
		this.precoKm = precoKm;
	}
	
	public String getPartida() {
		return partida;
	}

	public void setPartida(String partida) {
		this.partida = partida;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public float getPrecoKm() {
		return precoKm;
	}

	public void setPrecoKm(float precoKm) {
		this.precoKm = precoKm;
	}

	public float getPrecoCorrida() {
		return precoCorrida;
	}

	public void setPrecoCorrida(float precoCorrida) {
		this.precoCorrida = precoCorrida;
	}
	
	public void calcularValorCorrida(int distancia) {
		
	}

}