package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

public class TestConvert {
	@Test
	public void test_num2text_zero () {
		// Given
		String input = "0";
		String expected = "zéro";
		Convert myConvert = new Convert();
		// When
		String actual = myConvert.num2text(input);
		// Then
		Assert.assertEquals(expected, actual);
	}
	
	public void test_num2text_zero_neuf(){
		String[] numéros = {"0","1","2","3","4","5","6","7","8","9"};
		String[] tradNum = {"zéro","un","deux","trois","quatre","cinq","six","sept","huit","neuf"};
		for(int i = 0; i < numéros.length; i++){
			//Given
			String input = numéros[i];
			String expected = tradNum[i];
			Convert myConvert = new Convert();
			//When
			String actual = myConvert.num2text(input);
			//Then
			Assert.assertEquals(expected, actual);
		}
	}
	
	public void test_texte2num_zero_neuf(){
		String[] numéros = {"0","1","2","3","4","5","6","7","8","9"};
		String[] tradNum = {"zéro","un","deux","trois","quatre","cinq","six","sept","huit","neuf"};
		for(int i = 0; i < numéros.length; i++){
			//Given
			String input = tradNum[i];
			String expected = numéros[i];
			Convert myConvert = new Convert();
			//When
			String actual = myConvert.text2num(input);
			//Then
			Assert.assertEquals(expected, actual);
		}
			
	}
	
	
}
