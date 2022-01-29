
public class TesteContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Conta contacc=new ContaCorrente(111,1111);
			contacc.deposita(1000);
			Conta contacp=new ContaPoupanca(222,2222);
			contacp.deposita(500);
			System.out.println(contacc.getSaldo());
	}

}
