package entity;

public class Mp3File {
    private String url;
    private String name;
    private String time;
    private String playingTime;

    public Mp3File() {
    }

    public Mp3File(String url, String name, String time, String playingTime) {
        this.url = url;
        this.name = name;
        this.time = time;
        this.playingTime = playingTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime(String playingTime) {
        this.playingTime = playingTime;
    }
}
