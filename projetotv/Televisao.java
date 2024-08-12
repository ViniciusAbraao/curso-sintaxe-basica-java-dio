package edu.vinicius.projetotv;

public class Televisao {
	boolean ligada = false;
	int canal = 1;
	int volume = 10;
	
	public void ligar() {
		ligada = true;
		System.out.println("A Tv está ligada");
	}
	public void desligar() {
		ligada = false;
		System.out.println("A Tv está desligada");
	}
	public void subirCanal() {
		canal++;
		System.out.println("Subindo o canal para: " + canal);
	}
	public void descerCanal() {
		canal--;
		System.out.println("Descendo o canal para: " + canal);
	}
	public void mudarCanal(int novoCanal) {
		canal = novoCanal;
		System.out.println("Canal mudado para: " + canal);
	}
	public void aumentarVolume() {
		volume++;
		System.out.println("Aumentando o volume para: " + volume);
	}
	public void diminuirVolume() {
		volume--;
		System.out.println("Diminuindo o volume para: " + volume);
	}

}
