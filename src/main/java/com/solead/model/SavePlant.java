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
 	private String dados;
	public String getDados() {
		return dados;
	}
	public void setDados(String dados) {
		this.dados = dados;
	}
	
	 
	
	 }
	
		


