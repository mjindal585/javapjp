import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.*;

public class Pro2 {

	public static void main(String[] args) {
ScriptEngineManager se=new ScriptEngineManager();
ScriptEngine e=se.getEngineByName("nashorn");

try {
	e.eval(new FileReader("D:\\wipro\\Introduction To Nashorn\\Demo.js"));
	Invocable i=(Invocable)e;
	boolean s=(boolean) i.invokeFunction("r",17 );
	System.out.println(s);
} catch (NoSuchMethodException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
} catch (ScriptException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}catch (FileNotFoundException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
	}

}