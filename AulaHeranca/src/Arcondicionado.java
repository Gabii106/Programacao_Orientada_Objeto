public class Arcondicionado implements Dispositivo{

    @Override
    public void ligar() {
        System.out.println("Arcondicionado ligou");
    }

    @Override
    public void desligar() {
        System.out.println("Arcondicionado desligou");
    }
}
