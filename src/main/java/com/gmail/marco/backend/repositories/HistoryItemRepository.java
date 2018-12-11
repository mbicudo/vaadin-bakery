package com.gmail.marco.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmail.marco.backend.data.entity.HistoryItem;

public interface HistoryItemRepository extends JpaRepository<HistoryItem, Long> {
}
