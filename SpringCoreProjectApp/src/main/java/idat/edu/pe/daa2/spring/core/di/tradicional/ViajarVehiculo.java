package idat.edu.pe.daa2.spring.core.di.tradicional;

public class ViajarVehiculo {

	VehiculoI vehiculo;

	public ViajarVehiculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VehiculoI getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(VehiculoI vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	
	public void empezarAcelerar()
	{
		
		this.vehiculo.acelerar();
	}	
	
}
