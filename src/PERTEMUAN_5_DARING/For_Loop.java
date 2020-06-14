/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTEMUAN_5_DARING;

/**
 *
 * @author USER
 */
public class For_Loop {
    public static void main(String[] args) {
        //Java Simple For Loop
        /*for(int i=1; i<=10; i++){
            System.out.println(i);
        } */
        
        //Java Nested For Loop
        for(int i=1; i<=3; i++){
            for(int j=1; j<=3; j++){
                System.out.println(i+" "+j);
            }
        }
        
        //Pyramid Example 1
        /*for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
        System.out.println();
        } */
        
        //Pyramid Example 2
        /*int term=6;
        for(int i=1; i<=term; i++){
            for(int j=term; j>=i; j--){
                System.out.print("* ");
            }
        System.out.println();
        } */
        
        //Java For-Each Loop
        /*int arr[]={12, 23, 44, 56, 78};
        for(int i:arr){
            System.out.println(i);
        } */
        
        //Java Labeled For Loop
        /*aa:
            for(int i=1; i<=3; i++){
                bb:
                    for(int j=1; j<=3; j++){
                        if(i==2 && j==2){
                            break aa;
                        }
                        System.out.println(i+" "+j);
                    }
            } */
        
        //Java Labeled For Loop with Break bb
        /*aa:
            for(int i=1; i<=3; i++){
                bb:
                    for(int j=1; j<=3; j++){
                        if(i==2 && j==2){
                            break bb;
                        }
                        System.out.println(i+" "+j);
                    }
            } */
        
        //Java Infinitive For Loop
        /*for(;;){
            System.out.println("Infinitive Loop");
        } */
    }
}
