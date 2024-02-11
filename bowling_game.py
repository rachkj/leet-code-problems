class Solution:
    def isWinner(self, player1: List[int], player2: List[int]) -> int:
        score1=sum(player1)
        score2=sum(player2)
        print(score1,score2)
        for i in range(1,len(player1)):
            if i==1:
                if player1[0]==10:
                    score1+=player1[i]
                if player2[0]==10:
                    score2+=player2[i]
            else:
                if 10 in player1[i-2:i]:
                    print("player1",i)
                    score1+=player1[i]
                if 10 in player2[i-2:i]:
                    print("player2" ,i)
                    score2+=player2[i]
        if score1 >score2:
            return 1
        elif score2>score1:
            return 2
        elif score1==score2:
        
            return 0
