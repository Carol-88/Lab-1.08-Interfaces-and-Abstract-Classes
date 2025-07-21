package org.example.videoStreamingService;

public class Movie extends Video {
    double rating;
    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    @Override // Good practice to use @Override annotation
    public String getInfo() {
        return "Movie: " + title +
                ", Duration: " + duration + " minutes" +
                ", Rating: " + rating + "/10"; // Assuming a rating out of 10
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
