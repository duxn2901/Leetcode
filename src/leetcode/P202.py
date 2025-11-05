class Solution:
    def isHappy(self, n: int) -> bool:
        number = n
        haveSeen = set()
        while True:
            check = 0
            while number != 0:
                d = number % 10
                check += d*d
                number = number // 10
            if check == 1:
                return True
            if check in haveSeen:
                return False
            haveSeen.add(check)
            number = check


            
        