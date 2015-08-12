/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Computer;

import components.*;

/**
 *
 * @author pavel.tretyakov
 */
    public class Computer{

        protected Cpu cpu;
        protected Hdd hdd;
        protected Cdrom cdrom;
        protected Ram ram;
        protected boolean powerOn;
        
        public Computer() {
            this.cpu = new Cpu();
            this.hdd = new Hdd();
            this.cdrom = new Cdrom(false);
            this.ram = new Ram();
            this.powerOn = false;
        }
        
        
        public void turnOn(){
            powerOn=true;
            cpu.turnOn();
            ram.turnOn();
            hdd.turnOn();
            cdrom.turnOn();
            
            System.out.println("System is ready");
        }
        
        public void turnOff(){
            System.out.println("System is shutting down");

            powerOn=false;
            cdrom.turnOff();
            hdd.turnOff();
            ram.turnOff();
            cpu.turnOff();
        }
        
        public void scanViruses(){
            if(this.powerOn!=false)
            {
                String dataForScan = ram.read();
                cpu.scanForVirus(ram, dataForScan);
                
                dataForScan = hdd.read();
                cpu.scanForVirus(hdd, dataForScan);
                
                if(cdrom.isDiskInserted()==true){
                    dataForScan = cdrom.read();
                    cpu.scanForVirus(cdrom, dataForScan);
                }
                else
                {
                    System.out.println("No disk in CDROM");
                }
                
            }
            else
            {
                System.out.println("Before scan, turn on your PC");
            }
        }
        
        public void getRamSize(){
            System.out.println("Total RAM: "+this.ram.getSize());
        }
        
        public void getHddSize(){
            System.out.println("Hard Disk Drive installed");
            System.out.println("Free space: "+this.hdd.getFreeSpace()+" of "+this.hdd.getSize());
        }
    }