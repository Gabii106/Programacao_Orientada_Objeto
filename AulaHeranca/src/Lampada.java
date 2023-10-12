public class Lampada implements Dispositivo, EquipamentoEletrico{
    @Override
    public void ligar() {
        System.out.println("Lampada ligou");
    }

    @Override
    public void desligar() {
        System.out.println("Lampada desligou");
    }

    @Override
    public void mostrarPotencia() {
        System.out.println("20w");
    }
}
