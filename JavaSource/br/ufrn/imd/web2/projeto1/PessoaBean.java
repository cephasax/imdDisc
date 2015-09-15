package br.ufrn.imd.web2.projeto1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
 

@ManagedBean(name="PessoaBean")
@SessionScoped
public class PessoaBean implements Serializable {
 
    private Pessoa pessoa = new Pessoa();
    private List<Pessoa> pessoaLista = new ArrayList<Pessoa>();

    /** Creates a new instance of PessoaBean */
    public PessoaBean() {
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

    
    public void receberPessoa(){
    	//this.getPessoaLista().add(pessoa);
    	System.out.println("Pessoa " + pessoa.getNome() + " cadastrada!");
    	pessoa = new Pessoa();
    }
	
    public void cadastrarPessoa(){    	
    	this.getPessoaLista().add(pessoa);
    	System.out.println("Pessoa " + pessoa.getNome() + " cadastrada!");
    	pessoa = new Pessoa();
    }
    
    public void setListaPessoas(java.util.ArrayList listaPessoas) {
		this.pessoaLista = listaPessoas;
	}
}
