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
public class Cpu extends Component{

    public Cpu() {
        name="Intel Celeron";
    }
    
    public void scanForVirus(Component device, String data){
        System.out.println("Scanning "+device.name+": "+data);
    }
    
}
