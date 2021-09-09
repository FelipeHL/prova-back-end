var id = document.querySelector("#id");
var nome = document.querySelector("#nome");
var descricao = document.querySelector("#descricao");
var valor = document.querySelector("#valor");
var quantidade = document.querySelector("#quantidade");
var tipo = document.querySelector("#tipo");

var bt = document.querySelector("input[type=submit]");
	
function edita(e){
	let linha = e.parentNode.parentNode.querySelectorAll("td");
	id.value = linha[0].innerHTML;
	nome.value = linha[0].innerHTML;
	descricao.value = linha[1].innerHTML;
	valor.value = linha[2].innerHTML;
	quantidade.value = linha[3].innerHTML;
	tipo.value = 1;
	bt.value = "Editar";
	
}