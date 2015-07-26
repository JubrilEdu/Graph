/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphtheorypractice;

import java.util.Scanner;

/**
 *
 * @author Edu
 */
public class GraphTheoryPractice {
   static Boolean cells[][] = new Boolean[5][5];
   
    /**
     * @param args the command line arguments
     */
   // using adjacency matrix as the input 
    public static void main(String[] args) {
        // TODO code application logic here
        initialize();
        int node,edges,row,column;
        Scanner scanner = new Scanner(System.in);
        node = scanner.nextInt();
        edges = scanner.nextInt();       
        for (int i = 0; i < edges; i++) {
            row = scanner.nextInt();
            column = scanner.nextInt();
            cells[row][column] = true;
        }
        if (cells[2][3] == true) {
            System.out.println("There is  an edge here ");  
        }else{
            System.out.println("There is no edge");
        }
        if (cells[3][4]== true) {
            System.out.println("There is an edge here");
        }
    }
    
    public static boolean initialize(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                cells[i][j] = false;
            }
        }
        return  false;
    }
    
}
