package atividadeArrays;

import java.util.Scanner;

public class exercicioarray1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean encontrado = false;
		int numero, i;
		

        int vetor [] = {2,5,1,3,4,9,7,10,6};
        
        System.out.println("Digite o número que você deseja encontrar: ");
        numero = sc.nextInt();
         	
        for ( i =0; i < vetor.length; i++){
            if (numero==vetor[i]) {
            	encontrado = true;
            	break;
            }
               
        	}
        
        if(encontrado==true) {
        	System.out.println("O numero "+numero+" está na posição: "+i);
        }else {
        	System.out.println("O número "+numero+ " não foi encontrado!");
        }
	}
}
