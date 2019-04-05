import java.util.*;
import java.lang.*;

public class Digits
{
    //The list of digits from the number used to //construct this object
    ArrayList<Integer> digitList = new ArrayList<>();

    //Constructs a Digits object that
    //represents num
    public Digits (int num)
    {
        //implemented in part (a)
        for (int i = num; i > 0; i = i%10) {
            digitList.add(i);
            i = i/10;
        }
    }
    public boolean isStrictlyIncreasing()
    {
        boolean bool = true;
        //implemented in part (b)
        for(int j = 0; j < digitList.size()-1; j++)
        {
            if(digitList.get(j) > digitList.get(j+1))
            {
                bool = false;
            }
        }
        return bool;
    }
    //Extra method to make the runner easier to read
    public ArrayList<Integer> getDigitList()
    {
        return digitList;
    }

}
