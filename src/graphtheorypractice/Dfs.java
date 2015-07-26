/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphtheorypractice;

import static graphtheorypractice.Graph2.node;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class Dfs {
  static   Boolean visitedNodes[] = new Boolean[20];
  static ArrayList<ArrayList<Integer>> connectedEdges = new ArrayList<ArrayList<Integer>>();
    
    public static void dfs(int s){
     visitedNodes[s] = true;
        for (int i = 0; i <= connectedEdges.get(s).size(); ++i) {
            if (visitedNodes[connectedEdges.get(s).get(i)]== false) {               
               // dfs(connectedEdges.get(s).get(i));
                System.out.println("false");
            }
        }
    }
    
    public static void initialize(){
        for (int i = 0; i < 10; ++i) {
            visitedNodes[i] = false;
        }
    }
    public static void main(String[] args) {
        int nodes,edges,first,second,connectedComponents =0;
        List sam = null ;List sam1= null;
        Scanner scanner = new Scanner(System.in);
        nodes = scanner.nextInt();
        edges = scanner.nextInt();
        for (int i = 0; i < edges;++i) {
            first = scanner.nextInt();
            second = scanner.nextInt();
               if (connectedEdges.size()>first && connectedEdges.size()>=second) { 
                connectedEdges.get(first-1).add(second);
                connectedEdges.get(second-1).add(first);
                }else if(connectedEdges.size()==first && connectedEdges.size()>second){
                    connectedEdges.get(first-1).add(second);
                connectedEdges.get(second-1).add(first);
                }else if(connectedEdges.size()== first && connectedEdges.size()<second){
                connectedEdges.get(first-1).add(second);
                sam = new ArrayList<>();
                sam.add(first);
               connectedEdges.add((ArrayList<Integer>) sam);
                }else{
              sam = new ArrayList<>();
              sam1 = new ArrayList<>();
              sam.add(second);
              sam1.add(first);
               connectedEdges.add((ArrayList<Integer>) sam);
               connectedEdges.add((ArrayList<Integer>)sam1);
            }
            System.out.println(connectedEdges);
            
        }
        initialize();
        for (int i = 1; i <=nodes; i++) {
             if (visitedNodes[i] == false) {
                dfs(i);
                connectedComponents++;
            }
        }
        System.out.println(connectedComponents);
    }
}
