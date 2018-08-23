/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rdtelecom.dal;

import java.sql.DriverManager;

public class ModuloConexao {

    //Metodo responsavel por estabelecer conexão com banco e dados
    public static java.sql.Connection conector() {
        java.sql.Connection conexao = null;
        //alinha aboixo chama o drive jdbc
        String driver = "com.mysql.jdbc.Driver";
        //Armazenando informaçoes referente ao banco de dados

        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String senha = "";
        //Estabelecendo conexao com banco
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,senha);
            return  conexao;
        } catch (Exception e) {
            return null;
            
            
        }

        

    }

}
