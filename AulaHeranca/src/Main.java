public class Main {
    public static void main(String[] args) throws InterruptedException{
        Object o = new Base(); //Classe é Object e o objeto é Base - Funciona pq Base é um tipo de Object

        //o.equals(null); //Base recebe esses comportamentos de Object
        //o.getClass();
        //o.hashCode();
        //o.notify();
        //o.toString();
        //o.wait();
        //o.wait(200);
        //if(o instanceof Base){
        //    ((Base)o).acao01();;
        //}

        //Não sobrescrever metódos na classe derivada de forma que muda o comportamento
        Retangulo rec = new Retangulo();
        rec.setBase(20);
        rec.setAltura(10);
        processar(rec);

        Quadrado quad = new Quadrado();
        quad.setLado(20);
        processar(quad);

        //processar(new Circulo());

        //Interruptor interruptor1 = new Interruptor(new Lampada());

    }

    public static void processar(Shape forma){

        System.out.println("Area do "+forma.getName()+": "+forma.area());
    }
}