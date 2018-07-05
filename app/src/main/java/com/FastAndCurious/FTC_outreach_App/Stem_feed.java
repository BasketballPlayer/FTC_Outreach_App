package com.FastAndCurious.FTC_outreach_App;


public class Stem_feed {
    private String date, feed_type, feed_text, feed_author;


    public Stem_feed(String date, String feed_type, String feed_text, String feed_author) {
        this.setDate(date);
        this.setFeed_type(feed_type);
        this.setFeed_text(feed_text);
        this.setFeed_author(feed_author);

    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFeed_type() {
        return feed_type;
    }

    public void setFeed_type(String feed_type) { this.feed_type = feed_type;}

    public String getFeed_text() {return feed_text;}

    public void setFeed_text(String feed_text) {this.feed_text = feed_text;}

    public String getFeed_author() {
        return feed_author;
    }

    public void setFeed_author(String feed_author) {this.feed_author = feed_author;}

}
