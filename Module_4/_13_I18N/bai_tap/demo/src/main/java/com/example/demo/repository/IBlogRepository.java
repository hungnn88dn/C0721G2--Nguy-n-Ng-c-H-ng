package com.example.demo.repository;


import com.example.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogRepository extends JpaRepository<Blog, Integer> {

    Page<Blog> findBlogByAuthorContaining(String author, Pageable pageable);

    @Query(value= "select * from blog join ecommerce where blog.e_commerce_id = ecommerce.id and ecommerce.id = :id" , nativeQuery= true)
    Page<Blog> findAllBlogByECommerceId(@Param("id") int id, Pageable pageable );
}
