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

	
}
