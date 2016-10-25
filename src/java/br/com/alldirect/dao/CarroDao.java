/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alldirect.dao;

import br.com.alldirect.connection.ConnectionFactory;
import br.com.alldirect.model.CarroModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CarroDao {
    private PreparedStatement stmt;
    private ResultSet rs;
    private Connection conecta;

    public CarroDao() throws SQLException{
        this.conecta = new ConnectionFactory().getConnection();
    }
    
    public void adicionaCarro(CarroModel carroModel) throws SQLException{
        String sql = "INSERT INTO CARRO (MODELO_CARRO,COR_CARRO,QUANTOS_CAVALOS,ACABAMENTO_CARRO,COMANDO_DE_BORDO_CARRO,ARROS_DOS_CARROS, ANO_CARRO) VALUES (?,?,?,?,?,?,?)";
        try{
            stmt = conecta.prepareStatement(sql);
            stmt.setString(1, carroModel.getModeloCarro());
            stmt.setString(2, carroModel.getCorDoCarro());
            stmt.setInt(3, carroModel.getQuantosCavalos());
            stmt.setString(4, carroModel.getAcabamento());
            stmt.setString(5, carroModel.getComandoDeBordo());
            stmt.setString(6, carroModel.getArosCarros());
            stmt.setDate(6, carroModel.getAnoCarro());
        } catch(SQLException e){
            System.out.println("Não foi possivel conectar a sua base " +e);
        }
    }
    public List<CarroModel> getLista() throws SQLException{
        List<CarroModel> carroModel = new ArrayList<>();
        String sql = "SELECT * FROM CARRO";
        try{
            stmt = conecta.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                CarroModel carroModel1 = new CarroModel();
                
                carroModel1.setAcabamento(rs.getString("acabamento"));
                carroModel1.setAnoCarro(rs.getDate("anoCarro"));
                carroModel1.setArosCarros(rs.getString("arrosCarros"));
                carroModel1.setComandoDeBordo(rs.getString("comandoDeBordo"));
                carroModel1.setCorDoCarro(rs.getString("corDoCarro"));
                carroModel1.setModeloCarro(rs.getString("modeloCarro"));
                carroModel1.setQuantosCavalos(rs.getInt("QuantosCavalos"));
            }
            stmt.close();
            return  carroModel;
        }  catch(SQLException e){
            System.out.println("Não possivel listar");
            return null;
        }
    }
}
