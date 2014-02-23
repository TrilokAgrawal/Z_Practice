import java.io.File;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class EvalScript {
    public static void main(String[] args) throws Exception {
        // create a script engine manager
        ScriptEngineManager factory = new ScriptEngineManager();
        // create a JavaScript engine
        ScriptEngine engine = factory.getEngineByName("JavaScript");
       FileReader reader = new FileReader(new File("F:/ISuite-code/Java/Z_Practice/src/test.js"));
        Greeter g = ((Invocable)engine).getInterface(Greeter.class);
        engine.eval(reader);
        
        System.out.println(g.greet("Trilok"));
        // evaluate JavaScript code from String
        engine.eval("print('Hello, World')");
    }
}

