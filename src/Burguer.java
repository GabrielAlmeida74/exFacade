public class Burguer extends Produto{

    private int gramas;
    public int getGramas() {
        return gramas;
    }

    public void setGramas(int gramas) {
        this.gramas = gramas;
    }

    public void setInfo(String descricao, int gramas, double preco){
        setDescricao(descricao);
        setGramas(gramas);
        setPreco(preco);
    }

    public String getInfo(){
        return getDescricao()+" de "+getGramas()+"g, R$"+getPreco();
    }

}
