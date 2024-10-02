package edu.tekwill.academy.computer;

import edu.tekwill.academy.computer.components.HardDrive;
import edu.tekwill.academy.computer.components.Motherboard;
import edu.tekwill.academy.computer.components.Processor;
import edu.tekwill.academy.computer.peripherals.Keyboard;
import edu.tekwill.academy.computer.peripherals.Monitor;
import edu.tekwill.academy.computer.peripherals.Mouse;

public class Computer {
    public HardDrive hardDrive ;
    public Motherboard motherboard ;
    public Processor processor ;
    public Keyboard keyboard ;
    public Monitor monitor ;
    public Mouse mouse ;

   public Computer(String hardDrive,String motherboard,String processor,String keyboard,String monitor,String mouse)
    {
        this.hardDrive = new HardDrive(hardDrive);
        this.motherboard = new Motherboard(motherboard);
        this.processor = new Processor(processor);
        this.keyboard = new Keyboard(keyboard);
        this.monitor = new Monitor(monitor);
        this.mouse = new Mouse(mouse);

    }
}
