package com.wangzhb.sample.refactoring.v1;

/**
 * Rental 表示某个客户租赁了一步影片
 *
 * @author wang
 * @since 2021/11/27 12:40
 **/
public class Rental {
    private Movie movie;
    private int dayRented;

    public Rental(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getDayRented() {
        return dayRented;
    }

    public void setDayRented(int dayRented) {
        this.dayRented = dayRented;
    }

    public double getCharge() {
        double result = 0;
        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (getDayRented() > 2) {
                    result += (getDayRented() - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                result += getDayRented() * 3;
                break;
            case Movie.CHILDREN:
                result += 1.5;
                if (getDayRented() > 1) {
                    result += (getDayRented() - 3) * 1.5;
                }
                break;
            default:
                throw new IllegalArgumentException("illegal price code");
        }
        return result;
    }

    public int getFrequentRenterPoints() {
        if (getMovie().getPriceCode() == Movie.NEW_RELEASE && getDayRented() > 1) {
            return 2;
        }
        else {
            return 1;
        }
    }

}
