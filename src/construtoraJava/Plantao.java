package construtoraJava;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Plantao extends Planta {
	// Atributos
	String nome = "Apartamento de alto padrão";
	String condominio = "Residencial Paschoalotto";
	Double preco = 300000.00;
	Double tamanho = 90.00;
	int qtdComodos = 12;

	// Métodos
	public void mostrarDetalhes() {
		JOptionPane.showMessageDialog(null, "O " + this.nome + " possui " + this.tamanho + " m² com um total de " + qtdComodos
				+ " comodos. \nÉ o nosso imóvel de altíssimo padrão." + "\nEste imóvel está localizado no condomínio "
				+ this.condominio + "\nO valor de investimento é de R$" + this.preco);
	}

	public String registrarVenda(String cliente) {

		String msg = "Parabéns ao sr(a) " + cliente + "! O imóvel foi vendido a ele(a) "
				+ "com sucesso! \nSeja feliz no condomínio: " + this.condominio;

		return msg;

	}

	public String gerarContrato(String cliente) throws IOException {

		FileWriter arq = new FileWriter("C:/Users/treinamentosti/Desktop/contratoPlantao.html");
		PrintWriter gravar = new PrintWriter(arq);

		gravar.println("<center>Construtora Java<br /></center>" + 
		"<center>Contrato de Venda<br /><br /><br /><br /></center>");
		gravar.println("<center>Nome do cliente: " + cliente + "</center>");
		gravar.println("<center><br />Imóvel: " + this.nome + "</center>");
		gravar.println("<center><br />Tamanho: " + this.tamanho+ " m²</center>");
		gravar.println("<center><br />Condomínio: " + this.condominio + "</center>");
		gravar.println("<center><br />Valor: R$" + this.preco + "</center>");
		gravar.println("<center><br /><br />\t\t____________________________<br /></center>");
		gravar.println("<center>Assinatura do comprador(a) " + cliente + "</center>");

		arq.close();

		return "Contrato gerado com sucesso!";

	}
}
