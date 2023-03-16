# Java String (문자열)

---

## 자주 사용하는 메소드

### length()
- 문자열의 길이를 리턴한다.

### indexOf("문자열")
- 해당 문자열이 처음 등장하는 인덱스를 리턴한다.
- 해당 문자가 존재하지 않을 경우 -1을 리턴한다.
- ex) `"토마토맛토마토".indexOf("토마토")` == 0, `"김사과".indexOf("사")` == 1

### lastIndexOf("문자열")
- 해당 문자열이 마지막으로 등장하기 시작하는 인덱스를 리턴한다.
- ex) `"ABCDECDE".lastIndexOf("CDE")` == 5

### substring(int begin, int end)

- begin부터 end-1까지 문자열을 리턴한다.
- ex) `"abcde".substring(2,5)` ==  "cde"
- substring의 인자로 하나의 값만 들어오면 해당 위치부터 끝까지의 문자열을 반환한다.

### replace(CharSequence target, CharSequence replacement)

- 모든 target 문자를 replacement 문자로 변경한다.
- 치환 메소드이지만 보통 특정 문자를 삭제하고 싶을 때 유용하게 사용한다.
- ex) `"abcde".replace("a", "b")` == "bbcde"

### contains("문자열")

- 문자열에 인자로 받은 문자열이 포함되어 있으면 true, 아니면 false를 리턴한다.
- ex) `"abcde".contains("ab")` == true 

### split(String regex)

- 문자열에서 특정 문자를 기준으로 문자열을 나누어 배열에 저장해 리턴한다.
- ```java
  String str = "010-1234-5678;
  String[] num = str.split("-");
  ```
- num 배열에는 `[010, 1234, 5678]`이 들어있게 된다.

## 형 변환
### 자동 형 변환

- 자바에서는 서로 다른 타입의 피연산자를 연산할 경우 크기가 큰 타입으로 자동 변환된다.
- `정수 + 정수 = 정수`, `정수 + 실수 = 실수`, `문자 + 정수 = 정수`
- 문자열을 정수로 바꿀 때는 `Integer.parseInt("문자열")` 메소드를 사용.
- 문자열이 아닌 값을 문자열로 바꾸고 싶을 때는 단순히 값에 `""`를 더해주면 된다.
- ex) 3 + 0.0 = 3.0, 'A' + 5 = 70 ('A'가 ASCII 코드로 65)

### 강제 형 변환
- (자료형) 값
- ex) `(int) 3.99` == 3

## 아스키코드
<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FcJvqZo%2FbtqM8PqY9m2%2FOCNv0b8pnCe3eVQYQKZHok%2Fimg.png">

- 자바는 char형을 바로 입력받을 수 없기 때문에 char형태의 값을 입력받기 위해서는 `char c = sc.next().charAt(0)`과 같은 형태로 입력 받는다.
- 문자를 아스키코드로 변환할 때는 int형으로 강제 형 변환을 해준다. ex) `(int) 'A'` == 65
- 아스키코드를 문자로 변환할 때는 char형으로 강제 형 변환을 해준다. ex) `(char) 65` == 'A'
