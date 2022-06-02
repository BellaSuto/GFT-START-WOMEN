package questao01;

public class TestarConta {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        //Conta Corrente
        cc.setNumero("123");
        cc.setTitular("Aria");
        cc.setSaldo(1220);
        //Conta Poupança
        cp.setNumero("145");
        cp.setTitular("Maria");
        cp.setSaldo(1220);

        System.out.println("Rendimento mensal de " + cc.getTitular()+ " é: " +cc.Rendimento());

        System.out.println("Rendimento mensal de " + cp.getTitular()+ " é: " +cp.Rendimento());
    }

}
