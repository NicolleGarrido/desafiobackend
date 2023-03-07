/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class flexpag {
    
}
	public static void main(String[] args) {
	    cadastro novoCadastro = new cadastro ("ivone",20/12/1943,1234567,0000999922221111,65,30/12/2023,19)
	}
package cadastro;
public class cadastro {

    private String nome;
    private int datadenascimento;
    private long cpf;
    public long codigodebarras;
    float valor;
    public String data;
    public int hora;
    
    public cadastro (String nome,int datadenascimento,long cpf,long codigodebarras,float valor, String data,int hora) {
        this.nome = nome;
        this.datadenascimento = datadenascimento;
        this.cpf = cpf;
        this.codigodebarras = codigodebarras;
        this.valor = valor;
        this.data = data;
        this.hora = hora;
        
    }
    
    public String getNome () {
        return nome;
    }
    public void setNome (String nome) {
    this.nome = nome;    
    }    
    
    public int getDatadenascimento () {
    return datadenascimento;
    } 
    
    public void setDatadenascimento () {
        this.datadenascimento = datadenascimento;
        
    }
    
    public String getCpf (){
        return cpf;
    }
    
    public void setCpf () {
        this.cpf = cpf;
        
    }
    
    public String getCodigodebarras (){
        return codigodebarras;
        
    }
    
    public void setCodigodebarras () {
        this.codigodebarras = codigodebarras;
        
    }
    public String getValor (){
        return valor;
        
    }
    
    public void setValor () {
        this.valor = valor;
        
    }
    
    public String getData (){
        return data;
        
    }
    public void setData () {
        this.data = data;
    }
    public String getHora () {
        return hora;
    }
    public void setHora () {
        this.hora = hora;
    }
 }
 
 public class pagamento de conta 
     
     private cadastro titular;
     private int cpf, codigodebarras, hora;
     private String data;
     private float id;
     
     public pagamento de conta (cadastro titular,int cpf, int codigodebarras, int hora) {
         this.titular = titular;
         this.cpf= cpf;
         this.codigodebarras = codigodebarras;
         this.hora = hora;
         id = 0;
     }
     public float peding (float id) {
         saldo += valor;
         return id;
         
     }
     public cadastro getTitular () {
         return titular;
     }
     
 }