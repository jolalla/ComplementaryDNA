public class DnaStrand {
  public static String makeComplement(String dna) {
    String resultado="";
    
    for (int x = 0; x<dna.length(); x++){
    	char proteina = dna.charAt(x);
  switch(proteina){
  
  case 'A':
  resultado +="T";
  break;
  case 'T':
  resultado += "A";
  break;
  case 'C':
  resultado +="G";
  break;
  case 'G':
  resultado += "C";
  break;
   }
        
  }
	return resultado;
}}