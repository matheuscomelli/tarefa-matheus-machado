package br.senac.recuperacao.modelo.entidade.pessoa.empregado.professor;

public class Professor extends Empregado{
private Long id;
private String nome;
private String email;
private String senha;

public Professor(Long id) {
    this.id = id;
}

public Professor (String nome, String email, String senha) {
    this.nome = nome;
    this.email = email;
    this.email = senha;
}

public Professor(Long id, String nome, String email, String senha) {
    this.id = id;
    this.nome = nome;
    this.email = email;
    this.email = senha;
}

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

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getSenha() {
    return senha;
}

public void setSenha(String senha) {
    this.senha = senha;
}

public boolean equals(Object objeto) {
    if (objeto == null)
        return false;
    if (this == objeto)
        return true;
    if (this.getClass() != objeto.getClass())
        return false;

Professor professor= (Profesor) objeto;
return this.getId() == professor.getId() && this.getNome().equals(professor.getNomel())
    && this.getEmail().equals(professor.getEmail());
    && this.getSenha().equals(professor.getSenha())
 }
}

package br.senac.recuperacao.modelo.entidade.pessoa.estudante.aluno;

public class Aluno extends Estudante{
private Long id;
private String nome;
private String email;
private String senha;

public Aluno(Long id) {
    this.id = id;
}

public Aluno (String nome, String email, String senha) {
    this.nome = nome;
    this.email = email;
    this.email = senha;
}

public Aluno(Long id, String nome, String email, String senha) {
    this.id = id;
    this.nome = nome;
    this.email = email;
    this.email = senha;
}

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

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getSenha() {
    return senha;
}

public void setSenha(String senha) {
    this.senha = senha;
}

public boolean equals(Object objeto) {
    if (objeto == null)
        return false;
    if (this == objeto)
        return true;
    if (this.getClass() != objeto.getClass())
        return false;

Aluno aluno= (Aluno) objeto;
return this.getId() == aluno.getId() && this.getNome().equals(aluno.getNomel())
    && this.getEmail().equals(aluno.getEmail());
    && this.getSenha().equals(aluno.getSenha())
 }
}



