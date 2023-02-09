/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.text.SimpleDateFormat;
import javax.swing.JLabel;

/**
 *
 * @author hthkt
 */
public class Date extends Thread{
    private JLabel jlb;
    public Date (JLabel jlb){
        this.jlb = jlb;
    }
    @Override
    public void run(){
        SimpleDateFormat sp = new SimpleDateFormat("yyy-MM-dd");
        while (true) {            
            java.util.Date now = new java.util.Date();
            String st = sp.format(now);
            jlb.setText(st);
            
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ex){
            
        }
    }
  }
    
}
