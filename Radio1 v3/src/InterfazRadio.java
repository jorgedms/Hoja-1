/*
 * Universidad del Valle de Guatemala
 * Algoritmos y estructura de datos
 * Seccion 10
 * 
 * Christopher Aju 13171
 * Jorge Manrique 13600
 * Jonathan Aguirre 14349
 * 
 * Hoja de trabajo 1
 * 
 * 
 * */

import java.util.List;

public class InterfazRadio {
	/**
	 * constante que permite el cambio de frecuencia en AM
	 */
	final int CONST_CAMBIO_AM = 10;
	/**
	 * Constante que permite el cambio de frecuencia en FM
	 */
	final double CONST_CAMBIO_FM = 0.2;
	/**
	 * Determina la MAx frecuencia que se alcanza en AM
	 */
	final int MAX_AM = 1610;
	/**
	 * Determina la minima frecuencia que se alcanza en AM
	 */
	final int MIN_AM = 530;
	/**
	 * Determina ma max frecuancia alcanzada en FM
	 */
	final double MAX_FM = 107.9;
	/**
	 * Determina la Min frecuencia alcanzada en FM
	 */
	final  double MIN_FM = 87.9;
	
	
	
	/**
	 * VARIABLES QUE NO SE DEFINIERON!!!!!!!!!!
	 * 
	 */
	private double emisora= 0;
	private String frecuencia = "AM";
	private int volumen =0;
	/**
	 * primer [] filas; segundo [] columnas
	 * 0 es para AM y 1 para FM para las columnas
	 */
	private double [][] save = new double [12][2];


	/**
	 * Metodo que permite subir el volumen
	 */
	public void subirVolumen(){
		if (volumen<100){
			volumen= volumen + 10;
		}
	}

	/**
	 * Metodo que permite bajar el volumen
	 */
	public void bajarVolumen(){
		if (volumen>0){
			volumen = volumen - 10;
		}
	}

	/**
	 * Metodo que permite cambiar a frecuencias mayores
	 */
	public void adelantarEmisora(){
		//verifica que tipo de frecuencia
		if (frecuencia.equals("AM")){
			//verifica que se pueda subir mas
			if (emisora<MAX_AM){
				emisora = emisora + CONST_CAMBIO_AM;
			}
			else{
				emisora = MIN_AM;
			}
		}
		else {
			if (emisora<MAX_FM){
				emisora = emisora + CONST_CAMBIO_FM;
			}
			else{
				emisora = MIN_FM;
			}
		}
	}

	/**
	 * Metodo que permite cambiar a frecuencias menores
	 */
	public void atrasarEmisora(){
		//verifica que tipo de frecuencia
		if (frecuencia.equals("AM")){
			//verifica que se pueda bajar mas
			if (emisora>MIN_AM){
				emisora = emisora - CONST_CAMBIO_AM;
			}
			else{
				emisora = MAX_AM;
			}
		}
		else {
			if (emisora > MIN_FM){
				emisora = emisora - CONST_CAMBIO_FM;
			}
			else {
				emisora = MAX_FM;
			}
		}
	}
	
	/**
	 * Retorna la emisora actual seleccionada (dependiendo si es AM o FM)
	 */
	public double getEmisora(){
		return emisora;
	}

	/**
	 * Retorna la frecuencia actual AM o FM
	 */
	public String getFrec(){
		return frecuencia;
	}

	public int getVolumen(){
		return volumen;
	}
	
	/**
	 * Metodo que permite cambiar la frecuencia entre AM y FM.
	 */
	public void cambiarFrec(){
		//si es AM cambia a FM
		if (frecuencia.equals("AM")){
			frecuencia= "FM";
			emisora = MIN_FM;
		}
		//si es FM cambia a AM
		else{
			frecuencia= "AM";
			emisora = MIN_AM;
		}
	}
	/**
	 *  Carga la emisora almacenada en uno de los 12 botones
	 * 
	 */
	public double cargarEmisora(int posicion){
		int tipo;
		if (frecuencia.equals("AM")){
			tipo = 0;
		}
		else{
			tipo = 1;
		}
		return (save[posicion][tipo]);
	}

	/**
	 * Metodo que permite guardar emisoras
	 * @param emisora
	 * @param posicion
	 */
	public void guardarEmisora(double emisora, int posicion){
		int tipo;
		if (frecuencia.equals("AM")){
			tipo = 0;
		}
		else {
			tipo = 1;
		}
		save[posicion][tipo] = emisora;
		
	}
	

}
