# BufferedReader, BufferedWriter
: 백준 15552, 10952, 10951번 문제에서 사용.

---
> 버퍼를 통해 읽고 쓰는 함수. <br>
> 입출력 데이터가 바로 전달되는 것이 아니라, 중간에 버퍼에 저장했다가 한꺼번에 전달된다.<br>
> 흙을 파서 언덕에 버릴 때, 한 번 삽질할 때마다 가서 버리는 것보다 수레에 가득 채워서
> 한 번에 나르는 것이 더 효과적인 것과 마찬가지로, 버퍼에 저장했다가 한꺼번에 전달하기 때문에 속도가 빠르다.


## Buffer
- 데이터를 한 곳에서 다른 한 곳으로 전송하는 동안 일시적으로 그 데이터를 보관하는 임시 메모리 영역
- 입출력 속도 향상을 위해 버퍼를 사용한다.
## Buffer flush
- 버퍼에 남아 있는 데이터를 출력시킨다. (버퍼를 비우는 동작)
## BufferedReader
- 버퍼를 이용한 입력
## BufferedWriter
- 버퍼를 이용한 출력

## BufferedReader 사용법
입력스트림에서 문자를 읽는 함수. <br>
문자나 배열, 라인들을 효율적으로 읽기 위해 문자들을 버퍼에 저장하고(버퍼링) 읽는 방법을 취한다. <br>
버퍼 사이즈는 사용자가 지정할 수도 있지만 그렇지 않을 경우 디폴트 사이즈가 사용된다.
### readLine() 
- 데이터 라인 단위로 읽기 가능
- Scanner처럼 공백단위로 끊어지지 않고, 엔터를 경계로 인식한다.
- return 값이 String형으로 고정되기 때문에 다른 타입으로 입력받기 위해서는 형 변환을 해줘야 한다.
## BufferedWriter 사용법
한 번에 모았다가 출력이 가능하도록 하는 함수. <br>
버퍼를 정의해줬기 때문에 반드시 `flush()`, `close()` 메소드를 호출해 뒤처리를 해줘야한다. <br>
`System.out.println()`처럼 자동개행 기능이 없기 때문에 필요한 경우 `\n`를 통해 따로 처리해줘야 한다.

```java
import java.io.*;
import java.util.StringTokenizer;

public class Bj_15552 {
    public static void main(String[] args) throws IOException {
        // BufferedReader, BufferedWriter를 사용하면 Scanner와 System.out.println을 사용했을 때 보다 효율적이고 빠르다.
        // 해당 기능을 사용할 때는 try catch를 이용해 예외를 잡던가 IOException을 던져줘야한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;

        // readLine 메소드는 항상 String 형을 반환하기 때문에 다른 형태로 사용하기 위해서는 형 변환이 필요하다.
        int tcNum = Integer.parseInt(br.readLine());

        for (int i = 0; i < tcNum; i++) {
            st = new StringTokenizer(br.readLine());
            bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

```
BufferedReader와 BufferedWriter를 사용할 때는 throws를 통해 예외를 던져주던가, try~catch 구문을 이용해 예외를 잡아줘야 한다.