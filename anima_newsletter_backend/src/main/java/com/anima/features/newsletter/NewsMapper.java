package com.anima.features.newsletter;

import org.springframework.stereotype.Service;

@Service
public class NewsMapper {

    public NewsDTO entityToDto(NewsEntity newsEntity){
        return NewsDTO.builder()
                .author(newsEntity.getAuthor())
                .content(newsEntity.getContent())
                .creationDate(newsEntity.getCreationDate().toLocalDate())
                .id(newsEntity.getId().toString())
                .title(newsEntity.getTitle())
                .build();
    }

    public NewsEntity dtoToEntity(NewsDTO newsDTO){
        return NewsEntity.builder()
                .author(newsDTO.getAuthor())
                .content(newsDTO.getContent())
                .creationDate(java.sql.Date.valueOf(newsDTO.getCreationDate()))
                .id(Integer.valueOf(newsDTO.getId()))
                .title(newsDTO.getTitle())
                .build();
    }
}