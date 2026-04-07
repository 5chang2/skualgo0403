package day03.a01_stack_queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // stack 기본 메소드
//        ArrayDeque<Integer> stack = new ArrayDeque<>();
//
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//        stack.pop();
//        stack.pop();
//        System.out.println(stack.isEmpty());

        // 괄호검증
//        String s = "({[]})";
//
//        ArrayDeque<Character> stack = new ArrayDeque<>();
//        boolean valid = true;
//
//        for (char c : s.toCharArray()) {
//            // 여는 괄호인가
//            if (c == '(' || c == '{' || c == '[') {
//                stack.push(c);
//            // 닫는 괄호인가
//            } else {
//                char top = stack.pop();
//                if (c == ')' && top != '(') { valid = false; break;}
//                if (c == '}' && top != '{') { valid = false; break;}
//                if (c == ']' && top != '[') { valid = false; break;}
//            }
//        }
//        if (!stack.isEmpty()) { valid = false; }
//        System.out.println(valid);

        Queue<Integer> queue = new ArrayDeque<>();
//        ArrayDeque<Integer> queue = new ArrayDeque<>();
        // offer, add
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue.peek());
        // poll (데이터가 없으면 null)
        // remove (데이터가 없으면 예외)
        System.out.println(queue.poll());
        System.out.println(queue.isEmpty());


    }
}
