package partice;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliProgram {

	public static void main(String[] args) throws Throwable {
		
		Screen scr = new Screen();
	Pattern ele = new Pattern("C:\\Users\\Shobha\\Pictures\\Screenshots\\Search2.png");
	scr.type(ele, "paint");
	
	Robot rob = new Robot();
	rob.keyPress(KeyEvent.VK_ENTER);
	rob.keyRelease(KeyEvent.VK_ENTER);
	
	//Pattern ele2 = new Pattern("C:\\Users\\Shobha\\Pictures\\Screenshots\\Page.png");
	//scr.type(ele2, "Shobha");
	
}

}
