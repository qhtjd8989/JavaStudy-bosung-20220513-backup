package j19_제네릭;

import j10_클래스기본정리.repository.User;
import j12_상속.동물.Animal;
import j12_상속.동물.Human;
import j12_상속.동물.Tiger;

public class Controller {
	
	public Object createUser() {
		return new CMRespDto<String>(1, "회원추가 성공", "aaaa, 1234");
	}
	
	public Object updateUser() {
		return new CMRespDto<Integer>(1, "회원정보(나이)수정 성공", 29);
	}
	//제네릭의 와일드카드 : ?
	public CMRespDto<?> getUser() {
		User user = new User();
		user.setUsercode("1");
		user.setUsername("asd");
		user.setPassword("1234");
		user.setName("사람1");
		user.setEmail("aaaa@aaaa");
		if(user.getUsercode().equals("1")) {
			return new CMRespDto<User>(1, "회원정보 가져오기 성공", user);
		}else {
			return new CMRespDto<String>(-1, "회원정보 가져오기 실패", "usercode = 2");
		}
		
	}
	
	//와일드카드에서 제약 조건을 거는 방법
	public CMRespDto<? extends Animal> getAnimal(){
		Animal animal = new Animal();
		
		if(animal instanceof Human) {
			return new CMRespDto<Human>(1, "사람입니다.", (Human)animal);
		}else if(animal instanceof Tiger) {
			return new CMRespDto<Tiger>(1, "사람입니다.", (Tiger)animal);
		}else {
			return new CMRespDto<>(-1, "찾을 수 없는 동물", animal); //와일드카드에서 <>비우면 리턴 자료형을 따라간다
		}
	}
}
