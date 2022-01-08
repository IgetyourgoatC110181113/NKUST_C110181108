import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ouou {
    public static void main(String[] args) throws IOException {
        try {
            String URL_1 = "https://ck101.com";
            Document index_1 = Jsoup.connect(URL_1).get();
            Elements headline = index_1.select("div.article_container");
            Element table = headline.select("table").last();
            Element tbody = table.select("tbody").first();
            Element tr = tbody.select("tr").first();
            Element td = tr.select("td a").first();
            Elements styleS = td.select("style");
            Elements elements = index_1.getElementsByClass("l_sPic");
            Elements imagePath = tbody.select("[src]");
            for(Element img : styleS) {
                Elements x = img.select("*[style*='background-image']");
                if (imagePath == null) {
                    continue;

                    //System.out.println(style.attr("style"));
                }System.out.println(x);
            }
            //for (Element title : titles) {
                //String link = title.attr("href");
                //System.out.println("Link: " + link);
                //Document innerDoc = Jsoup.connect("https://ck101.com/" + link).get();
                //String titleText = innerDoc.select("h1").text();
                //String viewNumber = innerDoc.select("div.views").text();
                //String commentNumber = innerDoc.select("div.replys").text();
                //System.out.println("titleText: " + titleText);
                //System.out.println("viewNumber: " + viewNumber);
                //System.out.println("commentNumber: " + commentNumber);
                //Elements tags = innerDoc.select("div.tagBox a");

                //System.out.print("tag: ");
                //for (Element tag : tags) {
                    //System.out.print(tag.text() + " ,");
                System.out.println();
                System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
