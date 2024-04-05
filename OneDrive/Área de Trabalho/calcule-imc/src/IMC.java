
import java.util.Scanner;
public class IMC {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner teclado  = new Scanner(System.in);
		
		System.out.println("--------------------------------");
		
		System.out.println(" PROGRAMA DE CALCULO DE IMC");

		System.out.println("--------------------------------");
		
		System.out.println(" Digite seu nome: "); 
		
		String nome = teclado.next();

		System.out.println();
		
		System.out.println(" Ola  " + nome + " Seja bem vindo(a)!");

		System.out.println();
		
		System.out.println("--------------------------------");
		
		System.out.println(" Vamos calcular seu IMC ?");

		System.out.println("--------------------------------");
	
		System.out.println(" Qual seu peso: ");
		
		double peso;
		
		peso = teclado.nextDouble();
		
		System.out.println(" Qual sua altura: ");
		
		double alt;
		
		alt = teclado.nextDouble();
		
		double imc = peso / (alt * alt);
		
		System.out.println(" SEU IMC E: " + imc);
		
		System.out.println();
		
		double x1 = (18.5 * (alt*alt));
		double x2 = (24.9 * (alt*alt));		
			
			
			if (imc <= 16) {
				
				System.out.println(" Voce esta com magreza grau 3. Seu peso ideal deve ser entre " + x1 + " e " + x2 );
			}else if (imc >= 16 && imc <16.9 ) {
				
				System.out.println("  Voce esta com magreza grau 2. Seu peso ideal deve ser entre " + x1 + " e " + x2 );
			}else if(imc >= 17 && imc <18.4 )
			{
				System.out.println("  Voce esta com magreza grau 1. Seu peso ideal deve ser entre " + x1 + " e " + x2 );
			}else if (imc >= 18.5 && imc <24.9 ) {
				
				System.out.println(" Parabens voce esta com peso ideal" );
			}else if (imc >= 25 && imc <29.9 ) {
				
				System.out.println(" Voce esta com sobrepeso. Seu peso ideal deve ser entre " + x1 + " e " + x2 );
			}else if (imc >= 30 && imc <34.9 ) {
				
				System.out.println(" Voce esta com obesidade grau 1. Seu peso ideal deve ser entre " + x1 + " e " + x2 );
			}else if (imc >= 35 && imc <39.9 ) {
				
				System.out.println(" Voce esta com obesidade grau 2 (severa). Seu peso ideal deve ser entre " + x1 + " e " + x2 );
			}else 
				
				System.out.println(" Voce esta com obesidade grau 3 (Morbida). Seu peso ideal deve ser entre " + x1 + " e " + x2 );
			
			
		
		
	}

}