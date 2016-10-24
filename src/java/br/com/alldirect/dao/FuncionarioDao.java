/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alldirect.dao;

import br.com.alldirect.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class FuncionarioDao {
    private PreparedStatement stmt;
    private ResultSet rs;
    private Connection conecta;

    public FuncionarioDao() throws SQLException{
        this.conecta = new ConnectionFactory().getConnection();
    }
    
    public void adiconarCarro
}
