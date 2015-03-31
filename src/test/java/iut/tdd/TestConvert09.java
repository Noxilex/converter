package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

public class TestConvert09 {
	//Num -> Texte 0-9
	@Test
	public void test_num2text_zero () {
		Assert.assertEquals("zéro", Convert.num2text("0"));
	}
	@Test
	public void test_num2text_un () {
		Assert.assertEquals("un", Convert.num2text("1"));
	}
	@Test
	public void test_num2text_deux () {
		Assert.assertEquals("deux", Convert.num2text("2"));
	}
	@Test
	public void test_num2text_trois () {
		Assert.assertEquals("trois", Convert.num2text("3"));
	}
	@Test
	public void test_num2text_quatre () {
		Assert.assertEquals("quatre", Convert.num2text("4"));
	}
	@Test
	public void test_num2text_cinq () {
		Assert.assertEquals("cinq", Convert.num2text("5"));
	}
	@Test
	public void test_num2text_six () {
		Assert.assertEquals("six", Convert.num2text("6"));
	}
	@Test
	public void test_num2text_sept () {
		Assert.assertEquals("sept", Convert.num2text("7"));
	}
	@Test
	public void test_num2text_huit () {
		Assert.assertEquals("huit", Convert.num2text("8"));
	}
	@Test
	public void test_num2text_neuf () {
		Assert.assertEquals("neuf", Convert.num2text("9"));
	}
	
	//Texte -> Num 0-9
	@Test
	public void test_texte2num_zero(){
		Assert.assertEquals("0", Convert.text2num("zéro"));
	}
	@Test
	public void test_texte2num_un(){
		Assert.assertEquals("1", Convert.text2num("un"));
	}
	@Test
	public void test_texte2num_deux(){
		Assert.assertEquals("2", Convert.text2num("deux"));
	}
	@Test
	public void test_texte2num_trois(){
		Assert.assertEquals("3", Convert.text2num("trois"));
	}
	@Test
	public void test_texte2num_quatre(){
		Assert.assertEquals("4", Convert.text2num("quatre"));
	}
	@Test
	public void test_texte2num_cinq(){
		Assert.assertEquals("5", Convert.text2num("cinq"));
	}
	@Test
	public void test_texte2num_six(){
		Assert.assertEquals("6", Convert.text2num("six"));
	}
	@Test
	public void test_texte2num_sept(){
		Assert.assertEquals("7", Convert.text2num("sept"));
	}
	@Test
	public void test_texte2num_huit(){
		Assert.assertEquals("8", Convert.text2num("huit"));
	}
	@Test
	public void test_texte2num_neuf(){
		Assert.assertEquals("9", Convert.text2num("neuf"));
	}
}
