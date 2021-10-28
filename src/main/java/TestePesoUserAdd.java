import java.util.List;

public class TestePesoUserAdd {
    public static void main(String[] args) {
        try {


            InformacoesUserDAO dao = new InformacoesUserDAOImpl();
            InformacoesUser informacoesUser = new InformacoesUser();

//            informacoesUser.setNomeUsuario("Manuel");
//            informacoesUser.setPesoUsuario(132);

//            dao.gravar(informacoesUser);


//            ADICIONANDO OS 5 INFORMAÇOES DO USUARIO COMO SOLICITADO "PESO DO USUARIO"

                        informacoesUser.setNomeUsuario("Azmodeu");
            informacoesUser.setPesoUsuario(121);

            dao.gravar(informacoesUser);

                        informacoesUser.setNomeUsuario("Jesus");
            informacoesUser.setPesoUsuario(99);

            dao.gravar(informacoesUser);

                        informacoesUser.setNomeUsuario("Tiririca");
            informacoesUser.setPesoUsuario(88);

            dao.gravar(informacoesUser);

                        informacoesUser.setNomeUsuario("Tirulipa");
            informacoesUser.setPesoUsuario(77);

            dao.gravar(informacoesUser);


            informacoesUser.setNomeUsuario("Manuel");
            informacoesUser.setPesoUsuario(139);

//            dao.atualizarPesoUser(informacoesUser);

            // CONSULTANDO O BANCO COM METODO GETALL COMO SOLICITADO, E TODOS OS METEDOS DE CRUD FEITOS!!!
            List<InformacoesUser> informacoesUsers = dao.getAll();

            for (InformacoesUser infos: informacoesUsers){
                System.out.println(infos.toString());
            }

            System.out.println("O PESO DOS USUARIOS FORAM GRAVADOS COM SUCESSO");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }






}
