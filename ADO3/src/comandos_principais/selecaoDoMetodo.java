package comandos_principais;
import basesMetodosOrdenacao.OrdenacaoBase;
import metodosDeOrdenacao.Selecao;
import metodosDeOrdenacao.Insercao;
import metodosDeOrdenacao.Bolha;
import ado3.*;


public class selecaoDoMetodo {
    static OrdenacaoBase metodo;
    public static OrdenacaoBase escolha(int op_escolhida){
        switch(op_escolhida){
            case 1:
                    metodo = new Bolha();
                    break;
                    
                case 2:
                    metodo = new Selecao();
                    break;
                    
                case 3:
                    metodo = new Insercao();
                    break;
            default:
                System.out.println("Saindo do programa..");
                System.exit(0);
        }
        return metodo;
    }
    
}

