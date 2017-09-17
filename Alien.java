import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Alien extends GameObject{
public Alien(int x, int y, int width, int height) {
	super(x, y, width, height);
	this.x=x;
	this.y=y;
	this.width=width;
	this.height=height;
}
public void update() {
	super.update();
	y+=7;
	Random r1=new Random();
	int num=r1.nextInt(3);
	x-=num;
	
}
public void draw(Graphics g) {
	g.setColor(Color.YELLOW);
	g.drawRect(x, y, width, height);
}
}
