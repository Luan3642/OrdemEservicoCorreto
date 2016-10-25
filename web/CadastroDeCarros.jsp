<%-- 
    Document   : CadastroDeCarros
    Created on : 25/10/2016, 10:52:31
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="newcss.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="unico ">Cadastre seu carro</div>
        <form class="form-horizontal" action="CarroServlet" method="GET">
            <div class="form-group ">
                <label class="col-sm-2 control-label">Digite o modelo do carro</label>
                <div class="col-sm-9">
                    <input  name="modeloCarro" type="text" class="form-control" placeholder="modelo do carro">
                </div>
            </div>
            <div class="form-group ">
                <label   class="col-sm-2 control-label">Digite a cor do carro </label>
                <div class="col-sm-9">
                    <input name="corDoCarro" type="text" class="form-control"  placeholder="cor do carro">
                </div>
            </div>
            <div class="form-group ">
                <label   class="col-sm-2 control-label">Digite o ano do eeeeeeeeeeeeecarro</label>
                <div class="col-sm-9">
                    <input type="text" name="anoDoCarro" class="form-control"  placeholder="Digite o ano do carro">
                </div>
            </div>
            <div class="form-group ">
                <label  class="col-sm-2 control-label">Quantos cavalos tem seu carro </label>
                <div class="col-sm-9">
                    <input  name="quantosCavalos" type="text" class="form-control"  placeholder="Digite os cavalos do carro">
                </div>
            </div>
            <div class="form-group ">
                <label   class="col-sm-2 control-label">Digite como quer seu acabamento</label>
                <div class="col-sm-9">
                    <input  name="acabamento" type="text" class="form-control"  placeholder="Digite seu acabamento">
                </div>
            </div>
            <div class="form-group ">
                <label    class="col-sm-2 control-label">Digite o nome do seu comando de bordo</label>
                <div class="col-sm-9">
                    <input name="comandoDeBordo" type="text" class="form-control" placeholder="Comando de bordo">
                </div>
            </div>
            <div class="form-group ">
                <label   class="col-sm-2 control-label">Digite o aro do seu carro</label>
                <div class="col-sm-9">
                    <input  name="arosCarros" type="text" class="form-control"  placeholder="Aro do carro">
                </div>
            </div>
            <table>
                <div class="col-sm-7 control-label">
                    <input type="submit" class="btn btn-primary" value="Gravar Produto"><br>
                </div>
            </table>
        </form>
                </body>
                </html>
