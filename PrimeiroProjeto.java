import java.util.Scanner;
import java.text.DecimalFormat;

public class PrimeiroProjeto {

	public static void main(String[] args) {
		float nProva1, nProjeto1, nExercicios1, nContribuicao1;
        String nomeAluno, disciplina;
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Informe o nome do aluno: ");
        
        nomeAluno=entrada.nextLine();
        System.out.println("Informe a disciplina: ");
        
        disciplina=entrada.nextLine();
        System.out.println("Informe a nota da prova do aluno no 1º Bimestre: ");
       
        nProva1=entrada.nextFloat();
        System.out.println("Informe a nota do projeto do aluno no 1º Bimestre: ");
        
        nProjeto1=entrada.nextFloat();
        System.out.println("Informe a nota dos exercícios do aluno no 1º Bimestre: ");
       
        nExercicios1=entrada.nextFloat();
        System.out.println("Informe a nota de contribuição do aluno no 1º Bimestre: ");
        
        nContribuicao1=entrada.nextFloat();
        float nProva2, nProjeto2, nExercicios2, nContribuicao2;
        System.out.println("Informe a nota da prova do aluno no 2º Bimestre: ");
        
        nProva2=entrada.nextFloat();
        System.out.println("Informe a nota do projeto do aluno no 2º Bimestre: ");
       
        nProjeto2=entrada.nextFloat();
        System.out.println("Informe a nota dos exercícios do aluno no 2º Bimestre: ");
        
        nExercicios2=entrada.nextFloat();
        System.out.println("Informe a nota de contribuição do aluno no 2º Bimestre: ");
        
        nContribuicao2=entrada.nextFloat();
        DecimalFormat formatador = new DecimalFormat("0.00");
        float nota1Bimestre;
        
        nota1Bimestre=((nProva1 * 3 + nProjeto1 * 3 + nExercicios1 * 2 + nContribuicao1 * 3)/11);
        System.out.println("A nota final do aluno " + nomeAluno + " no 1º Bimestre em " + disciplina + " foi: " + formatador.format(nota1Bimestre));
        
        float nota2Bimestre;
        nota2Bimestre=((nProva2 * 3 + nProjeto2 * 3 + nExercicios2 * 2 + nContribuicao2 * 3)/11);
        
        float mediaSemestral;
        mediaSemestral= ((nota1Bimestre + nota2Bimestre) / 2);
        System.out.println("A média semestral do aluno " + nomeAluno + " em " + disciplina + " é: " + formatador.format(mediaSemestral));
        
        if (mediaSemestral >= 8) {
            System.out.println("O aluno " + nomeAluno + " está aprovado!");
        } else if (mediaSemestral<8){
            System.out.println("O aluno " + nomeAluno + " está em recuperação!");
        } if (mediaSemestral<8) {
            float notaMinima;
            notaMinima= (10 - mediaSemestral);
            System.out.println("Para ser aprovado o aluno " + nomeAluno + " precisa tirar uma pontuação de " + formatador.format(notaMinima) + " na prova final.");
		
		
		
	}
		
		
		
		
	}

}
 