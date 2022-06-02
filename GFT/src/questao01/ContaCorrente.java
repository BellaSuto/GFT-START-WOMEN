package questao01;

public class ContaCorrente extends Conta {

    public ContaCorrente(String numero, String titular, int saldo) {
        super(numero, titular, saldo);
    }

    public ContaCorrente() {
        super();
    }

    public  double Rendimento(){
       return  saldo * 0.03;
    }
}



