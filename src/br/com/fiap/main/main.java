package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Livro;

public class main {

	public static void main(String[] args) {
	
		//solicitando ao usuario as informações do livro
        String titulo = JOptionPane.showInputDialog("Digite o titulo do livro");
		
        String autor = JOptionPane.showInputDialog("Digite o nome do autor");
        
        String genero = JOptionPane.showInputDialog("Digite o nome do genero");
        
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));
        
        String isbn = JOptionPane.showInputDialog("Digite o isbn");
        
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));
        
        Livro Livro = new Livro(titulo ,autor,genero, preco, isbn, quantidade);
        
        String message = String.format(
        		"Livro coletado com sucesso!\n\n" +
                "Titulo: %s\n" +
        		"Autor: %s\n" +
                "Genero: %s\n" +
        		"Preço: R$ %.2f\n" + 
                "ISBN: %s\n" +
        		"Quantidade: %d",
        		Livro.getTitulo(),
        		Livro.getAutor(),
        		Livro.getGenero(),
        		Livro.getPreco(),
        		Livro.getIsbn(),
                Livro.getQuantidade());
        JOptionPane.showMessageDialog(null, message);
	}

}
