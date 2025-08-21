package parte2;

public class Empleado {
	
	private String nombre;
	private Integer sueldo;
	private Integer legajo;

	public Empleado() {
		super();
	}

	public Empleado(String nombre, Integer sueldo) throws StringException,EnteroPositivoException {
		super();
		if (nombre.isEmpty()) {
			throw new StringException(0);
		} else if (nombre.length() < 4) {
			throw new StringException(1);
		} else {
		this.nombre = nombre;
		}
		if (sueldo == null) {
			throw new EnteroPositivoException(0);
		} else if (sueldo.intValue() <= 0) {
			throw new EnteroPositivoException(1);
		} else {
			this.sueldo = sueldo;
		}
		
	}

	public Empleado(String nombre) throws StringException {
		super();
		if (nombre.isEmpty()) {
			throw new StringException(0);
		} else if (nombre.length() < 4) {
			throw new StringException(1);
		} else {
		this.nombre = nombre;
		}
	}

	public Empleado(Integer sueldo) throws EnteroPositivoException {
		super();
		if (sueldo == null) {
			throw new EnteroPositivoException(0);
		} else if (sueldo.intValue() <= 0) {
			throw new EnteroPositivoException(1);
		} else {
			this.sueldo = sueldo;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws StringException  {
		if (nombre.isEmpty()) {
			throw new StringException(0);
		} else if (nombre.length() < 4) {
			throw new StringException(1);
		} else {
		this.nombre = nombre;
		}
	}

	public Integer getSueldo() {
		return sueldo;
	}

	public void setSueldo(Integer sueldo) throws EnteroPositivoException {
		if (sueldo == null) {
			throw new EnteroPositivoException(0);
		} else if (sueldo.intValue() < 0) {
			throw new EnteroPositivoException(1);
		} else {
			this.sueldo = sueldo;
		}
	}

	public String getSueldoString() {
		return "$" + sueldo;
	}
	
	public void setLegajo(Integer legajo) throws EnteroPositivoException{
		if (legajo == null) {
			throw new EnteroPositivoException(0);
		} else if (legajo.intValue() < 0) {
			throw new EnteroPositivoException(1);
		} else {
			this.legajo = legajo;
		}
	}

	@Override
	public String toString() {
		return this.getNombre() + " - " + this.getSueldoString();
	}
}
