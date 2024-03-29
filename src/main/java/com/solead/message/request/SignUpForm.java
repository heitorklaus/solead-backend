package com.solead.message.request;

import java.util.Set;

import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class SignUpForm {
    @NotBlank
    @Size(min = 3, max = 50)
    private String name;

    @NotBlank
    @Size(min = 3, max = 50)
    private String username;
    
    @NotBlank
    @Size(min = 3, max = 50)
    private String company;

    public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	@NotBlank
    @Size(max = 60)
    @Email
    private String email;
    
    private Set<String> role;
    
    @NotBlank
    @Size(min = 6, max = 40)
    private String password;
    
    
    @Size(min=6, max = 200)
    private String foto;
    
    private byte[] avatar;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    public Set<String> getRole() {
    	return this.role;
    }
    
    public void setRole(Set<String> role) {
    	this.role = role;
    }

    public byte[] getAvatar() {
		return avatar;
	}
	public void setAvatar(byte[] avatar) {
		this.avatar = avatar;
	}
}