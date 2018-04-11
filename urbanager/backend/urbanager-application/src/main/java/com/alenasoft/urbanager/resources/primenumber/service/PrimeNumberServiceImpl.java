package com.alenasoft.urbanager.resources.primenumber.service;

import com.alenasoft.urbanager.api.Result;
import com.alenasoft.urbanager.resources.arithmetic.dao.ResultDaoImpl;

import javax.inject.Inject;

public class PrimeNumberServiceImpl implements PrimeNumberService {

    @Override
    public boolean isPrime(int num1) {
        int contador = 0;
        if ( num1 <= 0 ) return false;

        for ( int i = 1; i <= num1; i++ ) {
           if (( num1 % i ) == 0 ) {
               contador++;
           }
        }
        if(contador <= 2)  return true;
        return false;
    }

    @Override
    public String eval(int num1) {

        if ( isPrime( num1 ) ) return "OK";
        return  "FAIL";
    }

}
