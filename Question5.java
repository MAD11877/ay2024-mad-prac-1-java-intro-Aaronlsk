import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);  
    ArrayList<Integer> numList = new ArrayList<>();
    //System.out.println("Enter the number of integers you would like: ");
    int num = in.nextInt();
    for (int i = num; i >= 1; i--) {
      //System.out.println("Enter a number: ");
      int number = in.nextInt();
      numList.add(number);
    }

    int mode = 0;
    int maxCount = 0;

    for (int i = 0; i < numList.size(); i++) {
        int count = 0;
        int currentNumber = numList.get(i);

        for (int j = 0; j < numList.size(); j++) {
            if (numList.get(j) == currentNumber) {
                count++;
            }
        }

        if (count > maxCount) {
            maxCount = count;
            mode = currentNumber;
        }
    }

    System.out.println(mode);
  }
}
