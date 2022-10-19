public class Combo {

    public int getCombo() {
        return combo;
    }

    public void setCombo(int combo) {
        this.combo = combo;
    }

    private int combo;
    Burguer burguer = new Burguer();
    Sobremesa sobremesa = new Sobremesa();
    Bebida bebida = new Bebida();
    public void CriarCombo(int combo) {
        switch(combo) {
            case 1:
                burguer.setDescricao("Hamburguer de Frango");
                sobremesa.setDescricao("Sunday de Chocolate");
                bebida.setDescricao("Refrigerante ou Suco");
                break;
            case 2:
                burguer.setDescricao("Hamburguer de Salsicha");
                sobremesa.setDescricao("Cookie");
                bebida.setDescricao("Milkshake");
                break;
            case 3:
                burguer.setDescricao("Hamburguer de Feijão");
                sobremesa.setDescricao("Açai");
                bebida.setDescricao("Refrigerante ou Suco");
                break;
            default:
                System.out.println("Número inválido");
                break;
        }
    }

    public void MostrarCombo(){
        System.out.println(burguer.getDescricao() + ", " + sobremesa.getDescricao() + ", e um " + bebida.getDescricao());
    }


}
