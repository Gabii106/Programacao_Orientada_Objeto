public class Interruptor {

    Dispositivo dispositivo = new Dispositivo() {
        @Override
        public void ligar() {
            dispositivo.ligar();
        }

        @Override
        public void desligar() {
            dispositivo.desligar();
        }
    };
}
