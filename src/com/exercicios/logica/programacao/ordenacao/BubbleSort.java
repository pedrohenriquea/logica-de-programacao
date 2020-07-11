package com.exercicios.logica.programacao.ordenacao;

public class BubbleSort {
	
	public static int[] getBubbleSort(int[] vetor){
		
		for(int ultimo = vetor.length - 1; ultimo > 0; ultimo--) {
			
			for(int i = 0; i < ultimo; i++) {
				
				if(vetor[i] > vetor[i+1]) {
					int aux = vetor[i];
					vetor[i] = vetor[i+1];
					vetor[i+1] = aux;
				}
			}
		}
		
		return vetor;
		
	}


}
