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
        String sql = "INSERT INTO CARRO (MODELO_CARRO,COR_CARRO,ANO_CARRO,QUANTOS_CAVALOS,ACABAMENTO_CARRO,COMANDO_DE_BORDO_CARRO,AROS_DOS_CARROS) VALUES (?,?,?,?,?,?,?)";
        try{
            stmt = conecta.prepareStatement(sql);
            stmt.setString(1, carroModel.getModeloCarro());
            stmt.setString(2, carroModel.getCorDoCarro());
            stmt.setDate(3, carroModel.getAnoCarro());
            stmt.setInt(4, carroModel.getQuantosCavalos());
            stmt.setString(5, carroModel.getAcabamento());
            stmt.setString(6, carroModel.getComandoDeBordo());
            stmt.setString(7, carroModel.getArosCarros());
            stmt.execute();
            stmt.close();
        } catch(SQLException e){
            System.out.println("Não foi possivel conectar a sua base " +e);
        }
    }
    public List<CarroModel> getLista() throws SQLException{
        List<CarroModel> carroModel = new ArrayList<>();
        String sql = "SELECT * FROM ordemservicoluan.carro";
        try{
            stmt = conecta.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()){                
                CarroModel carroModel1 = new CarroModel();
                carroModel1.setAcabamento(rs.getString("ACABAMENTO_CARRO"));
                carroModel1.setAnoCarro(rs.getDate("ANO_CARRO"));
                carroModel1.setArosCarros(rs.getString("AROS_DOS_CARROS"));
                carroModel1.setComandoDeBordo(rs.getString("COMANDO_DE_BORDO_CARRO"));
                carroModel1.setCorDoCarro(rs.getString("COR_CARRO"));
                carroModel1.setModeloCarro(rs.getString("MODELO_CARRO"));
                carroModel1.setQuantosCavalos(rs.getInt("QUANTOS_CAVALOS"));
                carroModel.add(carroModel1);
            }
            stmt.close();
            return  carroModel;
        }  catch(SQLException e){
            System.out.println("Não possivel listar");
            return null;
        }
    }
}
