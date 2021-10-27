import java.util.List;

public interface InformacoesUserDAO {
    void gravar (InformacoesUser informacoesUser);
    List<InformacoesUser> getAll();

    void buscarInformacoesPesoUsuarios(String nomeUsuario);

    void atualizarPesoUser(InformacoesUser informacoesUser);

    void remover (int pesoUsuario);
}
