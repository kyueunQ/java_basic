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

<br><br>

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

pulbic : 외부접근 가능

private: 내부접근만 허용

→ public의 경우 외부에서 데이터를 변경할 위험이 있기에 속성(멤버변수)이 변질되지 않도록 private을 사용함

<br>

그렇다면 한 번 지정한 데이터는 어떻게 변경할 수 있을까?

### setter와 getter

: 바로 데이터가 변경되지 않도록, 한 단계를 거쳐 실수를 줄이고자 함

무조건 만들 필요는 없다. 필요한 변수에 한해 getter와 setter를 사용하면 된다.

ex. 이름, 사번 등 결코 변경해서는 안될 데이터들의 setter는 만들 필요가 없다. 

<br><br>

<br>

## 상속

: 상위 클래스의 속성(멤버 변수)과 기능(method)을 하위 클래스는 사용할 수 있다. 더불어 자신만의 속성과 기능을 추가할 수 있다.

parent class (상위 클래스) - child class (하위클래스)

child class가 parent class를 상속한다.

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

: 다중 상속 불가. 한 클래스는 하나의 클래스만을 상속 받을 수 있다.

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

## 내부 클래스와 익명 클래스(많이 사용)

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

<br><br>

[[학습자료 출처\] Inflearn, 완전 초보부터 개발자 취업까지!! 실전 JAVA 강좌](https://www.inflearn.com/learningpath/java-gibon/#hj_clp_step)