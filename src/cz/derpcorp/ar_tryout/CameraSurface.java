/**
 * 
 */
package cz.derpcorp.ar_tryout;

import java.io.IOException;

import android.content.Context;
import android.hardware.Camera;
import android.util.AttributeSet;
import android.view.SurfaceView;

/**
 * @author Alexandr Toptygin
 *
 */
public class CameraSurface extends SurfaceView {
		
	public CameraSurface(Context context, AttributeSet attrSet){
		super(context,attrSet);		
		Camera cam = Camera.open();
		
		try {
			cam.setPreviewDisplay(this.getHolder());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
		cam.startPreview();
	}

}
