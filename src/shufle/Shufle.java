/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alexander Riscanevo
 * @
 */
public class Shufle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int X;
        X = 3;
        while (X > 0){
            if (X > 2){
                System.out.print("a");
            }
            X = X-1;
            System.out.print("-");
            if (X==2){
                System.out.print("b c");
            }
            if (X==1){
                System.out.print("d");
                X = X - 1;
            }
        }
       
        
    }
    
}
