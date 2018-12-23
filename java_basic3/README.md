## 프로그래밍이란?

 개발자가 코드를 생성하면 컴파일러를 통해 기계어로 해석되고, 컴퓨터가 이를 실행하는 과정

 C, C++, java 등에는 컴파일러가 존재함

<br><br>

## 자바 언어의 특징

- C와 C++은 직접 메모리에 접근해 관리함 (속도가 빠름)

  java는 한 단계를 거쳐서 메모리에 접근

- 객체 지향 언어 : 조립이 용이

  ex. 집의 욕실 공사

- `JRE(Java Runtime Enviroment)` 를 통해 윈도우, 리눅스 등 운영체계에 얽매이지 않음 

- `GC(garbage Collector)`을 통한 자동 메모리 관리

  java 언어는 메모리에 직접 접근할 수 없음

  쓰고 난 후 알아서 메모리를 정리하고 안 쓰는 부분을 반환

<br>

## Java를 개발하기 위한 환경 구축

- `JVM`(프로그램을 실행시켜줌) → JVM을 컨트롤 해주는 `API`(JVM이 일을 할 수 있는 기능)  →  `JRE`(자바 프로그램이 실행될 수 있는 환경 조성) 

  // 자바 프로그램이 실행될 수 있는 상황이 구현됨

  → 개발을 위해서 `JDK(Java Development Kit)`설치가 필요

- 현재 JDB java SE 8버전을 주로 사용하고 있음

  Java SE 8u161/162 : 처음 출시 이후 161~162번의 업그레이드가 진행

- `LINK` : 기계어로 바뀌어 실행됨 (메모리로딩-실행준비-실행결정-초기화)

<br>

### IDE (Integrated Development Environment)

- 통합개발환경 : 개발, 컴파일, 실행, 디버깅을 반복하는데 이러한 기능을 하나의 툴에서 모두 가능하게 함

<br>

### eclipse 설치와 프로젝트, class 생성

<img width="359" alt="1" src="https://user-images.githubusercontent.com/35055662/50206898-39c74980-03b0-11e9-95a1-df007c67ad6f.png">

- eclipse Java EE for Developers 버전을 .zip 형태로 다운로드 받기

- 좌측 화면에서 프로젝트 생성시

  `scr	`파일: 코드들이 담겨 있는 폴더

  `bin`파일: 컴파일한 후 컴퓨터들이 이해할 수 있는 파일들이 담긴 곳



- `public static void main(String[] args)`

  : 많은 파일, 많은 기능들 중 가장 먼저 실행하는 것으로 시작점

- sysout + ctrl + space = `System.out.println();`

- crtl + s = 저장기능, 자동으로 컴파일 완료

<br>

### 환경변수 설정

왜 설정해야하는가?

 ***JVM을 구동하는 `java.exe` 컴파일 기능의 `javac.exe`를 다른 디렉토리에서도 실행할 수 있도록 `bint`경로를 등록***



- 사용자변수 : 특정 사용자에 대해서만 
- 한 대의 컴퓨터에서 여러 사용자를 만들어뒀을 때 공동으로 사용하는

<img width="374" alt="2" src="https://user-images.githubusercontent.com/35055662/50206993-84e15c80-03b0-11e9-9919-9d1e4df354ff.png">

- Java가 어디에 있다는 것을 알려줌

<img width="375" alt="3" src="https://user-images.githubusercontent.com/35055662/50207014-93c80f00-03b0-11e9-944d-9a9e7e728f41.png">

- [편집] - [찾아보기] - 위의 경로에서 한단계 더 들어간 `bin`까지의 경로 입력하기
- cmd에서 `java -version`을 통해 자바 설치와 설정이 잘 되었는지 확인



<br><br><br>

# Java

## 변수

- '선언부'와 '초기화' 부분

- 선언부까지 입력시, 변수를 선언 ex. int i 

  값은 아직 정해지지 X, 메모리에 특정 공간이 할당됨

- 대입 연산자를 통해 변수에 값을 입력

- int, float 등의 '자료형'에 따라 메모리 방의 갯수 확보가능

- 초기화 값은 언제든지 변경 가능

변수를 왜 사용할까? 

  재활용에 용이하다. 학생 5명의 점수의 총점, 평균을 구할 때 매번 점수를 작성하는 것보다, 값을 변수에 저장하여 변수만을 이용하는 것이 효율적이다.

<br>

## 자료형 (데이터의 형태)

#### 1. 기본 자료형

: 메모리에 데이터가 직접 들어가는 것

- 정수

  - byte (1byte)

  - **char** (2byte) 

    : 아즈키 코드로 문자를 숫자로 대체하여 전송

  - short (2byte) > byte

  - **int** (4byte) 

  - long (8byte)

- 실수

  - float (4byte)
  - **double** (8byte)

- 논리형

  - **boolean** (1byte)



** String (기본 자료형이 아닌 객체 자료형)*

​    ex. String abc = "abc";

<br>

#### 2. 객체 자료형

: 실제로 객체를 담는 것이 아닌, 메모리 주소만 가지고 있음

(1) 객체 생성

(2) 객체를 담아 놓음

(3) 이 객체를 가리키는 특정 주소를 담고 있는 

​	객체를 직접적으로 변수에 담을 수 없고,

그 변수의 주소를 가리키고 있는 것을 변수로 설정(레퍼런스)

​	항상 레퍼런스는 4byte로 고정되어 있음

<br>

### 형변환

#### 1. 자동(묵시적) 형 변환 (작은 공간 → 큰 공간)

​	ex. byte a = 10;

​		int b = a;

#### 2. 명시적 형 변환 (큰 공간 → 작은 공간)

: 데이터 누실 overflow 발생 가능성, 주의

​	ex. int a = 100;

​		byte b = (byte)a;

<br>

### 서식문자

%d (10진수), %o (8진수), %x (16진수), %f (실수)

%c (문자), %s (문자열)

