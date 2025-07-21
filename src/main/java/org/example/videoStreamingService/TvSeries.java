package org.example.videoStreamingService;

public class TvSeries extends Video {
    int episodes;
    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }

    @Override // Good practice to use @Override annotation
    public String getInfo() {
        return "TV Series: " + title +
                ", Duration: " + duration + " minutes" +
                ", Episodes: " + episodes;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}
