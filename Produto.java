

public class Produto {              //nosso produto
    private int codigo = 0;
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private int estoqueMinimo;


public Produto(String nome, double preco, int estoqueMinimo, int quantidadeEstoque){    //construtor do produto
    if(preco < 0){
        System.out.println("Preço não pode ser negativo!");         //caso o preço seja negativo
        this.preco = 0;
    } else {
        this.preco = preco;
    }
codigo ++;
this.nome = nome;
this.estoqueMinimo = estoqueMinimo;
this.codigo = codigo + 1;               //o código é feito com que cada produto adicionado tenha o código do antigo + 1, assim vai subindo, 1, 2, 3 , etc.
this.quantidadeEstoque = quantidadeEstoque;
}

public void vender(int quantidadeVender){

    if(this.quantidadeEstoque - quantidadeVender > 0){          //para vender nosso produto
this.quantidadeEstoque -= quantidadeVender;
    } else {
        System.out.println("Não há produto suficiente para vender");
    }
}

public void repor(int quantidadeRepor){             //para repor o estoque
    this.quantidadeEstoque += quantidadeRepor;

}

public void aplicarDesconto(int percentual){
this.preco -= this.preco * percentual / 100;            //aplica o desconto no preço
}

private boolean verificarEstoquebaixo(){
    if(this.quantidadeEstoque < this.estoqueMinimo){            //verificar caso estejamos com estoque baixo
        return true;
    }else{
        return false;
    }
}
}