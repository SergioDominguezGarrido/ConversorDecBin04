package modelo;

public class Numero {

	private int numDecimal;
	String numBinario = convertirBinario(numDecimal);
	
	
	public Numero(int numDecimal, String numBinario) {
		this.numDecimal = numDecimal;
		this.numBinario = numBinario;
	}



	public String convertirBinario(int numDecimal){		
		if (numDecimal == 0) {
            return "0";
        }
		
		 String numBinario = "";
		
		 while (numDecimal > 0) {
	            int remainder = numDecimal % 2;
	            numBinario = remainder + numBinario;
	            numDecimal = numDecimal / 2;
	        }
        
        return numBinario;
		}	
	
	
}
