import java.util.*;

import java.util.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class MinMaxCalculation {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter numbers separated by spaces:");
      String input = scanner.nextLine();
      String[] tokens = input.split(" ");
      Set<Integer> numbers = new HashSet<>();
      
      for (String token : tokens) {
        numbers.add(Integer.parseInt(token));
      }
      
      int min = Collections.min(numbers);
      int max = Collections.max(numbers);
      
      System.out.println("Minimum: " + min);
      System.out.println("Maximum: " + max);
    }
}