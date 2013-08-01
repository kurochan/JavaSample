package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void 通して実行できるかどうか() {
		FizzBuzz.main(null);
	}

	@Test
	public void 三の倍数でも五の倍数でもない場合() {
		assertEquals("8", FizzBuzz.eval(8));
	}

	@Test
	public void 三の倍数の場合() {
		assertEquals("Fizz", FizzBuzz.eval(6));
	}

	@Test
	public void 五の倍数の場合() {
		assertEquals("Buzz", FizzBuzz.eval(20));
	}

	@Test
	public void 三と五の倍数の場合() {
		assertEquals("FizzBuzz", FizzBuzz.eval(15));
	}
}
