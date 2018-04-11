package com.alenasoft.urbanager.resources.primenumber.service;

import com.alenasoft.urbanager.api.Example;
import com.alenasoft.urbanager.resources.example.dao.ExampleDao;
import com.alenasoft.urbanager.resources.example.service.ExampleService;
import com.alenasoft.urbanager.resources.example.service.ExampleServiceImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
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
}