package com.wangzhb.sample.refactoring.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * Customer 表示顾客
 *
 * @author wang
 * @since 2021/11/27 12:41
 **/
public class Customer {

    private final String name;
    private final List<Rental> rentals;

    public Customer(String name, List<Rental> rentals) {
        this.name = name;
        this.rentals = rentals;
    }

    public Customer(String name) {
        this.name = name;
        this.rentals = new ArrayList<>();
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    /**
     * 生成租赁详单
     * @return String
     */
    public String statement() {
        String result = "Rental Record for " + getName() + "\n";
        for (Rental each : rentals) {
            // show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + each.getCharge() + "\n";
        }

        // add foot lines
        result += "Amount owed is " + getTotalCharge() + "\n";
        result += "You earned " + getTotalFrequentRenterPoints() + " frequent renter points";

        return result;
    }

    public String htmlStatement() {
        String result = "<H1>Rental Record for <EM>" + getName() + "</EM></H1><P>\n";
        for (Rental each : rentals) {
            // show figures for this rental
            result += each.getMovie().getTitle() + ":" + each.getCharge() + "<BR>\n";
        }

        // add foot lines
        result += "<P>Amount owed is <EM>" + getTotalCharge() + "</EM><P>\n";
        result += "You earned <EM>" + getTotalFrequentRenterPoints() + "</EM> frequent renter points<P>";

        return result;
    }


    private double getTotalCharge() {
        double result = 0;
        for (Rental each : rentals) {
            result += each.getCharge();
        }
        return result;
    }

    private double getTotalFrequentRenterPoints() {
        double result = 0;
        for (Rental each : rentals) {
            result += each.getFrequentRenterPoints();
        }
        return result;
    }


}
