
public class Produto
{
    private String Nome;
    private String Descricao;
    private Double Valor;
    private int    Quantidade;

    public String getNome()
    {
        return this.Nome;
    }

    public Boolean setNome(String Nome)
    {
        if (Nome.trim().equals(""))
            return false;
        else
        {
            if (!Nome.equals(this.Nome))
                this.Nome = Nome.trim();
            return true;
        }
    }

    public String getDescricao()
    {
        return this.Descricao;
    }

    public void setDescricao(String Descricao)
    {
        if (!Descricao.equals(Descricao))
            this.Descricao = Descricao;
    }

    public Double getValor()
    {
        return this.Valor;
    }

    public Boolean setValor(Double Valor)
    {
        if (Valor != this.Valor)
            if (Valor > 0)
            {
                this.Valor = Valor;
                return true;
            }
            else
                return false;
        else
            return true;
    }

    public int getQuantidade()
    {
        return this.Quantidade;
    }

    public Boolean setQuantidade(int Quantidade)
    {
        if (Quantidade != this.Quantidade)
            if (Quantidade > 0)
            {
                this.Quantidade = Quantidade;
                return true;
            }
            else
                return false;
        else
            return true;
    }

}
