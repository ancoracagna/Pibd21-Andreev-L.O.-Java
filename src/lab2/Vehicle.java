package lab2;
import java.awt.*;

public abstract class Vehicle implements ITransport{
	protected int _startPosX;
	protected int _startPosY;
	protected int _pictureWidth;
	protected int _pictureHeight;
	
	protected int MaxSpeed;
	public int getMaxSpeed(){
		return MaxSpeed;
	}
	public void setMaxSpeed(int s){
		MaxSpeed = s;
	}	
	
	protected float Weight;
	public float getWeight(){
		return Weight;
	}	
	public void setWeight(float w){
		Weight = w;
	}	
	
	protected Color MainColor;
	public Color getMainColor(){
		return MainColor;
	}
	public void setMainColor(Color mc){
		MainColor = mc;
	}	
	
	public void SetPosition(int x, int y, int width, int height)
    {
        _startPosX = x;
        _startPosY = y;
        _pictureWidth = width;
        _pictureHeight = height;
    }

    public abstract void DrawCar(Graphics g);
    public abstract void MoveTransport(Direction direction);
}
