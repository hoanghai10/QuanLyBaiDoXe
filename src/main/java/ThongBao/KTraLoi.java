/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThongBao;

import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author hthkt
 */
public class KTraLoi {
    public static void KTraLoi(JTextField field,StringBuilder sb,String errorMessage){
        if(field.getText().equals("")){
            sb.append(errorMessage).append("\n");
            field.requestFocus();
        }
        else{
            
        }
    }
    public static void KTraLoiEmpty(JPasswordField field,StringBuilder sb,String errorMessage){
        String pass = new String(field.getPassword());
        if(pass.equals("")){
            sb.append(errorMessage).append("\n");
            field.requestFocus();
        }
        else{
            
        }
    }
    public static void KTraLoi1(JComboBox field,StringBuilder sb,String errorMessage){
        if(field.equals("")){
            sb.append(errorMessage).append("\n");
            field.requestFocus();
        }
        else{
            
        }
    }
}
