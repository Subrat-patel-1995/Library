package com.store.book.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Book extends BaseEntity{
    private String name;

}
