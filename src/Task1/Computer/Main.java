import edu.tekwill.academy.computer.Computer;


public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Samsung HDD 200Gb","Gigabyte A123","Intel i7","Logitech B321","Dell 27 inch","Razor Naga");
        //Task1
        System.out.println("Calculatorul are urmatoarele parametre");
        System.out.println("Componente : ");
        System.out.println("HardDrive : "+computer.hardDrive.name);
        System.out.println("Motherboard : "+computer.motherboard.name);
        System.out.println("Processor : "+computer.processor.name);
        System.out.println("Periferice : ");
        System.out.println("Keyboard : "+computer.keyboard.name);
        System.out.println("Monitor : "+computer.monitor.name);
        System.out.println("Mouse : "+computer.mouse.name);
    }
}