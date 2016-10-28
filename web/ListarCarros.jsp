<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="newcss.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar carros</title>
    </head>
    <body>
        <jsp:useBean id="dao" class="br.com.alldirect.dao.CarroDao"/>
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
            <c:forEach var="c" items="${dao.lista}">
                <tr>
                    <td>${c.modeloCarro}</td>
                    <td>${c.corDoCarro}</td>
                    <td>${c.quantosCavalos}</td>
                    <td>${c.acabamento}</td>
                    <td>${c.comandoDeBordo}</td>
                    <td>${c.arosCarros}</td>
                    <td><fmt:formatDate value="${c.anoCarro}" pattern="dd/mm/yyyy"/></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>