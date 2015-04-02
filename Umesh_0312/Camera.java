import java.util.*;

public class Camera{
    public static void main(String[] args){

        SelectCamera camera = new SelectCamera();
          // to select front camera
          camera.frontCamera();
          // to select back camera
          camera.backCamera();

        FlashLight light = new FlashLight();
          // if flashlight is on
            light.flashOn();
          // if flashlight is off
            light.flashOff();

        Mode  mode = new Mode();
          // if video mode required
            mode.videoMode();
          // if camera mode required
            mode.cameraMode();

        Shutter shot = new Shutter();
          // if shot is taken
            shot.pressShutter();
            shot.storeInGallery();
    }
}

class SelectCamera{
    String frontCamera(){
    /*logic*/
    }
    String backCamera(){
    /*logic*/
    }
}

class FlashLight{
    String flashOn(){/*logic*/}
    String flashOff(){/*logic*/}
}

class Mode{
    String videoMode(){/*logic*/}
    String cameraMode(){/*logic*/}
}

class Shutter{
    String pressShutter(){/*logic*/}
    String storeInGallery(){/*logic*/}
}
