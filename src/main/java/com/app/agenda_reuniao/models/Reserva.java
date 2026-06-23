package com.app.agenda_reuniao.models;

import java.io.Serializable;
import java.util.Objects;



import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "TB_EVENTO")
public class EventoModel implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotBlank
	private String nome;
	@NotBlank
	private String local;
	@NotBlank
	private String data;
	@NotBlank
	private String horaInicial;
	@NotBlank
	private String horaFinal;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHoraInicial() {
		return horaInicial;
	}
	public void setHoraInicial(String horaInicial) {
		this.horaInicial = horaInicial;
	}
	public String getHoraFinal() {
		return horaFinal;
	}
	public void setHoraFinal(String horaFinal) {
		this.horaFinal = horaFinal;
	}
	@Override
	public int hashCode() {
		return Objects.hash(data, horaFinal, horaInicial, id, local, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EventoModel other = (EventoModel) obj;
		return Objects.equals(data, other.data) && Objects.equals(horaFinal, other.horaFinal)
				&& Objects.equals(horaInicial, other.horaInicial) && Objects.equals(id, other.id)
				&& Objects.equals(local, other.local) && Objects.equals(nome, other.nome);
	}
	@Override
	public String toString() {
		return "EventoModel [id=" + id + ", nome=" + nome + ", local=" + local + ", data=" + data + ", horaInicial="
				+ horaInicial + ", horaFinal=" + horaFinal + "]";
	}
	
	
	
	
	
	
	

}
