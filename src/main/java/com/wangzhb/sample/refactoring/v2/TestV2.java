package com.wangzhb.sample.refactoring.v2;

import com.wangzhb.sample.Customer;
import com.wangzhb.sample.Movie;
import com.wangzhb.sample.Rental;

/**
 * TestV2
 *
 * @author wang
 * @since 2021/11/27 14:53
 **/
public class TestV2 {
    public static void main(String[] args) {
        com.wangzhb.sample.Movie movie = new com.wangzhb.sample.Movie("Titanic", Movie.REGULAR);
        com.wangzhb.sample.Rental rental = new Rental(movie, 5);
        com.wangzhb.sample.Customer customer = new Customer("wang");
        customer.addRental(rental);
        System.out.println(" statement = " + customer.statement());

    }
}
