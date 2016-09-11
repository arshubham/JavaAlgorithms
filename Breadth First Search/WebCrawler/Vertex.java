/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebCrawler;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shubham Arora
 */
public class Vertex {
    private String name;
    private boolean visited;
    private Vertex previousVertex;
    private List<Vertex> adjacenciesList;
    
    public Vertex(String name)
    {
        this.name = name;
        this.adjacenciesList = new ArrayList<>();
    }
    
    public void addNeighbour(Vertex vertex)
    {
        this.adjacenciesList.add(vertex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Vertex getPreviousVertex() {
        return previousVertex;
    }

    public void setPreviousVertex(Vertex previousVertex) {
        this.previousVertex = previousVertex;
    }

    public List<Vertex> getAdjacenciesList() {
        return adjacenciesList;
    }

    public void setAdjacenciesList(List<Vertex> adjacenciesList) {
        this.adjacenciesList = adjacenciesList;
    }
    
    @Override
    public String toString()
    {
        return this.name;
    }
}
