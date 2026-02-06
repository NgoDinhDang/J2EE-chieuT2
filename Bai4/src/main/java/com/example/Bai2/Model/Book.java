package com.example.Bai2.Model;

import jakarta.validation.constraints.*;
import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Tên sách không được để trống")
    @Size(min = 3, max = 100, message = "Tên sách phải từ 3 đến 100 ký tự")
    @Column(nullable = false)
    private String title;

    @NotBlank(message = "Tên tác giả không được để trống")
    @Size(min = 3, max = 100, message = "Tên tác giả phải từ 3 đến 100 ký tự")
    @Column(nullable = false)
    private String author;

    @NotNull(message = "Giá không được để trống")
    @DecimalMin(value = "0.0", inclusive = false, message = "Giá phải lớn hơn 0")
    @DecimalMax(value = "999999.0", message = "Giá không được vượt quá 999999")
    @Column(nullable = false)
    private Double price;

    @Column
    private String image;

    @NotNull(message = "Thể loại không được để trống")
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Category category;

    // Getters and setters (thêm thủ công để tránh phụ thuộc Lombok)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
} 