class progAceito3{

String author="Does";

int myMethod(int pa, int pb, int pc = 19){

    int ret=-1;
    
    print author;
    
	if (pa > pb)
      ret=0;	
	else
	  ret=pc;

	return ret;
}

string myMethod2(string name, string last="Doe"){
  if (last != "Doe")
    return name+last;
  else
    return name;
}
}