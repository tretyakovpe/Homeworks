/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Computer;

/**
 *
 * @author pavel.tretyakov
 */
public class Homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computer pc = new Computer();
        pc.turnOn();
        pc.scanViruses();
        pc.getRamSize();
        pc.getHddSize();
        pc.turnOff();
    }
    
    
}
