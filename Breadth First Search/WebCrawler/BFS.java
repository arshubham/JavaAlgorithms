/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebCrawler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Shubham Arora
 */
public class BFS {
    
    private Queue<String> queue;
    private List<String> discoveredWebsiteList;
    
    public BFS()
    {
        this.queue = new LinkedList<>();
        this.discoveredWebsiteList = new ArrayList<>();
    }
   
    public void discoverWeb(String root)
    {
        this.queue.add(root);
        this.discoveredWebsiteList.add(root);
        
        while(!queue.isEmpty())
        {
            String v = this.queue.remove();
            String rawHtml = readUrl(v);
            String regezp = "https://(\\w+\\.)*(\\w+)";
            Pattern pattern = Pattern.compile(regezp);
            Matcher matcher = pattern.matcher(rawHtml);
            
            while(matcher.find())
            {
                String w = matcher.group();
                if(!discoveredWebsiteList.contains(w))
                {
                    discoveredWebsiteList.add(w);
                    System.out.println("Website Found with Url: "+w);
                    queue.add(w);
                }
            }
        }
    }

    private String readUrl(String v) {
        String rawHtml = "";
        try
        {
            URL url = new URL(v);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            
            String inputline = "";
            
            while((inputline = bufferedReader.readLine()) != null)
            {
                rawHtml += inputline;
            }
            bufferedReader.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();  
        }
        return rawHtml;
    }
    
}
