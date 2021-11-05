# &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;Java Collection Framework


> ###**다수의 데이터를 쉽고 효과적으로 처리할 수 있는 표준화된 방법을 제공하는 클래스의 집합.**
>
> - _데이터를 저장하는 <u>자료구조</u>와 데이터를 처리하는 <u>알고리즘</u>을 구조화하여 <u>클래스로 구현</u>해 놓은 것._



&#160;

&#160;

------------

##자료구조(Data Structure)

>**일련의 일정 타입들의 데이터 모임 또는 관계를 나타낸 구성체**

- ### 선형 자료구조
   - **데이터가 일렬로 연결된 형태**
     - *ex) int[], List, Queue, Deque*
   
- ###비선형 자료구조
    - 각 **요소가 여러 개의 요소와 연결 된 형태.**
      - *ex) 그래프(Graph), 트리(Tree)*

- ###집합 자료구조
    - **데이터가 연결 된 형식이 아닌 형태**
      - *ex) 집합(Set)*

&#160;

------------

&#160;

##1. List

> **순서가 있는 데이터의 집합으로, 데이터의 중복을 허용한다.**        
>
> - Vector, ArrayList, LinkedList, Stack, Queue
>   - *ex) 대기자 명단*

선형 자료구조, 순서가 있는 데이터를 목록으로 이용 할 수 있도록 만들어진 인터페이스

&#160;

```
int[] array = new int[10];

array[13] = 32; 

-> IndexOutofBoundsException

//할당된 크기(범위)밖이기 때문에 10개의 공간 외에는 더이상 사용하지 못함. 
```

- 단점을 보완하여 List를 통해 구현된 클래스들은 <u>**'동적 크기'**</u>를 갖으며 배열처럼 사용할 수 있게 되었다. 

  - **_배열의 기능 + 동적 크기 할당_**

&#160;

##2. Queue
> **순서가 있는 데이터를 기반으로 FIFO(선입선출)을 위해 만들어진 인터페이스**
> 
> -  _ex) 10, 20, 30, 40 순으로 데이터를 넣고 꺼낼 때 (**pool**) 넣은 순서 그대로 10, 20, 30, 40 이 나오는 구조_
>   - 놀이기구를 타기 위해 줄서있는 모습

시간 순으로 어떤 작업 또는 데이터를 처리할 필요가 있는 것들은 큐의 성지을 갖고 있다고 보면 된다. 또한 대표적으로 알고리즘에서는 BFS(너비 우선 탐색)에 적용된다.


&#160;

##2-1. Deque
> **Queue를 상속하고 있는 인터페이스**
> - Double ended Queue = 양쪽에서 삽입삭제가 가능한 자료구조
> - head에서도 접근 가능하며, tail에서도 접근 가능한 양방향 Queue(큐에서 확장된 형태)
>   - _ex) 카드 덱(deck) - 카드를 중간에서 뺄 수는 없고 맨 위 혹은 아래만 가능 놓는 것도 그와 같음_

&#160;

##3. Set  

> **순서가 없는 데이터의 집합으로, 데이터의 중복을 허용하지 않는다.**
> - HashSet, TreeSet
>   - *ex) 양의 정수 집합, 소수의 집합*

**입력 순서대로의 저장 순서를 보장하지 않는다.**

> - 기본적으로 List 계열은 index(node)로 관리하기 때문에 add() 같은 메소드를 쓰면 순서대로 저장이 됨. 
>
  > - Queue 계열 또한 우선순위 큐를 제외하고는 기본적으로 입력한 순서대로 객체가 연결되어 있다.
>
>> 하지만 Set의 경우는 일반적으로 입력받은 순서와 상관없이 데이터를 집합시키기 때문에 입력받은 순서를 보장할 수 없다.
>>> _LinkedHashSet(데이터 중복을 허용하지 않지만 입력순서를 보장)_



&#160;

##4. Map
> **키(Key)와 값(Value)의 한 쌍으로 이루어진 데이터의 집합으로 순서가 없다.** 
> - 키는 중복을 허용하지 않지만 **값은 중복**될 수 있다. 
> - HashMap, TreeMap, HashTable, Properties
>   - *(ex)우편번호, 지역번호(전화번호))*

&#160;

##5. Collection 
> **List와 Set 인터페이스의 공통점을 뽑아내서 만든 인터페이스**

&#160;

&#160;

------------

&#160;

&#160;

##컬렉션 클래스(Collection Class)

>###컬렉션 프레임워크에 속하는 인터페이스를 구현한 클래스 = 컬렉션 클래스
>
> - _즉, 위의 List, Set, Map 3가지 중에 하나를 구현하고 있음._



구현한 인터페이스의 이름이 클래스의 이름에 포함되어 있어서 이름만으로도 클래스의 특징을 쉽게 알 수 있도록 되어있다.

> _Vector, Stack, HashTable, Properties와 같은 클래스들은 컬렉션 프레임워크가 만들어지기 전에 존재하던 것이기 때문에 컬렉션 프레임워크의 명명법을 따르지 않음._
>
> _Vector나 HashTable과 같은 기존의 컬렉션 클래스들은 호환을 위해서 남겨두었지만 가능하면 사용하지 않는 것이 좋다._
>
>> - _그대신 새로 추가된 ArrayList와 HashMap을 사용하도록 하자._

