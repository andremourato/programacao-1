public class Data {
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	boolean igualA( Data date ){
		if(this.ano != date.ano()) return false;
		else if(this.mes != date.mes()) return false;
		else if(this.dia != date.dia()) return false;
		else return true;
	}
	
	boolean maiorDoQue( Data date ){
		
		if(this.ano < date.ano()) return false;
		else if(this.ano > date.ano()) return true;
		else { //se o ano for igual
			if(this.mes < date.mes()) return false;
			else if(this.mes > date.mes()) return true;
			else{ //se o mes for igual
				if(this.dia < date.dia()) return false;
				else if(this.dia > date.dia()) return true;
				else return false; //se a data for igual
			}
		}
	}
	
	boolean menorDoQue( Data date ){
		
		if(this.ano < date.ano()) return true;
		else if(this.ano > date.ano()) return false;
		else{ //se o ano for igual
			if(this.mes < date.mes()) return true;
			else if(this.mes > date.mes()) return false;
			else{ //se o mes for igual
				if(this.dia < date.dia()) return true;
				else if(this.dia > date.dia()) return false;
				else return false; //se as datas forem iguais
			}
		}
	}
	
	int dia(){
		return dia;
	}
	
	int mes(){
		return mes;
	}
	
	int ano(){
		return ano;
	}
	
	private int dia;
	private int mes;
	private int ano;
	
}

