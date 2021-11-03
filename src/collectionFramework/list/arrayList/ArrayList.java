package collectionFramework.list.arrayList;

/*
ArrayList는 Object[] 배열을 사용하면서 내부 구현을 통해 동적으로 관리(흔히 쓰는 primitive 배열과 유사)
최상위 타입인 Object 타입으로 배열을 생성하여 사용하기 때문에 요소접근 면에서는 탁월한 성능을 보이나,
중간의 요소가 삽입, 삭제가 일어나는 경우
그 뒤의 요소들은 한칸씩 밀어야 하거나 당겨야 하기 때문에 삽입, 삭제에서는 비효율적
*/
public class ArrayList {
    Object[] arr = null;
    int capacity = 0;  //arr의 length
    int size = 0;      //arr이 지금까지 사용하고 있는 크기

/*
    array, arr의 크기를 알려주는 capacity
    현재의 arr의 size를 반환해주는 size
    ArrayList를 생성함과 동시에 arr를 전달받은 size로 크기를 초기화하거나,
    그렇지 않은 경우 배열의 크기를 1로 설정
    1 이상으로 해도 됨. 하지만 0으로 할 경우, ArrayList 생성 후에 삽입을 한다면 에러가 발생
*/
    ArrayList(int capacity){ //생성함과 동시에 arr 전달받은 size로 크기 초기화
        this.capacity = capacity;
        arr = new Object[capacity];
        size = 0;
    }

    ArrayList(){  //배열의 크기를 1로 설정
        capacity = 1;
        arr = new Object[capacity];
        size = 0;
    }

/*
    -데이터 보관
     1. arr이 꽉 참 -> arr의 크기를 바꾸고 내용을 복사
     2. 삽입하는 위치가 특정 위치일 경우 해당 위치부터 요소들을 뒤로 한칸씩 밈
*/
    public void add(Object element){
        if(size == capacity){ //arr이 가득참
            expandArray(); //해당 배열의 크기를 기존의 2배로 확장-> 기존배열 복사 후 새로운 요소 추가
        }

        arr[size++] = element;
    }

    public void addFirst(Object element){
        add(0, element);
    }

    public void add(int index, Object element){
        if(size == capacity){
            expandArray();
        }

        for(int i = size; i >= index; i--)
            arr[i] = arr[i-1];

        arr[index] = element;
        size++;
    }

    private void expandArray(){
        capacity *= 2;
        Object[] tempArr = new Object[capacity];
        copyArr(tempArr, arr);
        arr = new Object[capacity];
        copyArr(arr, tempArr);
    }

    private void copyArr(Object[] arr1, Object[] arr2){
        for(int i = 0; i < arr2.length; i++){
            arr1[i] = arr2[i];
        }
    }
}
