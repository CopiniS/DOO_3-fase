
package trabalho_doo;

public class Administrador {
    private String nome;
    private String cargo;
    private String setor;
    private String usuario;
    private String senha;
    private String repitaSenha;

    public Administrador() {
        this.nome = null;
        this.cargo = null;
        this.setor = null;
        this.usuario = null;
        this.senha = null;
        this.repitaSenha = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getRepitaSenha() {
        return repitaSenha;
    }

    public void setRepitaSenha(String repitaSenha) {
        this.repitaSenha = repitaSenha;
    }
    
    
    
}
