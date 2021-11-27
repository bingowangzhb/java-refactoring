package com.wangzhb.sample.refactoring.v2;

/**
 * NewReleasePrice
 *
 * @author wang
 * @since 2021/11/27 17:08
 **/
public class NewReleasePrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    double getCharge(int dayRented) {
        return dayRented * 3;
    }

    @Override
    protected int getFrequentRenterPoints(int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}
