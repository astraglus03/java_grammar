package c1Basic;

public class c07Array {
    public static void main(String[] args) {
        String[] arr = {"Hello", "World", "Java"};
//        StringBuffer sb2 = new StringBuffer();
//        for(String a: arr){
//            sb2.append(a);
//            sb2.append("\n");
//        }
//        sb2.insert(0,"c++");
//        sb2.insert(1,"\n");
//        sb2.deleteCharAt(sb2.length()-1); // 마지막 줄바꿈 제거
//        System.out.println(sb2);


//        StringBuilder: 문자열 조립 객체(가장빠름)
//        String st1 = "hello";
//        StringBuilder는 동시성이슈O == Thread-safe하지않음 -> 성능이 뛰어남.
//        StringBuffer는 동시성이슈X == Thread-safe함 -> 성능이 떨어짐.
//        StringBuilder sb = new StringBuilder(st1);
//        StringBuffer sbf = new StringBuffer(st1);

//        문자열 뒤집기
//        System.out.println(sb.reverse());
//        배열표현식1: 배열 할당 후 값 할당
//        int[] arr1 = new int[5];
//        arr1[0] = 1;
//        arr1[1] = 2;
//        arr1[2] = 3;
//        arr1[3] = 4;
//        arr1[4] = 5; // index out of bounds 예외 발생. 배열길이가 동적으로 늘어날 수 없음.


//        배열표션식2: 리터럴방식
//        int[] arr2 = {10, 20, 30, 40, 50};

//        int[] arr3 = new int[]{10, 20, 30, 40, 50};

//        ArrayList<int[]> list = new ArrayList<>();
//        list.add(new int[5]);
//        list.add(new int[]{1, 2, 3, 4, 5});

//        System.out.println(list.get(1)[0]);

//        Arrays.fill:  배열에 모든값을 변경.
//        String[] arr = new String[4];
//        for(int i=0; i<arr.length; i++){
//            arr[i] = "";
//        }
//        Arrays.fill(arr, "");
//        int[] arr = {80,65,90};
        // 총합
//        int sum = 0;
//        for(int i=0; i<arr.length; i++){
//            sum += arr[i];
//        }
        // 평균
//        double avg = (double)sum / arr.length;

//        // 최대값
//        int[] arr2 = {10,20,30,12,8,17};
//        int max = arr2[0];
//        for(int i=1;i<arr2.length;i++){
//            if(arr2[i] > max){
//                max = arr2[i];
//            }
//        }
//        // 최소값
//        int min = arr2[0];
//        for(int i=1;i<arr2.length;i++){
//            if(arr2[i] < min){
//                min = arr2[i];
//            }
//        }

//        int[] arr={10,20,30,40,50};
//        int[] newArr = new int[arr.length];

//        for(int i=0; i<arr.length; i++){
//            newArr[i] = arr[arr.length-1-i];
//        }
//        System.out.println(Arrays.toString(newArr));

//        슷지 내림차순은 불가능

//        int [] arr = {17, 12, 20, 10, 15};
//        Arrays.sort(arr);
//        String[] arr1 = {"17","12","20","10","15"};
//        Arrays.sort(arr1, Comparator.reverseOrder());

//        int[] arr = {17,12,20,10,15};
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            int minIdx = i;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[minIdx] > arr[j]) minIdx = j;
//            }
//
//            if (i == minIdx) continue;
//
//            int t = arr[i];
//            arr[i] = arr[minIdx];
//            arr[minIdx] = t;
//        }

//        조합문제 : 모두 각기 다른 숫자의 배열이 있을때, 만들어질 수 있는 두 숫자의 조합을 문자열 형태로 출력
//        ex)(10,20), (10,30), (10,40), (10,50), (20,30), (20,40), (20,50), (30,40), (30,50), (40,50)

//        int[] intArr = {10,20,30,40,50};
//
//        for(int i=0;i< intArr.length-1; i++){
//            for(int j=i+1; j<intArr.length; j++){
//                System.out.println("("+intArr[i]+","+intArr[j]+")");
//            }
//        }

//        배열의 중복제거: set자료구조(중복X, 순서X)를 활용하여 중복 제거
//        int[] arr = {10,20,30,10,20,30,40,50};
//
//        Set<Integer> mySet = new HashSet<>();
//
//        for(int a: arr){
//            mySet.add(a);
//        }
//
//        System.out.println(mySet);
//
//        int[] answer = new int[mySet.size()];
//        int index=0;
//        for(int a: mySet){
//            answer[index++] = a;
//        }
//
//        System.out.println(mySet.size());
//        System.out.println(Arrays.toString(answer));


//        이분탐색(이진탐색) - binary search
//        사전에 데이터가 오름차순정렬돼 있을경우, 이분탐색 가능

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int firstInput = Integer.parseInt(br.readLine());
//        int[] arr = new int[firstInput];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for(int i=0; i<firstInput; i++){
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//        System.out.println(Arrays.toString(arr));

//        int[] arr1 ={10,20,30};
//        int[] arr2 ={10,20,30};

//        System.out.println(Arrays.equals(arr1,arr2)); // true, 두 배열의 내용이 동일한지 비교

//        배열
//        int[][] arr1 = new int[3][3];
//        arr1[0][0] = 1;
//        arr1[0][1] = 2;
//        arr1[0][2] = 3;
//        arr1[1][0] = 4;
//        arr1[1][1] = 5;
//        arr1[1][2] = 6;
//        arr1[2][0] = 7;
//        arr1[2][1] = 8;
//        arr1[2][2] = 9;

//         리터럴 방식
//        int[][] arr2 = {
//            {1, 2, 3},
//            {4, 5, 6},
//            {7, 8, 9}
//        };
//
//        System.out.println(arr2); // 2차원 배열의 주소값 출력
//        System.out.println(Arrays.toString(arr2)); // 각 1차원 배열의 주소값 출력
//        System.out.println(Arrays.deepToString(arr2));


//        가변배열
//        int[][] arr3 = new int[2][];
//        arr3[0] = new int[]{1, 2, 3};
//        arr3[1] = new int[]{4, 5};

//        배열 복사
//        Arrays.copyOf(배열명, length), Arrays.copyOfRange(배열명, 시작인덱스, 끝인덱스)

    }
}
