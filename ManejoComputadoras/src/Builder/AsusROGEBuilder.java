package Builder;

import emsamablajecomputadoras.creacional.Mainboard;
import emsamablajecomputadoras.creacional.SistemaOperativo;

public class AsusROGEBuilder extends ComputadorBuilder{

	@Override
	public void BuildInstalacionOs() {
		computador.setOs(new SistemaOperativo("Windows", 64,"10 PRO") );
		
	}

	@Override
	public void BuildInterna() {
		
		computador.setRam(32);
		computador.setTipoRam("ddr4");
		computador.setAlmacenamiento(1000);
		computador.setTipoAlmacenamiento("HDD");
		computador.setPlaca(new Mainboard("Strix", "x99"));
		
		
	}

	
	@Override
	public void BuildExterna() {
		
		computador.setMarca("AZUS");
		computador.setModelo("ROG");
	}

}
