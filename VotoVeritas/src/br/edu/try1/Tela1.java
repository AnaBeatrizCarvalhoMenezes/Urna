package br.edu.try1;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import br.edu.try2.*;

public class Tela1 extends Teclado{

	public static void Tela1() {
		LocalDateTime dataHoraAtual = LocalDateTime.now();
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String dataHoraFormatada = dataHoraAtual.format(formatter1);
		System.out.println(dataHoraFormatada + "\n");
		
		System.out.println("Urna pronta para receber o seu voto");
		System.out.println("Use o teclado numérico para digitar o seu voto \n");
		System.out.println("Aperte a tecla CONFIRMA para iniciar seu voto");
		
		if (ClicarConfirma()==true){
			Tela2();
		}else {
			
		}
	}
}
