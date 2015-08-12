/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

/**
 *
 * @author pavel.tretyakov
 */
public class Hdd extends Component{
    private int size;
    private int freeSpace;
    private boolean bootable;

    public Hdd() {
        this.size = 150;
        this.freeSpace = 52;
        this.bootable = bootable;
        name="Seagate Barracuda "+size+"Gb";
        bootable=true;
    }
    
    public int getFreeSpace(){
        return this.freeSpace;
    }
    
    public int getSize(){
        return this.size;
    }

    public String read(){
        return "data for scan";
    }

}
