/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alldirect.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author luan
 */
public class ConnectionFactory {
     public Connection getConnection() throws SQLException {

			try {
				String driverName = "com.mysql.jdbc.Driver";
				Class.forName(driverName);
				String serverName = "192.68.0.200:3306";
				String myDataBase = "ordemServicoLuan";
				String url = "jdbc:mysql://" + serverName + "/" + myDataBase;
				String userName = "aluno";
				String passWord = "123456";
				Connection connection = DriverManager.getConnection(url, userName, passWord);
				return connection;
			} catch (ClassNotFoundException e) {
				System.out.println("Driver não encontrado." + e);
				return null;
			} catch (SQLException e) {
				System.out.println("Não possivel conectar a sua database ." + e);
				return null;
			}
}
}