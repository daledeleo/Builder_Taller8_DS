package Builder;

import emsamablajecomputadoras.creacional.Mainboard;
import emsamablajecomputadoras.creacional.SistemaOperativo;

public class AsusZenbookBuilder extends ComputadorBuilder{

	@Override
	public void BuildInstalacionOs() {
		computador.setOs(new SistemaOperativo("Windows", 64,"10 HOME") );
		
	}

	@Override
	public void BuildInterna() {
		
		computador.setRam(16);
		computador.setTipoRam("ddr3");
		computador.setAlmacenamiento(500);
		computador.setTipoAlmacenamiento("SSD");
		computador.setPlaca(new Mainboard("Prime", "Z370"));
		
		
	}

	
	@Override
	public void BuildExterna() {
		
		computador.setMarca("AZUS");
		computador.setModelo("Zenbook");
	}

}
