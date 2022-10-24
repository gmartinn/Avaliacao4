package br.com.voe.mga.modelo;

public class Aeronave {
	private Long id;
	private String fabricante;
	private String modelo;
	private String codigo;
	
	public Aeronave() {
		
	}
	
	public Aeronave(String fabricante, String modelo, String codigo) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.codigo = codigo;
	}
	
	
	
	public Long getId() {
		return id;
	}

	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
}
