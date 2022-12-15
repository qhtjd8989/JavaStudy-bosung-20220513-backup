package j21_익명클래스;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PrincipalDetailse {

	public static void main(String[] args) {
		// 클래스를 따로 만들지 않고 바로 구현을 해서 클래스명이 없음(익명클래스) 
		// 익명클래스는 재사용하지 않을때 사용
		// 구현 내용이 달라져야 할 때 사용
		
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("a");
		strList.add("b");
		strList.add("c");
		strList.add("d");
		strList.add("e");
		strList.add("f");
		
		// 익명클래스
		GrantedAuthority grantedAuthority = new GrantedAuthority() {
			
			@Override
			public Collection<String> getRoles(List<String> roles) {
				System.out.println(roles);
				return roles;
			}
		};
		
		GrantedAuthority grantedAuthority3 = new GrantedAuthority() {
			
			@Override
			public Collection<String> getRoles(List<String> roles) {
				return roles;
			}
		};
		
		
		GrantedAuthority grantedAuthority2 = new GrantedAuthorityImpl();
			
		grantedAuthority.getRoles(strList).forEach(r -> {System.out.println(r);}); // 매개변수가 하나일때는 괄호 생략가능
		grantedAuthority2.getRoles(strList).forEach(r -> {System.out.println(r);});
		grantedAuthority3.getRoles(strList).forEach(r -> {System.out.println(r);});

	}

}
