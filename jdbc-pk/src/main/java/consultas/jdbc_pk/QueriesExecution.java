package consultas.jdbc_pk;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QueriesExecution {
    public static void main(String[] args) {

        AlunoDAO alunoDAO = new AlunoDAO();

        //  Consulta
        List<Aluno> alunos = alunoDAO.list();

        alunos.stream().forEach(System.out::println);


        //Consulta com filtro
        Aluno alunoParaConsulta = alunoDAO.getById(1);

        //System.out.println(alunoParaConsulta);


        // Insere
        Aluno alunoParaInsercao = new Aluno(
                "Matheus",
                43,
                "SP"
        );

        //alunoDAO.create(alunoParaInsercao);


        // Deleta
        //alunoDAO.delete(1);


        // Atualiza
        Aluno alunoParaAtualizar = alunoDAO.getById(3);
        alunoParaAtualizar.setNome("Joaquim");
        alunoParaAtualizar.setIdade(18);
        alunoParaAtualizar.setEstado("RS");

        //alunoDAO.update(alunoParaAtualizar);
    }
}
