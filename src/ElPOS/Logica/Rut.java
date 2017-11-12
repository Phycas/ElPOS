/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package ElPOS.Logica;

public class Rut {
	int rut;
	String dv;

	
	public Rut(Integer r, String d) throws Exception{
		Boolean retVal = verificarRut(r, d);
		
		if(!retVal) {
			throw new Exception("Rut no Válido");
		}
                this.rut = r;
                this.dv = d;
	}
        
        public Rut() {
		
	}
	
	private Boolean verificarRut(Integer rut2, String dv2) {
		Boolean estabien = false;
		
		int suma, mult, resto;
		suma = 0;
		mult = 2;
		int largoRut = String.valueOf(rut2).length();
		for(int count=0;count<largoRut; count++) {
			suma += mult * (rut2 % 10); // multiplicar el ultimo número, añadirlo a la suma
			rut2 /= 10; //quitar el último número
			mult++; //aumentar el multiplicador
			
			if(mult == 8) { //después de usar el multiplicador en 7, devolverlo a 2
				mult = 2;
			}
		}
		resto = 11 - (suma % 11); //generar el dígito verificador
		
		int leDigit = 99;
		if(dv2 == "k"){ //comprobar que dv sea "k" o un int
			leDigit = 10;
		} else {
			try{
			leDigit = Integer.parseInt(dv2);
			} catch (Exception ex){
				estabien = false;
			}
		}
		if(resto == leDigit){
			estabien = true;
		} else {
			estabien = false;
		}
		
		return estabien;		
	}
	
	public String getRut(){
		String leRut;
		leRut = rut + "-" + dv;
		return leRut;
	}
}