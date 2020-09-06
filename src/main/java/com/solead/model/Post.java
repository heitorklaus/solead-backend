package com.solead.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
//import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="tb_posts")
public class Post implements Serializable{

	/**
	 * Serial UID
	 */
	 
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
	 
	@SequenceGenerator(name = "id_Sequence", sequenceName = "POST_SEQ", initialValue = 1, allocationSize = 1)
	 
	private Long id;
	private String titulo;
	private String descricao;
	
	 
	 

	 

	private byte[] img1;
	private byte[] img2;
	private byte[] img3;
	private byte[] img4;
	private byte[] img5;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public byte[] getImg1() {
		return img1;
	}
	public void setImg1(byte[] img1) {
		this.img1 = img1;
	}
	public byte[] getImg2() {
		return img2;
	}
	public void setImg2(byte[] img2) {
		this.img2 = img2;
	}
	public byte[] getImg3() {
		return img3;
	}
	public void setImg3(byte[] img3) {
		this.img3 = img3;
	}
	public byte[] getImg4() {
		return img4;
	}
	public void setImg4(byte[] img4) {
		this.img4 = img4;
	}
	public byte[] getImg5() {
		return img5;
	}
	public void setImg5(byte[] img5) {
		this.img5 = img5;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public String getData_hora() {
		return data_hora;
	}
	
	public void setData_hora(String data_hora) {
		
        Date date = Calendar.getInstance().getTime();

		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String today = formatter.format(date);
        
        data_hora = today;
		
		this.data_hora = data_hora;
	}
	public int getStatus_post() {
		return status_post;
	}
	public void setStatus_post(int status_post) {
		this.status_post = status_post;
	}
 
	private int likes;
	private String data_hora;
	private int status_post;
	
    @OneToOne()
    @JoinColumn(name="id_usuario")
	private  User usuario;

	public User getUsuario() {
		return usuario;
	}
	public void setUsuario(User usuario) {
		this.usuario = usuario;
	}
	
	
	 

	
	
}