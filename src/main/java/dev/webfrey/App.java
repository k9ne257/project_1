package dev.webfrey;
import static j2html.TagCreator.*;
import static spark.Spark.*;

public class App {
    public static void main( String[] args ){
        System.out.println( "..............................Startin Application............................." );
        port(8080);
        get("/hello", (req, res) -> {
            return html(
            head(),
            body(h1("Hello World!").attr("align","center"))
            ).render();
        });
    }
}
