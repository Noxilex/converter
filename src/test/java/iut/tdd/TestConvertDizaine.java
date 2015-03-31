package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;


public class TestConvertDizaine {
	//Num2Text
	@Test
	public void test_num2text_10 () {
		Assert.assertEquals("dix", Convert.num2text("10"));
	}
	@Test
	public void test_num2text_20 () {
		Assert.assertEquals("vingt", Convert.num2text("20"));
	}
	@Test
	public void test_num2text_30 () {
		Assert.assertEquals("trente", Convert.num2text("30"));
	}
	@Test
	public void test_num2text_40 () {
		Assert.assertEquals("quarante", Convert.num2text("40"));
	}
	@Test
	public void test_num2text_50 () {
		Assert.assertEquals("cinquante", Convert.num2text("50"));
	}
	@Test
	public void test_num2text_60 () {
		Assert.assertEquals("soixante", Convert.num2text("60"));
	}
	@Test
	public void test_num2text_70 () {
		Assert.assertEquals("soixante-dix", Convert.num2text("70"));
	}
	@Test
	public void test_num2text_80 () {
		Assert.assertEquals("quatre-vingt", Convert.num2text("80"));
	}
	@Test
	public void test_num2text_90 () {
		Assert.assertEquals("quatre-vingt-dix", Convert.num2text("90"));
	}
	
	//Text2Num
	@Test
	public void test_text2num_10 () {
		Assert.assertEquals("10", Convert.text2num("dix"));
	}
	@Test
	public void test_text2num_20 () {
		Assert.assertEquals("20", Convert.text2num("vingt"));
	}
	@Test
	public void test_text2num_30 () {
		Assert.assertEquals("30", Convert.text2num("trente"));
	}
	@Test
	public void test_text2num_40 () {
		Assert.assertEquals("40", Convert.text2num("quarante"));
	}
	@Test
	public void test_text2num_50 () {
		Assert.assertEquals("50", Convert.text2num("cinquante"));
	}
	@Test
	public void test_text2num_60 () {
		Assert.assertEquals("60", Convert.text2num("soixante"));
	}
	@Test
	public void test_text2num_70 () {
		Assert.assertEquals("70", Convert.text2num("soixante-dix"));
	}
	@Test
	public void test_text2num_80 () {
		Assert.assertEquals("80", Convert.text2num("quatre-vingt"));
	}
	@Test
	public void test_text2num_90 () {
		Assert.assertEquals("90", Convert.text2num("quatre-vingt-dix"));
	}
}
