
public class Radio {
	public double emisoraa; 
	public double emisoraf; // variables
	public int maxam;
	public int minam;
	public double maxfm;
	public double minfm;
	public int volumen;
	public String frec; 
	public double ea1,ea2,ea3,ea4,ea5,ea6,ea7,ea8,ea9,ea10,ea11, ea12; 
	public double ef1,ef2,ef3,ef4,ef5,ef6,ef7,ef8,ef9,ef10,ef11, ef12;
	final int CONST_CAMBIO_AM = 10;
	final double CONST_CAMBIO_FM = 0.2;
	final int MAX_AM = 1610;
	final int MIN_AM = 530;
	final double MAX_FM = 107.9;
	final double MIN_FM = 87.9;
	
	public Radio(){  // constructor
		frec = "A.M";
		volumen = 0; 
		ea1 = ea2 = ea3 = ea4 = ea5 = ea6 = ea7 = ea8 = ea9 = ea10 = ea11 = ea12 = 0;
		ef1 = ef2 = ef3 = ef4 = ef5 = ef6 = ef7 = ef8 = ef9 = ef10 = ef11 = ef12 = 0;
		//Retorna el estado actual de Encendido (true=encendido, false=apagado)
		//public boolean getEncendido();
		//Retorna la frecuencia actual AM o FM
	    //public String getFrec();

	   // 
	    
	   // public String toString();
	    	    
	}
	public double getEmisora(){
		if (frec == "A.M"){
			return emisoraa;
		}
		else{
			return emisoraf;
		}
	}
	public void getEncendido(){
	 
	}
	public int getVolumen(){
	 return volumen; 	
	}
	public String getFrec(){
		return frec;
	}
	public void encenderApagar(){
		emisoraa = MIN_AM;
		emisoraf = MIN_FM;
	}
	public void CambiarFrec(){
		if (frec == "A.M"){
			frec = "F.M";
		}
		else{
			frec = "A.M";
		}
	}
	public void cargarEmisora(int posicion){
		if (frec == "A.M"){
			switch (posicion){
			case 1:  emisoraa = ea1; break; 
			case 2:  emisoraa = ea2; break; 
			case 3:  emisoraa = ea3; break; 
			case 4:  emisoraa = ea4; break; 
			case 5:  emisoraa = ea5; break; 
			case 6:  emisoraa = ea6; break; 
			case 7:  emisoraa = ea7; break; 
			case 8:  emisoraa = ea8; break; 
			case 9:  emisoraa = ea9; break; 
			case 10: emisoraa = ea10; break; 
			case 11: emisoraa = ea11; break; 
			case 12: emisoraa = ea12; break; 
			}
		}
		else if (frec == "F.M"){
			switch (posicion){
			case 1:  emisoraf = ef1; break; 
			case 2:  emisoraf = ef2; break; 
			case 3:  emisoraf = ef3; break; 
			case 4:  emisoraf = ef4; break; 
			case 5:  emisoraf = ef5; break; 
			case 6:  emisoraf = ef6; break; 
			case 7:  emisoraf = ef7; break; 
			case 8:  emisoraf = ef8; break; 
			case 9:  emisoraf = ef9; break; 
			case 10:  emisoraf = ef10; break; 
			case 11:  emisoraf = ef11; break; 
			case 12:  emisoraf = ef12; break; 
		}
		}
		}
		
	
	public void guardarEmisora(double emisora, int posicion){
		if (frec == "A.M"){
			switch (posicion){
			case 1:  ea1 = emisora; break; 
			case 2:  ea2 = emisora; break; 
			case 3:  ea3 = emisora; break; 
			case 4:  ea4 = emisora; break; 
			case 5:  ea5 = emisora; break; 
			case 6:  ea6 = emisora; break; 
			case 7:  ea7 = emisora; break; 
			case 8:  ea8 = emisora; break; 
			case 9:  ea9 = emisora; break; 
			case 10:  ea10 = emisora; break; 
			case 11:  ea11 = emisora; break; 
			case 12:  ea12 = emisora; break; 
			}
		}
		else if (frec == "F.M"){
			switch (posicion){
			case 1:  ef1 = emisora; break; 
			case 2:  ef2 = emisora; break; 
			case 3:  ef3 = emisora; break; 
			case 4:  ef4 = emisora; break; 
			case 5:  ef5 = emisora; break; 
			case 6:  ef6 = emisora; break; 
			case 7:  ef7 = emisora; break; 
			case 8:  ef8 = emisora; break; 
			case 9:  ef9 = emisora; break; 
			case 10:  ef10 = emisora; break; 
			case 11:  ef11 = emisora; break; 
			case 12:  ef12 = emisora; break; 
			}
		}
	}

	
	public void adelantarEmisora(){ // disminuir estación
	if (frec == "A.M"){
		if (emisoraa == MAX_AM){
			emisoraa = MIN_AM;
		}
		else{
		emisoraa = emisoraa + 10;
		}
	}
	if (frec == "F.M"){
		if (emisoraf >= MAX_FM){
			emisoraf = MIN_FM;
		}
		else{
		emisoraf = emisoraf + 0.2;
		}
	}
	}
	public void atrasarEmisora(){ // disminuir estación
		if (frec == "A.M"){
			if (emisoraa == MIN_AM){
				emisoraa = MAX_AM;
			}
			else{
			emisoraa = emisoraa - 10;
			}
		}
		if (frec == "F.M"){
			if (emisoraf <= MIN_FM){
				emisoraf = MAX_FM;
			}
			else{
			emisoraf = emisoraf - 0.2;
			}
		}
		}
	public void subirVolumen(){
		volumen = volumen + 1;
		
	}
	public void bajarVolumen(){
		volumen = volumen -1;
	}
	
}