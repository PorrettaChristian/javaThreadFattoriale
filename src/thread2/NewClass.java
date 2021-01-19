/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author porretta.christian
 */
public class NewClass implements Runnable{
    boolean terminato = true;
    String a;
    int i=5;
    int q = 6;
    long r=1;
    long y = 1;
    public NewClass(String a) {
        this.a=a;
    }

    @Override
    public void run()  {    
        if(a=="a"){
            while(terminato){
                long d = r;
                r = i *r;
                System.out.println(i+" * "+d+" = "+r);
                i--;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(i==0){
                    this.ferma();
                }
            }
        }else{
            while(terminato){
                long da = y;
                y = q *y;
                System.out.println("        "+q+" * "+da+" = "+y);
                q--;
                try { 
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(q==0){
                    this.ferma();
                }
            }
        }
    }
    public void ferma(){
        terminato = false;
    }
}
