/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebCrawler;

/**
 *
 * @author Shubham Arora
 */
public class App {
    public static void main(String[] args) {
        String root = "http://shubhamarora.co.in";
        BFS bfs = new BFS();
        bfs.discoverWeb(root);
    }
}
