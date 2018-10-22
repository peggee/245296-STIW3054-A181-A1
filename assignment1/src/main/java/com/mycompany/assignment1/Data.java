/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Data {

    public static List<Info> data = new ArrayList();
    public static void collectData(){
        try {
            String web = "https://ms.wikipedia.org/wiki/Malaysia";
            Document doc = Jsoup.connect(web).get();
            
            Element table = doc.select("table.wikitable").get(1);
            Elements rows = table.select("tr");

            for(Element tr : rows) {
                String th = tr.select("th").text();
                String td = tr.select("td").text();

                data.add(new Info(th,td));
            }
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
