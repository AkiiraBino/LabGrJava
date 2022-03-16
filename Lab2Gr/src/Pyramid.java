
public class Pyramid extends Shape {

	double height;
	double S;
	Pyramid(double h, double s)
	{
		height = h;
		S = s;
		volume = S * height / 3;
	}
	
}