```java
package testPjt;
import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		Scanner sta = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: "); int i = sta.nextInt();
		System.out.println("이름을 입력하세요: "); String st = sta.next();
		
		System.out.printf("오늘 기온은 %d도 입니다.", i);
		System.out.printf("지각생 %s 나오세요", st);
		
	}

}
```

<br><br><br>

## 연산자

CPU (연산), 메모리 (데이터를 CPU로 전송)

단항 / 이항 / 삼항 연산자



- 복합 대입연산자 (+=, -=, *=, /=, %=)

- 관계 연산자 (>, <, >=, <=, ==, !=)

- 증감연산자 (전위/후위 연산자) ++x/ x++

  int i = 10;   System.out.println( +(i++) );

  i의 값을 일단 출력 한 후,

  **메모리 상**에서 +1을 해 둠 (현재 11인 상태)

- 논리 연산자

  - && (And), || (OR), !(not)

- 조건(삼항) 연산자

  - 조건식 ?  식:식

    ```java
    int a = 50; int b = 70;
    int c = 0;
    c = (x>y) ? 1000:5000;
    System.out.println(c);
    ```

- 비트 연산자

  - 데이터를 비트 단위로 환산하여 연산하기 때문에

    다른 연산자보다 속도가 빠르다.

  - & (And), | (OR), ^ (XOR : a와 b가 같지 않을 경우)

<br><br><br>

## 배열

: 인덱스를 부여해, **자료형이 같은** 데이터를 관리하는 것

인덱스 0, 1, 2, 3, ... n-1 (배열의 길이(크기): n)

<br>

### 배열 선언

(1) 배열 안의 데이터 자료형 설정하기

(2) 배열 이름 설정

(3) 배열 크기 설정

​	int[] arr = new int[3];

- 배열을 선언

  = 메모리에 해당 크기의 메모리를 확보

(4) 배열 초기화

<br>

***자바에서 배열의 크기가 한 번 정해지면 변경 불가***

<br>

### 배열과 메모리

ex. int[] arr = new int[5];

​	int (4byte) X 5 = arr는 총 20byte가 할당됨

<br>

객체 자료형으로 접근하기,

arr[0]이 시작하는 **메모리 주소**를 배열 변수 arr에 담고 있음

(직접 데이터가 들어가는 것이 아님)

<br>

- 배열의 길이(크기) 구하기

  ```java
  arr.length();
  ```

- 배열의 요소(값) 출력

  ```java
  Arrays.toString(배열이름)
  ```

- 배열 요소 복사

  ```java
  int[] arr = {1, 2, 3, 4, 5};
  int[] arr02 = null;
      
  arr02 = Arrays.copyOf(arr, arr.length);
  System.out.println("arr02 : " + Arrays.toString(arr02));
  ```

  - `arr`가 가르키고 있는 배열의 첫번째 주소를 동일하게 `arr02`가 가지고 있지 않음

  - `arr`의 배열을 복사해서 메모리의 어딘가에 할당한 후, 그 새로운 것의 주소를 `arr02`는 가르킴

    (새로운 곳에 새로운 객체를 만들어 가르킴)

  - 따라서 `arr`와 `arr02`의 값은 동일하지만

    **두 배열이 가르키고 있는 주소 값은 다름**

    **(전혀 다른 객체임)**

- 배열 레퍼런스

  ```
  int[] arr = {1, 2, 3, 4, 5};
  int[] arr03 = null;
  
  arr03 = arr;
  ```

  - 이때의 경우 `arr`와 `arr03`이 같은 메모리 주소를 가리키고 있음 (= **같은 배열을 레퍼런스**하고 있다.)

<br>

### 다차원 배열

: 종종 2차원 배열까지는 사용

- 선언과 초기화

  ```java
  int[][] arr = new int[3][2]; //행,열
  
  arr[0][0] = 10;
  arr[0][1] = 11;
  ...
  ```

<br><br><br>

## 조건문

### 1. If 문

(1)  

​	if (  조건  )  {           }

(2)

​	if (  조건  ) {

​	} else if (  조건  ) {

​	} else {

​	}

<br>

### 2. switch문

switch (  조건  ) {

​	case value1:

​		System.out.println(  );

​	break;

​	

​	case value2:

​		System.out.println(  );

​	break;

}

<br><br>

## 반복문

### 1. for문

for (초기값, 조건식, 증감식) {

}

for (int i = 1; i<10; i++) {

}

<br>

### 2. while문

초기값

while (조건식) {

​	증감식	

}

<br>

### 3. do ~ while

while문과 달리 최초 1회는 무조건 실행됨

<br><br><br>

## 객체 지향 프로그래밍 (OOP)

  만들어져 있는 좋은 기능들을 조합하여 나만의 새로운 프로그램을 생성할 수 있다는 장점 → 언어의 확장성

<br>

### 객체

: 속성과 기능을 가지고 있는 것, 

특정한 목적을 수행하기 위해 속성들을 가지고 있음

<br>

### 클래스

: '자전거'라는 객체 → 일반/ 산악/ 레이싱 등 용도에 따른 다양함

이렇듯 *속성과 기능은 달라져도*, 다양한 객체를 효율적으로 만들기 위한 '기본적인 틀'

 **객체를 생성하기 위해서는 반드시 Class 생성이 필요함**

이후 GC가 쓸모없는 객체를 정리해 메모리를 회수함

<br>

#### 클래스 구성요소

1. 멤버 변수 (속성)

2. 메서드 (기능)

   - void : 반환 값이 존재하지 않음

   ```java
   public void run() {
       System.out.println("반환값 없음");
   }
   
   public String run() { //String :반환되는 값의 자료형
       return "반환값 존재";
   }
   ```

3. 생성자 (constructor)

   - 메소드와 닮아있고 클래스의 이름과 동일함
   - 클래스, 객체를 생성하기 위함
   - 가장 먼저 호출되는 구역 (생성할 때 필요한 것 명시)

클래스 생성 → 객체 생성(생성자 호출) → 할당된 메모리 주소 

<br>

#### 메서드

