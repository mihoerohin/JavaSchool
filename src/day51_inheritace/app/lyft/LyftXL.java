package day51_inheritace.app.lyft;

public class LyftXL extends Lift{

    public LyftXL(String driver) {
        super(driver);
    }

    @Override
    public double calculate(int mile) {
        return super.calculate(mile) * 1.1;
    }
}



