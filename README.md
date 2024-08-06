This is a Java program that calculates the True Shooting Percentage (TS%) of a basketball player. By definition, true shooting percentage (TS%) is a statistic that measures how efficiently a player shoots the ball based on their total points, field goal attempts, and free throw attempts. In other words this measures how well a player can put the ball in the basket relative to everyone else. In future iterations of this program, I'll create grab data from every era of NBA basketball to compare the player against their competition. For now this is simply a basic calculator. 

Instructions: 
1. Compile: javac trueShootingCalc.java
2. Run: java trueShooting

Input Data:
The program will prompt you to enter the player's first initial, last name, total points, field goal attempts, and free throw attempts.

Formula used to make calculations: 
Total points / (2 * (Total Field Goal Attempts + (0.44 * Total Free Throw Attempts)) 

Example: 
*****************************************
State the player's first initial: J

State the player's last name: Doe

Player's total points: 1000

Player's total field goal attempts: 800

Player's total free throw attempts: 500


Player name: J.Doe

TS%: 0.588
*****************************************
