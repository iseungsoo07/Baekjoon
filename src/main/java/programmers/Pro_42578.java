package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 프로그래머스 의상
 *
 * 안입는 경우를 그냥 의상의 한 종류라고 생각하고
 * 의상의 종류 + 1개 중 한가지를 고르는 경우의 수를 모두 곱함
 * 모든 의상을 안 입는 것만 고르는 경우 1가지를 마지막에 빼줌
 */
public class Pro_42578 {
    public static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < clothes.length; i++) {
            String name = clothes[i][0];
            String type = clothes[i][1];

            if (map.get(type) == null) {
                map.put(type, new ArrayList<>(Arrays.asList(name)));
            } else {
                ArrayList<String> name_list = map.get(type);
                name_list.add(name);
            }
        }

        System.out.println(map);

        for (Map.Entry<String, ArrayList<String>> entries : map.entrySet()) {
            String key = entries.getKey();
            ArrayList<String> strings = map.get(key);
            answer *= strings.size() + 1;
        }

        return answer - 1;
    }

    public static void main(String[] args) {
        String[][] clothes = {{"검정모자", "모자"}, {"노란모자", "모자"}, {"검정치마", "하의"}, {"청바지", "하의"}, {"초록모자", "모자"}, {"티셔츠", "상의"}, {"후드티", "상의"}};

        System.out.println(solution(clothes));
    }
}
