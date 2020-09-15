
/**
 * A class to display a picture of a monitor and a man that nac be put into
 * black and white and then changed back to color.
 * 
 * @author Brian McMahon G00274188
 * @version 1.0.0
 */
public class Picture
{
    // instance variables - replace the example below with your own
    private Square monitorOut;
    private Square monitorIn;
    private Square monitorStand;
    private Square monitorStandTwo;
    private Triangle logo;
    private Circle powerButton;
    private Person man;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        monitorOut = new Square();
        monitorIn = new Square();
        monitorStand = new Square();
        monitorStandTwo = new Square();
        logo = new Triangle();
        powerButton = new Circle();
        man = new Person();
        drawn = false;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void draw()
    {
        if(!drawn)
        {
            monitorOut.changeSize(150);
            monitorOut.changeColor("black");
            monitorOut.moveVertical(-20);
            monitorOut.moveHorizontal(-100);
            monitorOut.makeVisible();
            
            monitorIn.changeSize(130);
            monitorIn.changeColor("blue");
            monitorIn.moveVertical(-10);
            monitorIn.moveHorizontal(-90);
            monitorIn.makeVisible();
            
            monitorStand.changeSize(50);
            monitorStand.changeColor("black");
            monitorStand.moveVertical(120);
            monitorStand.moveHorizontal(-50);
            monitorStand.makeVisible();
            
            monitorStandTwo.changeSize(100);
            monitorStandTwo.changeColor("black");
            monitorStandTwo.moveVertical(170);
            monitorStandTwo.moveHorizontal(-75);
            monitorStandTwo.makeVisible();
            
            logo.changeSize(20,10);
            logo.changeColor("green");
            logo.moveVertical(120);
            logo.moveHorizontal(75);
            logo.makeVisible();
            
            powerButton.changeSize(5);
            powerButton.changeColor("red");
            powerButton.moveVertical(152);
            powerButton.moveHorizontal(-15);
            powerButton.makeVisible();
            
            man.changeSize(100, 60);
            man.changeColor("black");
            man.moveVertical(40);
            man.moveHorizontal(-200);
            man.makeVisible();
        }
    }
    public void setBlackAndWhite()
    {
        monitorIn.changeColor("white");
        logo.changeColor("white");
        powerButton.changeColor("white");
    }
    public void setColor()
    {
        monitorIn.changeColor("blue");
        logo.changeColor("green");
        powerButton.changeColor("red");
    }
}
