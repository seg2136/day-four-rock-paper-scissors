import.java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.Random;


public class RockPaperScissors {
  public static String computerChoice;

  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> { //do I need to put something (aka .vtl file name) inside the "/"?
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/inputRPS.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}


public static String rpsResults(String userInput) {


public static String randomCompPlay(String compPlayer) {
  Random compRandom = new Random();
  Integer computer = computerRandom.nextInt(3);

  Map<Integer, String> results = new HashMap<>();
  compResults.put(0, "Rock");
  compResults.put(1, "Paper");
  compResults.put(2, "Scissors");

  String choice = compResults.get(computer);
  compChoice = choice;
  System.out.println(choice);
  System.out.println(playerOne); //still have to define variable for playerOne
}


//these are just notes... unless they work!
0 = paper
1 = scissors
2 = rock

// Random.Generator random = new Random()
// Integer computerChoice = random.nextInt(3) //already inserted this at the top
String winnerUser = "You win!";
String winnerComp = "Sorry, the computer wins this time.";
String rpsTie = "It's a tie!"

for (userChoice == "Rock") {
    if (computerChoice == "Rock") {
      return rpsTie;
  } if (computerChoice == "Paper") {
      return winnerComp;
  } if (computerChoice == "Scissors") {
      return winnerUser;
  }
}

for (userChoice == "Paper") {
    if (computerChoice == "Rock") {
      return winnerUser;
  } if (computerChoice == "Paper") {
      return rpsTie;
  } if (computerChoice == "Scissors") {
      return winnerComp;
  }
}

for (userChoice == "Scissors") {
    if (computerChoice == "Rock") {
      return winnerComp;
  } if (computerChoice == "Paper") {
      return winnerUser;
  } if (computerChoice == "Scissors") {
      return rpsTie;
  }
}
