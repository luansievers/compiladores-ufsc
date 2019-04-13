class Pessoa extends Compilador{

string genero;
int idade;
	constructor(string gen){
		super(gen);
		genero = gen;
	}
	string doCalculations(int year){
	idade = 2017 - year;
	   	if (idade < 60){
			genero = genero;
		}
		else{
			genero = "old";
		}
		while (i <= idade){
			print "count: " + i;
		}
		switch (idade){
			case verdadeiro : 
				break;
			case falso : 
				print "false";		
			default :
				print "default";
		}
	}
}
