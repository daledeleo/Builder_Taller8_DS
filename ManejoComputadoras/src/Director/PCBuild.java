package Director;

public class PCBuild {

	
	private ComputadorBuilder contructorPC;
	
	
	public void establecerContructor(ComputadorBuilder cp) {
		
		
		this.contructorPC = cp;
		
	}
	
	
	public void obtenerPC{
		
		
		return contructorPC.obtenerPC();
		
		
	}
	
	
	public void construirPC() {
		
		
		contructorPC.BuildInstalacionOs();
		contructorPC.BuildInterna();
		contructorPC.BuildExterna();
		
		
	}
	
	
	
	
}
