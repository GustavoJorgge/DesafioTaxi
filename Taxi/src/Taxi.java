/*Um grande amigo seu mora numa cidade pequena, onde existem apenas duas empresas de táxi 
 * - a Empresa 1 e a Empresa 2. Ambas mudam suas taxas a cada dia e calculam o valor de suas corridas da seguinte forma:
 *  uma taxa fixa mais um valor por quilômetro rodado.
 *  Seu amigo é fisioterapeuta e pega táxis diariamente para visitar seus clientes ao redor da cidade. 
 *  Você decidiu escrever um código para ajudá-lo a decidir qual empresa escolher para cada uma das corridas, baseado no preço.
 *  Sua função receberá 4 valores: 
 *  TF1 (a taxa fixa da empresa 1)
 *  VQR1 (o valor por quilômetro rodado da empresa 1)
 *  TF2 (a taxa fixa da empresa 2)
 *  VQR2 (o valor por quilômetro rodado da empresa 2)
 *  Todos em formato string. Seu retorno deve ser uma string em uma das seguintes formas:
 *  “Tanto “Empresa 1” - se o valor da Empresa 1 for sempre menor que o da Empresa 2
 *  “Empresa 2” - para o caso contrário do citado acima
 *  "Tanto faz” - para o caso de o valor das duas empresas para qualquer corrida ser igual
“Empresa Xpto quando a distância < N, Tanto faz quando a distância = N, Empresa Ypto quando a distância > N” para o caso de a escolha depender da distância a ser percorrida (onde Xpto e Ypto representa 1 ou 2 e N representa a distância).
Exemplo:
TF1 = 2,50
VQR1 = 1,00
TF2 = 5,00
VQR2 = 0,75
Output:
“Empresa 1 quando a distância < 10.0, Tanto faz quando a distância = 10.0, Empresa 2 quando a distância > 10.0”
*/

import java.util.Scanner;

public class Taxi {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String tarifa1;
		String valorDistancia1;
		String tarifa2;
		String valorDistancia2;		
		double i = 0;
		
		System.out.printf("Entre com o valor da primeira tarifa:");
		tarifa1 = ler.nextLine();
		System.out.printf("Entre com o valor por km:");
		valorDistancia1 = ler.nextLine();
		System.out.printf("Entre com o valor da segunda tarifa:");
		tarifa2 = ler.nextLine();
		System.out.printf("Entre com o valor por km:");
		valorDistancia2 = ler.nextLine();		
		
		double taxa1 = Double.valueOf(tarifa1).doubleValue();
		double taxa2 = Double.valueOf(tarifa2).doubleValue();
		double valorKM1 = Double.valueOf(valorDistancia1).doubleValue();
		double valorKM2 = Double.valueOf(valorDistancia2).doubleValue();	
		
		double v1 = taxa1, v2= taxa2;
		
		if(taxa1<taxa2 && valorKM1 < valorKM2) {
			System.out.printf("Empresa 1");
		}else if(taxa2<taxa1 && valorKM2 < valorKM1) {
			System.out.printf("Empresa 2");
		}else if(taxa1*valorKM1 == taxa2*valorKM2) {
			System.out.printf("Tanto faz");
		}else {
			do {
				i++;
				v1 = taxa1 + (valorKM1*i);
				v2 = taxa2 + (valorKM2*i);				
			}while(v1!=v2);
			String.valueOf(i);
			System.out.println("Empresa 1 quando a distância < "+ i +", Tanto faz quando a distância = "+ i +", Empresa 2 quando a distância > "+ i );
		}
	}
}
