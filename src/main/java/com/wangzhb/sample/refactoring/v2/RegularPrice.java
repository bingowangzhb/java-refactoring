package com.wangzhb.sample.refactoring.v2;

/**
 * RegularPrice
 *
 * @author wang
 * @since 2021/11/27 17:09
 **/
public class RegularPrice extends Price {

    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    double getCharge(int dayRented) {
        double result = 2;
        if (dayRented > 2) {
            result += (dayRented - 2) * 1.5;
        }
        return result;
    }
}
