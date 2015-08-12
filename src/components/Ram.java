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
public class Ram extends Component {
    private int size;

    public Ram() {
        size=4096;
        name="RAM";
    }
    
    public int getSize(){
        return this.size;
    }
    
    public String read(){
        return "data for scan";
    }
}
