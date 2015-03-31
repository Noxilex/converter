package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

public class TestConvert {
	//Num -> Texte 0-9
	@Test
	public void test_num2text_zero () {
		Assert.assertEquals("zéro", Convert.num2text("0"));
	}
	
	public void test_num2text_un () {
		Assert.assertEquals("un", Convert.num2text("1"));
	}
	
	public void test_num2text_deux () {
		Assert.assertEquals("deux", Convert.num2text("2"));
	}
	
	public void test_num2text_trois () {
		Assert.assertEquals("trois", Convert.num2text("3"));
	}
	
	public void test_num2text_quatre () {
		Assert.assertEquals("quatre", Convert.num2text("4"));
	}
	
	public void test_num2text_cinq () {
		Assert.assertEquals("cinq", Convert.num2text("5"));
	}
	
	public void test_num2text_six () {
		Assert.assertEquals("six", Convert.num2text("6"));
	}
	
	public void test_num2text_sept () {
		Assert.assertEquals("sept", Convert.num2text("7"));
	}
	
	public void test_num2text_huit () {
		Assert.assertEquals("huit", Convert.num2text("8"));
	}
	
	public void test_num2text_neuf () {
		Assert.assertEquals("neuf", Convert.num2text("9"));
	}
	
	//Texte -> Num 0-9
	public void test_texte2num_zero(){
		Assert.assertEquals("0", Convert.text2num("zéro"));
	}
	
	public void test_texte2num_un(){
		Assert.assertEquals("0", Convert.text2num("un"));
	}
	
	public void test_texte2num_deux(){
		Assert.assertEquals("0", Convert.text2num("deux"));
	}
	
	public void test_texte2num_trois(){
		Assert.assertEquals("0", Convert.text2num("trois"));
	}
	
	public void test_texte2num_quatre(){
		Assert.assertEquals("0", Convert.text2num("quatre"));
	}
	
	public void test_texte2num_cinq(){
		Assert.assertEquals("0", Convert.text2num("cinq"));
	}
	
	public void test_texte2num_six(){
		Assert.assertEquals("0", Convert.text2num("six"));
	}
	
	public void test_texte2num_sept(){
		Assert.assertEquals("0", Convert.text2num("sept"));
	}
	
	public void test_texte2num_huit(){
		Assert.assertEquals("0", Convert.text2num("huit"));
	}
	
	public void test_texte2num_neuf(){
		Assert.assertEquals("0", Convert.text2num("neuf"));
	}
}
