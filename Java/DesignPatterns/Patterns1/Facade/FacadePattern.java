package Patterns.Facade;

public class FacadePattern {

  public void runFacadePattern() {
    CPU cpu = new CPU();
    Memory memory = new Memory();
    HardDrive hd = new HardDrive();

    ComputerFacade computerFacade = new ComputerFacade(cpu, memory, hd);
    computerFacade.start();
  }

}
