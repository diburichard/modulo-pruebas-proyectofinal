package com.alenasoft.urbanager.resources.primenumber.service;

public interface PrimeNumberService {
    boolean isPrime( int num1 );
    String eval( int num1 );
    int[] getNPrimeNumbers(int n);
}
