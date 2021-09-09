package controll;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import model.Produto;

public class ProdutoProcess {
		
		public boolean teste (Produto prod) {
			try {
				FileWriter cad = new FileWriter("D:/cad.txt", true);
				BufferedWriter bw =new  BufferedWriter(cad);
				String linha = 	prod.getId() + ";" +
								prod.getNome() + ";" +
								prod.getDescricao()+ ";" +
								prod.getValor() + ";" + 
								prod.getQuantidade() + "\r\n";
								
				bw.write(linha);
				
				bw.close();
				cad.close();
				
				return true;
			}catch(Exception e) {
				System.out.println(e);
				}
			return false;
		}
			
			public ArrayList<String> abrir(){
				ArrayList<String> data = new ArrayList<String>();
				
				try {
					FileReader fr = new FileReader("D:/cad.txt");
					BufferedReader br = new BufferedReader(fr);
					
					String linha = "";
					while((linha = br.readLine()) !=null ){
						data.add(linha);
					}
					
					br.close();
					fr.close();
				}catch(Exception e) {
					System.out.println(e);
				}
				
				return data;
			}
			
			public boolean salvar(Produto prod) {
				ArrayList<String> data = abrir();
				
				try {
					FileWriter fw = new FileWriter("d:cad.txt, false");
					BufferedWriter bw = new BufferedWriter(fw);
					
					for(int i = 0; i < data.size(); i++) {
						String linha = data.get(i);
						if(linha.contains(prod.getDescricao())) {
							linha = prod.getNome() + ";" +
									prod.getDescricao()+ ";" +
									prod.getValor() + ";" + 
									prod.getQuantidade() + "\r\n";
							data.remove(i);
							data.add(i, linha);
							
						}
						bw.write(data.get(i)+"\r\n");
					}
					
					bw.close();
					fw.close();
					
					return true;
					
				}catch(Exception e) {
					
				}
				
				
				return false;
			
			}
				
	}

