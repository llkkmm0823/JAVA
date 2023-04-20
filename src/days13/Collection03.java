package days13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//ArrayList나 Vector와 비슷하지만 운영방식이 다른 LinkedList 라는 리스트가 있으나 거의 사용하지 않아 생략

// Set (HashSet)클래스
// 데이터의 중복을 허용하지 않고 저장하는 클래스

// - 검색을 위해서 사용되는 클래스
// 	  (저장할 때 hash연산의 결과로 저장하므로, 검색할 때도 hash연산 결과로 검색하여 빠른 검색이 가능)

//  - hash 연산 : 클래스 내에서 유일한 값을 얻어낼 수 있는 고유 알고리즘 연산
//  - 중복된 값을 제거하면서 데이터를 저장하기 위해 사용

public class Collection03 {

	public static void main(String[] args) {
		
		ArrayList<Integer>a = new ArrayList<>();
		a.add(1); a.add(2); a.add(2);
		System.out.println("ArrayList 자료 갯수 : " +a.size()); // 중복을 허용하기 때문에 3이 반환
		
		HashSet<Integer>h = new HashSet<>();
		h.add(1); h.add(2); h.add(2);
		System.out.println("HashSet 자료 갯수 : "+h.size()); // 중복을 허용하지 않기 때문에 2가 반환
		
		System.out.println("\nArrayList : ");
		for(Integer k : a)System.out.printf("%d ",k);
		System.out.println("\nHashSet : ");
		for(Integer k : h)System.out.printf("%d ",k);
		System.out.println();
		
		//로또 번호 발생기
		HashSet<Integer> lotto = new HashSet<>();
		while(lotto.size()<6) //6개가 채워질때까지 계속 해
			lotto.add((int)(Math.random()*45+1));
		for(Integer k : lotto)System.out.printf("%d ",k);
		System.out.println();

		// HashSet에는 정렬 메서드가 없음
		// 링크드 리스트의 부모클래스인 List 클래스에 전해주고 리스트로 변환해서 Collection의 스태틱 메서드로 정렬
		List<Integer>list = new LinkedList(lotto);
		Collections.sort(list);
		System.out.println(list); // 한번에 출력
		for( Integer k : list) System.out.printf("%d ",k); // for 문 이용
		System.out.println();
		
		// 리스트 또는 해쉬세트의 내부 값들을 조회하는 방법
		// 1. iterator를 이용하는 방법
		//		-Iterator 객체는 컬렉션 내부의 데이터를 순회할 수 있는 객체
		Iterator<Integer> iter1 = lotto.iterator();
		Iterator<Integer> iter2 = list.iterator();
		//lotto 및 list의 값들에 접근할 수 있는 권한을 Iterator객체에 저장합니다
		
		System.out.println("\n iter1로 lotto(HashSet) 방문출력 : ");
		while ( iter1.hasNext())//.hasNext() : 방문할 다음 데이터가 있다면 true 없다면 false
			System.out.printf("%d  ",iter1.next());
		// 최초에 데이터들의 맨 앞쪽을 가리키고 있다가 iter1.next()에 의해 첫 번째 데이터부터 방문하게 됨
		System.out.println("\n iter2로 list(list) 방문출력 : ");
		while ( iter2.hasNext())
			System.out.printf("%d  ",iter2.next());


	}

}
