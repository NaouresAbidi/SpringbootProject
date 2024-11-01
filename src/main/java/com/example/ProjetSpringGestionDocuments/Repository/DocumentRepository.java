package com.example.ProjetSpringGestionDocuments.Repository;

import com.example.ProjetSpringGestionDocuments.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
    List<Document> findTop10ByOrderByCreationDateDesc();
}
