class Pessoa extends Compilador{

string genero;
int idade;

	constructor(string uMgenero){
		super(uMgenero);
		genero = uMgenero;
	}

	string umMetodo(int novoAno){
		
	idade = 2017 - novoAno;
	
	   	if (idade < 60){
			genero = genero;
		}
		else{
			genero = "idoso";
		}

		while (i <= idade){
			print "contagem: " + i;
		}

		switch (idade){
			case verdadeiro : 
				break;
			case falso : 
				print "falso";		

			default :
				print "meio";
		}
	}
}
