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
public class Cdrom extends Component {
    private boolean diskIn;

    public Cdrom(boolean diskIn) {
        name="Generic CD-ROM";
        this.diskIn = diskIn;
    }
    
    public void insertDisk(){
        this.diskIn=true;
    }
    
    public void ejectDisk(){
        this.diskIn=false;
    }

    public boolean isDiskInserted(){
        return diskIn;
    }
    
    public String read(){
        return "data for scan";
    }
    
}
