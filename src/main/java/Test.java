import org.sikuli.script.*;
import org.sikuli.basics.Debug;

class Test {
    public static void main(String[] args) throws FindFailed {
        Debug.setDebugLevel(3);
        App a = new App("/Applications/VideoEditor_ecomm.app/Contents/MacOS/VideoEditor_ecomm");
        a.focus();
        Region region =a.window();
        Screen s = new Screen();
        try{
            region.click("imgs/spotlight.png");
            region.wait("imgs/spotlight-input.png");
            region.click();
            region.write("hello world#ENTER.");
        }
        catch(FindFailed e){
            e.printStackTrace();
        }
    }
}
