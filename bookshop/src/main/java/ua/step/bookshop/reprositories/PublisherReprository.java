package ua.step.bookshop.reprositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.step.bookshop.models.Genre;

public interface PublisherReprository extends JpaRepository<Genre, Short>{

}
