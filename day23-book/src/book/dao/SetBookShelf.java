package book.dao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import book.exception.DuplicateException;
import book.exception.NotFoundException;
import book.vo.Book;

/**
 * Set 으로 만들어진 책장 구현 클래스
 * 
 * @author 304
 *
 */
public class SetBookShelf implements BookShelf {

	// 1. 멤버변수
	Set<Book> books;
	
	// 2. 생성자
	// (1) 기본생성자
	public SetBookShelf() {
		// books 를 HashSet 으로 직접 초기화
		books = new HashSet<>();
	}
	
	// (2) 매개변수 생성자
	public SetBookShelf(Set<Book> books) {
		this.books = books;
	}
	
	@Override
	public int add(Book book) throws DuplicateException {
		int addCnt = 0;
		
		if (books.add(book)) {
			addCnt++;
		} else {
			throw new DuplicateException("add", book);
		}
		
		return addCnt;
	}

	@Override
	public int set(Book book) throws NotFoundException {
		/*
		 * Set 구조에서 
		 * set:데이터 수정 은
		 * 기존 값 제거 후 수정할 값 추가
		 */
		int setCnt = 0;
		
		if (books.remove(book)) {
			books.add(book);
			setCnt++;
		} else {
			throw new NotFoundException("set", book);
		}
		
		return setCnt;
	}

	@Override
	public int remove(Book book) throws NotFoundException {
		int rmCnt = 0;
		
		if (books.remove(book)) {
			rmCnt++;
		} else {
			throw new NotFoundException("remove", book);
		}
		
		return rmCnt;
	}

	@Override
	public Book get(Book book) throws NotFoundException {
		Book found = null;

		for (Book inBook: books) {
			if (inBook.equals(book)) {
				found = inBook;
				break;
			} 
		}
		
		if (found == null)	
			throw new NotFoundException("get", book);
		
		return found;
	}

	@Override
	public List<Book> getAllBooks() {
		// Set<Book> ===> List<Book> 
		// (1) API 메소드 사용하여 변환
		List<Book> bookList = 
				Arrays.asList(books.toArray(new Book[] {}));
		
//		List<Book> bookList = new ArrayList<>();
//		for (Book book: books) {
//			bookList.add(book);
//		}
		
		return bookList;
	}

}