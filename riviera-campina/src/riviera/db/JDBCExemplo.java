package riviera.db;
import java.sql.*;
import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;

import com.mysql.jdbc.PreparedStatement;

public class JDBCExemplo
{
	public static void main(String[] args) throws Exception
	{
		Connection connection = new ConnectionFactory().getConnection();
		Scanner teclado = new Scanner(System.in);
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		//String S = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss").format(timestamp);
		//System.out.println(timestamp.getTime());
		
		opcoesSelecao();
		int opcaoGerenciamento = teclado.nextInt();
		teclado.nextLine();
		
		if (opcaoGerenciamento == 1)
		{
			System.out.print("O cliente já está registrado? ");
			int statusRegistro = teclado.nextInt();
			teclado.nextLine();
			
			if (statusRegistro == 1)
			{
				System.out.println("> Tela de criação de contrato para o cliente selecionado");
			}
			else if (statusRegistro == 0)
			{
				System.out.print("Nome do cliente: ");
				String nome = teclado.nextLine();
				System.out.print("CPF do cliente: ");
				String cpf = teclado.nextLine();
				System.out.print("Data de nascimento do cliente: ");
				String nascimento = teclado.nextLine();
				System.out.println("Endereço do cliente: ");
				System.out.print("> Linha 1: ");
				String enderecoLinha1 = teclado.nextLine();
				System.out.print("> Linha 2: ");
				String enderecoLinha2 = teclado.nextLine();
				String endereco = enderecoLinha1 + "\n" + enderecoLinha2;
				System.out.print("Número do cartão de crédito do cliente: ");
				String cartao = teclado.nextLine();
				boolean isHospedado = true;
				System.out.print("Tipo de contrato do cliente: ");
				String contrato = teclado.nextLine();
				
				String sql = "insert into clientes (nome, cpf, nascimento, endereco, cartao, is_hospedado, contrato, data_registro)" +
							 "values (?, ?, ?, ?, ?, ?, ?, ?)";
				
				PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
				stmt.setString(1, nome);
				stmt.setString(2, cpf);
				stmt.setString(3, nascimento);
				stmt.setString(4, endereco);
				stmt.setString(5, cartao);
				stmt.setBoolean(6, isHospedado);
				stmt.setString(7, contrato);
				stmt.setInt(8, (int) timestamp.getTime());
				
				stmt.execute();
				System.out.println("Cliente adicionado com sucesso!");
			}
			
		}
		
		teclado.close();
		connection.close();
	}
	
	public static void opcoesSelecao()
	{
		System.out.println("---------- Hotel Riviera Campina - Sistema de gerenciamento ----------\n");
		System.out.println("Bem-vindo ao sistema básico de gerenciamento do Hotel Riviera Campina\n" + 
							"Escolha uma das opções abaixo para fazer suas alterações:\n" +
							"\n" +
							"1. Adicionar novo contrato de cliente");
		System.out.print("Insira a opção desejada: ");
	}
	
	
}