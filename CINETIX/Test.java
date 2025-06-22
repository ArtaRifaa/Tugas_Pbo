/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CINETIX;

/**
 *
 * @author Arta
 */
public class Test{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       

    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            RegistFrame frame = new RegistFrame();
            frame.setTitle("CINETIX");
            frame.setSize(600, 500);
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
            frame.setVisible(true);
        }
    });
}

    
}
