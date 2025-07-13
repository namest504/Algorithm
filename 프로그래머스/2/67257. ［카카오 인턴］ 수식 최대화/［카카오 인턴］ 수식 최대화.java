import java.util.*;
import java.io.*;

class Solution {
    
    // 연산자 우선순위 데이터 준비
    private static List<List<String>> patterns = List.of(
        List.of("*","+","-"),
        List.of("*","-","+"),
        List.of("+","-","*"),
        List.of("+","*","-"),
        List.of("-","+","*"),
        List.of("-","*","+")
    );
   
    // Solution
    public long solution(String expression) {
        long answer = 0;
        List<Long> numberArr = parseNumber(expression);
        List<String> calcArr = parseCalc(expression);

        for (List<String> pattern : patterns) {
            // 연산자 우선 순위에 따른 개별 연산 결과 처리를 위해 깊은 복사
            List<Long> numbers = new ArrayList<>(numberArr);
            List<String> calcs = new ArrayList<>(calcArr);

            for (String op : pattern) {
                for (int i = 0; i < calcs.size(); ) {
                    if (calcs.get(i).equals(op)) {
                        
                        long a = numbers.get(i);
                        long b = numbers.get(i+1);
                        long result = calculate(op, a, b);
                        
                        // 결과로 두 숫자와 연산자를 대체
                        numbers.remove(i+1);
                        numbers.set(i, result);
                        calcs.remove(i);
                    } else {
                        i++;
                    }
                }
            }
            answer = Math.max(answer, Math.abs(numbers.get(0)));
        }
        return answer;
    }

    // 연산식 과 숫자 a, b 전달
    private long calculate(String op, long a, long b) {
        long r = 0;
        switch (op) {
            case "+": 
                r= a + b;
                break;
            case "-": 
                r= a - b;
                break;
            case "*": 
                r= a * b;
                break;
            default: 
                break;
        }
        return r;
    }
    
    // 숫자 파싱
    private List<Long> parseNumber(String expression) {
        List<Long> numberArr = new ArrayList<>();
        String[] strArr = expression.split("\\+|-|\\*");
        for (String str : strArr) {
            numberArr.add(Long.parseLong(str));
        }
        return numberArr;
    }
    
    // 연산자 파싱
    private List<String> parseCalc(String expression) {
    List<String> calcArr = new ArrayList<>();
    for (char c : expression.toCharArray()) {
        if (c == '+' || c == '-' || c == '*') {
            calcArr.add(String.valueOf(c));
        }
    }
    return calcArr;
}
}