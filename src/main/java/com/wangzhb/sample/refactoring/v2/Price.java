package com.wangzhb.sample.refactoring.v2;

/**
 * Price
 *
 * @author wang
 * @since 2021/11/27 17:08
 **/
public abstract class Price {
    /**
     * getPriceCode
     * @return int
     */
    abstract int getPriceCode();

    /**
     * getCharge
     * @param daysRented daysRented
     * @return double
     */
    abstract double getCharge(int daysRented);

    /**
     * getFrequentRenterPoints
     * @param daysRented days rented
     * @return int
     */
    protected int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
