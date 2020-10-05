package com.solead.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
@Table(name="tb_savedplants")
public class SavePlant {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "SAVED_SEQ", initialValue = 1, allocationSize = 1)
	private Long id;
	private String usuario_id;
	private String geracao;
	private String cpf;
	private String cep;
	private String bairro;
	private String numero;
	private String area;
	private String codigo;
	private String inversor;
	private String marcaDoModulo;
	private String numeroDeModulo;
	private String peso;
	private String potencia;
	private String potenciaDoModulo;
	private String valor;
	private String potenciaNovo;
	private String consumoEmReais;
	private String consumoEmKw;
	private String cliente;
	private String endereco;
 	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGeracao() {
		return geracao;
	}
	public void setGeracao(String geracao) {
		this.geracao = geracao;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getInversor() {
		return inversor;
	}
	public void setInversor(String inversor) {
		this.inversor = inversor;
	}
	public String getMarcaDoModulo() {
		return marcaDoModulo;
	}
	public void setMarcaDoModulo(String marcaDoModulo) {
		this.marcaDoModulo = marcaDoModulo;
	}
	public String getNumeroDeModulo() {
		return numeroDeModulo;
	}
	public void setNumeroDeModulo(String numeroDeModulo) {
		this.numeroDeModulo = numeroDeModulo;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public String getPotencia() {
		return potencia;
	}
	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	public String getPotenciaDoModulo() {
		return potenciaDoModulo;
	}
	public void setPotenciaDoModulo(String potenciaDoModulo) {
		this.potenciaDoModulo = potenciaDoModulo;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getPotenciaNovo() {
		return potenciaNovo;
	}
	public void setPotenciaNovo(String potenciaNovo) {
		this.potenciaNovo = potenciaNovo;
	}
	public String getConsumoEmReais() {
		return consumoEmReais;
	}
	public void setConsumoEmReais(String consumoEmReais) {
		this.consumoEmReais = consumoEmReais;
	}
	public String getConsumoEmKw() {
		return consumoEmKw;
	}
	public void setConsumoEmKw(String consumoEmKw) {
		this.consumoEmKw = consumoEmKw;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	private String dados;
	public String getDados() {
		return dados;
	}
	public void setDados(String dados) {
		this.dados = dados;
	}
	 
	public Long getUsuario_id() {
		return usuario_id;
	}
	public void setUsuario_id(Long usuario_id) {
		this.usuario_id = usuario_id;
	}
	
	 
	
	 }
	
		


