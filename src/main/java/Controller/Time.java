/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author hthkt
 */
public class Time extends Thread{
    private JLabel jlb;
    public Time (JLabel jlb){
        this.jlb = jlb;
    }
    @Override
    public void run(){
        SimpleDateFormat sp = new SimpleDateFormat("hh:mm:ss aa");
        while (true) {            
            Date now = new Date();
            String st = sp.format(now);
            jlb.setText(st);
            
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ex){
            
        }
    }
  }
}
