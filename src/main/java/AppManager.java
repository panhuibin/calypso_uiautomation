import org.sikuli.script.App;

public class AppManager {
    static App a;

    public static App getApp(){
        if(a==null){
            a = new App("/Applications/VideoEditor_ecomm.app/Contents/MacOS/VideoEditor_ecomm");
        }
        return a;
    }
}
