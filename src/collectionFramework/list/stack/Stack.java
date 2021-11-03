package collectionFramework.list.stack;

import java.util.ArrayList;

/*
    Stack은 쌓아 올리는 것.
    LIFO(Last In First Out) 선입후출
    마지막으로 들어온 것이 먼저 나간다.
    ex) 웹페이지 뒤로가기 -> 새로운 페이지로 넘어갈 때마다 넘어가기 전 페이지를 스택에 쌓고,
    뒤로가기를 누르면 가장 위에 있는 페이지부터 꺼내오는 방식
    Vector 클래스 상속을 받고 있고 메소드들도 Vector의 메소드들을 이용하여 구현하고 있다.
*/
public class Stack<E> extends ArrayList<E> {

    //Stack은 항상 LIFO, 후입선출이어야하며 중간에 index를 가져와서 제거하거나 중간에 값을 추가하면 안된다.
    public Stack()  {
    }

    /*
        스택의 최상단에 특정 요소 추가
        @param item 스택에 추가할 특정 요소
        @return 스택에 추가한 특정 요소
        push = 스택에서 데이터를 추가할 때
    */
    public E push(E item) {
        add(item); //push는 항상 Stack의 마지막에 추가되어야 하기 때문에 ArrayList add() 메서드 사용
        return item;
    }
    /*
        스택의 최상단을 제거하고 반환
        @return 제거된 스택의 요소
        pop = 스택에서 데이터를 봅아낼 때
        데이터의 최상단에 있는 데이터를 뽑아옴과 동시에 제거함
    */
    public E pop(){
        E object = peek();
        int len = size();

        remove(len-1);
        return object;
    }

    /*
        스택의 최상단을 반환
        @return 스택의 최상단 요소
        Stack에서 데이터를 받을 수 있는 것은 최상단에 위치한 가장 최근의 데이터
        마지막 데이터 = 배열의 크기에서 -1을 한 값(index는 0부터 시작하기 때문에)
    */
    public E peek(){
        int len = size();
        return get(len-1); //원하는 인덱스의 요소를 가져오는 메서드
    }

    /*
        스택에 특정 요소의 위치를 반환
        스택의 최상단으로부터 특정 요소가 있는 위치를 반환
        최상단 index : 1
        최상단 아래 index : 2
        가장 아래 index : stack.size()
        @param 스택에서 찾을 특정 요소
        @return 스택에서 가장 먼저나온 요소를 반환, 요소가 포함되지 않은 경우 -1을 반환
    */
    public int search(Object o) {
        int index = lastIndexOf(o);

        if(index >= 0){
            return size() - index; //배열의 크기 에서 index를 제거해준다면 원하는 로직이 완성
        }

        return -1;   //-1인 경우에는 찾지 못하였기 때문에 -1를 반환
    }

    /*
        스택이 비어있는지를 확인
        @return 스택에 요소가 있는 경우 true, 리스트가 비어있는 경우 false를 반환
    */
    public boolean empty(){
        return size() == 0;
    }


}