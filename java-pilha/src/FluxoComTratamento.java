
public class FluxoComTratamento {

	public static void main(String[] args) {
	        System.out.println("Ini do main");
	       try {
	    	   metodo1();
	       } catch(MinhaExcecao ex) {
	    	   System.out.println("ERRO DE:" + ex.getMessage());
	    	  ex.printStackTrace();
	       }
	        System.out.println("Fim do main");
	    }

	private static void metodo1() throws MinhaExcecao {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() throws MinhaExcecao {
		System.out.println("Ini do metodo2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			throw new MinhaExcecao("Deu muito errado");

		}
		System.out.println("Fim do metodo2");
	}
}
