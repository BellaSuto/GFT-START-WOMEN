package questao01;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String numero, String titular, int saldo) {
        super(numero, titular, saldo);
    }

    public ContaPoupanca() {

    }

    public  double Rendimento(){
        return  saldo * 0.05;
    }
}
