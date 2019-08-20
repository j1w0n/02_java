package snack;

/**
 * 오레오(Oreo) 쿠키가
 * 여러개 들어가있는 박스
 * @author Administrator
 *
 */
public class OreoBox {

	// Oreo 를 여러개 저장할 수 있는
		// Oreo[] oreos 를 멤버 변수로 갖도록 선언
		Oreo[] oreos;
		
		// 생성자 기본, 매개변수 중복정의
		OreoBox() {
			
		}
		
		OreoBox(Oreo[] oreos) {
			this.oreos = oreos;
		}
		
		
		// 오레오 박스에
		// 오레오 쿠키를 1개씩 추가, 삭제, 수정, 꺼내(get)거나
		public void add(Oreo oreo) {
			Oreo[] newOreos = new Oreo[oreos.length + 1];
			
			for (int idx = 0; idx < oreos.length; idx++) {
				newOreos[idx] = oreos[idx];			
			}
			
			newOreos[newOreos.length - 1] = oreo;
			
			this.oreos = newOreos;
		}
		
		public void remove(Oreo oreo) {
			Oreo[] newOreos;
			
			int index = findOreoIndex(oreo);
			
			if (index > -1) {
				newOreos = new Oreo[oreos.length - 1];
				
				for (int idx = 0; idx < index; idx++) {
					newOreos[idx] = oreos[idx];
				}
				
				for (int idx = index; idx < newOreos.length; idx++) {
					newOreos[idx] = oreos[idx + 1];
				}
				
				this.oreos = newOreos;
			
			} // end outer if
			
		}

		public void set(Oreo oreo) {
			int index = findOreoIndex(oreo);
			
			if (index > -1) {
				oreos[index] = oreo;
			}
		}
		
		public Oreo get(Oreo oreo) {
			return findOreo(oreo);
		}

		public Oreo[] getAllOreos() {
			return this.oreos;
		}
		
		private Oreo findOreo(Oreo oreo) {
			Oreo findOreo = null;
			for (Oreo inOreo: oreos) {
				if (inOreo.getSeq() == oreo.getSeq()) {
					findOreo = inOreo;
					break;
				}
			}
			
			return findOreo;
			
		}
		
		private int findOreoIndex(Oreo oreo) {
			int index = -1;
			for (int idx = 0; idx < oreos.length; idx++) {
				if (oreos[idx].getSeq() == oreo.getSeq()) {
					// 같은 쿠키 찾음
					index = idx;
					break;
				}
			}
			return index;
		}
	}
	  
