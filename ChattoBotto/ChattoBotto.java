import java.util.Scanner;
import java.io.*;


public class ChattoBotto {
  public static void main(String[] args)
  throws StringIndexOutOfBoundsException
  	{
  		ChatBot dude = new ChatBot();
  		System.out.println (dude.getGreeting());
  		Scanner in = new Scanner (System.in);
  		String statement = in.nextLine();
      String lowerCaseStatement = statement.toLowerCase();
      String[] words = new String[200];
      int k = 0;
      String temp;
      int temporaryNumber = 0;

  		while (lowerCaseStatement.indexOf("bye") < 0)
  		{
        lowerCaseStatement = statement.toLowerCase();
        String memAlphabet = statement.trim();
        String lowerCaseMemAlphabet = memAlphabet.toLowerCase();

        int periodPosition ;
        String periodPositionB ;
        Boolean periodPositionC ;

        try {
         periodPosition = lowerCaseMemAlphabet.indexOf(".");
         periodPositionB = lowerCaseMemAlphabet.substring(periodPosition, periodPosition+1);
         periodPositionC = periodPositionB.equals(".");
         } catch (StringIndexOutOfBoundsException e1) {
         periodPosition = lowerCaseMemAlphabet.length();
         periodPositionB = lowerCaseMemAlphabet.substring(periodPosition-1, periodPosition);
         periodPositionC = true;
         }
        if (periodPositionC == false) {System.exit(0);}

        String noPeriod = lowerCaseMemAlphabet.substring(0,periodPosition) +" ";
        String remainSentence = noPeriod;

        int wordCount = 0;
        for (int i = 0; i <remainSentence.length(); i++) {
          if (remainSentence.charAt(i) == ' ') {
            wordCount++;
            }
          }
        for(int i = k; i < wordCount+k; i++)
        {
          int word2space = remainSentence.indexOf(" ");
          String word = remainSentence.substring(0,word2space);
          words[i]= word;
          remainSentence = remainSentence.substring(word2space+1);
        }
        k+=wordCount;
        System.out.println("\n");
        for(int i = 0; i < k; i++)
        {
          for(int j = i+1; j< k; j++)
          {
            int c = words[i].compareTo(words[j]);
            if(c > 0)
            {
            temp = words[i];
            words[i]=words[j];
            words[j]=temp;
            }
            if(c == 0){
              words[j]=words[j+1];
              words[k]=null;
              k = k-1;
            }
          }
          System.out.println(i+1+".word| " + words[i]+" | \n");
        }
        System.out.println(dude.getResponse(statement));
        System.out.println("\n");
  			statement = in.nextLine();

        if(k== 199){
          k = 0;
        }
  		}
  	}

  }
