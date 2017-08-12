package controle;

public class MaterialDeConstrucao {
	
	public boolean comprarPrego(String cod, double valor){
		return ((cod=="AAA111"|| cod == "BB222")&& valor<= 5);
//		if((cod=="AAA111"|| cod == "BB222")&& valor<= 5){
//			return true;
//		}else{
//			return false;
//						
//		}
		
	}
	public boolean comprarCimento( double valor){
	return (valor <= 25.00);
//		if (valor <= 25.00){
//			return true;
//		}else{
//			return false;
					
	//	}
				
	}
	
	//20 dias
	
	

}
