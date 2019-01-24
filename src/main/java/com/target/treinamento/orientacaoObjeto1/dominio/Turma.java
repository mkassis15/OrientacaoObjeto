package com.target.treinamento.orientacaoObjeto1.dominio;

import java.util.List;

//Objeto - plain java Old Object

public class Turma {
	
	// atributos de classe
	
	private Professor professor;
	private List<Aluno> aluno;
	private Disciplina disciplina;
	private Sala sala;
	
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public List<Aluno> getAluno() {
		return aluno;
	}
	public void setAluno(List<Aluno> aluno) {
		this.aluno = aluno;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
	

}
