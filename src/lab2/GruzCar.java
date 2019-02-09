package lab2;
import java.awt.*;
import java.util.Set;

class GruzCar extends SamosvalCar {
	
	private Color DopColor;
	public Color getDopColor(){
		return DopColor;
	}
	
	public void setDopColor(Color dc){
		DopColor = dc;
	}	
	
	private boolean Flag;
	public boolean getFlag() {
		return Flag;
	}
	private double Kuzovsize;
	public double getKuzovsize() {
		return Kuzovsize;
	}
	public void setFlag(boolean f){
		Flag = f;
	}	
	
	private boolean Toner;
	public boolean getToner() {
		return Toner;
	}
	
	public void setToner(boolean g){
		Toner = g;
	}

	public GruzCar(int maxSpeed, float weight, Color mainColor, Color dopColor, boolean flag, boolean toner,  double kuzovsize) {
		super(maxSpeed, weight, mainColor);
		DopColor = dopColor;
		Flag = flag;
		Toner = toner;
		Kuzovsize = kuzovsize;
	}

	public void SetPosition(int x, int y, int width, int height) {
		_startPosX = x;
		_startPosY = y;
		_pictureWidth = width;
		_pictureHeight = height;
	}

	public void MoveTransport(Direction direction) {
		float step = MaxSpeed * 100 / Weight;
		switch (direction) {
		case Right:
			if (_startPosX + step < _pictureWidth - carWidth) {
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
			if (_startPosY + step < _pictureHeight - carHeight) {
				_startPosY += step;
			}
			break;
		}
	}

	public void DrawCar(Graphics g) {
		super.DrawCar(g);
		Color blacPen = new Color(0,0,0);
        
        //Тонировка
        if (Toner)
        {
        	g.setColor(blacPen);                
            g.drawRect(_startPosX + 55, _startPosY, 15,15);
            g.fillRect(_startPosX + 55, _startPosY, 15, 15);
        }

        //размер кузова
        if (Kuzovsize!=0)
        {   
        Color greenPen = new Color(34,139,34);
        g.setColor(greenPen);
            g.drawRect(_startPosX + 80, _startPosY - 6, 80 * (int)Kuzovsize, 40);
            g.fillRect(_startPosX + 80, _startPosY - 6, 80 * (int)Kuzovsize, 40);
        }
	}
	
}
