import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        LocalDate dataAtual, dataEspecifica, dataConvertida;
        DateTimeFormatter frmtReceber, frmtExibir, frmtHora;
        int dia, mes, ano;
        Month objetoMes;
        String dataString, horaFormatada, texto;
        LocalTime horaAtual, horaFutura, meioDia;


        System.out.println("Trabalhando com datas em Java");

        dataAtual = LocalDate.now();
        System.out.println("Data Atual: " + dataAtual);

        dataEspecifica = LocalDate.of(2025, 3, 18);
        System.out.println("Data Especifica: " + dataEspecifica);

        ano = dataAtual.getYear();
        mes = dataAtual.getMonthValue();
        dia = dataAtual.getDayOfMonth();

        System.out.println("Dia: " + dia);
        System.out.println("Mês: " + mes);
        System.out.println("Ano: " + ano);

        objetoMes = dataAtual.getMonth();
        System.out.println(objetoMes.getDisplayName(TextStyle.NARROW, new Locale("pt", "BR")));

        //System.out.println("Digite uma data (dd/MM/yyyy)");
        //dataString = entrada.nextLine();

        frmtReceber = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        frmtExibir = DateTimeFormatter.ofPattern("dd/MMMM/yyyy", new Locale("en", "USA"));

        //dataConvertida = LocalDate.parse(dataString, frmtReceber);
        //System.out.println("Data convertida: " + dataConvertida);

        System.out.println("Data Atual: " + dataAtual.format(frmtExibir));
        //System.out.println("Data Convertida: " + dataConvertida.format(frmtReceber));


        System.out.println("\n\n LocalTime \n");

        horaAtual = LocalTime.now();
        System.out.println("Hora Atual: " + horaAtual);

        horaFutura = horaAtual.plusHours(1);
        horaFutura = horaFutura.plusMinutes(10);

        System.out.println("Hora Atual somando 1:10 " + horaFutura);

        horaFutura = horaFutura.minusHours(1);
        horaFutura = horaFutura.minusMinutes(10);

        System.out.println("Hora Atual diminuindo 1:10 " + horaFutura);

        frmtHora = DateTimeFormatter.ofPattern("HH:mm:ss");

        horaFormatada = horaAtual.format(frmtHora);
        System.out.println("Hora formatada: " + horaFormatada);

        meioDia = LocalTime.of(12, 0);

        System.out.println("É antes do Meio dia? " + horaAtual.isBefore(meioDia));

        System.out.println("\n\n Manipulação de Texto \n");

        texto = "    Hello, world!   ";

        System.out.println("Texto original: " + texto);
        System.out.println("Contagem caracteres: " + texto.length());
        System.out.println("Todas as letras em MAIUSCULO: " + texto.toUpperCase());
        System.out.println("Todas as letras em minusculo: " + texto.toLowerCase());
        System.out.println("Removendo espaços em branco: " + texto.trim());
        System.out.println("Substituindo caracteres: " + texto.replace("Hello", "Hi"));
        System.out.println("Querando a String do caractere 7 em diante: " + texto.substring(7));
        System.out.println("Quebrando a String do caracter 3 ao 8: " + texto.substring(3, 8));

        System.out.println("Buscando 'hello' dentro do texto: " + texto.toLowerCase().contains("hello"));
        System.out.println("Meu texto começa com 'hello'? " + texto.trim().startsWith("Hello"));
        System.out.println("Meu texto termina com 'world!? " + texto.endsWith("world!"));
        System.out.println("primeira ocorrencia da letra 'o': " + texto.indexOf("o"));
        System.out.println("ultima ocorrencia da letra 'o': " + texto.lastIndexOf("o"));

        //Separando String em um array

        String[] partes = texto.split(",");
        System.out.println("Texto dividido em strings");
        for (String s : partes) {
            System.out.println(s.trim());
        }

        if(texto.trim().equals("hello, world!")) System.out.println("Texto é igual");
        if(texto.trim().equalsIgnoreCase("hello, World!")) System.out.println("Texto é igual");






        
    }
}
