package br.ufrn.imd.web2.projeto1;

import java.util.ArrayList;
import java.util.Arrays;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="megazord")
@ApplicationScoped
public class MegazordBean{
	
	ArrayList<Disciplina> listaDisciplinas;
	private String[] discName;
	
	public MegazordBean(){
		listaDisciplinas = new ArrayList<Disciplina>();
				
		//Disciplinas e listaDisciplina
			
		Disciplina disciplina = new Disciplina();
		disciplina.setCodigo("IMD0510");
		disciplina.setNome("ACESSIBILIDADE DIGITAL");
		disciplina.setCargaHoraria(45);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("MAT0309");
		disciplina.setNome("ALGEBRA LINEAR PARA COMPUTACAO");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DAN0007");
		disciplina.setNome("ANTROPOLOGIA AFRO-BRASILEIRA");
		disciplina.setCargaHoraria(45);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0519");
		disciplina.setNome("APRENDIZAGEM BASEADA EM PROJETOS");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0514");
		disciplina.setNome("ARQUITETURA DE SOFTWARE");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0332");
		disciplina.setNome("ARQUITETURAS AVANCADAS DE COMPUTADORES");
		disciplina.setCargaHoraria(45);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0512");
		disciplina.setNome("AVALIACAO DA INTERACAO HUMANO-COMPUTADOR");
		disciplina.setCargaHoraria(45);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0541");
		disciplina.setNome("BANCO DE DADOS");
		disciplina.setCargaHoraria(90);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0401");
		disciplina.setNome("BANCO DE DADOS");
		disciplina.setCargaHoraria(45);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0501");
		disciplina.setNome("BOAS PRATICAS DE PROGRAMACAO");
		disciplina.setCargaHoraria(30);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0024");
		disciplina.setNome("CALCULO DIFERENCIAL E INTEGRAL I");
		disciplina.setCargaHoraria(90);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0404");
		disciplina.setNome("CALCULO NUMERICO PARA CIENCIA DA COMPUTACAO");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0320");
		disciplina.setNome("CIRCUITOS ELETRONICOS");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0011");
		disciplina.setNome("CIRCUITOS LOGICOS");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0419");
		disciplina.setNome("COMPUTACAO EM NUVEM");
		disciplina.setCargaHoraria(45);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0451");
		disciplina.setNome("COMPUTACAO GRAFICA I");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DAN0012");
		disciplina.setNome("CULTURA E MEIO AMBIENTE");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0524");
		disciplina.setNome("DESENVOLVIMENTO DE SISTEMAS PARA DISPOSITIVOS MOVEIS");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0404");
		disciplina.setNome("DESENVOLVIMENTO DE SISTEMAS WEB I");
		disciplina.setCargaHoraria(30);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0409");
		disciplina.setNome("DESENVOLVIMENTO DE SISTEMAS WEB II");
		disciplina.setCargaHoraria(30);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0331");
		disciplina.setNome("DESENVOLVIMENTO EM PLATAFORMAS EMBARCADAS");
		disciplina.setCargaHoraria(30);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0413");
		disciplina.setNome("DESENVOLVIMENTO PARA AMBIENTE DESKTOP");
		disciplina.setCargaHoraria(30);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0509");
		disciplina.setNome("DESENVOLVIMENTO PARA DISPOSITIVOS MOVEIS");
		disciplina.setCargaHoraria(30);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0505");
		disciplina.setNome("DESIGN DA INTERACAO HUMANO-COMPUTADOR");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0423");
		disciplina.setNome("DESIGN DE SOFTWARE I");
		disciplina.setCargaHoraria(90);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0407");
		disciplina.setNome("DESIGN DE SOFTWARE II");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0520");
		disciplina.setNome("DESIGN INSTRUCIONAL PARA TI");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DAN0024");
		disciplina.setNome("DIREITOS HUMANOS, DIVERSIDADE CULTURAL E RELACOES ETNICO-RACIAIS");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0524");
		disciplina.setNome("EDUCACAO A DISTANCIA");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0513");
		disciplina.setNome("EMPREENDEDORISMO");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0548");
		disciplina.setNome("ENGENHARIA DE LINGUAGENS");
		disciplina.setCargaHoraria(40);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("EST0323");
		disciplina.setNome("ESTATISTICA APLICADA A ENGENHARIA I");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0029");
		disciplina.setNome("ESTRUTURA DE DADOS BASICAS I");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0039");
		disciplina.setNome("ESTRUTURAS DE DADOS BASICAS II");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0340");
		disciplina.setNome("FORMACAO HUMANISTICA EM COMPUTACAO");
		disciplina.setCargaHoraria(30);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0521");
		disciplina.setNome("FUNDAMENTOS DE JOGOS DIGITAIS");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0405");
		disciplina.setNome("FUNDAMENTOS DE SISTEMAS DE INFORMACAO");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0028");
		disciplina.setNome("FUNDAMENTOS MATEMATICOS DA COMPUTACAO I");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0038");
		disciplina.setNome("FUNDAMENTOS MATEMATICOS DA COMPUTACAO II");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0601");
		disciplina.setNome("FUNDAMENTOS MATEMATICOS DA COMPUTACAO III");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0517");
		disciplina.setNome("FUNDAMENTOS PEDAGOGICOS PARA A INFORMATICA EDUCACIONAL I");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0518");
		disciplina.setNome("FUNDAMENTOS PEDAGOGICOS PARA A INFORMATICA EDUCACIONAL II");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0517");
		disciplina.setNome("GERENCIA DE CONFIGURACAO E MUDANCAS");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0421");
		disciplina.setNome("GESTAO DA MUDANCA ORGANIZACIONAL");
		disciplina.setCargaHoraria(45);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0415");
		disciplina.setNome("GESTAO DE INFRAESTRUTURA DE TI");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0417");
		disciplina.setNome("GESTAO DE PROJETOS DE SOFTWARE");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0549");
		disciplina.setNome("GRAFOS");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("LET0508");
		disciplina.setNome("HISTORIA E CULTURA AFRO-BRASILEIRA E INDIGENA");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("HIS0037");
		disciplina.setNome("HISTORIA INDIGENA NO BRASIL");
		disciplina.setCargaHoraria(30);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0309");
		disciplina.setNome("INSTRUMENTACAO ELETROELETRONICA");
		disciplina.setCargaHoraria(30);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0511");
		disciplina.setNome("INTELIGENCIA ARTIFICIAL APLICADA À EDUCACAO");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0443");
		disciplina.setNome("INTERACAO HUMANO-COMPUTADOR");
		disciplina.setCargaHoraria(45);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0411");
		disciplina.setNome("INTRODUCAO À GOVERNANCA E GESTAO DE TI");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0041");
		disciplina.setNome("INTRODUCAO A ORGANIZACAO E ARQUITETURA DE COMPUTADORES");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0325");
		disciplina.setNome("INTRODUCAO A SISTEMAS DE CONTROLE");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0042");
		disciplina.setNome("INTRODUCAO A SISTEMAS OPERACIONAIS");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0412");
		disciplina.setNome("INTRODUCAO AO TESTE DE SOFTWARE");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0012");
		disciplina.setNome("INTRODUCAO ÀS TECNICAS DE PROGRAMACAO");
		disciplina.setCargaHoraria(90);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0522");
		disciplina.setNome("JOGOS DIGITAIS COMO FERRAMENTA PEDAGOGICA");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0503");
		disciplina.setNome("LEVANTAMENTO E MODELAGEM DE REQUISITOS");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("FPE0087");
		disciplina.setNome("LINGUA BRASILEIRA DE SINAIS");
		disciplina.setCargaHoraria(45);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0030");
		disciplina.setNome("LINGUAGEM DE PROGRAMACAO I");
		disciplina.setCargaHoraria(0);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0040");
		disciplina.setNome("LINGUAGEM DE PROGRAMACAO II");
		disciplina.setCargaHoraria(0);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0437");
		disciplina.setNome("LINGUAGENS DE PROGRAMACAO: CONCEITOS E PARADIGMAS");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0606");
		disciplina.setNome("LINGUAGENS FORMAIS E AUTOMATOS");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0505");
		disciplina.setNome("LOGICA APLICADA A ENGENHARIA DE SOFTWARE");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0610");
		disciplina.setNome("LOGICA COMPUTACIONAL");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0415");
		disciplina.setNome("LOGICAS NAO-CLASSICAS");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0515");
		disciplina.setNome("MANUTENCAO DE SOFTWARE");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("MAT0312");
		disciplina.setNome("MATEMATICA PARA ENGENHARIA II");
		disciplina.setCargaHoraria(90);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("MAT0314");
		disciplina.setNome("MATEMATICA PARA ENGENHARIA III");
		disciplina.setCargaHoraria(90);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0323");
		disciplina.setNome("METODOLOGIAS DE PROJETOS EM SISTEMAS EMBARCADOS");
		disciplina.setCargaHoraria(30);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0550");
		disciplina.setNome("METODOS EXPERIMENTAIS EM ENGENHARIA DE SOFTWARE");
		disciplina.setCargaHoraria(40);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0516");
		disciplina.setNome("METODOS FORMAIS DE ENGENHARIA DE SOFTWARE");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0518");
		disciplina.setNome("PLANEJAMENTO E GERENCIAMENTO DE PROJETOS");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0044");
		disciplina.setNome("PRATICAS DE LEITURA E ESCRITA EM INGLES");
		disciplina.setCargaHoraria(45);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0017");
		disciplina.setNome("PRATICAS DE LEITURA E ESCRITA EM PORTUGUES I");
		disciplina.setCargaHoraria(30);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0027");
		disciplina.setNome("PRATICAS DE LEITURA E ESCRITA EM PORTUGUES II");
		disciplina.setCargaHoraria(30);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0018");
		disciplina.setNome("PRATICAS DE LEITURA EM INGLES");
		disciplina.setCargaHoraria(30);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0033");
		disciplina.setNome("PROBABILIDADE");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0326");
		disciplina.setNome("PROCESSAMENTO DIGITAL DE SINAIS");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0502");
		disciplina.setNome("PROCESSO DE DESENVOLVIMENTO DE SOFTWARE EDUCACIONAL");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0408");
		disciplina.setNome("PROCESSOS DE SOFTWARE");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0403");
		disciplina.setNome("PROGRAMACAO COM BANCO DE DADOS");
		disciplina.setCargaHoraria(30);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0612");
		disciplina.setNome("PROGRAMACAO CONCORRENTE");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0410");
		disciplina.setNome("PROGRAMACAO CONCORRENTE E DISTRIBUIDA");
		disciplina.setCargaHoraria(45);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0502");
		disciplina.setNome("PROGRAMACAO DISTRIBUIDA");
		disciplina.setCargaHoraria(30);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0600");
		disciplina.setNome("PROJETO DE SOFTWARE");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0333");
		disciplina.setNome("PROJETO DE SOFTWARE E TESTES EM SISTEMAS EMBARCADOS");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0506");
		disciplina.setNome("PROJETO DETALHADO DE SOFTWARE");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0605");
		disciplina.setNome("PROJETO E ANALISE DE ALGORITMOS");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0324");
		disciplina.setNome("PROJETO INTEGRADO I");
		disciplina.setCargaHoraria(30);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0327");
		disciplina.setNome("PROJETO INTEGRADO II");
		disciplina.setCargaHoraria(30);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0329");
		disciplina.setNome("PROJETO INTEGRADO III");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0321");
		disciplina.setNome("PROJETOS BASEADOS EM MICROCONTROLADORES");
		disciplina.setCargaHoraria(30);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0406");
		disciplina.setNome("PROTOCOLO E SERVICOS DE INTERNET");
		disciplina.setCargaHoraria(30);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0043");
		disciplina.setNome("REDES DE COMPUTADORES");
		disciplina.setCargaHoraria(45);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0330");
		disciplina.setNome("REDES DE COMUNICACAO EM SISTEMAS EMBARCADOS");
		disciplina.setCargaHoraria(30);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0504");
		disciplina.setNome("RELACOES ENTRE COMUNICACAO, MIDIA E EDUCACAO");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0019");
		disciplina.setNome("RESOLUCAO DE PROBLEMAS MATEMATICOS PARA TI");
		disciplina.setCargaHoraria(180);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0416");
		disciplina.setNome("SEGURANCA DA INFORMACAO");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0334");
		disciplina.setNome("SENSORES INTELIGENTES");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0414");
		disciplina.setNome("SISTEMA DE INFORMACAO DISTRIBUIDO");
		disciplina.setCargaHoraria(45);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0506");
		disciplina.setNome("SISTEMAS COLABORATIVOS DE APOIO À APRENDIZAGEM");
		disciplina.setCargaHoraria(45);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0422");
		disciplina.setNome("SISTEMAS DE INTELIGENCIA EMPRESARIAL");
		disciplina.setCargaHoraria(45);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0322");
		disciplina.setNome("SISTEMAS DIGITAIS RECONFIGURAVEIS");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0308");
		disciplina.setNome("SISTEMAS EMBARCADOS DE TEMPO REAL");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0328");
		disciplina.setNome("TECNICAS DE PROTOTIPACAO E MONTAGEM DE CIRCUITOS E SISTEMAS ELETRONICOS");
		disciplina.setCargaHoraria(15);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0020");
		disciplina.setNome("TECNOLOGIA DA INFORMACAO E SOCIEDADE");
		disciplina.setCargaHoraria(30);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0523");
		disciplina.setNome("TECNOLOGIAS EDUCACIONAIS");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0319");
		disciplina.setNome("TEORIA DE CIRCUITOS ELETRICOS");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0337");
		disciplina.setNome("TI VERDE");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0420");
		disciplina.setNome("TOPICOS AVANCADOS EM GOVERNANCA DE TI");
		disciplina.setCargaHoraria(30);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0036");
		disciplina.setNome("TOPICOS ESPECIAIS EM COMPUTACAO");
		disciplina.setCargaHoraria(45);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0090");
		disciplina.setNome("TOPICOS ESPECIAIS EM COMPUTACAO I");
		disciplina.setCargaHoraria(30);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0091");
		disciplina.setNome("TOPICOS ESPECIAIS EM COMPUTACAO II");
		disciplina.setCargaHoraria(30);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0092");
		disciplina.setNome("TOPICOS ESPECIAIS EM COMPUTACAO III");
		disciplina.setCargaHoraria(30);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0093");
		disciplina.setNome("TOPICOS ESPECIAIS EM COMPUTACAO IV");
		disciplina.setCargaHoraria(30);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0098");
		disciplina.setNome("TOPICOS ESPECIAIS EM COMPUTACAO IX");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0094");
		disciplina.setNome("TOPICOS ESPECIAIS EM COMPUTACAO V");
		disciplina.setCargaHoraria(30);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0095");
		disciplina.setNome("TOPICOS ESPECIAIS EM COMPUTACAO VI");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0096");
		disciplina.setNome("TOPICOS ESPECIAIS EM COMPUTACAO VII");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0097");
		disciplina.setNome("TOPICOS ESPECIAIS EM COMPUTACAO VIII");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0099");
		disciplina.setNome("TOPICOS ESPECIAIS EM COMPUTACAO X");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0531");
		disciplina.setNome("TOPICOS ESPECIAIS EM ENGENHARIA DE SOFTWARE I");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0532");
		disciplina.setNome("TOPICOS ESPECIAIS EM ENGENHARIA DE SOFTWARE II");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0533");
		disciplina.setNome("TOPICOS ESPECIAIS EM ENGENHARIA DE SOFTWARE III");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0534");
		disciplina.setNome("TOPICOS ESPECIAIS EM ENGENHARIA DE SOFTWARE IV");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0539");
		disciplina.setNome("TOPICOS ESPECIAIS EM ENGENHARIA DE SOFTWARE IX");
		disciplina.setCargaHoraria(30);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0535");
		disciplina.setNome("TOPICOS ESPECIAIS EM ENGENHARIA DE SOFTWARE V");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0536");
		disciplina.setNome("TOPICOS ESPECIAIS EM ENGENHARIA DE SOFTWARE VI");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0537");
		disciplina.setNome("TOPICOS ESPECIAIS EM ENGENHARIA DE SOFTWARE VII");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0538");
		disciplina.setNome("TOPICOS ESPECIAIS EM ENGENHARIA DE SOFTWARE VIII");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("DIM0540");
		disciplina.setNome("TOPICOS ESPECIAIS EM ENGENHARIA DE SOFTWARE X");
		disciplina.setCargaHoraria(30);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0515");
		disciplina.setNome("TOPICOS ESPECIAIS EM INFORMATICA EDUCACIONAL I");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0516");
		disciplina.setNome("TOPICOS ESPECIAIS EM INFORMATICA EDUCACIONAL II");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0100");
		disciplina.setNome("TOPICOS ESPECIAIS EM TECNOLOGIA DA INFORMACAO I");
		disciplina.setCargaHoraria(90);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0101");
		disciplina.setNome("TOPICOS ESPECIAIS EM TECNOLOGIA DA INFORMACAO II");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0102");
		disciplina.setNome("TOPICOS ESPECIAIS EM TECNOLOGIA DA INFORMACAO III");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0103");
		disciplina.setNome("TOPICOS ESPECIAIS EM TECNOLOGIA DA INFORMACAO IV");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0108");
		disciplina.setNome("TOPICOS ESPECIAIS EM TECNOLOGIA DA INFORMACAO IX");
		disciplina.setCargaHoraria(30);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0104");
		disciplina.setNome("TOPICOS ESPECIAIS EM TECNOLOGIA DA INFORMACAO V");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0105");
		disciplina.setNome("TOPICOS ESPECIAIS EM TECNOLOGIA DA INFORMACAO VI");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0106");
		disciplina.setNome("TOPICOS ESPECIAIS EM TECNOLOGIA DA INFORMACAO VII");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0107");
		disciplina.setNome("TOPICOS ESPECIAIS EM TECNOLOGIA DA INFORMACAO VIII");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0109");
		disciplina.setNome("TOPICOS ESPECIAIS EM TECNOLOGIA DA INFORMACAO X");
		disciplina.setCargaHoraria(30);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0335");
		disciplina.setNome("TOPICOS ESPECIAIS I");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0336");
		disciplina.setNome("TOPICOS ESPECIAIS II");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

		disciplina = new Disciplina();
		disciplina.setCodigo("IMD0034");
		disciplina.setNome("VETORES E GEOMETRIA ANALITICA");
		disciplina.setCargaHoraria(60);
		listaDisciplinas.add(disciplina);

	}

	public String[] getdiscName() {
		return discName;
	}

	public void setdiscName(String[] discName) {
		this.discName = discName;
	}
	
	public String discNameInString() {
		return Arrays.toString(discName);
	}
	
	public ArrayList<Disciplina> getListaDisciplinas() {
				
		return listaDisciplinas;
	}
	
}
