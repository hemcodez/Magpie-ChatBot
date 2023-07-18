public class MagpieChatbot {
        public String getGreeting()
        {
            return "Hello, let's talk.";
        }

        public String getResponse(String statement) {
            String response = "";

                // Checking to see if they mentioned their family
             if (statement.indexOf("mother") >= 0
                    || statement.indexOf("father") >= 0
                    || statement.indexOf("sister") >= 0
                    || statement.indexOf("brother") >= 0) {

                 //if it contains a family member, then response to tell them to say more about their family
                 response = "Tell me more about your family.";

                //Check if the statement contains the word no
            } else if (statement.indexOf(" no ") >= 0) {
                    response = "Why so negative?";



                // 3.12.2.1. EXERCISES


            } else if (statement.indexOf("cat") >= 0
                    || statement.indexOf("dog") >= 0) {
                response = "Tell me more about your pet.";

            } else if (statement.indexOf("Mr. ") >= 0) {
                response = " He must be a good teacher.";

            } else if (statement.indexOf("Mrs. ") >= 0) {
                response = "She sounds like fun.";

            } else if(statement.trim() == "") {
                response = "Say something, please.";

            } else if (statement.indexOf("Nice") >= 0) {
                response = "Is it really nice?";

            } else if (statement.indexOf("Weather") >= 0) {
                 response = "What about the weather?";

             } else if (statement.indexOf("Food") >= 0) {
                 response = "Sounds Tasty.";

                //else, get a random response
         } else {
                response = getRandomResponse();
            }
            //Return the response to the method that called
            return response;
        }

        //Generates a random conversational response
        private String getRandomResponse()
        {
            //Decalre a variable to hold the number of responses
            final int NUMBER_OF_RESPONSES = 6; // -> constant means that the variable value can't be changed

            //Call the random method to generate a random number
            double r = Math.random();
            int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
            String response = "";

            //Check to see if the random number is 1,2,3, or 4 and then assign a response
            if (whichResponse == 0) {
                response = "Interesting, tell me more.";
            } else if (whichResponse == 1) {
                response = "Hmmm.";
            } else if (whichResponse == 2) {
                response = "Wow.";
            } else if (whichResponse == 3) {
                response = "Do you really think so?";
            } else if (whichResponse == 4) {
                response = "You don't say.";
            } else if (whichResponse == 5) {
                response = "Really now?";
            }
            //Return the response to the method that called
            return response;
        }

        //DISPLAY MESSAGES WITH CHATBOT RESPONSES
        public static void main(String[] args)
        {
            MagpieChatbot maggie = new MagpieChatbot();

            System.out.println(maggie.getGreeting());
            System.out.println(">My mother and I talked last night.");
            System.out.println(maggie.getResponse("My mother and I talked last night."));
            System.out.println(">I said no.");
            System.out.println(maggie.getResponse("I said no!"));
            System.out.println(">The weather is nice.");
            System.out.println(maggie.getResponse("The weather is nice."));
            System.out.println(">Do you know my brother?");
            System.out.println(maggie.getResponse("Do you know my brother?"));

            // 3.13.2.1. EXERCISES
            System.out.println(">I like my cat Mittens.");
            System.out.println(maggie.getResponse("I like my cat Mittens."));
            System.out.println(">Mr. Finkelstien is telling us about robotics.");
            System.out.println(maggie.getResponse("Mr. Finkelstien is telling us about robotics."));
            System.out.println(">Ms. Finkelstien is teaching us shakespeare.");
            System.out.println(maggie.getResponse("Mrs. Finkelstien is teaching us shakespeare."));
            System.out.println(">");
            System.out.println(maggie.getResponse(""));
            System.out.println(">Willow trees look so gloomy.");
            System.out.println(maggie.getResponse("Willow trees look so gloomy."));
            System.out.println(">The color red is cool.");
            System.out.println(maggie.getResponse("The color red is cool."));
            System.out.println(">My mother has a dog but no cat.");
            System.out.println(maggie.getResponse("My mother has a dog but no cat."));
        }


    }

