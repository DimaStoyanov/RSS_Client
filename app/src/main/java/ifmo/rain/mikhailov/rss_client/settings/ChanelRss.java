package ifmo.rain.mikhailov.rss_client.settings;

import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created by user on 19.12.2016.
 */

public class ChanelRss {
    String rssName;
    String linkToRss;
    ChanelRss(String rssName, String linkToRss){
        this.linkToRss = linkToRss;
        this.rssName = rssName;
    }
    @Override
    public String toString() {
        return rssName;
    }
}
