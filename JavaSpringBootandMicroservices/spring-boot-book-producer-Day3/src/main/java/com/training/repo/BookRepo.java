package com.training.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.training.model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

	//retrive all C Books based on title
	
	List<Book> findByTitleLike(String title);
	
	List<Book> findByStockGreaterThan(Integer stock);
	
	@Query("from Book b where b.price > :price")
	List<Book> findByPricegreaterThan(@Param("price") Double price);
	
	//update stock of all the books that are titled with pattern C
	@Transactional
	@Modifying
	@Query("update Book b set b.stock= b.stock + :newstock where b.title like :pattern")
	int updateStockTitle(@Param("pattern") String titlePattern,@Param("newstock") Integer newStock);
}
