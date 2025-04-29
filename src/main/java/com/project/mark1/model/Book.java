package com.project.mark1.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String authorname;

    private String isbn;
    private Integer pubyear;
    private Integer copies;

    //getter and setters

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthorname(){
        return authorname;
    }

    public void setAuthorname(String authorname){
        this.authorname = authorname;
    }

    public String getIsbn(){
        return isbn;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public Integer getPubyear(){
        return pubyear;
    }

    public void setPubyear(Integer pubyear){
        this.pubyear = pubyear;
    }

    public Integer getCopies(){
        return copies;
    }

    public void setCopies(Integer copies){
        this.copies = copies;
    }
}