```java
// (메서드 선언)

public void getInfo() {

	// public(접근자) void(반환형) run() (매서드이름/매개변수)
    // 메서드 이름은 누가봐도 이해될 수 있도록 동사 + 목적어
	// return값이 있다면 반환형을 String, Arry 등으로 사용

// (메서드 정의)
    System.out.println("여기");
}
```

<br>

#### 중복메서드 (Overloading)

이름은 같더라도 매개변수의 개수와 타입이 다르면 동일한 메서드를 여러개 만들 수 있다.

<br>

#### 접근자

1. private 메서드

   : 외부에서 호출 불가, 내부에서만 사용 가능

2. public 메서드

   : 외부에서 호출 가능

<br><br>

## 객체와 메모리

Bike **mybic** = new Bike();

- 객체가 생성됨
- `mybic`를 **레퍼런스**(가르킨다)라고 칭함
- object를 `mybic`가 가지고 있는 것이 아니라, *object의 주소를 담고 있음*
  - `mybic = null; `한다면, 객체와의 관계가 끊긴다. 해당 object는 사라질지라도 레퍼런스는 존재, new 를 통해 새로운 object를 연결할 수 있음
  - `mybic`을 다시 호출하면 `NullPointException` 발생하며 오류 발생
- **같은 클래스에서 나온 객체일지라도 다른 주소를 가지고 있음**

<br>

GC는 언제 움직이나요?

- 객체에 레퍼런스가 끊긴 경우 출동해서 메모리를 회수함



## 생성자와 소멸자

### 생성자란?

  Object를 생성하기 위해 Class를 만들었다. 

Bike bi = new Bike();와 같이 새로운 object가 생성됐을 때 가장 먼저 호출하는 것이 생성자이다.

 <br>

#### 그럼, class에 생성자가 작성해두지 않았다면 object는 만들어지지 않고 오류를 발생시키는가? 

  생성자가 없는 경우에는 컴파일러가 자동으로 *비어있는 default 생성자*를 만들며 새로운 객체를 만든다. 



<br>

### 소멸자

protected viod finalize( ); 따로 명시하지 않아도 됨

먼저 생성된 객체와의 관계를 끊고 새로운 객체와의 연결고리가 생기는데 이때 System.gc();를 요청하지 않아도 자동으로 처리된다.

```java
System.gc();  
// GC를 작동시켜 주세요. 굳이 명시하지 않아도 됨
```

<br>

<br>

## this

전역변수(global)와 지역변수(local)를 명확히 구분하기 위해 사용

```java
package java_baic3;

public class TestVar {
    
    public int a;  // 전역변수
    public int b;
    
    public TestVar(int a, int b) { // 지역변수
        this.a = a;
        this.b = b;
        // this. = 해당 class 전체를 가르킴
        // this.a = 해당 클래스 내의 a를 의미함
        
        // 지역변수의 경우 생성자가 호출됐을 때(object가 생성됐을 때) 매개변수로 잠시 사용되고 메모리에서 사라짐
        
        System.out.println("a: " + a);
        System.out.println("b: " + b);
            
    }
    
    
}

```

<br>

<br>

## 패키지

: 여러 클래스를 패키지라는 폴더 안에 분류해 관리한다고 이해하기

- 이름 설정
  - 도메인을 꺼꾸로 사용해 지정
    - 다른 프로젝트에서 가져다 사용했을 때 중복이 발생하지 않도록 함
    - kr.co.javaclass, com.java.korea
  - 일반적으로 개발 시작전 미리 정하고 시작함
  - 이름만 보고 안의 내용을 예상할 수 있어야 함

<br>

### Import

: 다른 패키지의 클래스를 사용하고 싶을 경우

```java
package com.java.test;

import java.util.Scanner;
// java가 기본적으로 제공하고 있는 class

import java_basic3.Constructor;
// import package name.class name

import com.java.test2.*;
// * : import all classes in this package

public class TestImport {
    
	Scanner sc = new Scanner(System.in);
	Constructor con = new Constructor(10, 90);

}
```

<br>

### Static

- 별개의 객체이지만 전역변수 같이 사용하자

- static을 통해 메모리에 생성된 모든 객체가 ***데이터를 공유* 할 수 있음**
- 대신 모든 변수를 static 처리하면 메모리에 부담되기 때문에 꼭 필요한 경우에만 판단해서 사용할 것 

ex. 커플통장

*CoupleAccount.java*

```java
package com.java.test;

public class CoupleAccount {

	String name;
	static int amount;   // staic 선언
	// static: share the data with all objects
	
	public CoupleAccount(String name) {
		this.name = name;
	}
	
	public void saveMoney (int money) {
		
		amount += money;
		System.out.println("===================");
		System.out.println("amount: " + amount);

	}
	
	public void spendMoney (int money) {
		
		amount -= money;
		System.out.println("===================");
		System.out.println("amount: " + amount);
		
	}
	
	public void getInfo() {
		
		System.out.println("----------");
		System.out.println("user: " + name);
		System.out.println("amount: " + amount);
		
	}
	
}
```

<br>

*Atm.java*

```java
package com.java.test;

public class Atm {
	
	public static void main(String[] args) {
		
		CoupleAccount w = new CoupleAccount("W");
		// save the name (create W's card)
		w.saveMoney(10000);
		w.getInfo();
		
		CoupleAccount m = new CoupleAccount("M");
		// (create M's card)
		m.saveMoney(10000);
		m.getInfo();
		
		w.spendMoney(3000);
		m.spendMoney(2000);
		
	}

}
```

<br><br><br>

## 데이터 은닉

### public과 private

- pulbic : 외부접근 가능

- private: 내부접근만 허용

→ public의 경우 외부에서 데이터를 변경할 위험이 있기에 속성(멤버변수)이 변질되지 않도록 private을 사용함

<br>

그렇다면 한 번 지정한 데이터는 어떻게 변경할 수 있을까?

### setter와 getter

: 바로 데이터가 변경되지 않도록, 한 단계를 거쳐 실수를 줄이고자 함

