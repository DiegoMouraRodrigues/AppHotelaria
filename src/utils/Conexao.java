package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    //declarar 4 variavel com seu tipo e alocar o valor para cada:
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://127.0.0.1:3306/hotelgrupo3";
    private String usuario = "dbaHotel";
    private String senha = "dbaHotel123";

    public Connection conectar() {
        Connection conb = null;

        try {
            //Especifica a rota a ser carregado(jdbc para sgbd Mysql)
            Class.forName(driver);

            //Inicializar o driver ja carregado por meio do metodo getConnection(IP,porta,nome do banco, usuario,senha)
            conb = DriverManager.getConnection(url, usuario, senha);
            return conb;

        } catch (SQLException erro) {
            System.out.print("Erro ao conectar ao Banco de Dados: " + erro);
            return null;

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
