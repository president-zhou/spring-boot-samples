/**
 * This class is generated by jOOQ
 */
package sample.jooq.domain;

import javax.annotation.Generated;

import sample.jooq.domain.tables.Author;
import sample.jooq.domain.tables.Book;
import sample.jooq.domain.tables.BookStore;
import sample.jooq.domain.tables.BookToBookStore;
import sample.jooq.domain.tables.Language;

/**
 * Convenience access to all tables in PUBLIC
 */
@Generated(value = { "http://www.jooq.org",
		"jOOQ version:3.6.2" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

	/**
	 * The table PUBLIC.LANGUAGE
	 */
	public static final Language LANGUAGE = sample.jooq.domain.tables.Language.LANGUAGE;

	/**
	 * The table PUBLIC.AUTHOR
	 */
	public static final Author AUTHOR = sample.jooq.domain.tables.Author.AUTHOR;

	/**
	 * The table PUBLIC.BOOK
	 */
	public static final Book BOOK = sample.jooq.domain.tables.Book.BOOK;

	/**
	 * The table PUBLIC.BOOK_STORE
	 */
	public static final BookStore BOOK_STORE = sample.jooq.domain.tables.BookStore.BOOK_STORE;

	/**
	 * The table PUBLIC.BOOK_TO_BOOK_STORE
	 */
	public static final BookToBookStore BOOK_TO_BOOK_STORE = sample.jooq.domain.tables.BookToBookStore.BOOK_TO_BOOK_STORE;
}
