package lab1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;
import java.util.Set;

public class Samosval {
	private float _startPosX;
	private float _startPosY;
	private int _pictureWidth;
	private int _pictureHeight;
	private int shipWidth = 100;
	private int shipHeight = 60;
	private int MaxSpeed;
	public int getMaxSpeed(){
		return MaxSpeed;
	}
	private void setMaxSpeed(int value){
		MaxSpeed = value;
	}
	
	private float Weight;
	public float getWeight(){
		return Weight;
	}	
	private void setWeight(float value){
	Weight = value;
	}
	
	private Color MainColor;
	public Color getMainColor(){
		return MainColor;
	}
	private void setMainColor(Color value){
	MainColor = value;
	}
	
	private Color DopColor;
	public Color getDopColor(){
		return DopColor;
	}
	private void setDopColor(Color value){
	DopColor = value;
	}
	
	public Samosval(int maxSpeed, float weight, Color mainColor, Color dopColor) {
		setMaxSpeed (maxSpeed);
		setWeight(weight);
		setMainColor(mainColor);
		setDopColor (dopColor);
	}

	public void SetPosition(int x, int y, int width, int height) {
		_startPosX = x;
		_startPosY = y;
		_pictureWidth = width;
		_pictureHeight = height;
	}

	public void MoveTransport(Direction direction) {

		float step = getMaxSpeed() * 100 / getWeight();
		switch (direction) {
		case Right:
			if (_startPosX + step < _pictureWidth - shipWidth) {
				_startPosX += step;
			}
			break;
		case Left:
			if (_startPosX - step > 0) {
				_startPosX -= step;
			}
			break;
		case Up:
			if (_startPosY - step - 10 > 0) {
				_startPosY -= step;
			}
			break;
		case Down:
			if (_startPosY + step < _pictureHeight - shipHeight) {
				_startPosY += step;
			}
			break;
		}
	}

	public void DrawShip(Graphics g) {
		Color pen = new Color(255, 255, 255);
        
        // ÊÓÇÎÂ
        g.drawRect((int)_startPosX + 80, (int) _startPosY + 15, 80, 20);
        g.fillRect((int)_startPosX + 80,(int) _startPosY + 15, 80, 20);
        //   g.DrawLine(bpen, _startPosX, _startPosY);
        // ÊÎËÅÑÀ       
        Color white = new Color (0,0,0);
        g.setColor(white);
        g.drawOval((int)_startPosX + 140, (int)_startPosY + 25, 20, 20);
        g.drawOval((int)_startPosX + 80, (int)_startPosY + 25, 20, 20);

        g.fillOval((int) _startPosX + 140,(int) _startPosY + 25, 20, 20);
        g.fillOval((int) _startPosX + 80,(int) _startPosY + 25, 20, 20);
        // ÏÅÐÅÄÍßß ×ÀÑÒÜ ÊÓÇÎÂÀ
        g.drawRect((int) _startPosX + 50,(int) _startPosY - 5, 30, 30);
        Color kuzov = new Color(255,255,0);
        g.setColor(kuzov);
        g.fillRect((int) _startPosX + 50,(int) _startPosY - 5, 30, 30);
        Color pen2 = new Color (255,255,255);
        g.setColor(pen2);
        g.drawRect((int) _startPosX + 55,(int) _startPosY, 15, 15);
        g.fillRect((int)_startPosX + 55,(int) _startPosY, 15, 15); 
	}
}
