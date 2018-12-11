package Builder;

import emsamablajecomputadoras.creacional.Computador;

public abstract class ComputadorBuilder {

	
	
	protected Computador computador;
	
	public void nuevo() {
		
		computador = new Computador();
			
	}
	
	
	public abstract void BuildInstalacionOs();
	public abstract void BuildInterna();
	public abstract void BuildExterna();
	
	
	
	
	
	
	
	
	
	
	
}
