package part4.week35.chw;

public class Stack_4949 {
    public static void main(String[] args) {

    }
}
/*

import sys

while True:
    string = sys.stdin.readline().rstrip()
    stack = []
    if string == '.':
        break
    
    for str in string:
        if str == '(' or str == '[':
            stack.append(str)
        elif str == ')' or str == ']':
            if len(stack) == 0:
                stack.append(str)
                break
            
            pop_str = stack.pop()
            if pop_str == '(':
                pop_str = ')'
            elif pop_str == '[':
                pop_str = ']'

            if pop_str != str:
                stack.append(str)
                break
    if len(stack) == 0:
        print('yes')
    else:
        print('no')

*/