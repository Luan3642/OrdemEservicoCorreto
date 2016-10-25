/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alldirect.servlet;

import br.com.alldirect.dao.CarroDao;
import br.com.alldirect.model.CarroModel;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CarroServlet")

public class CarroServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String modeloCarro = request.getParameter("modeloCarro");
        String corDoCarro = request.getParameter("corDoCarro");
        int quantosCavalos = Integer.parseInt(request.getParameter("quantosCavalos"));
        String acabamento = request.getParameter("acabamento");
        String comandoDeBordo = request.getParameter("comandoDeBordo");
        String arrosCarros = request.getParameter("arosCarros");
        Date anoDoCarro = Date.valueOf(request.getParameter("anoDoCarro"));

        CarroModel carrosModel = new CarroModel();
        carrosModel.setAcabamento(acabamento);
        carrosModel.setArosCarros(arrosCarros);
        carrosModel.setComandoDeBordo(comandoDeBordo);
        carrosModel.setCorDoCarro(corDoCarro);
        carrosModel.setModeloCarro(modeloCarro);
        carrosModel.setQuantosCavalos(quantosCavalos);

        try {
            CarroDao carroDao = new CarroDao();
            carroDao.adicionaCarro(carrosModel);
        } catch (SQLException ex) {
            Logger.getLogger(CarroServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
