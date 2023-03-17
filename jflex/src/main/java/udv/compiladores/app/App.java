package udv.compiladores.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Objects;


/**
 * Hello world!
 *
 */
public class App 
{
	public static ArrayList<token> tokens = new ArrayList<token>(); 

    public static void main( String[] args ) throws IOException
    {
    	
        System.out.println( "Solución examen!" );
        
        String testString ="{\r\n"
        		+ "  \"departamento\":8,\r\n"
        		+ "  \"nombredepto\":\"Ventas\",\r\n"
        		+ "  \"director\": \"Juan Rodriguez\",\r\n"
        		+ "  \"empleados\":[\r\n"
        		+ "    {\r\n"
        		+ "      \"nombre\":\"Pedro\",\r\n"
        		+ "      \"apellido\":\"Fernandez\"\r\n"
        		+ "    },{\r\n"
        		+ "      \"nombre\":\"Jacinto\",\r\n"
        		+ "      \"apellido\":\"Benavente\"\r\n"
        		+ "    } \r\n"
        		+ "  ]\r\n"
        		+ "}";
        Reader stringReader = new StringReader(testString);
        DemoLexer lexer = new DemoLexer(stringReader);
        
        token tk = lexer.next_token();

        String html = "<html><table width=\"100%\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#000000\"><tr><th>ID</th><th>Lexema</th><th>ER</th></tr>";
        
        PrintWriter writer = new PrintWriter("salida.html", "UTF-8");
        writer.println(html);
        
        
        while(tk.getER()!=null) {
        	String line = "<tr><td>"+tk.gettokenType()+"</td><td>"+tk.getLexema()+"</td><td>"+tk.getER()+"</td></tr>";
            writer.println(line);
        	tk = lexer.next_token();
        }
        
        html ="</table></html>";
        writer.println(html);

        writer.close();
    }
}
