package com.FastAndCurious.FTC_outreach_App;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class FeedAdapter extends ArrayAdapter<Stem_feed> {

    Context context;
    private ArrayList<Stem_feed> feeds;

    public FeedAdapter(Context context, int textViewResourceId, ArrayList<Stem_feed> items) {
        super(context, textViewResourceId, items);
        this.context = context;
        this.feeds = items;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = vi.inflate(R.layout.feed, null);
        }
        Stem_feed feed = feeds.get(position);
        if (feed != null) {
            TextView date = (TextView) v.findViewById(R.id.date);
            TextView feed_type = (TextView) v.findViewById(R.id.feed_type);
            TextView feed_text = (TextView) v.findViewById(R.id.feed_text);
            TextView feed_author = (TextView) v.findViewById(R.id.feed_author);
            date.setText(String.valueOf(feed.getDate()));
            feed_type.setText(String.valueOf(feed.getFeed_type()));
            feed_text.setText(String.valueOf(feed.getFeed_text()));
            feed_author.setText(String.valueOf(feed.getFeed_author()));

        }
        return v;
    }
}
