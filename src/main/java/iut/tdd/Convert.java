package iut.tdd;

public class Convert {
	
	static String[] numéros = {"0","1","2","3","4","5","6","7","8","9"};
	static String[] tradNum = {"zéro","un","deux","trois","quatre","cinq","six","sept","huit","neuf"};
	
	public static String num2text(String input) {
		for(int i = 0; i < numéros.length; i++){
			if(numéros[i].equals(input)){
				return tradNum[i];
			}
		}
		return null;
	}
	
	public static String text2num(String input) {
		for(int i = 0; i < tradNum.length; i++){
			if(tradNum[i].equals(input)){
				return numéros[i];
			}
		}
		return null;
	}
}