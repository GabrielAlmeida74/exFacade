public class Sobremesa extends Produto {

    private String tamanho;
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Sobremesa(String descricao, String tamanho, double preco){
        setDescricao(descricao);
        setTamanho(tamanho);
        setPreco(preco);
    }

    public String getInfo(){
        return getDescricao()+" tamanho "+getTamanho()+", R$"+getPreco();
    }

}
