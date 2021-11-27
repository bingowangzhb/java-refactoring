package com.wangzhb.sample.refactoring.v2;

/**
 * ChildrenPrice
 *
 * @author wang
 * @since 2021/11/27 17:08
 **/
public class ChildrenPrice extends Price {

    @Override
    int getPriceCode() {
        return Movie.CHILDREN;
    }

    @Override
    double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3) {
            result += (daysRented - 3) * 1.5;
        }
        return result;
    }
}
