public class Quadrado extends Shape{
    /*@Override - Quando extendia de Retangulo
        public void setBase(double base) {
            super.setBase(base);
            super.setAltura(base); //super - chamar metodo definido na clsse base - chama a implementação da classe base
        }
        @Override
        public void setAltura(double alt) {
            super.setAltura(alt);
            super.setBase(alt);
        }
        */
    private double lado;
    @Override
    public double area() {
        return this.lado * this.lado;
    }

    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

}
