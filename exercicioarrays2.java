package atividadeArrays;

public class exercicioarrays2 {
	
	 public static void main(String[] args) {

	        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};

	        int par = 0, impar = 0;
	        int soma=0;
	        double media=0;

	        System.out.println("Elementos nos índices pares: ");
	        for (int i = 0; i < vetor.length; i++) {
	            if (vetor[i] % 2 == 0) {

	                System.out.print(vetor[i]+" ");
	            }
	        }
	       
	        System.out.println("\nElementos nos índices impares: ");
	        for (int i = 0; i < vetor.length; i++) {
	            if (vetor[i] % 2 == 1) {
	                System.out.print(vetor[i]+" ");
	            }

	        }	        

	        for(int i = 0; i < vetor.length; i++) {
	            soma = vetor[0]+vetor[1]+vetor[2]+vetor[3]+vetor[4]+vetor[5]+vetor[6]+vetor[7]+vetor[8]+vetor[9];
	            //System.out.println("Soma: "+soma);
	        }
	        System.out.println("\n\nSoma: "+soma);	        

	        for(int i = 0; i < vetor.length; i++) {
	            media = soma/10;
	    }
	        System.out.println("\nMédia: "+media);
	 }
}
