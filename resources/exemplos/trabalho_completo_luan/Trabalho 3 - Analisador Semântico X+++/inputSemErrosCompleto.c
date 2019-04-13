class Pessoa extends Compilador{

string genero;
int idade;

	constructor(string uMgenero){
		genero = uMgenero;
	}

	string getGenero(int novoAno){
	idade = 2017 - novoAno;

	   	if (idade < 60){
			genero = genero;
		}
		else{
			genero = "idoso";
		}

		switch (genero){
			case mulher : 
				print "feminino";
			case homem :
				print "masculino";
			default :
				print "idoso";
		}

		return genero;
	}

	
	void imprimeSerie(){
		
		int i;
		for(i=0; i<6; i=i+1){
			print "Na creche. Idade: " + i;
		}


		while (idade<60){
			print "Nao eh idoso: " + idade;
			idade = idade + 1;
		}


		do
			genero = "idoso";
			(idade>60);
	}

}
