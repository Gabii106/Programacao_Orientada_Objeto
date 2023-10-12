public abstract class Shape { //Não pode ser instanciada, somente pode ser usada para herança

    public abstract double area(); //È abstrato até implementar em outra classe

    public String getName(){
        return this.getClass().getSimpleName();
    }
}
