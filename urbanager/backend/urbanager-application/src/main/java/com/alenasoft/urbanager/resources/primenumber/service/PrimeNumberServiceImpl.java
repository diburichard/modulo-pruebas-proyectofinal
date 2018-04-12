package com.alenasoft.urbanager.resources.primenumber.service;

import com.alenasoft.urbanager.api.Result;
import com.alenasoft.urbanager.resources.arithmetic.dao.ResultDaoImpl;

import javax.inject.Inject;

public class PrimeNumberServiceImpl implements PrimeNumberService {

    @Override
    public boolean isPrime(int num1) {
        int dividercounter = 1;
        if ( num1 <= 1 ) return false;
        for ( int i = 2; i <= num1; i++ ) {
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

    @Override
    public int[] getNPrimeNumbers(int number){

        if(number <= 0){
            return new int[]{};
        }

        int oounter = 0;
        int i = 1;

        int[] primeNumbers = new int[number];

        while(oounter != number){
            if(isPrime(i)){
                primeNumbers[oounter] = i;
                oounter++;
            }
            i++;
        }

        return primeNumbers;
    }

}