무조건 만들 필요는 없다. 필요한 변수에 한해 getter와 setter를 사용하면 된다.

ex. 이름, 사번 등 결코 변경해서는 안될 데이터들의 setter는 만들 필요가 없다. 

<br><br>

## 상속

-  상위 클래스의 속성(멤버 변수)과 기능(method)을 하위 클래스는 사용할 수 있다. 더불어 자신만의 속성과 기능을 추가할 수 있다.

- parent class (상위 클래스) - child class (하위클래스)

- child class가 parent class를 상속한다.

<br>

### 왜 상속이 필요할까?

 기존에 있던 속성과 기능을 또 처음부터 새롭게 만들어 추가해 중복이 발생하지 않도록 한다. 기존의 클래스를 가져다 사용할 수 있음으로 시간을 줄이고 정확성을 높일 수 있다.

<br>

### extend: 상속 관계 만들기

```java
public class ChildClass extends ParentClass{

}
```

<br>

### Java는 다른 언어와 달리 *단일상속*만 가능

- 다중 상속 불가. 한 클래스는 하나의 클래스만을 상속 받을 수 있다.

<br>

### parent class에서 상속받아 사용할 수 없는 것은?

- private method에는 child class이 접근할 수 없다.

<br>

### 상속의 특징은?

1. Override

   : 상위 클래스의 메서드(기능)을 수정/보완하여 *메서드를 재정의함*

   *ChildClass.java*

   ```java
   @Override
   	public void smile() { 
   		System.out.println("--HiHiHi--");
   	}
   ```

   *ParentClass.java*

   ```java
   public void smile() {
   		System.out.println("--HoHoHoHo--");
   	}
   ```

<br>

2. 클래스의 이름이 '데이터 타입'으로 사용됨

   ```java
   ParentClass[] arr = new ParentClass[2];
   		
   	ParentClass child1 = new ChildClass();
   	ParentClass child2 = new ChildClass2();
   
   	arr[0] = child1;
   	arr[1] = child2;
   ```

   - `child1`의 데이터 타입은 `ParentClass`

     `child2`의 데이터 타입도 `ParentClass`

   - 그러므로 *'동일한 데이터 타입'* 인 두 객체로 배열을 생성할 수 있음

<br>

