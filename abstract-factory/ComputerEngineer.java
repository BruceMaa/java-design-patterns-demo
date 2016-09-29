
public class ComputerEngineer {

    private Cpu cpu = null;

    private Mainboard mainboard = null;

    public void makeComputer(AbstractFactory af) {

        prepareHardwares(af);
    }

    private void prepareHardwares(AbstractFactory af) {

        this.cpu = af.createCpu();

        this.mainboard = af.createMainboard();

        this.cpu.calculate();
        this.mainboard.installCPU();
    }
}
