package com.wangzhb.sample;

/**
 * Test
 *
 * @author wang
 * @since 2021/11/27 14:36
 **/
public class Test {

    public static void main(String[] args) {

        Movie movie = new Movie("Titanic", Movie.REGULAR);

        Rental rental = new Rental(movie, 5);

        Customer customer = new Customer("wang");
        customer.addRental(rental);

        System.out.println(" statement = " + customer.statement());

    }

}
