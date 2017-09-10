import org.opencv.core.Mat;
import org.sikuli.script.*;

public class actions {

    public static void loadVideo(){
        Screen s = new Screen();
        try{
            s.findText("File").click();
            s.findText("Open files").click();
            //s.findAllText("File");
            //s.click("imgs/menu_file.png");
            //Match open_file_img = s.wait("imgs/menu_file_open_file.png");
            //open_file_img.click();
            App.focusedWindow().findText("Browse").click();
            App.focusedWindow().findText("test_like2.mp4").click();
            App.focusedWindow().findText("Initialize").click();


        }
        catch(FindFailed e){
            e.printStackTrace();
        }
    }
}
