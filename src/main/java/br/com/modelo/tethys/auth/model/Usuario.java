package br.com.modelo.tethys.auth.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Paulo Roberto
 */
@Entity
@Table(name = "tb_usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 5110990345399379981L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "ci_usuario")
	private Long id;
	@Column(name = "nm_usuario")
	private String usuario;
	@Column(name = "nm_login")
	private String login;
	@Column(name = "nm_senha")
	private String senha;
	@Column(name = "ds_email")
	private String email;
	@Column(name = "nm_cpf")
	private String cpf;
	@Column(name = "dt_nascimento")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtNascimento;
	@Column(name = "fl_sexo")
	private String flSexo;
	@Column(name = "fl_atualizousenha")
	private Boolean flAtualizousenha;
	@Column(name = "dt_criacao")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtCriacao;
	@Column(name = "fl_senha_corrigida")
	private Boolean flSenhaCorrigida;
	@Column(name = "fl_ativo")
	private Boolean flAtivo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public String getFlSexo() {
		return flSexo;
	}
	public void setFlSexo(String flSexo) {
		this.flSexo = flSexo;
	}
	public Boolean getFlAtualizousenha() {
		return flAtualizousenha;
	}
	public void setFlAtualizousenha(Boolean flAtualizousenha) {
		this.flAtualizousenha = flAtualizousenha;
	}
	public Date getDtCriacao() {
		return dtCriacao;
	}
	public void setDtCriacao(Date dtCriacao) {
		this.dtCriacao = dtCriacao;
	}
	public Boolean getFlSenhaCorrigida() {
		return flSenhaCorrigida;
	}
	public void setFlSenhaCorrigida(Boolean flSenhaCorrigida) {
		this.flSenhaCorrigida = flSenhaCorrigida;
	}
	public Boolean getFlAtivo() {
		return flAtivo;
	}
	public void setFlAtivo(Boolean flAtivo) {
		this.flAtivo = flAtivo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}

