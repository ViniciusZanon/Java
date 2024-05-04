package construtoraJava;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Plantinha extends Planta {
	// Atributos
	String nome = "Apartamento de entrada";
	String condominio = "Condomínio de entrada";
	Double preco = 170000.00;
	Double tamanho = 48.50;
	int qtdComodos = 6;

	// Métodos
	public void mostrarDetalhes() {
		JOptionPane.showMessageDialog(null, "O " + this.nome + " possui " + this.tamanho + " m² com um total de " + qtdComodos
				+ " comodos.\nÉ uma excelente opção para quem deseja adquirir" + " seu primeiro imóvel.\n"
				+ "Este imóvel está localizado no condomínio " + this.condominio + "\nO valor de investimento é de R$"
				+ this.preco , "Detalhes da Planta" , JOptionPane.INFORMATION_MESSAGE, null);
	}

	public String registrarVenda(String cliente) {

		String msg = "Parabéns ao sr(a) " + cliente + "! O imóvel foi vendido a ele(a) "
				+ "com sucesso! \nSeja feliz no condomínio: " + this.condominio;

		return msg;

	}

	public String gerarContrato(String cliente) throws IOException {
		
		FileWriter arq = new FileWriter("C:/Users/treinamentosti/Desktop/contratoPlantinha.html");
		PrintWriter gravar = new PrintWriter(arq);

		gravar.println("<center>Construtora Java<br /></center>" 
		+ "<center>Contrato de Venda<br /><br /><br /><br /></center>");
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
