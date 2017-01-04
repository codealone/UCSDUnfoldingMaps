import processing.core.PApplet;
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.providers.MBTilesMapProvider;
import de.fhpotsdam.unfolding.utils.MapUtils;

/**
 * This example uses a local MBTiles file. Thus, it does not need an Internet connection to load tiles.
 */
public class OfflineMapApp extends PApplet {

	public static String mbTilesString = "blankLight-1-3.mbtiles";

	UnfoldingMap map;

	public void setup() {
		size(800, 600, OPENGL);

		map = new UnfoldingMap(this, new MBTilesMapProvider(mbTilesString));
		MapUtils.createDefaultEventDispatcher(this, map);
		map.setZoomRange(1, 3);
		
	}

	public void draw() {
		background(0);
		map.draw();
		drawbuttons();
		
	}
	public void keypressed(){
		if(key=='w')
			background(255,255,255);
	}
	private void drawbuttons(){
		fill(255,255,255);
		rect(100,100,25,25);
		fill(100,100,100);
		rect(100,150,25,25);
	}
	public void mouseReleased(){
		if(mouseX>100 && mouseX<125 && mouseY>100 && mouseY<125){
			background(255,255,255);
		}
		else if(mouseX>100 && mouseX<125 && mouseY>150 && mouseY<175){
			background(100,100,100);
		}
			
	}
}