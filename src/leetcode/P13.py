class Solution:
    def romanToInt(self, s: str) -> int:
        roman = {'I':1, 'V':5, 'X':10, 'L': 50, 'C': 100, 'D':500, 'M':1000}
        digit = list(s)
        summ = 0
        
        while digit:
            count = 0
            flag = True
            while flag:
                
                temp = digit.pop()
                count += 1
                if not digit:
                    summ += roman[temp]*count
                    flag = False
                    break
                if digit[-1] != temp:
                    flag = False
                    if roman[digit[-1]] > roman[temp]:
                        summ += roman[temp]*count
                    else:
                        temp2 = digit.pop()
                        summ += roman[temp]*count - roman[temp2]
        return summ