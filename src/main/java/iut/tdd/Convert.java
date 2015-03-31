package iut.tdd;

public class Convert {
	
	static String[] numeros = {"0","1","2","3","4","5","6","7","8","9"};
	static String[] tradNum = {"zéro","un","deux","trois","quatre","cinq","six","sept","huit","neuf"};
	static String[] dizaine = {"10","20","30","40","50","60","70","80","90"};
	static String[] tradDiz = {"dix","vingt","trente","quarante","cinquante","soixante"};
	static String[] num11to16 = {"11","12","13","14","15", "16"};
	static String[] trad11to16 = {"onze","douze","treize","quatorze","quinze", "seize"};
	
	public static String num11to16_2text(String input){
		for(int i = 0; i<num11to16.length;i++){
			if(num11to16.equals(input)){
				return trad11to16[i];
			}
		}
		return null;
	}
	
	public static String text_2num11to16(String input){
		for(int i = 0; i<trad11to16.length;i++){
			if(trad11to16.equals(input)){
				return num11to16[i];
			}
		}
		
		return null;
	}
	
	
	public static String num2text(String input) {
		for(int i = 0; i < numeros.length; i++){
			if(numeros[i].equals(input)){
				return tradNum[i];
			}
		}
		for(int i = 0; i < dizaine.length; i++){
			if(input.equals("70")){
				return tradDiz[5]+"-"+tradDiz[0];				
			}
			else if(input.equals("80")){
				return tradNum[4]+"-"+tradDiz[1];
			}
			else if(input.equals("90")){
				return tradNum[4]+"-"+tradDiz[1]+"-"+tradDiz[0];
			}
			else if(dizaine[i].equals(input)){
				return tradDiz[i];				
			}
		}
		if(!num11to16_2text(input).equals(null)){
			return num11to16_2text(input);
		}

		return null;
	}
	
	public static String text2num(String input) {
		for(int i = 0; i < tradNum.length; i++){
			if(tradNum[i].equals(input)){
				return numeros[i];
			}
		}
		for(int i = 0; i < dizaine.length; i++){			
			if(input.equals(tradDiz[5]+"-"+tradDiz[0])){
				return dizaine[6];					
			}
		 	else if(input.equals(tradNum[4]+"-"+tradDiz[1])){
				return dizaine[7];					
			}
			
			else if(input.equals(tradNum[4]+"-"+tradDiz[1]+"-"+tradDiz[0])){
				return dizaine[8];					
			}		
			else if(tradDiz[i].equals(input)){
				return dizaine[i];				
			}
		}
		if(!text_2num11to16(input).equals(null)){
			return text_2num11to16(input);
		}
		return null;
	}
}