package com.alenasoft.urbanager.resources.primenumber.service;

import com.alenasoft.urbanager.api.Example;
import com.alenasoft.urbanager.resources.example.dao.ExampleDao;
import com.alenasoft.urbanager.resources.example.service.ExampleService;
import com.alenasoft.urbanager.resources.example.service.ExampleServiceImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Matchers;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimeNumberServiceImplTest {
  @Test
  public void testGetisPrimeIfNumberIsDivisibleByOneAndReturnTrue() {
    PrimeNumberService service = new PrimeNumberServiceImpl();
    boolean expected = true;
    assertThat(service.isPrime(1)).isEqualTo(expected);
  }

  @Test
  public void testGetisPrimeIfNumberIsDivisibleOnlyByOneAndItselftReturnTrue() {
    PrimeNumberService service = new PrimeNumberServiceImpl();
    boolean expected = true;
    assertThat(service.isPrime(3)).isEqualTo(expected);
  }

  @Test
  public void testGetisPrimeIfNegativeNumberIsDivisibleByOneAndItselftReturnFalse() {
    PrimeNumberService service = new PrimeNumberServiceImpl();
    boolean expected = false;
    assertThat(service.isPrime(-3)).isEqualTo(expected);
  }

  @Test
  public void testGetIsPrimeEvaluateIfNumberIsDivisibleByOneAndReturnOK() {
    PrimeNumberService service = new PrimeNumberServiceImpl();
    String expected = "OK";
    assertThat(service.eval(1)).isEqualTo(expected);
  }
  @Test
  public void testGetIsPrimeEvaluateIfNegativeNumberIsDivisibleByOneAndItselftReturnFAIL() {
    PrimeNumberService service = new PrimeNumberServiceImpl();
    String expected = "FAIL";
    assertThat(service.eval(-3)).isEqualTo(expected);
  }

  @Test
  public void testGetNPrimeNumbersIfNIsZero(){
    PrimeNumberService service = new PrimeNumberServiceImpl();
    int[] expected = {};
    Assert.assertArrayEquals( expected, service.getNPrimeNumbers(0) );
  }

  @Test
  public void testGetNPrimerNumbersIfNIsTen(){
    PrimeNumberService service = new PrimeNumberServiceImpl();
    int[] expected = {2,3,5,7,11,13, 17, 19, 23, 29};
    Assert.assertArrayEquals( expected, service.getNPrimeNumbers(10) );
  }

}