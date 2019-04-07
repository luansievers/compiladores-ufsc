class tiposPrimitivos {


	class numeros { // construtor com e sem parametros; comparacao de inteiros, if-else
		int dia, mes, ano;
		double altura;
		lacos umlaco;
		char verificacaolaco1;

		constructor()  // construtor 1, sem parâmetros altura media
		{
		   altura = 1.60d;
		}

		constructor(int d, int m, int a, double parametroAltura) // construtor 2 - dia mês ano e altura como 
		{                // parâmetros 
		   dia = d;
		   mes = m;
		   ano = a;
		   altura = parametroAltura;
		}
		
		int maiorInteiro(int primeiroInteiro, int segundoInteiro) 
		{
		   int maiorInteiro;      
		   if(primeiroInteiro > segundoInteiro){
				maiorInteiro = primeiroInteiro;
		   }
		   else{
				maiorInteiro = segundoInteiro;
		   }
		   if(altura<2.5d){
				verificacaolaco1 = umlaco.segundoLaco(dia, dia);
		   }

		   return maiorInteiro;
		}
	} // final da classe numeros

	class caracteresCalculadora{ // float, comparacao de float, boolean, caractere string, switch, if sem else
		float resultado;
		float numero1;
		float numero2;
		int operacao;
		boolean erro;
		string sucesso;
		char verificacaolaco2;
		lacos umlaco;

		string calcule() {
			erro = false;
			sucesso = "sucesso";
		
			switch (operacao) {
				case 1 : {
					resultado = numero1 + numero2;
					break;
				}
				case 2 : {
					resultado = numero1 - numero2;
					break;
				}
				case 3 : {
					resultado = numero1 * numero2;
					break;
				}
				case 4 : {
					if (numero2 == 0.0f)
						erro = true;
					else
						resultado = numero1 / numero2;
					break;
				}		
			}
	
			if(erro){
				verificacaolaco2 = umlaco.primeirLaco(operacao);
				sucesso = "fracasso";
			}

			return sucesso;			
		}
		
	} // final classe caracteres

	class lacos{ // for, while, do, caractere char

		char primeirLaco(int repeticoesWhile){
			int repeticoes;
			while(repeticoes < repeticoesWhile){
				print "repetindo While";
				repeticoes = repeticoes + 1;
			}
			return 'terminado';
		}

		char segundoLaco(int repeticoesDo){
			int repeticoes;
			do 
				print "repetindo Do";
				(repeticoes < repeticoesDo);
				repeticoes = repeticoes + 1;
			return 'terminado';
		}

		char terceiroLaco(int repeticoesFor){ 
			int repeticoes;
			for(repeticoes = 0; repeticoes < repeticoesFor; repeticoes = repeticoes + 1){
				print "repetindo For";
			}
			return 'terminado';
		}

	}//final da classe lacos

}// final da classe tiposPrimitivos
