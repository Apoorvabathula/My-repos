from random import choice

def display_choices(player_choice, computer_choice):
    print(f'Player chooses: {Valid_choices[player_choice]}')
    print(f'Computer chooses: {Valid_choices[computer_choice]}')

def display_game_winner(player_wins, computer_wins):
    if player_wins > computer_wins:
        print(f"{Player_name} wins the match!")
    elif player_wins < computer_wins:
        print("Computer wins the match!")
    else:
        print("The match is tied!")

def winner(player_choice, computer_choice):
    if player_choice not in Valid_choices:
        return "Try Again"
    elif (
        (player_choice == "rock" and computer_choice == "scissors") or
        (player_choice == "scissors" and computer_choice == "paper") or
        (player_choice == "paper" and computer_choice == "rock")
    ):
        return "Player"
    elif player_choice == computer_choice:
        return "Tie"
    else:
        return "Computer"

def display_scoreboard(player_wins, computer_wins, games_played):
    num_ties = games_played - (player_wins + computer_wins)
    scoreboard = f"""
        PLAYER WINS:    {player_wins}
        COMPUTER WINS:  {computer_wins}
        NUM TIES:       {num_ties}
        GAMES PLAYED:   {games_played}
    """
    print(scoreboard)

games_played = 0
player_wins = 0
computer_wins = 0

print("Welcome to Rock, Paper, Scissors!")
Player_name = input("What is your name?: ")

Valid_choices = {
    "rock": "🪨",
    "paper": "📜",
    "scissors": "✀"
}

print("\nYour valid choices are:")
for choice_name, emoji in Valid_choices.items():
    print(f"{choice_name}: {emoji}")

while True:
    player_choice = input(f"\nRock, paper, or scissors, {Player_name}?: ").lower()

    if player_choice not in Valid_choices:
        print("That was an invalid choice. Try again!")
        continue  

    computer_choice = choice(list(Valid_choices.keys()))
    display_choices(player_choice, computer_choice)
    
    round_winner = winner(player_choice, computer_choice)
    
    if round_winner == "Player":
        print(f"{Player_name} wins this round!")
        player_wins += 1
    elif round_winner == "Computer":
        print("Computer wins this round!")
        computer_wins += 1
    else:
        print("This round is a tie!")
    
    games_played += 1
    display_scoreboard(player_wins, computer_wins, games_played)
    
    keep_playing = input("Do you want to keep playing? (y/n): ").lower()
    if keep_playing != "y":
        break

display_game_winner(player_wins, computer_wins)
