package Introduction;
import java.util.*;


public class Calculator
{
    private double input1;
    private double input2;

    public Calculator(double Inputfirst, double Inputsecond)
    {
        input1 = Inputfirst;
        input2 = Inputsecond;
    }

    public double getFirstInput()
    {
        return input1;
    }


    public double getSecondInput()
    {
        return input2;
    }

    public double multiply()
    {
        
        return input1*input2;
    }

    public double divide()
    {
        if (input2 == 0)
        {
            return Double.NaN;
        }
        else
        {
            return input1/input2;
        }
        
    }

    public double add()
    {
        return input1+input2;
    }

    public double subtract()
    {
        return input1 - input2;
    }

    public double power()
    {
        return Math.pow(input1, input2);
    }
}
