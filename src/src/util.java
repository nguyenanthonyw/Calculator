import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * This class is back end of the calculator
 */
public class util {

    public static int reset;

    public static void clearScreen() {
	if (util.reset == 1) {
	    mainGUI.textField.setText("");
	    util.reset = 0;
	}

    }

    public static String getReturnString(String old, String add) {
	String complete = old + add;
	return complete;
    }

    public static String results(String string) throws ScriptException {
	ScriptEngineManager manager = new ScriptEngineManager();
	ScriptEngine engine = manager.getEngineByName("js");
	Object result = engine.eval(string);
	reset = 1;
	return String.valueOf(result);
    }

}
