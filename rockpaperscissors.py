import random
while True:
    player_score=0
    computer_score=0
    tie=0
    
    name=input("enter the player name")
    print("""
    Game rules
    1.rock vs paper--->paper win
    2.paper vs scissor--->scissor win
    3.scissor vs rock--->rock win""")
    
    print("""
    choice are:
    1.rock
    2.paper
    3.scissor""")
    
    choice=int(input("enter the choice:1-3"))
    while choice>3 or choice<1:
        choice=int(input("invalid one and you lose"))
    
    if choice==1:
        player_choose="rock"
    elif choice==2:
        player_choose="Paper"
    elif _choice==3:
        player_choose="Scissor"
    print("the player choice is:",choice)
    computer=random.randint(1,3)
    print("computer choose:",computer)
    
    if computer==1:
        comp_choice="rock"
    elif computer==2:
        comp_choice="paper"
    elif computer==3:
        comp_choice="scissor"
        
    if player_choose==comp_choice:
        print("it's a tie")
        result="tie"
    elif player_choose==2 and comp_choice==1 or player_choose==1 and comp_choice==2:
        print("paper win")
        result="paper"
    elif player_choose==3 and comp_choice==1 or player_choose==1 and comp_choice==3:
        print("rock win")
        result="rock"
    else:
        print("scissor win")
        result="scissor"
    
    if result=="tie":
        tie+=1
    elif result=="player":
        player_score+=1
    else:
        computer_score+=1
    
    print("scores are")
    print(name,"score is",player_score)
    print("computer score is",computer_score)
    print("ties are",tie)
    
    
    repeat=input("play again?")
    if repeat=="no" or repeat=="no":
        break
print("game over")
        
    
