package Model.bean;

public class Usuario {

   
    private int codigo;
    private String nome;
    private String email;
    private String senha;
    private byte foto;
    private String descricao;
    private String usuario;

    public Usuario(String nome, String email, String usuario) {
        this.nome = nome;
        this.email = email;
        this.usuario = usuario;
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

    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
  
    
     public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

   

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Usuario (String nome, String email, String senha, String descricao, String usuario){
        this.nome = nome; 
        this.email = email;
        this.senha = senha;
        this.descricao = descricao;
        this.usuario = usuario;
        
    }
    
    public Usuario(int codigo){
        this.codigo = codigo;
        
    }

    /**
     * @return the foto
     */
    public byte getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(byte foto) {
        this.foto = foto;
    }

  
    
}
