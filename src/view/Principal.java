package view;

import br.elinos.pilhaInt.PilhaInt;

public class Principal {

	public static void main(String[] args) throws Exception {
		PilhaInt p = new PilhaInt();

		int[] vetor = {0,5,7,-4,3,5,-2,-1,10,4,3,-6,2,-9,1,-5};

		for (int i = 0; i < vetor.length; i++) {
		    
		    if (vetor[i] >= 0) {
		        p.Push(vetor[i]);
		        System.out.println("Push: " + vetor[i]);
		    } else {
		        int v1 = p.Pop();
		        int v2 = p.Pop();
		        System.out.println("Pop: " + v1 + "\nPop: " + v2);
		        int soma = v1 + v2;
		        
		        p.Push(vetor[i]);
		        p.Push(soma);
		        System.out.println("Push: " + vetor[i] + "\nPush: " + soma);
		    }
		}

		System.out.println("Quantidade: " + p.Size());
	}
}

/*
PilhaInt p = new PilhaInt();

		int[] vetor = { 0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5 };

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] >= 0) {
				System.out.println("Push: " + vetor[i]);
				p.Push(vetor[i]);
			} else {

				int v1 = p.Pop();
				int v2 = p.Pop();
				System.out.println("Pop: " + v1 + "\nPop: " + v2);
				int soma = v1 + v2;
				p.Push(vetor[i]);
				p.Push(soma);
			}
		}
		System.out.println("Total de valores: " + p.Size());
*/
