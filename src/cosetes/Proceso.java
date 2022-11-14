package cosetes;

public class Proceso implements Runnable{
	
	Thread t;
	String tipo;
	
	public Proceso() {
		t = new Thread(this,"Proceso");
		t.start();
	}
	
	public Proceso(String tipoC) throws InterruptedException {
		this.tipo = tipoC;
		t = new Thread(this,"Proceso");
		t.start();
		if (tipo.equals("jamon")) {
			Thread.sleep(5000);
		}else if(tipo.equals("pollo")) {
			Thread.sleep(6000);
		}else if(tipo.equals("bacalao")) {
			Thread.sleep(7000);
		}else if(tipo.equals("queso")) {
			Thread.sleep(8000);
		}System.out.println("Se ha producido una croqueta de "+tipo);
		
	} 

	@Override
	public void run() {
		
	}
	
}
