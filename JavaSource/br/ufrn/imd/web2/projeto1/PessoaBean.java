package br.ufrn.imd.web2.projeto1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.apache.commons.collections.CollectionUtils;
 

@ManagedBean(name="PessoaBean")
@ApplicationScoped
public class PessoaBean implements Serializable {
 
    private Pessoa pessoa = new Pessoa();
    private List<Pessoa> pessoaLista = new ArrayList<Pessoa>();
    private String username;
	private String password;
	private String[] discName;

    /** Creates a new instance of PessoaBean */
    public PessoaBean() {
    	
    	pessoaLista = new ArrayList<Pessoa>();
		
		Pessoa pessoa = new Pessoa();
		//Pessoas e listaDisciplina
		pessoa.setNome("Cephas Alves da Silveira Barreto");
		pessoa.setMatricula(2013023300);
		pessoa.setLogin("2013023300");
		pessoa.setSenha("teste");
		
		pessoaLista.add(pessoa);
		
		pessoa = new Pessoa();
		pessoa.setNome("Victor Vilar Raposo");
		pessoa.setMatricula(2013022967);
		pessoa.setLogin("2013022967");
		pessoa.setSenha("teste");
		
		pessoaLista.add(pessoa);
		
		pessoa = new Pessoa();
		pessoa.setNome("Ramon Santos Malaquias");
		pessoa.setMatricula(2013018258);
		pessoa.setLogin("2013018258");
		pessoa.setSenha("teste");
		pessoaLista.add(pessoa);
    }
 
    /**Getters e Setters */
    public Pessoa getPessoa() {
        return pessoa;
    }
 
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
 
    public List<Pessoa> getPessoaLista() {
        return pessoaLista;
    }
 
    public void setPessoaLista(List<Pessoa> pessoaLista) {
        this.pessoaLista = pessoaLista;
    }
    
    public void cadastrarPessoa(){
    	this.getPessoaLista().add(pessoa);
    	System.out.println("Pessoa " + pessoa.getNome() + " cadastrada!");
    	pessoa = new Pessoa();
    }	
	
    public void setListaPessoas(java.util.ArrayList listaPessoas) {
		this.pessoaLista = listaPessoas;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String doLogin() {
		String[] users = {"2013023300:teste","2013022967:teste","2013018258:teste"};
    	for (String user: users) {
    	String dbUsername = user.split(":")[0];
    	String dbPassword = user.split(":")[1];
    	
    		// Successful login
	    	if (dbUsername.equals(username) && dbPassword.equals(password)) {
	    		return "escolheAcao";
	    	}
    	}
    	
    	// Set login ERROR
    	FacesMessage msg = new FacesMessage("Login error!", "ERROR MSG");
    	msg.setSeverity(FacesMessage.SEVERITY_ERROR);
    	FacesContext.getCurrentInstance().addMessage(null, msg);
    	return "login";
    	
	}

	public String[] getDiscName() {
		return discName;
	}

	public void setDiscName(String[] discName) {
		this.discName = discName;
	}
	
	
}
