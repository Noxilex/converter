package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

public class TestConvert11_16 {
	//Num2Text
	
	@Test
	public void test_num2text_11 () {
		Assert.assertEquals("onze", Convert.num2text("11"));
	}
	@Test
	public void test_num2text_12 () {
		Assert.assertEquals("douze", Convert.num2text("12"));
	}
	@Test
	public void test_num2text_13 () {
		Assert.assertEquals("treize", Convert.num2text("13"));
	}
	@Test
	public void test_num2text_14 () {
		Assert.assertEquals("quatorze", Convert.num2text("14"));
	}
	@Test
	public void test_num2text_15 () {
		Assert.assertEquals("quinze", Convert.num2text("15"));
	}
	@Test
	public void test_num2text_16 () {
		Assert.assertEquals("seize", Convert.num2text("16"));
	}
	
	//Text2Num
	
	@Test
	public void test_text2num_11 () {
		Assert.assertEquals("11", Convert.text2num("onze"));
	}
	@Test
	public void test_text2num_12 () {
		Assert.assertEquals("12", Convert.text2num("douze"));
	}
	@Test
	public void test_text2num_13 () {
		Assert.assertEquals("13", Convert.text2num("treize"));
	}
	@Test
	public void test_text2num_14 () {
		Assert.assertEquals("14", Convert.text2num("quatorze"));
	}
	@Test
	public void test_text2num_15 () {
		Assert.assertEquals("15", Convert.text2num("quinze"));
	}
	@Test
	public void test_text2num_16 () {
		Assert.assertEquals("16", Convert.text2num("seize"));
	}
}
