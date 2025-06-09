# 🎲 Java Number Guessing Game

An interactive console-based number guessing game developed in Java with modular structure, user-friendly features, and robust error handling.

---

## 👨‍💻 Developed By

**Group Name:** The Code Explorers  
**Team Members:**
- Ashutosh Kumar  
- Avnish Kumar  
- Juber Khan  
- Samarth Choudhary  

---

## 📌 Project Overview

This Java program allows users to play a number guessing game with multiple difficulty levels. The computer randomly selects a number, and the user tries to guess it. Feedback is given after each guess — whether it's too high, too low, or correct.

---

## 🎮 How the Game Works

1. Choose a difficulty level:
   - Easy: 1–50
   - Medium: 1–100
   - Hard: 1–200
2. The computer picks a random number in that range.
3. You guess the number, and receive hints:
   - 📉 Too low
   - 📈 Too high
   - 🎉 Correct
4. Once you guess correctly, you see the total attempts.
5. Option to play again.

---

## 🔧 Features

- 🎛️ Difficulty selection (Easy, Medium, Hard)
- 🔢 Random number generation
- 🔁 Game replay option
- 🧠 Smart feedback system (high/low)
- 🛡️ Robust error handling (invalid input, out-of-range input)
- 📊 Attempts counter
- 📚 Modular code with methods and comments

---

## 🖥️ Example Output
🎲 Welcome to the Number Guessing Game!

Choose a difficulty level:

 1.Easy (1-50)

 2.Medium (1-100)

 3.Hard (1-200)
Enter your choice (1-3): 2

🔢 I've picked a number between 1 and 100. Try to guess it!
Enter your guess: 50
📉 Too low! Try again.
Enter your guess: 75
📈 Too high! Try again.
Enter your guess: 63
🎉 Congratulations! You guessed the number in 3 attempts.

---

## 🛠️ How to Run

1. Make sure Java is installed.
2. Compile and run the program:

```bash
javac Main.java
java Main
