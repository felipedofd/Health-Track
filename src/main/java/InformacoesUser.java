import java.io.Serializable;

public class InformacoesUser implements Serializable {

    private String nomeUsuario;
    private float pesoUsuario;

    public InformacoesUser(String nomeUsuario, Float pesoUsuario) {
        super();
        this.nomeUsuario = nomeUsuario;
        this.pesoUsuario = pesoUsuario;
    }

    public InformacoesUser() {
    }


    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public float getPesoUsuario() {
        return pesoUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public void setPesoUsuario(float pesoUsuario) {
        this.pesoUsuario = pesoUsuario;
    }

    @Override
    public String toString() {
        return "Informacao do usuario [NOME DO USUARIO: " + nomeUsuario + " PESO DO USUARIO: " + pesoUsuario + "]";

    }
}
