
package br.com.freelacademy.model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Usuario {
    
    
    //metodo para cadastrar usuario
    
    public void cadastrar(String nome, String email, String senha) throws SQLException {
        String sql = "INSERT INTO tb_freelancer (nome, email, senha) VALUES (?, ?, ?)";
        try (Connection con = ConexaoDB.getConexao(); PreparedStatement stmt = con.prepareStatement(sql)){              
                stmt.setString(1, nome);
                stmt.setString(2, email);
                stmt.setString(3, nome);
                stmt.executeUpdate();
        
        }

    }
    
    //metodo para login de usuario 
    
    public boolean login(String email, String senha) throws SQLException{
        String sql = "SELECT * FROM tb_freelancer WHERE email = ? AND senha = ?";
        try (Connection con = ConexaoDB.getConexao(); PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setString(1, email);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
       
            }
        }  
    }
