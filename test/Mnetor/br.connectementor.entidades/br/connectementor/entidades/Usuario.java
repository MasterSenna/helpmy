package br.connectementor.entidades;

public class Usuario {
    private int Id;
    private String Nome;
    private String Email;
    private String Senha;
    private String Telefone;
    private int Programacao;
    private int Reedes;
    private int Ciberseguranca;
    private int Banco_Dados;
    private int businessIntelligence;
    private int GestaoTI;
    private int Cloud_Computing;
    private int DevOps;

    public Usuario(int devOps2, String nome2, String email2, String senha2, String telefone2, int programacao2, int redes, int ciberseguranca2, int banco_Dados2, int business_Intelligence, int gestao_TI, int cloud_Computing2, int devOps3) {
        // Construtor vazio
    }

	public Usuario(int id, String nome, String email, String senha, String telefone, int programacao, int reedes,
			int ciberseguranca, int banco_Dados, int businessIntelligence, int gestaoTI, int cloud_Computing) {
		super();
		Id = id;
		Nome = nome;
		Email = email;
		Senha = senha;
		Telefone = telefone;
		Programacao = programacao;
		Reedes = reedes;
		Ciberseguranca = ciberseguranca;
		
		this.businessIntelligence = businessIntelligence;
		GestaoTI = gestaoTI;
		Cloud_Computing = cloud_Computing;
		DevOps = DevOps;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public int getProgramacao() {
		return Programacao;
	}

	public void setProgramacao(int programacao) {
		Programacao = programacao;
	}

	public int getReedes() {
		return Reedes;
	}

	public void setReedes(int reedes) {
		Reedes = reedes;
	}

	public int getCiberseguranca() {
		return Ciberseguranca;
	}

	public void setCiberseguranca(int ciberseguranca) {
		Ciberseguranca = ciberseguranca;
	}

	public int getBanco_Dados() {
		return Banco_Dados;
	}

	public void setBanco_Dados(int banco_Dados) {
		Banco_Dados = banco_Dados;
	}

	public int getBusinessIntelligence() {
		return businessIntelligence;
	}

	public void setBusinessIntelligence(int businessIntelligence) {
		this.businessIntelligence = businessIntelligence;
	}

	public int getGestaoTI() {
		return GestaoTI;
	}

	public void setGestaoTI(int gestaoTI) {
		GestaoTI = gestaoTI;
	}

	public int getCloud_Computing() {
		return Cloud_Computing;
	}

	public void setCloud_Computing(int cloud_Computing) {
		Cloud_Computing = cloud_Computing;
	}

	public int getDevOps() {
		return DevOps;
	}

	public void setDevOps(int devOps) {
		DevOps = devOps;
	}

	public int getGestao_TI() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getRedes() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getBusiness_Intelligence() {
		// TODO Auto-generated method stub
		return 0;
	}
}

   
