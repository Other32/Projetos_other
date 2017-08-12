package controle;

public class Start {

	public static void main(String[] args) {
		
		MaterialDeConstrucao mc = new MaterialDeConstrucao();
		
		boolean resultado =mc.comprarPrego("AAA111" , 4.5);
		boolean resultadoCimento =mc.comprarCimento( 23.00);
		
		if (resultado){
			System.out.println("Comprar");
			
		}else{
			System.out.println("Procure Outra loja");
		}
		if(resultadoCimento){
			System.out.println("Comprar Cimento");
		}else{
			System.out.println("Cimento Muinto caro");
		}

	}

}