3. 모든 클래스의 최상위 클래스는 Object클래스

   ![image](https://user-images.githubusercontent.com/35055662/50230214-94cc6100-03ef-11e9-8b50-2b51bce9c723.png)

   - 특징 2번처럼 데이터 타입을 'Object'로 설정해 통일 할 수 있음

<br>

4. super 클래스

   : 현재 클래스가 상속하고 있는 클래스의 변수를 부를 때 사용

   *ParentClass.java*

   ```java
   String fatherName = "Jun";
   ```

   *ChildClass.java*

   ```java
   String fatherName = "JiHo";
   
   public void getFatherName() {
   		System.out.println("Grandfather's Name: " + super.fatherName);
   		System.out.println("My Father's Name: " + this.fatherName);
   	}
   ```

   - super.fatherName으로 상속한 클래스의 변수값을 불러옴

   *MainClass*

   ```java
   ChildClass chiiii = new ChildClass();
   		chiiii.getFatherName();
   ```

   *Console*

   ```java
   --Parent Constructor--
   --ChildClass Constructor--
   Grandfather's Name: Jun
   My Father's Name: JiHo
   ```


<br><br>

## 내부 클래스와 익명 클래스

1. 내부 클래스 (inner class)
   - 데이터를 공유가 쉬워진다는 장점
   - 하지만 객체의 객체가 만들어지는 등 관계가 복잡해져 거의 사용하지는 않음

   <br>

2. 익명 클래스 (anonymous class)

   - 메서드를 재정의하기 위해 사용
   - 일회성
   - **주로 인터페이스와 추상클래스에 사용됨**

   ```java
   //일반적으로 객체를 생성할 때
   ChildClass chi = new ChildClass();
   
   // 익명 클래스로 객체를 생성할 때
   new ChildClass();
   // chi와 같은 이름이 없어 익명 클래스
   ```

   ```java
   // anonymous class
   new ChildClass() {  
   // create Object
   
       @Override
       public void smile() {
       System.out.println("HahaHoho");
       };	
       
   }.smile();
   ```

   - new ChildClass( ) {   }.smile( ); 으로 바로 출력해 볼 수 있음

<br>

<br>

## 인터페이스 (Interface)

- Class에서 인터페이스를 '구현'한 후, 인터페이스에 선언만 되어 있던 method를 클래스에서 구체적으로 기능을 명시해 사용

- method를 선언만하고 정의하지 않음 (작업 명세서만 쓰여있는 껍데기)

  해당 인터페이스를 구현하는 클래스를 통해 기능을 정의하고 사용

- 다양한 데이터 타입을 취할 수 있음 (다형성)

  ```java
  Interface01 = new InterfaceClass();
  Interface02 = new InterfaceClass();
  Interface03 = new InterfaceClass();
  ```

  - 데이터 타입이 Interface01,  Interface02, Interface03 다양함
  - interfaace를 데이터타입으로 사용할 수 있음

- 변경사항이 발생했을 때 새롭게 각각의 객체를 다시 만들지 않고 해당 인터페이스를 수정해 그대로 사용할 수 있음 

<br>

ex. 오리의 일반적인 기능을 가지고 있는 interface로 실제오리와 인형오리 만들기

Interface: Duck.java

Class: DuckDollClass.java, DuckRealClass.java, DuckMainClass.java

*DuckMainClass.java*

```java

public static void main(String[] args) {
    Duck doll = new DuckDollClass();
    Duck real = new DuckRealClass();

    Duck ducks[] = {doll, real};
    //DataType: Duck 

    for(int i = 0; i < ducks.length; i++) {
        ducks[i].fly();
        ducks[i].sound();
        ducks[i].swim();
        ducks[i].walk();

        System.out.println();
		}
	}
```

- 배열을 만들기 위해 'Duck' 인터페이스를 데이터 타입으로 지정함<br>

<br><br>

## 추상 클래스 (abstract Class)

- Class 역할 + interface의 특성을 담은 클래스

- 상속처럼 abstract class도 객체 생성시 데이터 타입으로 사용 가능

- 선언만 되어 있고 정의가 되지 않은 method를 

  상속한 Class에서 extends로 구체화하여 사용

  *AbstractClass.java*

  ```java
  package com.java.abstractTest;
  
  // abstract 클래스
  public abstract class AbstractClass {
  
      // 일반 class 성질을 띄고 있음 (속성과 기능 명시 가능)
  	int num;
  	String str;
  	
  	public AbstractClass() {
  		System.out.println("--Abstract Constructor--");
  	}
  	
  	public AbstractClass(int n, String s) {
  		System.out.println("--Abstract Constructor--");
  	
  		this.num = n;
  		this.str = s;
  	}
  	
  	// 추상 method
  	public abstract void run();
  }
  ```

  *AbstractExClass.java*

  ```java
  package com.java.abstractTest;
  
  // 추상 클래스를 상속함
  public class AbstractExClass extends AbstractClass{
  	
      // 생성자
  	public AbstractExClass() {
  		System.out.println("--AbstractExClass Constructor--");
  	}
  	
      // 매개변수가 존재하는 생성자
  	public AbstractExClass(int n, String s) {
  		super(n, s);
  		
  	}
  	
      // 상속한 추상 클래스의 추상 메서드를 구체화함
  	@Override
  	public void run() {
  		System.out.println("--Run fast--");
  	}
  
  }
  ```

  *AbstractMainClass.java*

  ````java
  package com.java.abstractTest;
  
  public class AbstractMainClass {
  	
  		public static void main(String[] args) {
  			
              // 상속이기에 abstract class도 데이터 타입으로 사용 가능
  			AbstractClass ab = new AbstractExClass(100, "ha");
              // AbstractExClass ab = new AbstractExClass(100, "ha");  // 위의 식과 동일
              
  			ab.run();
  		}
  }
  
  ````



<br>

### 추상 클래스 vs. 인터페이스

#### 공통점 

- 추상 메서드를 가지고 있음
- 직접적인 객체 생성이 불가
- 자료형으로 사용할 수 있음

#### 차이점

- interface (구현되는 것: A implemets interface)

   - 추상클래스가 클래스처럼 생성자, 변수, 메서드 등을 포함하고 있는 것과 달리 *상수, 추상메서드만*을 지니고 있음

- abstract Class (상속 되는 것: A extends abstractClass)

  - 클래스가 가지고 있는 속성과 기능을 모두 가질 수 있음 (선언할 수 있음)

  - 단일 상속만 가능



여러개의 관련있는 메서드를 수정하거나 보안할 일이 많을 겅우 interface를 사용해 관리하고, 그러한 경우가 아니다면 abstract class를 사용하는 것이 좋다는 것일까(?). 차차 프로젝트를 통해 어느 것을 사용해야 알맞은지 알아가보자.

<br>

<br>

## 람다식

- 인터페이스를 implements와 @Override 없이 바로 사용 가능

  - Interfcae
    1. `Duck.java`라는 interface를 만듦
    2. `Duck.java` interface를 구현하는 `DuckDollClass`와 `DuckRealClass`를 생성
    3. `DuckMainClass.java`를 만들어 new로 `DuckDollClass`와 `DuckRealClass`의  객체를 생성하여 구현한 interface에 있는 메서드를 사용할 수 있음
  - Lambda
    1. `Duck.java`라는 interface를 만듦
    2. 바로 `DuckMainClass.java`에서 Class의 객체 생성 없이, interface의 메서드를 가져다 사용할 수 있음

  ***확실히 절차가 간단해 진 것을 볼 수 있음***

- 어떤 매개변수를 전달해야하고, 어떤 일을 해야하는지만 알려주면 됨

- C언어 함수 지향 언어 - java, C++ 객체 지향 언어 (함수를 묶고 묶어)

  함수만을 이용해서 사용할 수 있는 장점을 살려 '람다(Lambda)' 기능을 구현해 사용하고자 함

<br>

1. 

   ```
   // InterfaceA
   	InterfaceA Ia = (String a, String b) -> {System.out.println(a + " " + b); };
   	Ia.greeting("Good", "Morning");
   ```

2. Parameter 값이 1개 or 매개변수의 데이터 타입이 모두 동일할 때 

   ```java
   // InterfaceB
       InterfaceB Ib = (a) -> { System.out.println(a); };
       Ib.greeting("Morning");
   ```

   - 데이터 타입을 생략

   ```java
   // InterfaceB_2
       InterfaceB Ib2 = a -> System.out.println(a);
       Ib.greeting("Morning");
   ```

   - 만약 실행문이 한 개라면 '{ }' 를 생략할 수 있음
   - 매개변수가 한 개하면 또한 '( )'를 생략할 수 있음

<br>

3. 

   ```java
   // InterfaceC
       InterfaceC Ic = () -> System.out.println("no parameter");
       Ic.greeting();
   ```

   - lambda 함수에 매개변수가 없는 경우 빈 괄호만 작성함

<br>

4. 반환값이 있는 경우

   *InterfaceD*

   ```java
   public interface InterfaceD {
   		public int cal(int a, int b);
   }
   ```

   *MainClass*

   ```java
   Id = (x, y) -> {
       int result = (10*x) - y;
       return result;
   };
   System.out.printf("Id.cal: %d\n", Id.cal(100, 150));
   ```

<br><br><br>

## 문자열 클래스 

- `String str = "Hello";`

  - 바로 객체가 생성됨 (`String str = new String("문자열");` 생략)

  - str은 "Hello"가 들어간 *메모리 주소*를 포함

- 문자열을 변경한다면 기존의 메모리를 재활용하지 않고, 해당 메모리를 다시금 복사해 새롭게 만든 후 추가/수정한 내용을 덧붙임 (메모리의 효율성↓)

  - 메모리의 효율성↓ & 약간의 속도 저하 

  - 기존 객체의 메모리는 GC가 회수

  ```java
  String str = "Hello";
  str = str + "-Bye!";
  // 위의 str과 아래의 str이 가르키는 메모리 주소가 다르다.
  ```

<br>

문자열 객체의 단점인 메모리를 효율성을 보완하고자 사용하는 것이

### StringBuffer, StringBuilder

- String Buffer가 만들어 진 후 '속도' 측면을 보완하여 StringBuilder가 만들어짐
  - 데이터 안전성 : StringBuffer > StringBuilder
  - 속도 : StringBuffer < SringBuilder (빠름)
  - 비스하지만 최근에는 많은 데이터를 다룰 수 있는 StringBuilder가 빈번히 사용

- 문자열이 변경되면 기존의 객체를 재활용함
- 일반적으로 string 객체를 사용하고 장기간 데이터를 저장하고 사용한다면 StringBuffer와 StringBuilder 사용

```java

StringBuffer sf = new StringBuffer("문자열");
StringBuilder sb = new StringBuilder("Hello");

sf.append("+추가");

// 길이(크기) 
sf.length();

// insert(insert 시점, 문자);
sf.insert(6, "Bye");

//  delete(지우는 시작, 끝);
sf.delete(1, 3);

```

<br><br>

## Collections (자료형)

- 다양한 데이터를 주고 받을 경우 사용하는 Class

1. List

   - 배열과 유사, index값이 자동 부여되어 데이터를 관리

   - List는 인터페이스 (Vecotr, ArrayList, LinkedList는 List를 구현)

     - ArrayList 

       ```java
       ArrayList<데이터타입> list = new ArrayList<데이터타입>();
       
       // addData
       list.add("Good");
       list.add("Morning");
       list.add("Everyone");
       // 차곡차곡 정렬됨
       list.add(2, "*"); // list[2] = *;
       
       // 데이터를 변경하고 싶을 때
       list.set(2, "!");
       
       // getData
       String str = list.get(3);
       
       // removeData
       list.remove(3);
       
       // removeAllData : clear();
       list.clear();
       
       // isEmpty?
       boolean b = list.isEmpty();
       ```

       - DB를 이용시 데이이터를 관리할 때 많이 사용됨

2. Map

   - Index 아닌 Key, Value로 데이터 관리
   - Key 값은 중복불가, 유일해야 함

     - HashMap

       ```java
       HashMap<Integer, String> map = new HashMap<Integer, String>();
       
       // (key, value) 값 넣기
       map.put(2, "A");
       map.put(3, "c");
       map.put(4, "D");
       
       // value를 변경할 때 역시 put();으로
       map.put(2, "B");
       // 현재 map은 {2=B, 3=C, 4=D}
       
       // getData
       String str = map.get(2);
       
       // removeData
       map.remove();
       
       // 해당 key값을, 해당 value값을 map이 가지고 있나요?
       boolean b = map.containKey(3);
       b = map.containValue("A");
       
       // remove all data
       map.clear();
       
       // isEmpty?
       b = map.isEmpty();
       ```

       - <key의 데이터 타입, value의 데이터 타입>

<br>

<br>

## 예외처리

### 예외란

- 예외: s/w적으로, 프로그램에 문제가 있음을 의미

- 예외처리: 예외로 인해 시스템 동작이 멈추는 것을 방지

  1. Checked Exception

     - 무조건 예외처리를 해야되는 특정 상황으로 그렇지 않으면 컴파일 조차 되지 않음
     - 네트워크나 외부 자원을 사용할 때

  2. Unchecked Exception

     - 개발자의 판단에 따라 예외처리를 하는 경우 (무조건X)

       ex. a/b (b != 0)

<br>

### Exception Class

- 빈번히 발생하는 Exception의 3가지 하위 클래스

  - NullPointerException

    ````java
    Object obj = new Oject();
    obj = null;
    
    // 객체와 레퍼런스가 끊어졌는데 호출했기에 NullPointException 발생
    obj.getInfo(); 
    ````

  -  ArrayIndexOutOfBoundException

    : 배열에 존재하지 않는 인덱스를 가르킬 때

    ```java
    ArrayList<Integer> list2 = new ArrayList<Integer>();
    list2.add(1);
    list2.add(1, 2);
    // list2는 [1, 2]인 상황
    
    // 존재하지 않는 인덱스 index[3] (index[2] 자리가 비어있는 상황)
    // ArrayIndexOutOfBoundException 발생
    list2.add(3, 4);
    list2.add(2, 4);
    // list2는 [1, 2, 4]인 상황
    ```

  - NumberFormationException

    : 숫자 데이터에 다른 타입의 데이터를 넣었을 때

<br>

### try~ catch / finally

- 개발자가 자체적으로 예외를 처리함

  ```java
  package com.java.exception;
  
  public class MainClass {
  	
  	public static void main(String[] args) {
  		
  		int x = 100;
  		int y = 0;
  		int z;
  		int i;
  		
  		System.out.println("Here");
  		
  		try {
  			
  			// 예외가 발생할 것 같은 부분을 적기
  			z = x / y;
  			i = x + y;
  			
  		} catch (Exception e) {
  			
  			// 어떤 예외가 발생했는지 console에 출력
  			e.printStackTrace();
  			// 예외를 간략하게 문자로 받아옴
  			String msg = e.getMessage();
  			
  			System.out.println("Exception :" + msg);
  			
  		} finally {  // 무조건 실행
              
  			i = x + y;
  			System.out.println(i);
  		}
  	
  		System.out.println("Here?!");	
  	}
  }
  ```

- 예외가 발생한 이후의 코드들은 실행되지 않고, try~catch 문 이후로 보냄 

  위의 경우 예외가 발생한 `z = x / y;` 이후의 `i = x + y;`가 실행되지 않음


- 이때  `i = x + y;`가 반드시 실행되야 한다면, 외부의 네트워크를 끊는다는 의미의 `finally`를 통해 무조건 실행이 되도록 할 수 있음

<br>

### throws

- 예외처리 미루기, 저기에서 해결하세요. 

```
void Firstmethod throws Exception() {
    
}
```



<br><br>

## 데이터 입력과 출력

- stream : 데이터가 오고가는 길

- **InputStream, OutputStream 클래스**
  - 1byte단위로 데이터를 전송하는 기본 입출력클래스
  - 추상 Class로 추상 메서드를 가지고 있음


1. FileInputStream/FileOutputStream

   : 파일에 데이터를 읽고 쓰기 위한 클래스

   **네트워크 및 읽기/쓰기와 관련된 것은 무조건 예외처리를 해줘야 함**

   그렇지 않으면 컴파일 에러가 발생함

   - FileInputStream

     - read( );

       - 용량이 아무리 큰 파일일지라도 1byte씩 차근 차근 끝까지 읽어옴

     - read(byte[ ]);

       - byte[ ]를 매개변수로 사용
       - [ ]크기만큼 한 번에 묶음으로 읽어와 속도를 높임

     *InputOutput.java*

     ```java
     public class MainClass02 {
     	public static void main(String[] args) {
             // 읽고쓰는 기능을 쓰고자 추상 클래스로부터 객체를 생성
             InputStream ins2 = null;
             try {
     
                 ins2 = new FileInputStream("C:\\java\\pjt\\test.txt");
                 // FileInputStream ins2 = new FileInputStream("C:\\java\\pjt\\test.txt");
     
     
                 int data2 = 0;
                 // 매개변수로 배열 하나를 선언함
                 byte[] by = new byte[3];
     
                 while(true) {
     
                     try {
                         data2 = ins2.read(by);
                     } catch (IOException e){
                         e.printStackTrace();
                     } 
                     if(data2 == -1) break;
                     System.out.println("data :" + data2);
                     for (int i = 0; i < by.length; i++) {
                         System.out.println("bs[" + i + "] : " + by[i]);
                     }
                 }	
     
             } catch (FileNotFoundException e) {
                 e.printStackTrace();
             }
     
         }  // console에 파일의 데이터를 ASCII(아스키 코드)로 보여줌
     }
     ```

     <br>

   - FileOutputStream

     - write(byte[ ] b);
       - 배열로 한 번에 묶어서 쓰기 기능 실행
     - write(byte[ ], int off, int len)
       - (         ,시작점, 사용할 글의 길이)를 명시

     *InputOutput02.java*

     ```java
     public class MainClass02 {
     	
     	public MainClass02() {
     	
     		// write()
     		OutputStream os = null;
     		try {
     			
     			// 해당 파일이 있으면 기존의 것에 쓰고
     			// 해당 파일이 없으면 새로 생성함
     			os = new FileOutputStream("C:\\java\\pjt\\test2.txt");
     			String data = "Good Morning Everyone*";
     			byte[] arr = data.getBytes();
     			
     			try {
     				os.write(arr);
     			} catch (IOException e) {
     				e.printStackTrace();
     			} finally {
     				try {
     					if(os != null) os.close();
     				} catch (IOException e) {
     					e.printStackTrace();
     				}
     			}
     		} catch (IOException e) {
     			e.printStackTrace();
     		}
     		
     		
     		// write(
     		OutputStream os2 = null;
     		try {
     			
     			// 해당 파일이 있으면 기존의 것에 쓰고
     			// 해당 파일이 없으면 새로 생성함
     			os2 = new FileOutputStream("C:\\java\\pjt\\test2.txt");
     			String data2 = "Good Morning Everyone*";
     			byte[] arr2 = data2.getBytes();
     			
     			try {
     				os2.write(arr2, 0, 5);
     			} catch (IOException e) {
     				e.printStackTrace();
     			} finally {
     				try {
     					if(os != null) os.close();
     				} catch (IOException e) {
     					e.printStackTrace();
     				}
     			}
     		} catch (IOException e) {
     			e.printStackTrace();
     		}
     	}
     	
     }
     
     ```

     <br>

2. DataInputStream/ DataOutputStream

   - byte 단위에서 개선해 문자 단위로 처리

   *DataInputOut.java*

   ```java
   public class DataInputOut {
   	
   	public static void main(String[] args) {
   		
   		String str = "Good Morning Everyone";
   		OutputStream os = null;
   		DataOutputStream dos = null;
   		
   		try {
   		
   			// FileOutputStream으로 상위 OutputStream의 객체 생성
   			os = new FileOutputStream("C:\\java\\pjt\\good.txt");
   			// OutputStream을 매개변수로 사용한 DataOutputStream
   			dos = new DataOutputStream(os);
   
   			dos.writeUTF(str);
   			
   		} catch (Exception e) {
   			e.printStackTrace();
   		} finally {
   			try {
   				if(dos != null) dos.close();
   			} catch (IOException e) {
   				e.printStackTrace();
   			}
   		}
   	}
   
   }
   ```

   <br>

3. BufferedReader/ BufferedWrite

   - 문자열 단위로 한 라인씩 읽어 온다고 생각하기

<br><br>

## 네트워킹

<br>

### 소켓

- 소켓(Socket) : 네트워크 상에서 데이터를 전송하고 입/출력 가능
- 자바에서 Class로 제공 
- 클라이언트: 데이터 요청을 보내는 곳 (브라우저)
  - socket 제작
- 서버: 데이터를 제공하는 곳
  - Server socket 제작

<br>

1. ServerSocket을 만들어 놓고 Browser를 통해 접속

```java
package com.java.socket;

import java.net.ServerSocket;
import java.net.Socket;

public class SocketMainClass {
	
	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		// reference 변수를 serverSocket로 정함
		// 네트워크와 관련되어 무조건 예외처리가 필요함
		// 그래서 변수 선언만하고 초기화는 하지 않음
		
		Socket socket = null;
		
		try {
			
			serverSocket = new ServerSocket(9000); // port번호 입력
			// ServerSocket이 생성됨
			// Client를 맞을 준비가 됨
			System.out.println("ServerSocket 준비완료");
			
			socket = serverSocket.accept();
			// socket을 반환해 줌 
			System.out.println("Client 연결");
			System.out.println("socket: " + socket);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally { // 자원 회수
			try {
				if(socket != null) socket.close();
				if(serverSocket != null) serverSocket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

```

<br>

2. Client와 Server간의 Socket을 이용한 통신

   *MainClassServerSocket*

   ```java
   public class MainClassSeverSocket {
   	
   	public static void main(String[] args) {
   		
   		ServerSocket serverSocket = null;
   		// 요청을 받는 기능도 필요함
   		
   		Socket socket = null;
   		// 요청 보냄
   		
   		try {
   			serverSocket = new ServerSocket(9001);
   			System.out.println("Complete. Welcome, Client!");
   			
   			socket = serverSocket.accept();
   			// Client가 들어오면 accept()가 받아줌
   			// accept가 socket 객체를 반환해줌
   			System.out.println("Connect the client");
   			System.out.println("sockt: " + socket);
   			
   		} catch (IOException e) {
   			e.printStackTrace();
   		} finally {
   			try {
   				if(socket != null) socket.close();
   				if(serverSocket != null) serverSocket.close();
   			
   			} catch (IOException e) {
   				e.printStackTrace();
   			}
   			
   			
   		}
   	}
   
   ```

   *MainClassSocket*

   ```java
   public static void main(String[] args) {
   		
   		Socket socket = null;
   		
   		try {
   			socket = new Socket("localhost", 9000);
   			// 개인pc IP : 127.0.0.1  (어디로, 포트번호)
   			// 네트워크 연결장치 생성 완료
   			
   			System.out.println("successfully Connect the Server");
   			System.out.println("socket: " + socket);
   			
   		} catch (Exception e) {
   			e.printStackTrace();
   		} finally {
   			try {
   				if(socket != null) socket.close();
   			} catch (Exception e) {
   				e.printStackTrace();
   			}
   		}
   	}
   ```

   - Server 먼저 구동 한 후 Client 접속 (server 정보를 통해 접근)

<br>

3. 양방향 통신

   *ServerClass.java*

   ```java
   public class ServerClass {
   	
   	public static void main(String[] args) {
   		
   		ServerSocket serverSocket = null;
   		Socket socket = null;
   		
   		InputStream ins = null;
   		DataInputStream dins = null;
   		
   		OutputStream ops= null;
   		DataOutputStream dops = null;
   		
   		try {
   			
   			serverSocket = new ServerSocket(9001);
   			System.out.println("Complete. Welcome!");
   			
   			// outMessage가 오면 여기서 반응
   			socket = serverSocket.accept();
   			System.out.println("Successfully Connect the client");
   			System.out.println("socket: " + socket);
   			
   			ins = socket.getInputStream();
   			dins = new DataInputStream(ins);
   			
   			ops = socket.getOutputStream();
   			dops = new DataOutputStream(ops);
   			
   			while (true) {
   				// client에서 outMessage로 내보낸 데이터
   				String clientMessage = dins.readUTF();
   				System.out.println("clientMessage: " + clientMessage);
   
   				// Client에 메세지 전송(입력)
   				dops.writeUTF("메시지 전송완료");
   				dops.flush();
   				
   				if(clientMessage.equals("STOP")) break;
   				
   			}
   			
   		} catch (IOException e) {
   			e.printStackTrace(); 
   		} finally {
   			try {
   				if(dops != null) dops.close();
   				if(ops != null) ops.close();
   				if(dins != null) dins.close();
   				if(ins != null) ins.close();
   				
   				if(socket != null) socket.close();
   				
   			} catch (IOException e) {
   				e.printStackTrace();
   			}
   		}
   		
   	}
   
   }
   ```

   *ClientClass.java*

   ```java
   public class ClientClass {
   	
   	public static void main(String[] args) {
   		
   		
   		// 필요한 객체들을 선언
   		Socket socket = null;
   		
   		OutputStream ops= null;
   		DataOutputStream dops = null;
   		
   		InputStream ins = null;
   		DataInputStream dins = null;
   		
   		Scanner sc = null;
   		
   		try {
   			socket = new Socket("localhost", 9001);
   			System.out.println("Connet the Server");
   			
   			ops = socket.getOutputStream();
   			dops = new DataOutputStream(ops); // 확장
   			
   			ins = socket.getInputStream();
   			dins = new DataInputStream(ins);
   			
   			sc = new Scanner(System.in);
   			
   			while (true) {
   				System.out.println("메세지를 입력하세요: ");
   				String outMessage = sc.nextLine();
   				
   				// 서버로 보내기
   				dops.writeUTF(outMessage);
   				dops.flush();
   				
   				// Server에서 들어온 말을 출력
   				String inMessage = dins.readUTF();
   				System.out.println("inMessage: " + inMessage);
   				
   				if(outMessage.equals("Strop")) break;
   			}
   				
   		} catch (IOException e) {
   			e.printStackTrace(); 
   		} finally {
   			try {
   				if(dops != null) dops.close();
   				if(ops != null) ops.close();
   				if(dins != null) dins.close();
   				if(ins != null) ins.close();
   				
   				if(socket != null) socket.close();
   				
   			} catch (IOException e) {
   				e.printStackTrace();
   			}
   		}
   	}
   }
   ```

   - Severclass 서버 작동 후 ClientClass를 실행하면 다음과 같이 데이터를 주고 받을 수 있음

     *ClientClass 콘솔창*

     ![image](https://user-images.githubusercontent.com/35055662/50382124-8e820180-06db-11e9-8736-312a6507a411.png)



   ​	*ServerClass 콘솔창*

   ​	![image](https://user-images.githubusercontent.com/35055662/50382135-c12bfa00-06db-11e9-9be4-3c2228a18141.png)



<br><br><br>






[[학습자료 출처\] Inflearn, 완전 초보부터 개발자 취업까지!! 실전 JAVA 강좌](https://www.inflearn.com/learningpath/java-gibon/#hj_clp_step)