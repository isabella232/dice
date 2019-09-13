### TTS Dice Game - [Live on Heroku](https://glacial-forest-29319.herokuapp.com/game)

Please allow some time for the Heroku server to start up. It sleeps every half hour of inactivity

Import on IntelliJ IDEA with Maven, run the application and open localhost:8080/game in browser.

<img src="https://github.com/welleyloc/dice/blob/master/application%20snippet.png?raw=true" width="500">

**Basic Game Rules**

The player rolls two 6-sided dice.

* Rolling 7 or 11 on the first try is a win 
* Rolling 2, 3 or 12 on the first try is a lose 
* Any other roll on the first try becomes the player's POINT 

If the player rolled POINT, the player continues to reroll until one of two things happens:

* player wins when the player gets the POINT again

* OR loses when the player gets a 7
