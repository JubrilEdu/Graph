/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphtheorypractice;

import static java.lang.String.valueOf;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Setting up of graph using adjacency list i.e a list that contains lists of connected components 
 * @author Edu
 */
// this works using adjacency list
public class Graph2 {
    static ArrayList<ArrayList<Integer>> node = new ArrayList<ArrayList<Integer>>();   
    public static void main(String[] args) {
        int nodes,edges,first,second; List  sam = null;
        Scanner scanner = new Scanner(System.in);
        nodes = scanner.nextInt();
        edges = scanner.nextInt();
        for (int i = 0; i < edges; ++i) {
            first = scanner.nextInt();
            second = scanner.nextInt();
            if (node.size()>first-1) { 
                node.get(first-1).add(second);
            }else{
              sam = new ArrayList<>();
              sam.add(second);
               node.add((ArrayList<Integer>) sam);
            }
           
        }
        System.out.println(node);
    }
}
