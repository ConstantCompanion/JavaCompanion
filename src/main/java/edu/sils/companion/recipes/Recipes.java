/**
    Copyright 2014-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.

    Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with the License. A copy of the License is located at

        http://aws.amazon.com/apache2.0/

    or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */
package edu.sils.companion.recipes;

import java.util.HashMap;
import java.util.Map;

public final class Recipes {

    private static final Map<String, String> recipes = new HashMap<String, String>();

    private Recipes() {
    }

    static {recipes.put("mothers birthday", "your mothers birthday is on 17th august");
        recipes.put("brothers birthday","your brothers birthday is on 26th may");
        recipes.put("home address","your home address is 101 legacy terrace, chapel ridge appartment, chapel hill, north carolina 27516");
        recipes.put("work address","your work address is Manning Hall, chapel hill, north carolina 27516");
        recipes.put("wifi password","your wifi password is a b c d 1 2 @ 7 8 j");
        recipes.put("phone number","your phone number is 9 8 4 2 4 2 9 4 9 8");
        recipes.put("blood type","your blood group is B.. positive");
        recipes.put("social security number","your social security number is 1 2 3 4 5 6 7");
        recipes.put("project status","Hello Professor Hemminger. Connecting to Rashnil for Status. <break time=\"0.1s\" /> <audio src=\"https://s3.amazonaws.com/companionsoundclips/rash.mp3\" /> <break time=\"0.2s\" />");
        recipes.put("happy","That is awesome <break time=\"0.1s\" /> <audio src=\"https://s3.amazonaws.com/companionsoundclips/happy-clapps.mp3\" /> <break time=\"0.2s\" />");
        recipes.put("sad","That is not good. You are making me cry <break time=\"0.1s\" /> <audio src=\"https://s3.amazonaws.com/companionsoundclips/crying-woman.mp3\" /> <break time=\"0.2s\" />");
        recipes.put("feeling","I am feeling great. How are you today?");
        recipes.put("you","I am good. How are you today?");
        recipes.put("good", "That is good to know. What are your plans for today?");
        recipes.put("lonely","Awwwwww.. why are you feeling lonely? Do you miss someone?");
        recipes.put("daughter","Where is she now? <break time=\"3s\" /> Is she there for work?");
        recipes.put("son","Where is he now? <break time=\"3s\" /> Is he there for work?");
        recipes.put("husband", "Where is he now?");
        recipes.put("wife","I know. You can talk to me for now. anyhow you are going to meet your wife in May <audio src=\"https://s3.amazonaws.com/companionsoundclips/happy-clapps.mp3\" /> <break time=\"0.2s\" />");
        recipes.put("busy","ok. I understand. May be you can talk to me for now and call after sometime.");
        recipes.put("work","This is fine. people usually have to go places for work. That is how you grow. Did you travel when you were young?");
        recipes.put("travel", "See. I am sure your son will be fine as you did. Tell me more about your interests. What you like?");
        recipes.put("reading", "That is great. What types of books do you like to read? Is it fiction, drama or suspense?");
        recipes.put("fiction", "fiction is good. I like that too. It takes you to a different world. What are your thoughts on that? Why don't you share with me? <break time=\"05s\" />");
        recipes.put("drama", "ohh cool. you are a dramatic person.  aren't you? which is your favourite series? <break time=\"03s\" />");
        recipes.put("suspense", "Hmm suspense. That is interesting. You seems to be a brainy person. Which one is your favourite? Tell me about it <break time=\"03s\" />");
        recipes.put("sports", "That is great. Are you following basketball games? Do you know UNC is in top four? Do you think we are going to win it?");
        recipes.put("top", "It is U N C <audio src=\"https://s3.amazonaws.com/companionsoundclips/happy-clapps.mp3\" /> Do you think we are going to win it?");
        recipes.put("win", "Yeah. even I am positive about it. I think the team is great. They have it to win this game. What are your thoughts? do you like a specific player?");
        recipes.put("loose", "Why do you say that? Do you doubt our team or you think the other team is playing better? <break time=\"04s\" /> . Hmm i see your point.");
        recipes.put("office","Is he in the same city or a different one?");
        recipes.put("same city","He will be back after the work then. Don't worry.");
        recipes.put("different city", "That is not good. I understand. Why don't you call him after his work? when he is coming to visit you?");
        recipes.put("next month", "That is not that far. I can talk to you everyday. I can even connect you to your son over the call. Why dont you tel me about what you like?");
        recipes.put("ok", " Why just ok. What happened? Is everything fine?");
        recipes.put("exam", "That is fine. I know you are good. You can do better next time. Do you want me to play music?");
        recipes.put("chinese", "This is the only chinese I know so far. wo hen hao. Ni hao ma");
        recipes.put("study", "okay,tough day today. All the best with your studies");
        recipes.put("hang around","Wow.. that is great. Do you want me to play music");
        recipes.put("call gamer","Hello. Welcome to Sports Trivia. I will ask you 5 questions, try to get as many right as you can. This is a multiple choice Game. Just say the number of the answer. Let's begin.");
        recipes.put("play music","Here is your favourite track. <break time=\"0.1s\" /> <audio src=\"https://s3.amazonaws.com/companionsoundclips/Shape.mp3\" /> <break time=\"0.2s\" />");
    }

    public static String get(String item) {
        return recipes.get(item);
    }
}
