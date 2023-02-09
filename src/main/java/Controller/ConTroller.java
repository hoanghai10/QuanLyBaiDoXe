/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Bean.DanhMuc;
import com.mycompany.qlbaiguixe.NhanXeJPanel;
import com.mycompany.qlbaiguixe.TraXeJPanel;
import com.mycompany.qlbaiguixe.DKVeThangJPanel;
import com.mycompany.qlbaiguixe.TraCuuJPanel;
import com.mycompany.qlbaiguixe.ThongKeJPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.RootPaneUI;
import org.w3c.dom.Node;

/**
 *
 * @author hthkt
 */
public class ConTroller {
    private JPanel root;
    private String kindSelect;
    private List<DanhMuc> listItem = null;
    
    public ConTroller(JPanel jpnRoot){
        this.root = jpnRoot;
    }
    public void setView(JPanel jpnItem, JLabel jlbItem){
        kindSelect = "NhanXe";
        
        jpnItem.setBackground(new Color(198,226,255));
        jlbItem.setBackground(new Color(198,226,255));
        
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new NhanXeJPanel());
        root.validate();
        root.repaint();
    }
    
    
    public void setEvent(List<DanhMuc> listItem ){
        this.listItem = listItem ;
        
        for(DanhMuc item : listItem){
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }
    class LabelEvent implements MouseListener{
        private JPanel node ;
        private String kind ;
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "TraCuu":
                    node = new TraCuuJPanel();
                    break;
                case "NhanXe":
                    node = new NhanXeJPanel();
                    break;
                case "TraXe":
                    node =new TraXeJPanel();
                    break;
                case "ThongKe":
                {
                    try {
                        node = new ThongKeJPanel();
                    } catch (SQLException ex) {
                        Logger.getLogger(ConTroller.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                    break;

                case "DKVeThang":
                    node = new DKVeThangJPanel();
                    break;
                default:
                {
                    try {
                        node = new ThongKeJPanel();
                    } catch (SQLException ex) {
                        Logger.getLogger(ConTroller.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                    break;

            }
            
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(node);
        root.validate();
        root.repaint();
        setChangeBackground(kind);
            
        }
        @Override
        public void mousePressed(MouseEvent e) {
            kindSelect = kind;
            jpnItem.setBackground(new Color(198,226,255));
            jlbItem.setBackground(new Color(198,226,255));
        
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(198,226,255));
            jlbItem.setBackground(new Color(198,226,255));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if(!kindSelect.equalsIgnoreCase(kind)){
                jpnItem.setBackground(new Color(255,255,255));
                jlbItem.setBackground(new Color(255,255,255));
            }
        }
        private void setChangeBackground(String kind){
            for(DanhMuc item : listItem){
                if(item.getKind().equalsIgnoreCase(kind)){
                    item.getJlb().setBackground(new Color(198,226,255));
                }
                else{
                    item.getJpn().setBackground(new Color(255,255,255));
                    item.getJpn().setBackground(new Color(255,255,255));
                }
            }
        }
        
    }
}
