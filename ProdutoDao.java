package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ProdutoDao {
	
	private BufferedReader br;
	private BufferedWriter bw;
	private ArrayList<Produto> produtos;
	private Produto produto;
	
	public boolean cadastrar (Produto produtos) {
		try {
			FileWriter cad = new FileWriter("D:/cad.txt", true);
			BufferedWriter bw =new  BufferedWriter(cad);
			String linha = 	produtos.getId() + ";" +
							produtos.getNome() + ";" +
							produtos.getDescricao()+ ";" +
							produtos.getValor() + ";" + 
							produtos.getQuantidade() + "\r\n";
							
			bw.write(linha);
			
			bw.close();
			cad.close();
			
			return true;
		}catch(Exception e) {
			System.out.println(e);
			}
		return false;
	}
	
	public boolean salvar(ArrayList<Produto> produtos) {
		try {
			bw = new BufferedWriter(new FileWriter("D:/cad.txt",false));
			 {
			}
			bw.close();
			return true;
		} catch (IOException e) {
			System.out.println("Erro ao gravar arquivo "+e);
			return false;
		}
	}
	
	public ArrayList<Produto> abrir(){
		produtos = new ArrayList<>();
		try {
			br = new BufferedReader(new FileReader("D:/cad.txt"));
			while((br.readLine()) != null) {
				produto.add(produto);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo n�o encontrado "+e);
		} catch (IOException e) {
			System.out.println("Erro ao ler arquivo "+e);
		}
		return produtos;
	}
	
}

