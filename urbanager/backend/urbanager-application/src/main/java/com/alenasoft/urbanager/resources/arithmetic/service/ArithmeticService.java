package com.alenasoft.urbanager.resources.arithmetic.service;
import com.alenasoft.urbanager.api.Result;

public interface ArithmeticService {
    long sum(int num1, int num2);
    Result getById(long id);
}
