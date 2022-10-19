public class Bebida extends Produto {

    private int Ml;

    public int getMl() {
        return Ml;
    }

    public void setMl(int Ml) {
        this.Ml = Ml;
    }
    public void setInfo(String descricao, int Ml, double preco){
        setDescricao(descricao);
        setMl(Ml);
        setPreco(preco);
    }

    public String getInfo(){
        return getDescricao()+" de "+getMl()+"ml, R$"+getPreco();
    }
}
