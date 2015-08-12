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
public abstract class Component {
    protected String name;
    protected boolean powerOn;
    
    
    public void turnOn(){
        powerOn=true;
        System.out.println(name + " is On");
    }
    
    public void turnOff(){
        powerOn=false;
        System.out.println(name + " is Off");
    }
    
}
