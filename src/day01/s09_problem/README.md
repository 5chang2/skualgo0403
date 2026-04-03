
#### 문제 1: 배열에서 최대값 찾기

정수 배열이 주어졌을 때, 가장 큰 값을 출력합니다.

```
입력: {3, 7, 2, 8, 1, 5}
출력: 8
```

```java
public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 8, 1, 5};

        // 여기에 코드를 작성합니다.

    }
}
```

#### 문제 2: 배열 원소의 합

정수 배열이 주어졌을 때, 모든 원소의 합을 출력합니다.

```
입력: {10, 20, 30, 40, 50}
출력: 150
```

```java
public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        // 여기에 코드를 작성합니다.

    }
}
```

#### 문제 3: 짝수와 홀수 개수

정수 배열이 주어졌을 때, 짝수와 홀수의 개수를 각각 출력합니다.

```
입력: {1, 2, 3, 4, 5, 6, 7, 8}
출력: 짝수: 4, 홀수: 4
```

```java
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        // 여기에 코드를 작성합니다.

    }
}
```

#### 문제 4: 문자열 뒤집기

문자열이 주어졌을 때, 뒤집은 결과를 출력합니다.

```
입력: "hello"
출력: "olleh"
```

```java
public class Main {
    public static void main(String[] args) {
        String s = "hello";

        // 여기에 코드를 작성합니다.

    }
}
```


#### 문제 5: 문자열에서 각 문자 빈도수 세기

문자열이 주어졌을 때, 각 문자가 몇 번 등장하는지 출력합니다.

```
입력: "banana"
출력: {a=3, b=1, n=2}
```

```java
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String s = "banana";

        // 여기에 코드를 작성합니다.

    }
}
```

#### 문제 6: 배열 중복 제거

정수 배열이 주어졌을 때, 중복을 제거한 결과를 출력합니다.

```
입력: {1, 3, 2, 3, 1, 4, 2, 5}
출력: [1, 2, 3, 4, 5]
```

```java
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 1, 4, 2, 5};

        // 여기에 코드를 작성합니다.

    }
}
```

#### 문제 7: 팰린드롬 판별

문자열이 주어졌을 때, 앞에서 읽으나 뒤에서 읽으나 같은 문자열(팰린드롬)인지 판별합니다.

```
입력: "racecar"  → 출력: true
입력: "hello"    → 출력: false
```

```java
public class Main {
    public static void main(String[] args) {
        String s = "racecar";

        // 여기에 코드를 작성합니다.

    }
}
```


#### 문제 8: 두 수의 최대공약수 (GCD)

두 양의 정수가 주어졌을 때, 최대공약수를 출력합니다.

```
입력: 12, 18
출력: 6
```

힌트: 유클리드 호제법 — `b`가 0이 될 때까지 `a`를 `b`로 나눈 나머지를 반복합니다.

```
gcd(12, 18) → gcd(18, 12) → gcd(12, 6) → gcd(6, 0) → 6
```

```java
public class Main {
    static int gcd(int a, int b) {
        // 여기에 코드를 작성합니다.
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(gcd(12, 18)); // 6
    }
}
```

#### 문제 9: 두 수의 합 (Two Sum)

정수 배열과 목표값이 주어졌을 때, 합이 목표값이 되는 두 수의 인덱스를 출력합니다.

```
입력: {2, 7, 11, 15}, target = 9
출력: [0, 1]  (arr[0] + arr[1] = 2 + 7 = 9)
```

힌트: HashMap에 `(값, 인덱스)`를 저장하면서 `target - 현재값`이 이미 있는지 확인합니다.

```java
import java.util.HashMap;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        // 여기에 코드를 작성합니다.

    }
}
```

#### 문제 10: 두 배열의 교집합

두 정수 배열이 주어졌을 때, 공통으로 포함된 원소를 중복 없이 출력합니다.

```
입력: {1, 2, 3, 4, 5}, {3, 4, 5, 6, 7}
출력: [3, 4, 5]
```

힌트: HashSet의 집합 연산을 활용합니다.

```java
import java.util.HashSet;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        // 여기에 코드를 작성합니다.

    }
}
```

---
