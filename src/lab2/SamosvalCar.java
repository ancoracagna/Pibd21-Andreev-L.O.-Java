package lab2;
import java.awt.*;

public class SamosvalCar extends Vehicle{
	protected int carWidth = 100;
	protected int carHeight = 60;
	
	public SamosvalCar(int maxSpeed, float weight, Color mainColor)
    {
        MaxSpeed = maxSpeed;
        Weight = weight;
        MainColor = mainColor;
    }
	
	@Override
	public void DrawCar(Graphics g) {
		Color pen = new Color(255, 255, 255);
        
        //  ”«Œ¬
        g.drawRect((int)_startPosX + 80, (int) _startPosY + 15, 80, 20);
        g.fillRect((int)_startPosX + 80,(int) _startPosY + 15, 80, 20);
        //   g.DrawLine(bpen, _startPosX, _startPosY);
        //  ŒÀ≈—¿       
        Color white = new Color (0,0,0);
        g.setColor(white);
        g.drawOval((int)_startPosX + 140, (int)_startPosY + 25, 20, 20);
        g.drawOval((int)_startPosX + 80, (int)_startPosY + 25, 20, 20);

        g.fillOval((int) _startPosX + 140,(int) _startPosY + 25, 20, 20);
        g.fillOval((int) _startPosX + 80,(int) _startPosY + 25, 20, 20);
        // œ≈–≈ƒÕﬂﬂ ◊¿—“‹  ”«Œ¬¿
        g.drawRect((int) _startPosX + 50,(int) _startPosY - 5, 30, 30);
        Color kuzov = new Color(255,255,0);
        g.setColor(kuzov);
        g.fillRect((int) _startPosX + 50,(int) _startPosY - 5, 30, 30);
        Color pen2 = new Color (255,255,255);
        g.setColor(pen2);
        g.drawRect((int) _startPosX + 55,(int) _startPosY, 15, 15);
        g.fillRect((int)_startPosX + 55,(int) _startPosY, 15, 15); 
	}

	@Override
	public void MoveTransport(Direction direction) {
		// TODO Auto-generated method stub
		float step = MaxSpeed * 100 / Weight;
        switch (direction)
        {
            // ‚Ô‡‚Ó
            case Right:
                if (_startPosX + step < _pictureWidth - carWidth)
                {
                    _startPosX += step;
                }
                break;
            //‚ÎÂ‚Ó
            case Left:
                if (_startPosX - step > 0)
                {
                    _startPosX -= step;
                }
                break;
            //‚‚Âı
            case Up:
                if (_startPosY - step > 50)
                {
                    _startPosY -= step;
                }
                break;
            //‚ÌËÁ
            case Down:
                if (_startPosY + step < _pictureHeight - carHeight)
                {
                    _startPosY += step;
                }
                break;
        }
	}
	
}
