package hw6.blocks;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class key{
	
	int scale = 24;
	public Image pImage;
	public ImageView pblock;
	
	public key(){ // built constructor so that I can build out walls in map builder

		pImage = new Image("file:/Users/connorgreen/git/SoftwareEngineering2018/chip/textures/greenKey.png", 25, 25, true, true);	
		pblock = new ImageView(pImage);		
	}
	
	public Image getImageView(){
		return pImage;
	}
}