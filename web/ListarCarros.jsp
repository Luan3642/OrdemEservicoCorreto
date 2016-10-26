<%-- 
    Document   : ListarCarros
    Created on : 26/10/2016, 09:11:31
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="newcss.css"/>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<jsp:useBean id="dao" class="br.com.alldirect.dao.CarroDao"/>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar carros</title>
    </head>
    <body>
        <table class="conteudo">
            <tr>
                <td class="alinhaCentro">Modelo do carro</td>
                <td class="alinhaCentro">Cor do carro</td>
                <td class="alinhaCentro">Ano do carro</td>
                <td class="alinhaCentro">Quantos cavalos</td>
                <td class="alinhaCentro">Acabamento do carro</td>
                <td class="alinhaCentro">Comando de bordo do carro</td>
                <td class="alinhaCentro">Aro dos carros</td>            
            </tr>
            <c:forEach var="carro" items="${dao.lista}">
                <tr>
                    <td>${carro.modeloCarro}</td>
                    <td>${carro.CorDoCarro}</td>
                    <td>${carro.quantosCavalos}</td>
                    <td>${carro.acabamento}</td>
                    <td>${carro.comandoDeBordo}</td>
                    <td>${carro.arosCarros}</td>
                    <td><fmt:formatDate value="${carro.anoCarro}" pattern="dd/mm/yyyy"/></td>
                </tr>
            </c:forEach>
        </table>
</body>
</html>
