import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InformacoesUserDAOImpl implements InformacoesUserDAO {

    private Connection connection;
    PreparedStatement pstmt = null;

    @Override
    public void gravar(InformacoesUser informacoesUser) {
        try {
            connection = ConnectDbFiap.obterConexao();
            pstmt = connection
                    .prepareStatement("INSERT INTO T_USER_INFO" +
                            "(NM_USER, NR_PESO) " +
                            "VALUES (?, ?)");

            pstmt.setString(1, informacoesUser.getNomeUsuario());
            pstmt.setFloat(2, informacoesUser.getPesoUsuario());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

    @Override
    public List<InformacoesUser> getAll() {
        List<InformacoesUser> informacoesUsers = new ArrayList<InformacoesUser>();
        ResultSet rs = null;
        try {
            connection = ConnectDbFiap.obterConexao();
            pstmt = connection.prepareStatement("SELECT * FROM T_USER_INFO");
            rs = pstmt.executeQuery();

            while (rs.next()) {

                InformacoesUser informacoesUser = new InformacoesUser(rs.getString("NM_USER"), rs.getFloat("NR_PESO"));
                informacoesUsers.add(informacoesUser);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return informacoesUsers;
    }

    @Override
    public void buscarInformacoesPesoUsuarios(String nomeUsuario)  {
        try {
            connection = ConnectDbFiap.obterConexao();

            pstmt = connection.prepareStatement("SELECT * FROM T_USER_INFO WHERE NM_USER = ?");
            pstmt.setString(1, "BahiaA");
            ResultSet result = pstmt.executeQuery();

            while (result.next()) {
                System.out.println
                        ("USUARIO: " + result.getString("NM_USER") + " " + "ESTA PESANDO: " +
                                result.getInt("NR_PESO") + "KG");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public void atualizarPesoUser(InformacoesUser informacoesUser) {

        try {
            connection = ConnectDbFiap.obterConexao();
            pstmt = connection.prepareStatement(
                    "UPDATE T_USER_INFO SET NR_PESO = ? WHERE NM_USER = ?");
            pstmt.setFloat(1, informacoesUser.getPesoUsuario());
            pstmt.setString(2, informacoesUser.getNomeUsuario());
            pstmt.executeUpdate();
//                         UPDATE T_USER_INFO SET NR_PESO = 130 WHERE NM_USER = 'Manuel'
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public void remover(int pesoUsuario) {
        try {
            connection = ConnectDbFiap.obterConexao();
            pstmt = connection.prepareStatement("DELETE FROM T_USER_INFO WHERE NR_PESO = ?");
            pstmt.setInt(1, pesoUsuario);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
