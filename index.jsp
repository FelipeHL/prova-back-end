<%@page import="java.util.ArrayList"%>
<%@page import="controll.ProdutoProcess"%>
<%@page import="model.Produto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
		ProdutoProcess pr = new ProdutoProcess();
		String id = request.getParameter("id");
		String nome = request.getParameter("nome");
		String descricao = request.getParameter("descricao");
		String valor = request.getParameter("valor");
		String quantidade = request.getParameter("quantidade");
		String tipo = request.getParameter("tipo");
		
		System.out.println(id);
		System.out.println(nome);
		System.out.println(descricao);
		System.out.println(valor);
		System.out.println(quantidade);
		
		if(id != null &&
			nome != null &&
			descricao != null&&
			valor != null &&
			quantidade != null) {
			
			Produto p = new Produto();
			 	p.setId(Integer.parseInt(id));
			 	p.setNome(nome);
			 	p.setDescricao(descricao);
				p.setValor(Integer.parseInt(valor));
				p.setQuantidade(Integer.parseInt(quantidade));

			switch(tipo){
			
			case "0":
				pr.teste(p);
				break;
			case "1":
				pr.salvar(p);
				break;
			}

		}
	%>
	<form action="index.jsp" method="POST">
		<input type="text" name="nome" id="id"><br>
		<input type="text" name="nome" id="nome"><br>
		<input type="text" name="doc" id="descricao"><br>
		<input type="text" name="nasc" id="valor"><br>
		<input type="text" name="reg" id="quantidade"><br>
		<input type="hidden" name="tipo" value="0" id="tipo">
		<input type="submit" value="cadastrar">
		
	</form>
	<table>
		<thead>
			<tr>
				<th>Id</th>	
				<th>Nome</th>	
				<th>Descricao</th>
				<th>Valor</th>
				<th>Quantidade</th>
			</tr>
		</thead>
		<tbody>
			<%
				ArrayList<String> data = pr.abrir();	
				for(String linha : data){
					String[] tmp = linha.split(";");
					out.print("<tr>");
					out.print("<td>"+tmp[0]+"</td>");
					out.print("<td>"+tmp[3]+"</td>");
					out.print("<td>"+tmp[1]+"</td>");
					out.print("<td>"+tmp[2]+"</td>");
					out.print("<td><button onclick='edita(this)'>Editar</button></td>");
					out.print("<td><button onclick='excluir(this)'>Excuir</button></td>");
					out.print("</tr>");
				}
			%>
		</tbody>
	</table>
	
</body>
<script type="script.js"></script>
</html>