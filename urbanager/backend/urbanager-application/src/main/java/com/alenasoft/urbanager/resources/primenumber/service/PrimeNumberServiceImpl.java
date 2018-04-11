package com.alenasoft.urbanager.resources.primenumber.service;

import com.alenasoft.urbanager.api.Result;
import com.alenasoft.urbanager.resources.arithmetic.dao.ResultDaoImpl;

import javax.inject.Inject;

public class PrimeNumberServiceImpl implements PrimeNumberService {

    @Override
    public boolean isPrime(int num1) {
        int dividercounter = 0;
        if ( num1 <= 0 ) return false;
        for ( int i = 1; i <= num1; i++ ) {
           if (( num1 % i ) == 0 ) {
               dividercounter++;
               if ( dividercounter > 2 ) return false;
           }
        }
        return true;
    }

    @Override
    public String eval(int num1) {

        if ( isPrime( num1 ) ) return "OK";
        return  "FAIL";
    }

}
